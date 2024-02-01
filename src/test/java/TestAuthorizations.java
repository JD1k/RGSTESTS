import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestAuthorizations {
    @Test
    public void TestBrowser(){
        open("https://sravni.id/");
        $x("//a[@class='eJpgv4rrNlWX9wgPQYHg _p7lcln _7k5cz5']").click();
        $x("//input[@name='email']").setValue("maksimqa.makaroff2014@yandex.ru").shouldBe(Condition.value("maksimqa.makaroff2014@yandex.ru")).pressEnter();
        $x("//input[@name='password']").setValue("12EArsRUsh").shouldBe(Condition.value("12EArsRUsh")).pressEnter();
        $x("//a[@href='https://www.sravni.ru/']").click();
        $x("//h1[@class='_e9qrci _15bmsvx']").shouldHave(Condition.text("Помогаем сохранить деньги"));

    }
}
