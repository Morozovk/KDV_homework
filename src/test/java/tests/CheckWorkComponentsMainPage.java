package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tags({@Tag("Guest"),@Tag("Smoke")})
@DisplayName("Проверка работы блоков на главной странице")
public class CheckWorkComponentsMainPage extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка работы блока рекомендации")
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
    void workCategoriesSelectionMainPageTest() {
            mainPage.openPage()
                    .clickButtonCloseCookieInfo()
                    .checkCategoriesSection()
                    .clickButtonOpenCategories()
                    .clickButtonCloseCategories();
    }

    @Test
    @DisplayName("Проверка работы блока преимуществ КДВ")
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