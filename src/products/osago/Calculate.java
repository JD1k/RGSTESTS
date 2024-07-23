package products.osago;


import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import services.data.references.BeforeTests;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

import static products.osago.PageElements.*;
import static products.osago.UiHelpers.*;
import static services.data.references.Constants.*;
import static services.data.references.Urls.OSAGO_SBERBANK;

public class Calculate extends BeforeTests {
    private Calculate (){

    }

    public static void startCalculate (){

        open(OSAGO_SBERBANK);
        sleep(ONE_SECOND);

        clickElement(COOKE_CLICK);
        //$("title").shouldHave(Condition.attribute("text", "ОСАГО онлайн: калькулятор еОСАГО"));
     assertEquals(title(),TITLE,WRONG);
     clickElement(PRICE_CALCULATION);
        //assertEquals($x("//h2[text()='Калькулятор ОСАГО']"),$x("//h2[text()='Калькулятор ОСАГО']"),"Вы зашли не туда");
       switchTo().frame(FRAME);
       sleep(HALF_SECOND);

       //Данные тс
     clickElement(TYPE);

     fillInField(TS_NUMBER,"В903ОР97");
     fillInField(TS_VIN, "XTK21043040012799");

     clickElement(TS_CATEGORY);
     fillInField(ENGINE_POWER, "71");

     clickElement(TS_TYPE);
     clickElement(TS_USER);

        fillInDropdownField(MARKA, "ВАЗ");

        fillInField(TS_YEAR,"2004");
        fillInDropdownField(TS_MODEL,"2104");

        //Данные СТС
        fillInField(STS_SERIES,"4822");
        fillInField(STS_NUBMER,"556562");
        fillInField(STS_DATA,"13.01.2015");

        //Перидо страхования
        clickElement(INSURANSE_PERIOD);

        ZoneId timezona = ZoneId.of("Europe/Moscow");// определене часового пояса
        LocalDate currentDate = LocalDate.now(timezona);// получение текущей даты
        LocalDate nextDay = currentDate.plusDays(1);// к текущей дате прибавляем день и получаем следющий день
        DateTimeFormatter frm = DateTimeFormatter.ofPattern("dd.MM.yyyy");// задаем формат даты
        String formatDate = frm.format(nextDay);
        fillInField(IN_BENNING,formatDate);

        clickElement(RESUME);

        clickElement(NUMBERS_OF_DRIVERS);

        // ФИО Водителя
        fillInField(SURNAME,"Макаров");
        fillInField(NAME,"Максим");
        fillInField(MIDDLE_NAM,"Олегович");
        fillInField(DATE_OF_BRITH,"29.06.1999");

        //Водительское удостоверение
        fillInField(IDENTIFICATION_SERIES,"4834");
        fillInField(IDENTIFICATION_NUMBER,"832353");
        fillInField(DATA_OF_ISSUE,"14.12.2017");
        clickElement(DETAILS);

        clickElement(RESUME);

        //Вход в Личный кабинет
        fillInField(EMAIL,"maksimqa.makaroff2014@yandex.ru");
        fillInField(PASSWORD,"NUXV72");
        clickElement(CHECKBOX);
        clickElement(ENTERS);

        //Данные страхователя

     //PageElements.Addres.setValue("Липецкая обл, Липецкий р-н, деревня Копцевы Хутора, ул Котовского, д 9").shouldBe(Condition.visible).pressEnter();
     //actions().moveToElement(PageElements.Addres).sendKeys("Липецкая обл, Липецкий р-н, деревня Копцевы Хутора, ул Котовского, д 9").pause(500).sendKeys(Keys.chord(Keys.ENTER)).pause(500).build().perform();
        clickElement(PASSPORT);
        clickElement(PASSPORT_RF);
        //Fill(SERIES_PASSPORT,"4219");
        //Fill(NUMBER_PASSPORT,"207820");

        //fillInField(SERIES_PASSPORT,"4219");
        //fillInField(NUMBER_PASSPORT,"207820");
        Fill(PHONE_NUMBER,"9155514296");


        fillInField(ADDRES,"Липецкая обл, Липецкий р-н, деревня Копцевы Хутора, ул Котовского, д 9");
        REG.click();

        fillInField(FLAT,"21");

        clickElement(RESS);



     clickElement(CHECK);
     clickElement(POLICYHOLDER);
     clickElement(CALCULATE);

     Configuration.holdBrowserOpen = true;

    }

}
