package products.osago;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.*;
import static services.data.references.Urls.OSAGO_SBERBANK;

public class Login {

    @Test
    public static void doLogin (){

        Configuration.timeout = 34000;

        open(OSAGO_SBERBANK);
        sleep(1500);

        assert Objects.equals(Selenide.title(), "Оформить ОСАГО от Сбербанка ");
    }

}
