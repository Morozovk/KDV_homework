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
    void checkWorkSliderBannerMainPage() {

        step("Открытие страницы", () -> {
            mainPage.openPage();
        });

        step("Проверка отображения раздела Рекомендуем вам", () -> {
            mainPage.checkRecommendationSection();
        });

        step("Проверка некликкабельной левой кнопки", () -> {
            mainPage.leftButtonRecommendationNotClickable();
        });

        step("Тап по кнопкам внизу раздела рекомендуем вам", () -> {
            mainPage.clickMiniButtonsRecommendation();
        });

        step("Проверка некликкабельной правой кнопки", () -> {
            mainPage.rightButtonRecommendationNotClickable();
        });

        step("Тап по левой кнопке раздела рекомендации", () -> {
            mainPage.leftClickButtonRecommendation();
        });

        step("Тап по правой кнопке раздела рекомендации", () -> {
            mainPage.rightClickButtonRecommendation();
        });
    }

    @Test
    @DisplayName("Проверка работы блока категории")
    @Tag("Guest")
    @Tag("Smoke")
    void checkWorkCategoriesSelectionMainPage() {

        step("Открытие страницы", () -> {
            mainPage.openPage();
            mainPage.clickButtonCloseCookieInfo();
        });

        step("Проверка наличия раздела категории", () -> {
            mainPage.checkCategoriesSection();
        });

        step("Клик по кнопке 'Еще XX категорий'", () -> {
            mainPage.clickButtonOpenCategories();
        });

        step("Клик по кнопке 'Скрыть категории'", () -> {
            mainPage.clickButtonCloseCategories();
        });

    }

    @Test
    @DisplayName("Проверка работы блока преимуществ КДВ")
    @Tag("Guest")
    @Tag("Smoke")
    void checkWorkAdvantagesSelectionMainPage() {

        step("Открытие страницы", () -> {
            mainPage.openPage();
            mainPage.clickButtonCloseCookieInfo();
            mainPage.scrollAdvantagesBlock();
        });

        step("Проверка блока минимальная цена", () -> {
            mainPage.clickMinPriceButton();
            mainPage.checkTextMinPrice();
        });

        step("Проверка блока бесплатна доставка", () -> {
            mainPage.clickFreeDeliveryButton();
            mainPage.checkTextFreeDelivery();
        });

        step("Проверка блока удобной оплаты", () -> {
            mainPage.clickConvenientPaymentButton();
            mainPage.checkTextConvenientPayment();
        });
    }
}



//step("", () -> {
//
//        });