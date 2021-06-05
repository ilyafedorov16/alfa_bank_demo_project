package alfabank.demo.step.tests;


import alfabank.demo.helpers.DriverHelper;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


@Tags({@Tag("web"),@Tag("positive"),@Tag("ui")})
public class StepTests extends TestBase {

    @Test
    @Owner("Ilya Fedorov")
    @DisplayName("Проверка ипотечного калькулятора")
    void calculatorTest(){
        step("Открываем главную страницу", () -> open("https://alfabank.ru/"));

        step("Открываем Ипотечный калькулятор", () -> {
            $("[data-test-id='tabs-with-calculators']").$(byText("Рассчитать")).click();
        });

        step("Вводим стоимость недвижимости 706 тыс", () -> {
            $("#estateCost").setValue("706000");
            $("#estateCost").shouldHave(Condition.value("706000").because("Мы ввели сумму  706 тыс"));
        });

        step("Вводим первоначальный взнос 106 тыс", () -> {
            $("#initialFee").setValue("106000");
            $("#initialFee").shouldHave(Condition.value("106000").because("Мы ввели сумму  106 тыс"));
        });

        step("Вводим срок кредитования  5 лет", () -> {
            $("#creditTerm").setValue("5");
            $("#creditTerm").shouldHave(Condition.value("5").because("Мы ввели срок кредитования 5 лет"));
        });


        step("Проверяем что на странице присутствует кнопка заполнить заявку", () -> {
            $("#buttonId").shouldBe((Condition.visible));
        });
    }

    @Test
    @Disabled
    @Owner("Ilya Fedorov")
    @DisplayName("Проверка наличия заголовка на странице")
    void titleTest() {
        step("Open url 'https://alfabank.ru/'", () ->
            open("https://alfabank.ru/"));

        step("Страница должна содержать текст 'Альфа-Банк - кредитные и дебетовые карты, кредиты наличными, автокредитование, ипотека и другие банковские услуги физическим и юридическим лицам – Альфа-Банк'", () -> {
            String expectedTitle = "Альфа-Банк - кредитные и дебетовые карты, кредиты наличными, автокредитование, ипотека и другие банковские услуги физическим и юридическим лицам – Альфа-Банк";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
            sleep(3000);
        });
    }

    @Test
    @Owner("Ilya Fedorov")
    @DisplayName("Проверка, что в консоли нет ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем главную  страницу 'https://alfabank.ru/'", () ->
            open("https://alfabank.ru/"));

        step("Проверяем, что консоль не содержит  ошибок 'SEVERE'", () -> {
            String consoleLogs = DriverHelper.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
            sleep(3000);
        });
    }
}