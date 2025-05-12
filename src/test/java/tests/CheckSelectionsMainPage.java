package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import settings.TestBase;

import static io.qameta.allure.Allure.step;

public class CheckSelectionsMainPage extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка наполненности главной страницы")
    @Tag("Guest")
    @Tag("Smoke")
    void checkSelectionsMainPageTest() {
            mainPage.openPage()
                    .checkImageBankBanner()
                    .checkImageCookieBanner()
                    .checkImageBreakfastBanner()
                    .checkRecommendationSection()
                    .checkCategoriesSection()
                    .checkNewProductsSection()
                    .checkSalesHitsSection()
                    .checkInfoSection();
    }
}


