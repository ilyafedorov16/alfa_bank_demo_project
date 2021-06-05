package alfabank.demo.step.tests;

import com.codeborne.selenide.Condition;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class BaseStep extends TestBase {

    @Step("Открываем  главную  страницу")
    public void openMainPage() {
        open(baseUrl);
    }

    @Step("Ищем на странице слайдер Кредит наличными")
    public void selectSliderCredit() {
        $(byText("ДЕНЬГИ НА ЛЮБЫЕ ЦЕЛИ")).click();
    }

    @Step("Ищем на странице слайдер с открытием дебетовой карты")
    public void selectSliderDebetCart(){$("[tabindex='1']").click();}

    @Step("Кликаем по кнопке Заказать карту")
    public void clickButtonFillDebetCard(){$("[data-test-id='button']",4).click();}

    @Step("Кликаем на кнопку  Заполнить заявку")
    public void clickButtonFill() {
       $(byText("Заполнить заявку")).click();
    }

    @Step(" выбор чекбокса Не являюсь резидентом")
    public void selectNotResident() {
        $("[data-test-id='resident-notResident']").click();
        $("#draft-offer").shouldHave(Condition.matchText("Для оформления заявки на получение карты, пожалуйста, обратитесь в ближайшее отделение Альфа-Банка."));
    }

    @Step(" Поиск ближайшего отделения")
    public void clickButtonFindDepartment() {
        $(byText("Найти ближайшее отделение")).click();
        $("[role='tablist']").$(byText("Списком")).click();
        $("[data-test-id='layout']",4).shouldBe(Condition.visible);
    }

    @Step("Проверка что на странице присутствует заголовок Кредит наличными")
    public void assertCreditAlfaText() {
     $("[data-test-id=layout] h1").shouldHave(Condition.text("Кредит наличными"));
     $("#draft-offer").shouldBe(Condition.visible);

    }

    @Step("Проверка что на странице присутствует заголовок Заявка на дебетовую Альфа-Карту и форма")
    public void assertDebitAlfaText() {
        $("[data-test-id=layout] h1").shouldHave(Condition.text("Заявка на дебетовую Альфа-Карту"));
        $("#draft-offer").shouldBe(Condition.visible);
    }

}
