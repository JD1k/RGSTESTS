package services.data.references;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

public class BeforeTests {
    protected BeforeTests (){

    }
    @BeforeTest
    public static void beforeTests(){
        Configuration.pageLoadTimeout = 60000;
        //Configuration.browserSize = "1920x1080";
    }

}
