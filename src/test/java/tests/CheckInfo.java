package tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.components.InfoBlock;
import settings.TestBase;

import static io.qameta.allure.Allure.step;

public class CheckInfo extends TestBase {

    MainPage mainPage = new MainPage();
    InfoBlock infoBlock = new InfoBlock();

    @Test
    @DisplayName("Проверка наполненности блока информации")
    @Tag("Guest")
    @Tag("Smoke")
    void checkLinkAppTest() {
        mainPage.openPage();
        mainPage.scrollInfoBlock();
        infoBlock.checkLink();
        infoBlock.checkInfo();
        infoBlock.checkContacts();
    }
}