package products.osago;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;


import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

import static services.data.references.Urls.OSAGO_SBERBANK;

public class Login {

    @Test
    public static void doLogin (){

        //sleep(60000);
        Configuration.pageLoadTimeout = 60000;

        open(OSAGO_SBERBANK);
        sleep(1500);

        $("title").shouldHave(Condition.attribute("text", "ОСАГО онлайн: калькулятор еОСАГО"));

        PageElements.test.click();
        assertEquals($x("//h2[text()='Калькулятор ОСАГО']"),$x("//h2[text()='Калькулятор ОСАГО']"),"Вы зашли не туда");
        sleep(1500);


        //PageElements.enginePower.setValue("71").shouldBe(Condition.visible).pressEnter();

       switchTo().frame($x("//*[@id='RESOLUTE_INSURANCE']"));
       sleep(1000);

       //Данные тс
        PageElements.type.click();
        sleep(500);

        PageElements.tsNumber.setValue("В903ОР97").shouldBe(Condition.visible).pressEnter();
        PageElements.tsVin.setValue("XTK21043040012799").shouldBe(Condition.visible).pressEnter();
        sleep(500);

        PageElements.tsCategory.click();
        PageElements.enginePower.setValue("71").shouldBe(Condition.visible).pressEnter();
        sleep(500);

        PageElements.tsType.click();
        PageElements.tsUser.click();
        sleep(500);

        PageElements.Marka.click();
        actions().moveToElement(PageElements.Marka).sendKeys(PageElements.NAME_MARK).pause(500).sendKeys(Keys.chord(Keys.ENTER)).pause(500).build().perform();
        sleep(500);

        PageElements.tsYear.setValue("2004").shouldBe(Condition.visible).pressEnter();
        PageElements.tsModel.click();
        actions().moveToElement(PageElements.tsModel).sendKeys("2104").pause(500).sendKeys(Keys.chord(Keys.ENTER)).pause(500).build().perform();
        sleep(500);

        //Данные СТС
        PageElements.stsSeries.setValue("4822").shouldBe(Condition.visible).pressEnter();
        PageElements.stsNumber.setValue("556562").shouldBe(Condition.visible).pressEnter();
        PageElements.stsData.setValue("13.01.2015").shouldBe(Condition.visible).pressEnter();
        sleep(500);

        //Перидо страхования
        PageElements.insurancePeriod.click();
        sleep(500);

        ZoneId timezona = ZoneId.of("Europe/Moscow");// определене часового пояса
        LocalDate currentDate = LocalDate.now(timezona);// получение текущей даты
        LocalDate nextDay = currentDate.plusDays(1);// к текущей дате прибавляем день и получаем следющий день
        DateTimeFormatter frm = DateTimeFormatter.ofPattern("dd.MM.yyyy");// задаем формат даты
        String formatDate = frm.format(nextDay);

        PageElements.inBenning.setValue(formatDate).shouldBe(Condition.visible).pressEnter();
        sleep(500);

        PageElements.resume.click();

        PageElements.numbersOfDrivers.click();

        // ФИО Водителя
        PageElements.Surname.setValue("Макаров").shouldBe(Condition.visible).pressEnter();
        PageElements.Name.setValue("Максим").shouldBe(Condition.visible).pressEnter();
        PageElements.middleName.setValue("Олегович").shouldBe(Condition.visible).pressEnter();
        PageElements.DateOfBirth.setValue("29.06.1999").shouldBe(Condition.visible).pressEnter();
        sleep(500);

        //Водительское удостоверение
        PageElements.cardSeries.setValue("4834").shouldBe(Condition.visible).pressEnter();
        PageElements.cardNumber.setValue("832353").shouldBe(Condition.visible).pressEnter();
        PageElements.dataofIssue.setValue("14.12.2017").shouldBe(Condition.visible).pressEnter();
        PageElements.Details.click();
        sleep(500);

        PageElements.resume.click();

        //Вход в Личный кабинет

        PageElements.email.setValue("maksimqa.makaroff2014@yandex.ru").shouldBe(Condition.visible).pressEnter();
        PageElements.password.setValue("NUXV72").shouldBe(Condition.visible).pressEnter();
        PageElements.checkBox.click();
        sleep(500);
        PageElements.Enter.click();

        //Данные страхователя
     PageElements.Passport.click();
     PageElements.PassportRf.click();

     PageElements.seriesPs.setValue("4219").shouldBe(Condition.visible).pressEnter();
     PageElements.numberPs.setValue("207820").shouldBe(Condition.visible).pressEnter();
     PageElements.Addres.click();
     sleep(500);
     //PageElements.Addres.setValue("Липецкая обл, Липецкий р-н, деревня Копцевы Хутора, ул Котовского, д 9").shouldBe(Condition.visible).pressEnter();
     actions().moveToElement(PageElements.Addres).sendKeys("Липецкая обл, Липецкий р-н, деревня Копцевы Хутора, ул Котовского, д 9").pause(500).sendKeys(Keys.chord(Keys.ENTER)).pause(500).build().perform();
     sleep(500);

     PageElements.flat.setValue("21").shouldBe(Condition.visible).pressEnter();
     PageElements.index.setValue("398501").shouldBe(Condition.visible).pressEnter();
     sleep(500);

     PageElements.Resume.click();

     PageElements.check.click();
     PageElements.Strax.click();
     sleep(500);

     PageElements.calculate.click();

     Configuration.holdBrowserOpen = true;

    }

}
