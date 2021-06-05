package alfabank.demo.pageobject.test;

import alfabank.demo.step.tests.BaseStep;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

@Tags({@Tag("web"),@Tag("positive")})
public class AlfaBankTests extends BaseStep {

    public BaseStep steps = new BaseStep();

    @Test
    @Owner("Ilya Fedorov")
    @DisplayName("Проверка что страница доступна и присутствует заголовок Кредит Наличными")
    void pageCreditCardTest(){
        steps.openMainPage();
        steps.selectSliderCredit();
        steps.clickButtonFill();
        steps.assertCreditAlfaText();
    }

    @Test
    @Owner("Ilya Fedorov")
    @DisplayName("Проверка открытия страницы Дебетовая карта")
    void openDebetCardTest(){
        steps.openMainPage();
        steps.selectSliderDebetCart();
        steps.clickButtonFillDebetCard();
        steps.assertDebitAlfaText();
    }

    @Test
    @Owner("Ilya Fedorov")
    @DisplayName("Проверка поиска отделения,если клиент не является резидентом")
    void findDepartment(){
        open("/everyday/debit-cards/alfacard-short2/");
        steps.selectNotResident();
        steps.clickButtonFindDepartment();
    }
}




