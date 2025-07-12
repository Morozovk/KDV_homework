package tests;

import io.qameta.allure.Manual;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class DetailsProduct {

    @Test
    @Manual
    @Tag("Guest")
    @DisplayName("Проверка открытия карточки продукта")
    void openDetailsTest(){
    step("Открыть карточку продукта");
    step("Проверить корректное отображение элементов на странице");
    }

    @Test
    @Manual
    @Tag("Guest")
    @DisplayName("Проверка открытия характеристики продукта")
    void openCharacteristicProductTest() {
        step("Открыть карточку продукта");
        step("Тап по кнопке 'Описание товара'");
        step("Проверить наличие характеристик товара");
    }

    @Test
    @Manual
    @Tag("Guest")
    @DisplayName("Проверка перехода на карточку другого товара из раздела 'С этим товаром покупают'")
    void openAdditionalProductTest() {
        step("Открыть карточку продукта");
        step("Тап по товару в разделе 'С этим товаром покупают'");
        step("Проверить корректное отображение открытого товара");
    }

    @Test
    @Manual
    @Tag("Guest")
    @DisplayName("Проверка перехода на карточку другого товара из раздела 'Похожие товары'")
    void openRelatedProductsTest() {
        step("Открыть карточку продукта");
        step("Тап по товару в разделе 'Похожие товары'");
        step("Проверить корректное отображение открытого товара");
    }
}
