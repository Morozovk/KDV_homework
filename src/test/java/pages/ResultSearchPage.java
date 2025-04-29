package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ResultSearchPage {
    public void checkResultSearch(String nameProduct) {
        $(".toolbar").shouldHave(text("Результаты поиска для «" + nameProduct + "»"));
        $(".f44hEijrh").shouldHave(visible);
    }
    public void checkNullResultSearch() {
        $(".amjXRezSt").shouldHave(text("По вашему запросу ничего не найдено.\nПопробуйте изменить запрос."))
                .shouldHave(visible);
        $(".dmjXRezSt").shouldHave(visible);

    }
}
