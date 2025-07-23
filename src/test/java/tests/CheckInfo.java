package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.components.InfoBlock;

@Tags({@Tag("Guest"),@Tag("Smoke")})
@DisplayName("Проверка раздела 'Инфо'")
public class CheckInfo extends TestBase {

    MainPage mainPage = new MainPage();
    InfoBlock infoBlock = new InfoBlock();

    @Test
    @DisplayName("Проверка Links на сторы IOS и Android и соц сеть ВК")
    void linkAppTest() {
        mainPage.openPage()
                .scrollInfoBlock();
        infoBlock.checkLink();
    }

    @Test
    @DisplayName("Проверка наличия разделов в блоке 'Информация'")
    void infoCompanyTest() {
    mainPage.openPage()
            .scrollInfoBlock();
    infoBlock.checkInfo();
    }

    @Test
    @DisplayName("Проверка наличия контактной информации в блоке 'Информация'")
    void contactsCompanyTest() {
        mainPage.openPage()
                .scrollInfoBlock();
        infoBlock.checkContacts();
    }
}