package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class InputSearch {
    public void setValueSearch(String nameProduct) {
        $(".he5HEqxY7").$(".cIpro8vYp").click();
        $(".aphkBGzOm").$(".cIpro8vYp").setValue(nameProduct).pressEnter();
    }
}
