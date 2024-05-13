package products.osago;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;


import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PageElements {

    public static String NAME_MARK = "ВАЗ";

    public static SelenideElement test = $x("//a[@class='action-item btn--basic']");
    // Транспортное средство
    public  static SelenideElement tsCategory = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']");
    public static SelenideElement type =$x("//button[text()='Нет номера']");
    public static SelenideElement tsType = $x("//div[@id='content-object-data-type']//div[text()='Легковой']");
    public static SelenideElement tsUser = $(new WithTextCaseInsensitive("Личная"));
    public static SelenideElement enginePower = $x("//*[@class='input-group']/input[@name='content.object.data.power.value']");
    public static SelenideElement tsMarka = $x("//div[text()='Марка']");
    //*[@id='content-object-data-mark']//div[@class='SelectFieldInner__value-container css-1hwfws3']
    public static SelenideElement Marka = $x("//div[contains(text(),'Марка')]");
    public static SelenideElement tsYear = $x("//*[@class='input-group']/input[@name='content.object.data.prodYear']");
    public static SelenideElement tsModel = $x("//div[text()='Модель']");// Модель тс заблокировано
    public static SelenideElement tsVin = $x("//*[@class='input-group']/input[@name='content.object.data.vin']");
    public static SelenideElement tsNumber = $x("//*[@class='input-group']/input[@name='content.object.data.gosNumber']");
    // Серия и номер СТС
    public static SelenideElement stsSeries = $x("//*[@class='input-group']/input[@name='content.object.data.sts.seria']");
    public static SelenideElement stsNumber = $x("//*[@class='input-group']/input[@name='content.object.data.sts.number']");
    public static SelenideElement stsData = $x("//*[@class='input-group']/input[@name='content.object.data.sts.doi']");
    //Срок страхования
    public static SelenideElement insurancePeriod = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']/div[text()='1 год']");
    public static SelenideElement inBenning = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].beginDate']");
    public static SelenideElement inBefore = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].endDate']");

    // удостоверение водителей
    public static SelenideElement numbersOfDrivers = $( new WithTextCaseInsensitive("Ограниченное"));
    // ФИО водителя
    public static SelenideElement Surname = $x("//div[@class='input-group']/input[@placeholder='Фамилия']");
    public static SelenideElement Name = $x("//div[@class='input-group']/input[@placeholder='Имя']");
    public static SelenideElement middleName = $x("//div[@class='input-group']/input[@placeholder='Отчество']");
    public static SelenideElement DateOfBirth = $x("//div[@class='input-group']/input[@name='content.insuredPerson.list[0].dob']");

    //Водительское удостоверение
    public static SelenideElement cardSeries = $x("//*[@class='input-group']/input[@placeholder='Серия']");
    public static SelenideElement cardNumber = $x("//*[@class='input-group']/input[@placeholder='Номер']");
    public static SelenideElement dataofIssue = $x("//*[@class='input-group']/input[@name='content.insuredPerson.list[0].data.experienceFrom']");
    public static SelenideElement Details = $x("//button[text()='Нет']");

    //Вход в Личный кабинет
    public static SelenideElement email = $x("//*[@class='input-group']/input[@name='email']");
    public static SelenideElement password = $x("//*[@class='input-group']/input[@name='password']");
    public static SelenideElement checkBox = $(new WithTextCaseInsensitive("Даю"));
    public static SelenideElement Enter = $x("//*[@type='submit']");

    //Данные страхователя
    public static SelenideElement Passport = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']");
    public static SelenideElement PassportRf = $x("//div[text()='Паспорт гражданина РФ']");
    public static SelenideElement seriesPs = $x("//*[@class='input-group']/input[@placeholder='Серия']");
    public static SelenideElement numberPs = $x("//*[@class='input-group']/input[@placeholder='Номер']");
    public static SelenideElement Addres = $x("//input[@placeholder='Адрес регистрации']");
    public static SelenideElement flat = $x("//input[@placeholder='Квартира']");
    public static SelenideElement index = $x("//input[@placeholder='Индекс']");

    //Собственник
    public static SelenideElement check = $(new WithTextCaseInsensitive("Собственник"));
    public static SelenideElement Strax = $(new WithTextCaseInsensitive("Страхователь"));
    public static SelenideElement calculate = $x("//*[@class='btn btn-secondary btn-block']");

    // Переход на следующую вкладку
    public static SelenideElement resume = $x("//*[@class='text-right']/button");

    public static SelenideElement Resume = $x("//*[@class='btn btn-secondary btn-block']");

}
