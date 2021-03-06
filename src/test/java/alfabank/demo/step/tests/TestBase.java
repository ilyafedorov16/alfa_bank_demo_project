package alfabank.demo.step.tests;

import alfabank.demo.helpers.AttachmentsHelper;
import alfabank.demo.helpers.DriverHelper;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

@ExtendWith({AllureJunit5.class})
public class TestBase {

    @BeforeAll
    static void setUp() {
        DriverHelper.configureDriver();
    }

    @AfterEach
    public void addAttachments(){
        String sessionId = DriverHelper.getSessionId();

        AttachmentsHelper.attachScreenshot("Last screenshot");
        AttachmentsHelper.attachPageSource();
//        attachNetwork(); // todo
        AttachmentsHelper.attachAsText("Browser console logs", DriverHelper.getConsoleLogs());

        closeWebDriver();

        if (DriverHelper.isVideoOn()) AttachmentsHelper.attachVideo(sessionId);
    }
}
