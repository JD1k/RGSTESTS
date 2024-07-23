package products.osago;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static services.data.references.Constants.HALF_SECOND;
import static services.data.references.Constants.TO_CENTER;

public class UiHelpers {
    private UiHelpers(){

    }
    public static void clickElement (SelenideElement element){
        sleep(HALF_SECOND);
        element.click();
        sleep(HALF_SECOND);
    }

    public static void fillInField (SelenideElement element, String keys){
        element.scrollIntoView(TO_CENTER);
        element.click();
        sleep(HALF_SECOND);
        element.setValue(keys);
        sleep(HALF_SECOND);
    }

    public static void fillInDropdownField (SelenideElement element, String keys){
        element.scrollIntoView(TO_CENTER);
        element.click();
        sleep(HALF_SECOND);
        actions().moveToElement(element)
                .sendKeys(keys)
                .pause(HALF_SECOND)
                .sendKeys(Keys.chord(Keys.ENTER))
                .pause(HALF_SECOND)
                .build().perform();
    }

    public static void addressAction (SelenideElement element, String keys){

        sleep(HALF_SECOND);
        element.click();
        actions().moveToElement(element).sendKeys(keys).pause(HALF_SECOND).sendKeys(Keys.DOWN,Keys.ENTER).pause(HALF_SECOND).build().perform();
    }

    public static void Fill(SelenideElement element, String keys){
        element.click();
        sleep(HALF_SECOND);
        element.clear();
        sleep(HALF_SECOND);
        element.setValue(keys).pressEnter();
        sleep(HALF_SECOND);
    }
}
