package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.components.ResultSearchPage;
import settings.TestBase;

import static io.qameta.allure.Allure.step;

public class SearchProduct extends TestBase {

    MainPage mainPage = new MainPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    String nameProduct = "Крекер";
    String nameNullProduct = "1234qwer";

    @Test
    @DisplayName("Поиск продукта")
    @Tag("Guest")
    @Tag("Smoke")
    void searchProductTest() {

        step("Открытие страницы", () -> {
            mainPage.openPage();
        });

        step("Ввод в поле поиск название товара", () -> {
            mainPage.setNameProductSearchInput(nameProduct);
        });

        step("Проверка результатов поиска", () -> {
            resultSearchPage.checkResultSearch(nameProduct);
        });
    }

    @Test
    @DisplayName("Поиск несуществующего продукта")
    @Tag("Guest")
    @Tag("Smoke")
    void searchNullProductTest() {

        step("Открытие страницы", () -> {
            mainPage.openPage();
        });

        step("Ввод в поле поиск название товара, которого несуществует", () -> {
            mainPage.setNameProductSearchInput(nameNullProduct);
        });

        step("Результат поиска несуществующего товара", () -> {
            resultSearchPage.checkNullResultSearch();
        });
    }
}
