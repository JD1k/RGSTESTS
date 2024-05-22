package products.osago;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;


import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PageElements {

    private PageElements() {

    }

    //protected static final String NAME_MARK = "ВАЗ";

    protected static final SelenideElement test = $x("//a[@class='action-item btn--basic']");
    // Транспортное средство
    protected static final SelenideElement tsCategory = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']");
    protected static final SelenideElement type =$x("//button[text()='Нет номера']");
    protected static final SelenideElement tsType = $x("//div[@id='content-object-data-type']//div[text()='Легковой']");
    protected static final SelenideElement tsUser = $(new WithTextCaseInsensitive("Личная"));
    protected static final SelenideElement enginePower = $x("//*[@class='input-group']/input[@name='content.object.data.power.value']");
    protected static final SelenideElement tsMarka = $x("//div[text()='Марка']");
    //*[@id='content-object-data-mark']//div[@class='SelectFieldInner__value-container css-1hwfws3']
    protected static final SelenideElement Marka = $x("//div[contains(text(),'Марка')]");
    protected static final SelenideElement tsYear = $x("//*[@class='input-group']/input[@name='content.object.data.prodYear']");
    protected static final SelenideElement tsModel = $x("//div[text()='Модель']");// Модель тс заблокировано
    protected static final SelenideElement tsVin = $x("//*[@class='input-group']/input[@name='content.object.data.vin']");
    protected static final SelenideElement tsNumber = $x("//*[@class='input-group']/input[@name='content.object.data.gosNumber']");
    // Серия и номер СТС
    protected static final SelenideElement stsSeries = $x("//*[@class='input-group']/input[@name='content.object.data.sts.seria']");
    protected static final SelenideElement stsNumber = $x("//*[@class='input-group']/input[@name='content.object.data.sts.number']");
    protected static final SelenideElement stsData = $x("//*[@class='input-group']/input[@name='content.object.data.sts.doi']");
    //Срок страхования
    protected static final SelenideElement insurancePeriod = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']/div[text()='1 год']");
    protected static final SelenideElement inBenning = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].beginDate']");
    protected static final SelenideElement inBefore = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].endDate']");

    // удостоверение водителей
    protected static final SelenideElement numbersOfDrivers = $( new WithTextCaseInsensitive("Ограниченное"));
    // ФИО водителя
    protected static final SelenideElement Surname = $x("//div[@class='input-group']/input[@placeholder='Фамилия']");
    protected static final SelenideElement Name = $x("//div[@class='input-group']/input[@placeholder='Имя']");
    protected static final SelenideElement middleName = $x("//div[@class='input-group']/input[@placeholder='Отчество']");
    protected static final SelenideElement DateOfBirth = $x("//div[@class='input-group']/input[@name='content.insuredPerson.list[0].dob']");

    //Водительское удостоверение
    protected static final SelenideElement cardSeries = $x("//*[@class='input-group']/input[@placeholder='Серия']");
    protected static final SelenideElement cardNumber = $x("//*[@class='input-group']/input[@placeholder='Номер']");
    protected static final SelenideElement dataofIssue = $x("//*[@class='input-group']/input[@name='content.insuredPerson.list[0].data.experienceFrom']");
    protected static final SelenideElement Details = $x("//button[text()='Нет']");

    //Вход в Личный кабинет
    protected static final SelenideElement email = $x("//*[@class='input-group']/input[@name='email']");
    protected static final SelenideElement password = $x("//*[@class='input-group']/input[@name='password']");
    protected static final SelenideElement checkBox = $(new WithTextCaseInsensitive("Даю"));
    protected static final SelenideElement Enter = $x("//*[@type='submit']");

    //Данные страхователя
    protected static final SelenideElement Passport = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']");
    protected static final SelenideElement PassportRf = $x("//div[text()='Паспорт гражданина РФ']");
    protected static final SelenideElement seriesPs = $x("//*[@class='input-group']/input[@placeholder='Серия']");
    protected static final SelenideElement numberPs = $x("//*[@class='input-group']/input[@placeholder='Номер']");
    protected static final SelenideElement Addres = $x("//input[@placeholder='Адрес регистрации']");
    protected static final SelenideElement flat = $x("//input[@placeholder='Квартира']");
    public static final SelenideElement index = $x("//input[@placeholder='Индекс']");

    //Собственник
    public static final SelenideElement check = $(new WithTextCaseInsensitive("Собственник"));
    public static final SelenideElement Strax = $(new WithTextCaseInsensitive("Страхователь"));
    public static final SelenideElement calculate = $x("//*[@class='btn btn-secondary btn-block']");

    // Переход на следующую вкладку
    public static final SelenideElement resume = $x("//*[@class='text-right']/button");

    public static final SelenideElement Resume = $x("//*[@class='btn btn-secondary btn-block']");

}
