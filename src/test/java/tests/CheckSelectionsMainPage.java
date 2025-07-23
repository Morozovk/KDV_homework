package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tags({@Tag("Guest"),@Tag("Smoke")})
@DisplayName("Проверка наполненности главной страницы")
public class CheckSelectionsMainPage extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка наполненности главной страницы")
    void selectionsMainPageTest() {
            mainPage.openPage()
                    .checkRecommendationSection()
                    .checkCategoriesSection()
                    .checkNewProductsSection()
                    .checkSalesHitsSection()
                    .checkInfoSection();
    }
}


