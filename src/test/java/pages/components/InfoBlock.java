package pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InfoBlock {

    @Step ("Проверка Ссылок на VK, IOS, Android")
    public void checkLink() {
        $(".efTEZkzJt a[href='https://vk.com/kdvonline']").shouldHave(visible);
        $(".efTEZkzJt a[href='https://kdvonline.page.link/V9Hh']").shouldHave(visible);
        $(".efTEZkzJt a[href='https://play.google.com/store/apps/details?id=com." +
                "magonline.app&referrer=utm_source%3Dkdvonline%26utm_campaign%3Dkdvonline_badge']").shouldHave(visible);
        $(".efTEZkzJt a[href='https://appgallery.huawei.com/app/" +
                "C102325317?sharePrepath=ag&channelId=web&id=5ade75c49295439e81b9c77f90dc0fba&s=" +
                "2FCFCCE875EA210BF93BC8A96FEF54B8254FCC16AE2A07BA664C66F7ED18C894&detailType=0&v=" +
                "&callType=AGDLINK&installType=0000']").shouldHave(visible);
    }

    @Step ("Проверка наличия разделов в 'Инфо'")
    public void checkInfo() {
        $$(".aO0VmIpQ0 a").shouldHave(texts("О магазине",
                "Бесплатная доставка",
                "Оплата заказов",
                "Как купить",
                "Возврат и обмен",
                "Для юридических лиц",
                "Договор поставки",
                "Персональные данные",
                "Политика конфиденциальности",
                "Пользовательское соглашение",
                "Согласие на передачу данных",
                "Контакты"));
        $(".aO0VmIpQ0 a[href='/about']").shouldHave(text("О магазине"));
        $(".aO0VmIpQ0 a[href='/delivery']").shouldHave(text("Бесплатная доставка"));
        $(".aO0VmIpQ0 a[href='/payment-orders']").shouldHave(text("Оплата заказов"));
        $(".aO0VmIpQ0 a[href='/how-to-buy']").shouldHave(text("Как купить"));
        $(".aO0VmIpQ0 a[href='/return-policy']").shouldHave(text("Возврат и обмен"));
        $(".aO0VmIpQ0 a[href='/commercial-info']").shouldHave(text("Для юридических лиц"));
        $(".aO0VmIpQ0 a[href='https://kdvonline.ru/uploads/Supply_contract.pdf']").shouldHave(text(
                "Договор поставки"));
        $(".aO0VmIpQ0 a[" +
                "href='https://kdvonline.ru/uploads/consent_to_the_processing_of_personal_data_24032024.pdf']")
                .shouldHave(text("Персональные данные"));
        $(".aO0VmIpQ0 a[href='/confidential']").shouldHave(text("Политика конфиденциальности"));
        $(".aO0VmIpQ0 a[href='/terms-of-use']").shouldHave(text("Пользовательское соглашение"));
        $(".aO0VmIpQ0 a[href='/contacts']").shouldHave(text("Контакты"));

    }

    @Step ("Проверка блока контактов")
    public void checkContacts() {
        $(".a2J3P0lgC").shouldHave(text(
                "Свяжитесь с нами\n" +
                "info@kdvonline.ru\n" +
                "Служба поддержки:\n" +
                "8 800 250 55 55\n" +
                "7 дней в неделю с 05:00 до 22:00 по московскому времени, для звонков по РФ, звонок бесплатный"));
        $(".a2J3P0lgC a[href*='8002505555']").shouldBe(visible).shouldHave(text("8 800 250 55 55"));
        $(".a2J3P0lgC a[href='mailto:info@kdvonline.ru']").shouldBe(visible).shouldHave(text(
                "info@kdvonline.ru"));
    }
}
