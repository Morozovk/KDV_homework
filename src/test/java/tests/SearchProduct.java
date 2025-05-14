package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultSearchPage;

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
            mainPage.openPage()
                    .setNameProductSearchInput(nameProduct);
            resultSearchPage.checkResultSearch(nameProduct);
    }

    @Test
    @DisplayName("Поиск несуществующего продукта")
    @Tag("Guest")
    @Tag("Smoke")
    void searchNullProductTest() {
            mainPage.openPage()
                    .setNameProductSearchInput(nameNullProduct);
            resultSearchPage.checkNullResultSearch();
    }
}
