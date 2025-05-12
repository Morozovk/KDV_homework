package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import settings.TestBase;

import static io.qameta.allure.Allure.step;

public class CheckWorkComponentsMainPage extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка работы блока рекомендации")
    @Tag("Guest")
    @Tag("Smoke")
    void workSliderBannerMainPageTest() {
            mainPage.openPage()
                    .checkRecommendationSection()
                    .leftButtonRecommendationNotClickable()
                    .clickMiniButtonsRecommendation()
                    .rightButtonRecommendationNotClickable()
                    .leftClickButtonRecommendation()
                    .rightClickButtonRecommendation();
    }

    @Test
    @DisplayName("Проверка работы блока категории")
    @Tag("Guest")
    @Tag("Smoke")
    void workCategoriesSelectionMainPageTest() {
            mainPage.openPage()
                    .clickButtonCloseCookieInfo()
                    .checkCategoriesSection()
                    .clickButtonOpenCategories()
                    .clickButtonCloseCategories();
    }

    @Test
    @DisplayName("Проверка работы блока преимуществ КДВ")
    @Tag("Guest")
    @Tag("Smoke")
    void workAdvantagesSelectionMainPageTest() {
            mainPage.openPage()
                    .scrollAdvantagesBlock()
                    .clickMinPriceButton()
                    .checkTextMinPrice()
                    .clickFreeDeliveryButton()
                    .checkTextFreeDelivery()
                    .clickConvenientPaymentButton()
                    .checkTextConvenientPayment();
    }
}