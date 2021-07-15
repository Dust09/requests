package ru.cfmc.dev.quotas.tests.Form5_4;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ru.cfmc.dev.quotas.MethodsSelenium;

import static io.qameta.allure.Allure.step;

public class ElementsForm5_4 extends MethodsSelenium {

    String headElem = "//h1[contains(text(),'Реестр долей квот добычи (вылова) водных биоресурс')]";
    public void setHeadElem(){
        step("найти элемент Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров");
        find(headElem);
    }

    String partOfPairDistrictElem = "//span[contains(text(),'Доли по паре ВБР-Район')]";
    public void setPartOfPairDistrictElem(){
        step("найти элемент Доли по паре ВБР-Район");
        find(partOfPairDistrictElem);
    }
    /*public void partOfPairClick(){
        step("Кликнуть по кнопке Доли по паре ВБР-Район");
        click(partOfPairDistrictElem);
    }*/







    //Кнопка Перейти (первая в таблице)
    String goToHistory = "(//a[contains(text(),'Перейти')])[1]";
    public void goToHistoryClick(){
        step("Нажать на Перейти");
        click(goToHistory);
    }

    //Состав пакета долей и история владения
    String ownerHistory = "//span[contains(text(),'История владения долей')]";
    public void ownerHistoryClick(){
        step("Кликнуть на вкладку История владения Долей");
        click(ownerHistory);
    }



    //Поле Фильтры

    String poolFilterElem = "(//label[contains(text(),'Бассейн')]/following-sibling::input)[1]";
            //"//label[contains(text(),'Бассейн')]";

    public void enterPoolFilterElem(){
        click(poolFilterElem);
        //sendKeys(poolFilterElem,"1");
        //sendKeys("(//input[contains(@type,'text')])[2]","1");
        step("В поле Бассейн ввести Дальневосточный бассейн");
        sendKeys(poolFilterElem,"1");
        click("//div[contains(text(),'Дальневосточный рыбохозяйственный бассейн (')]");
        Assertions.assertEquals(15,driver.findElements(By.xpath("//td[contains(text(),'Дальневосточный рыбохозяйственный бассейн (1)')]")).size());
    }
    //Поле Район добычи(вылова)
    String districtProductFilterElem = "(//label[contains(text(),'Район добычи (вылова)')]/following-sibling::input)[1]";
    public void enterDistrictProductFilterElem(){
        step("В поле Район добычи ввести Карагинская подзона");
        sendKeys(districtProductFilterElem,"264");
        click("//div[contains(text(),'Карагинская подзона (')]");
        Assertions.assertEquals(15,driver.findElements(By.xpath("//td[contains(text(),'Карагинская подзона (264)')]")).size());
    }
    //Поле ВБР
    String vbrFilterElem = ("(//label[contains(text(),'ВБР')]/following-sibling::input)[1]");
    public void enterVbrFilterElem(){
        step("Ввести в поле ВБР Минтай");
        sendKeys(vbrFilterElem,"400");
        sendKeys(vbrFilterElem, Keys.chord(Keys.ENTER));
        //Assertions.assertEquals(15,driver.findElements(By.xpath("//td[contains(text(),'Минтай (400)')]")).size());
        find("//td[contains(text(),'Минтай (400)')]");
    }
    //Поле Наименование пользователя

    //Поле ИНН пользователя
    //Кнопка Очистить
    String clearFilterElem = "//span[contains(text(),' Очистить ')]";
    public void clickClearFilterElem(){
        step("Нажать на кнопку Очистить");
        click(clearFilterElem);
    }

    String nameUserFilterElem = "(//label[contains(text(),'Наименование пользователя')]/following-sibling::input)[1]";
    public void enterNameUserFilterElem(){
        step("В поле Наименование пользователя ввести АКРОНИС 3");
        sendKeys(nameUserFilterElem, "АО «АКРОС 3» (13475)");
        click("//span[contains(text(),'АО «АКРОС 3» (13475)')]");

        sendKeys(vbrFilterElem, Keys.chord(Keys.ENTER));
        find("//td[contains(text(), 'АО «АКРОС 3» (13475)')]");
        step("выбрать ИНН пользователя");
        click("(//label[contains(text(),'ИНН пользователя')]/following-sibling::input)[1]");
        click("//div[contains(text(),'4101151638')]");
        find("//td[contains(text(),'4101151638')]");
        //sendKeys("(//label[contains(text(),'ИНН пользователя')]/following-sibling::input)[1]",Keys.chord(Keys.ENTER));
    }


    //Чекбоксы в опциях





}
