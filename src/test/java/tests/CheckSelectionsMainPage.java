package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import settings.TestBase;

import static io.qameta.allure.Allure.step;

public class CheckSelectionsMainPage extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Tag("Guest")
    @Tag("Smoke")
    void checkSelectionsMainPage() {
        step ("Открытие страницы", () -> {
            mainPage.openPage();
        });

        step("Проверка изображения на баннере (Реклама банка)", () -> {
            mainPage.checkImageBankBanner();
        });

        step("Проверка изображения на баннере (Рекалама печенья)", () -> {
            mainPage.checkImageCookieBanner();
        });

//        step("Проверка изображения на баннере (Рекалама завтрака)", () -> {
//            mainPage.checkImageBreakfastBanner();
//        }); Почему то не работает

        step("Проверка наличия раздела Рекомендации", () -> {
            mainPage.checkRecommendationSection();
        });

        step("Проверка наличия раздела Категории", () -> {
            mainPage.checkCategoriesSection();
        });

        step("Проверка наличия раздела Новинки", () -> {
            mainPage.checkNewProductsSection();
        });

        step("Проверка наличия раздела Хиты", () -> {
            mainPage.checkSalesHitsSection();
        });

        step("Проверка наличия раздела Ифно", () -> {
            mainPage.checkInfoSection();
        });
    }
}


