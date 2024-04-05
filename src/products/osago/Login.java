package products.osago;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.drivercommands.WebDriverWrapper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;


import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

import static services.data.references.Urls.OSAGO_SBERBANK;

public class Login {

    @Test
    public static void doLogin () {

        //sleep(60000);
        Configuration.pageLoadTimeout = 8000;

        open(OSAGO_SBERBANK);
        sleep(1500);

        $("title").shouldHave(Condition.attribute("text", "ОСАГО онлайн: калькулятор еОСАГО"));

        PageElements.test.click();
        assertEquals($x("//h2[text()='Калькулятор ОСАГО']"),$x("//h2[text()='Калькулятор ОСАГО']"),"Вы зашли не туда");
        sleep(2000);

        switchTo().frame($x("//*[@id='RESOLUTE_INSURANCE']"));

        //Данные ТС
        PageElements.tsCategory.click();
        sleep(2000);

        PageElements.enginePower.setValue("71").shouldBe(Condition.visible,Duration.ofSeconds(5)).pressEnter();

        PageElements.Type.click();
        sleep(1500);
        PageElements.tsUser.click();
        actions().moveToElement(PageElements.Marka).click().sendKeys(PageElements.NAME_MARK).click().pause(2000).build().perform();
        sleep(1500);
        PageElements.tsYear.setValue("2004").shouldBe(Condition.visible).pressEnter();
        sleep(1500);
        //PageElements.tsModel.setValue("2104").shouldBe(Condition.visible).pressEnter();
        actions().moveToElement(PageElements.tsModel).click().sendKeys("2104").click().pause(2000).build().perform();
        //sleep(1500);
        PageElements.tsVin.setValue("XTK21043040012799").shouldBe(Condition.visible).pressEnter();
        PageElements.tsNumber.setValue("В903ОР97").shouldBe(Condition.visible).pressEnter();
        sleep(1500);
        //Данные СТС
        PageElements.stsSeries.setValue("4822").shouldBe(Condition.visible).pressEnter();
        PageElements.stsNumber.setValue("556562").shouldBe(Condition.visible).pressEnter();
        PageElements.stsData.setValue("13.01.2015").shouldBe(Condition.visible).pressEnter();
        sleep(1500);
        //Перидо страхования
        PageElements.insurancePeriod.click();
        PageElements.inBenning.setValue("06.04.2024").shouldBe(Condition.visible).pressEnter();
        //PageElements.inBefore.setValue("").shouldBe(Condition.visible).pressEnter();
        sleep(1500);



        // PageElements.resume.click();





        //PageElements.tsCategory.click();
        //Thread.sleep(2000);


    }

}
