package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import pages.components.InputSearch;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement
                            basicPage = $(".fkMNjtTqC"),
                            swiperBanner = $(".alof16ICz"),
                            recommendationSection = $(".recommendation-block_main"),
                            categoriesSection = $(".main-categories"),
                            newProductsSection = $(".novelties"),
                            salesHitsSection = $(".hits"),
                            infoSection = $(".hkMNjtTqC"),
                            rightButtonBanner = $(".b9XbeXYFr.elof16ICz"),
                            leftButtonBanner = $(".a9XbeXYFr.elof16ICz"),
                            bannerImageBank = $("[src='https://api.magonline.ru/thumbnail/1200x450/50/991/50991.png']"),
                            bannerImageCookie = $("[src='https://api.magonline.ru/thumbnail/1200x450/50/897/50897.png']"),
                            bannerImageBreakfast = $("[src='https://api.magonline.ru/thumbnail/1200x450/50/530/50530.png']"),
                            rightButtonRecommendation = $(".b9XbeXYFr.mvcyafA0C"),
                            leftButtonRecommendation = $(".a9XbeXYFr.lvcyafA0C"),
                            buttonOpenCategories = $(".bJAnns2bu"),
                            buttonCloseCategories = $(".cJAnns2bu"),
                            buttonCloseCokieInfo = $(".al2KFqfcU");


    public InputSearch inputSearch = new InputSearch();


    public MainPage openPage() {
        open(baseUrl);
        basicPage.shouldBe(visible);
        return this;
    }

    public  MainPage checkSwiperBanner() {
        swiperBanner.shouldBe(visible);
        return this;
    }

    public MainPage checkRecommendationSection() {
        recommendationSection.shouldHave(visible);
        return this;
    }

    public MainPage checkCategoriesSection() {
        categoriesSection.shouldHave(visible);
        return this;
    }

    public MainPage checkNewProductsSection() {
        newProductsSection.shouldHave(visible);
        return this;
    }

    public MainPage checkSalesHitsSection() {
        salesHitsSection.shouldHave(visible);
        return this;
    }

    public MainPage checkInfoSection() {
        infoSection.shouldHave(visible);
        return this;
    }

    public MainPage clickRightButtonBanner() {
        rightButtonBanner.click();
        return this;
    }

    public MainPage clickLeftButtonBanner() {
        leftButtonBanner.click();
        return this;
    }

    public MainPage checkImageBankBanner() {
        bannerImageBank.shouldBe(visible, Duration.ofSeconds(7));
        return this;
    }

    public MainPage checkImageCookieBanner() {
        bannerImageCookie.shouldBe(visible, Duration.ofSeconds(7));
        return this;
    }

    public MainPage checkImageBreakfastBanner() {
        bannerImageBreakfast.shouldBe(visible, Duration.ofSeconds(7));
        return this;
    }

    public MainPage rightClickButtonRecommendation() {
        rightButtonRecommendation.click();
        return this;
    }

    public MainPage leftClickButtonRecommendation() {
        leftButtonRecommendation.click();
        return this;
    }

    public MainPage leftButtonRecommendationNotClickable() {
        Assertions.assertFalse(leftButtonRecommendation.isEnabled());
        return this;
    }

    public MainPage rightButtonRecommendationNotClickable() {
        Assertions.assertFalse(rightButtonRecommendation.isEnabled());
        return this;
    }

    public MainPage clickMiniButtonsRecommendation() {
        $(".recommendation-block_main").scrollTo();
        $$(".d9XbeXYFr").get(0).click();
        $$(".d9XbeXYFr").get(1).click();
        $$(".d9XbeXYFr").get(2).click();
        $$(".d9XbeXYFr").get(3).click();
        $$(".d9XbeXYFr").get(4).click();
        $$(".d9XbeXYFr").get(5).click();
        $$(".d9XbeXYFr").get(6).click();
        $$(".d9XbeXYFr").get(7).click();
        $$(".d9XbeXYFr").get(8).click();
        return this;
    }

    public MainPage clickButtonOpenCategories() {
        buttonOpenCategories.click();
        return this;
    }

    public MainPage clickButtonCloseCategories() {
        buttonCloseCategories.click();
        return this;
    }

    public MainPage clickButtonCloseCookieInfo() {
        buttonCloseCokieInfo.click();
        return this;
    }

    public MainPage setNameProductSearchInput(String nameProduct) {
        inputSearch.setValueSearch(nameProduct);
        return this;
    }
}
