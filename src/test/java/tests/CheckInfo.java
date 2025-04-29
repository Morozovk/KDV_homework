package tests;

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
    @Tag("New")
    @Tag("Guest")
    @Tag("Smoke")
    void checkLinkApp() {
        step("Открытие страницы", () -> {
            mainPage.openPage();
            mainPage.scrollInfoBlock();
        });

        step("Проверка Link на сторы и соц. сети", () -> {
            infoBlock.checkLink();
        });

        step("Проверка блока Информации и др", () -> {
            infoBlock.checkInfo();
        });

        step("Проверка блока Контакты", () -> {
            infoBlock.checkContacts();
        });


    }
}
