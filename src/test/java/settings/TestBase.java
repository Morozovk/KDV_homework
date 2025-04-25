package settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920×1080";
        Configuration.baseUrl = "https://kdvonline.ru";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
