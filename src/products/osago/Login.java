package products.osago;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import java.util.Objects;


import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

import static services.data.references.Urls.OSAGO_SBERBANK;

public class Login {

    @Test
    public static void doLogin (){

        //sleep(60000);
        //Configuration.pageLoadTimeout = 60000;

        open(OSAGO_SBERBANK);
        sleep(1500);

        $("title").shouldHave(Condition.attribute("text", "ОСАГО онлайн: калькулятор еОСАГО"));

        PageElements.test.click();
        assertEquals($x("//h2[text()='Калькулятор ОСАГО']"),$x("//h2[text()='Калькулятор ОСАГО']"),"Вы зашли не туда");
        sleep(2000);



    }

}
