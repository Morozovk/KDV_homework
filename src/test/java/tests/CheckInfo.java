package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class CheckInfo {

    MainPage mainPage = new MainPage();

    @Disabled
    @Test
    @DisplayName("Проверка наполненности блока информации")
    @Tag("Guest")
    @Tag("Smoke")
    void checkLinkApp() {
        step("Открытие страницы", () -> {
            mainPage.openPage();
        });

        step("", () -> {

        });

        step(".", () -> {

        });


    }
}
