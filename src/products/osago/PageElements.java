package products.osago;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;


import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.*;
import static services.data.references.Constants.COOKE;
import static services.data.references.Constants.PERSONAL;

public class PageElements {

    private PageElements() {

    }

    //protected static final String NAME_MARK = "ВАЗ";
    protected static final SelenideElement FRAME = $x("//*[@id='RESOLUTE_INSURANCE']");

    protected static final SelenideElement PRICE_CALCULATION = $(new WithTextCaseInsensitive("Рассчитать"));
    protected static final SelenideElement COOKE_CLICK = $(new WithTextCaseInsensitive(COOKE));

    // Транспортное средство
    protected static final SelenideElement TYPE =$x("//button[text()='Нет номера']");
    protected static final SelenideElement TS_CATEGORY = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']");
    protected static final SelenideElement TS_TYPE = $x("//div[@id='content-object-data-type']//div[text()='Легковой']");
    protected static final SelenideElement TS_USER = $(new WithTextCaseInsensitive(PERSONAL ));
    protected static final SelenideElement ENGINE_POWER = $x("//*[@class='input-group']/input[@name='content.object.data.power.value']");
    protected static final SelenideElement tsMarka = $x("//div[text()='Марка']");
    //*[@id='content-object-data-mark']//div[@class='SelectFieldInner__value-container css-1hwfws3']
    protected static final SelenideElement MARKA = $x("//div[contains(text(),'Марка')]");
    protected static final SelenideElement TS_YEAR= $x("//*[@class='input-group']/input[@name='content.object.data.prodYear']");
    protected static final SelenideElement TS_MODEL = $x("//div[text()='Модель']");// Модель тс заблокировано
    protected static final SelenideElement TS_VIN = $x("//*[@class='input-group']/input[@name='content.object.data.vin']");
    protected static final SelenideElement TS_NUMBER = $x("//*[@class='input-group']/input[@name='content.object.data.gosNumber']");
    // Серия и номер СТС
    protected static final SelenideElement STS_SERIES = $x("//*[@class='input-group']/input[@name='content.object.data.sts.seria']");
    protected static final SelenideElement STS_NUBMER = $x("//*[@class='input-group']/input[@name='content.object.data.sts.number']");
    protected static final SelenideElement STS_DATA = $x("//*[@class='input-group']/input[@name='content.object.data.sts.doi']");
    //Срок страхования
    protected static final SelenideElement INSURANSE_PERIOD = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']/div[text()='1 год']");
    protected static final SelenideElement IN_BENNING = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].beginDate']");
    protected static final SelenideElement inBefore = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].endDate']");

    // удостоверение водителей
    protected static final SelenideElement NUMBERS_OF_DRIVERS = $( new WithTextCaseInsensitive("Ограниченное"));
    // ФИО водителя
    protected static final SelenideElement SURNAME= $x("//div[@class='input-group']/input[@placeholder='Фамилия']");
    protected static final SelenideElement NAME= $x("//div[@class='input-group']/input[@placeholder='Имя']");
    protected static final SelenideElement MIDDLE_NAM = $x("//div[@class='input-group']/input[@placeholder='Отчество']");
    protected static final SelenideElement DATE_OF_BRITH= $x("//div[@class='input-group']/input[@name='content.insuredPerson.list[0].dob']");

    //Водительское удостоверение
    protected static final SelenideElement IDENTIFICATION_SERIES= $x("//*[@class='input-group']/input[@placeholder='Серия']");
    protected static final SelenideElement IDENTIFICATION_NUMBER = $x("//*[@class='input-group']/input[@placeholder='Номер']");
    protected static final SelenideElement DATA_OF_ISSUE = $x("//*[@class='input-group']/input[@name='content.insuredPerson.list[0].data.experienceFrom']");
    protected static final SelenideElement DETAILS = $x("//button[text()='Нет']");

    //Вход в Личный кабинет
    protected static final SelenideElement EMAIL = $x("//*[@class='input-group']/input[@name='email']");
    protected static final SelenideElement PASSWORD= $x("//*[@class='input-group']/input[@name='password']");
    protected static final SelenideElement CHECKBOX = $(new WithTextCaseInsensitive("Даю"));
    protected static final SelenideElement ENTERS = $x("//*[@type='submit']");

    //Данные страхователя
    protected static final SelenideElement PASSPORT = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']");
    protected static final SelenideElement PASSPORT_RF = $x("//div[text()='Паспорт гражданина РФ']");
    protected static final SelenideElement SERIES_PASSPORT = $x("//*[@class='input-group']/input[@placeholder='Серия']");
    protected static final SelenideElement NUMBER_PASSPORT = $x("//*[@class='input-group']/input[@placeholder='Номер']");
    protected static final SelenideElement PHONE_NUMBER = $x("//div[@class='input-group']/input[@placeholder='+7(___)___-__-__']");
    protected static final SelenideElement ADDRES = $x("//input[@placeholder='Адрес регистрации']");
    protected static final SelenideElement REG = $x("//*[@role='menu']/div[@role='menuitem'][1]");
    protected static final SelenideElement FLAT = $x("//input[@placeholder='Квартира']");
    protected static final SelenideElement INDEX = $x("//input[@placeholder='Индекс']");

    //Собственник
    protected static final SelenideElement CHECK = $(new WithTextCaseInsensitive("Собственник и страхователь"));
    protected static final SelenideElement CHICK = $x("//input[@type='checkbox'][1]");
    protected static final SelenideElement CHEC = $x("//div[@class='custom-checkbox custom-control']/input[@name='properties.accept']");
    protected static final SelenideElement POLICYHOLDER = $(new WithTextCaseInsensitive("Страхователь подтверждает"));
    protected static final SelenideElement CALCULATE = $x("//*[@class='btn btn-secondary btn-block']");

    // Переход на следующую вкладку
    protected static final SelenideElement RESUME = $x("//*[@class='text-right']/button");

    protected static final SelenideElement RESS = $x("//*[@class='btn btn-secondary btn-block']");

    //ElementCollections
    protected static ElementsCollection REGISTR = $$x("//*[@role='menu']");
    //*[@role='menu']/div[@role]

}
