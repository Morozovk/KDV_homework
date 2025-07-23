package pages;

import com.codeborne.selenide.SelenideElement;
import com.sun.tools.javac.Main;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.components.InputSearch;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement
                            basicPage = $(".fkMNjtTqC"),
                            recommendationSection = $(".recommendation-block_main"),
                            categoriesSection = $(".main-categories"),
                            newProductsSection = $(".novelties"),
                            salesHitsSection = $(".hits"),
                            infoSection = $(".hkMNjtTqC"),
                            leftButtonBanner = $(".a9XbeXYFr.elof16ICz"),
                            bannerImageBank = $("[src='https://api.magonline.ru/thumbnail/1200x450/50/991/50991.png']"),
                            bannerImageCookie = $("[src='https://api.magonline.ru/thumbnail/1200x450/50/897/50897.png']"),
                            bannerImageBreakfast = $("[src='https://api.magonline.ru/thumbnail/1200x450/50/530/50530.png']"),
                            rightButtonRecommendation = $(".b9XbeXYFr.mvcyafA0C"),
                            leftButtonRecommendation = $(".a9XbeXYFr.lvcyafA0C"),
                            buttonOpenCategories = $(".bJAnns2bu"),
                            buttonCloseCategories = $(".cJAnns2bu"),
                            buttonCloseCokieInfo = $(".al2KFqfcU"),
                            infoBlockWithAllLinks = $(".cfTEZkzJt");


    public InputSearch inputSearch = new InputSearch();


    @Step ("Открытие страницы")
    public MainPage openPage() {
        open(baseUrl);
        basicPage.shouldBe(visible);
        return this;
    }

    @Step ("Проверка наличия блока 'Рекомендации'")
    public MainPage checkRecommendationSection() {
        recommendationSection.shouldHave(visible);
        return this;
    }

    @Step ("Проверка наличия блока 'Категории'")
    public MainPage checkCategoriesSection() {
        categoriesSection.shouldHave(visible);
        return this;
    }

    @Step ("Проверка наличия блока 'Новинки'")
    public MainPage checkNewProductsSection() {
        newProductsSection.shouldHave(visible);
        return this;
    }

    @Step ("Проверка наличия раздела 'Хиты продаж'")
    public MainPage checkSalesHitsSection() {
        salesHitsSection.shouldHave(visible);
        return this;
    }

    @Step ("Проверка наличия раздела 'Инфо'")
    public MainPage checkInfoSection() {
        infoSection.shouldHave(visible);
        return this;
    }

    @Step ("Тап по правой стрелке раздела 'Рекомендации'")
    public MainPage rightClickButtonRecommendation() {
        rightButtonRecommendation.click();
        return this;
    }

    @Step ("Тап по левой кнопке раздела 'Рекомендации'")
    public MainPage leftClickButtonRecommendation() {
        leftButtonRecommendation.click();
        return this;
    }

    @Step ("Проверка не кликкабельности левой кнопки раздела 'Рекомендации'")
    public MainPage leftButtonRecommendationNotClickable() {
        Assertions.assertFalse(leftButtonRecommendation.isEnabled());
        return this;
    }

    @Step ("Проверка не кликкабельности правой кнопки раздела 'Рекомендации'")
    public MainPage rightButtonRecommendationNotClickable() {
        Assertions.assertFalse(rightButtonRecommendation.isEnabled());
        return this;
    }

    @Step ("Тап по индикаторам слайдов раздела 'Рекомендации'")
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

    @Step ("Тап по кнопке 'Еще XX категорий'")
    public MainPage clickButtonOpenCategories() {
        buttonOpenCategories.click();
        return this;
    }

    @Step ("Тап по кнопке 'Скрыть категории'")
    public MainPage clickButtonCloseCategories() {
        buttonCloseCategories.click();
        return this;
    }

    @Step ("Тап по кнопке 'Закрыть информацию о Coockie файлах'")
    public MainPage clickButtonCloseCookieInfo() {
        buttonCloseCokieInfo.click();
        return this;
    }

    @Step ("Ввод в поле ввода {nameProduct}")
    public MainPage setNameProductSearchInput(String nameProduct) {
        inputSearch.setValueSearch(nameProduct);
        return this;
    }

    @Step ("Скролл до инфо блока")
    public MainPage scrollInfoBlock() {
        infoBlockWithAllLinks.scrollTo();
        return this;
    }

    @Step ("Тап по разделу преимуществ 'Минимальные цены'")
    public MainPage clickMinPriceButton() {
        $$(".bDCB7AS04").get(0).click();
        return this;
    }

    @Step ("Тап по разделу преимуществ 'Бесплатная доставка'")
    public  MainPage clickFreeDeliveryButton() {
        $$(".bDCB7AS04").get(1).click();
        return this;
    }

    @Step ("Тап по разделу преимуществ 'Удобная оплата'")
    public MainPage clickConvenientPaymentButton() {
        $$(".bDCB7AS04").get(2).click();
        return this;
    }

    @Step ("Скролл до раздела 'Преимущества'")
    public MainPage scrollAdvantagesBlock() {
        leftButtonBanner.scrollTo();
        return this;
    }

    @Step ("Проверка текста в выпадающем окне 'Минимальные цены'")
    public MainPage checkTextMinPrice() {
        $$(".goPLN1VGL").get(0).shouldHave(text("Холдинг KDV – это крупнейшее в России производство"));
        $(".goPLN1VGL [href='/about']").shouldBe(visible).shouldHave(text("Подробнее"));
        return this;
    }

    @Step ("Проверка текста в выпадающем окне 'Бесплатная доставка'")
    public MainPage checkTextFreeDelivery() {
        $$(".goPLN1VGL").get(1).shouldHave(text("Ваши покупки мы доставим бесплатно в удобное для вас"));
        $(".goPLN1VGL [href='/delivery']").shouldBe(visible).shouldHave(text("Подробнее"));
        return this;
    }

    @Step ("Проверка текста в выпадающем окне 'Удобная оплата'")
    public MainPage checkTextConvenientPayment() {
        $$(".goPLN1VGL").get(2).shouldHave(text("Вы можете оплатить заказ онлайн или картой при получении"));
        $(".goPLN1VGL [href='/payment-orders']").shouldBe(visible).shouldHave(text("Подробнее"));
        return this;
    }
}
