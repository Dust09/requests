package ru.cfmc.dev.quotas.tests.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.cfmc.dev.quotas.MethodsSelenium;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.tests.GeneralElements;

public class ElementAll extends TestBaseForAll {
    MethodsSelenium methodsSelenium = new MethodsSelenium();
    GeneralElements generalElements = new GeneralElements();
    //public WebDriver driver;
    public ElementAll(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


    @FindBy(xpath = "(//label[contains(text(),'№')])[1]")
    public WebElement number1;

    /*@FindBy(xpath = "(//label[contains(text(),'№')])[2]")
    public WebElement number2;*/

    @FindBy(xpath = "(//label[contains(text(),'Год')])[3]")
    public WebElement year;

    @FindBy(xpath = "(//label[contains(text(),'Статус')])")
    public WebElement status;

    @FindBy(xpath = "//label[contains(text(),'№ приказа об утверждении ОДУ')]")
    public WebElement numberOrder;

    @FindBy(xpath = "//label[contains(text(),'Дата приказа об утверждении ОДУ')]")
    public WebElement dateOrder;

    @FindBy(xpath = "//label[contains(text(),'№ приказа о внесении изменений ОДУ')]")
    public WebElement numberOrderCh;

    @FindBy(xpath = "//label[contains(text(),'Дата приказа о внесении изменений ОДУ')]")
    public WebElement dataOrderCh;

    @FindBy(xpath = "//label[contains(text(),'Комментарий')]")
    public WebElement comm;

    @FindBy(xpath = "//label[contains(text(),'Утвердил')]")
    public WebElement utv;

    @FindBy(xpath = "//label[contains(text(),'Дата утв.')]")
    public WebElement dateUtv;


    //Таблица Поиск по колонке
    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[1]")
    public WebElement findNumb;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[2]")
    public WebElement findYear;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[3]")
    public WebElement findStatus;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[4]")
    public WebElement findNumberOrder;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[5]")
    public WebElement findDateOrder;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[6]")
    public WebElement findNumbOrderCh;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[7]")
    public WebElement findDateOrderCh;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[8]")
    public WebElement findComm;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[9]")
    public WebElement findUtv;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[10]")
    public WebElement findDateUtv;

    @FindBy(xpath = "(//input[contains(@placeholder,'Поиск по колонке...')])[1]")
    public WebElement findAction;


    //------------------------------------------------------------------------------




    /*public void saveButn(){
        GeneralElements.saveButton();
    }*/





}
