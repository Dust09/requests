package ru.cfmc.dev.quotas.tests.Form5_4;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static io.qameta.allure.Allure.step;

public class Form5_4 extends TestBaseFor5_4{

    @Description("Названия тест кейса:  Сценарий \"Проверка работоспособности кнопки [ ]" +
            "(расширить) в ЭФ \"Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров\"")
    @Link(name = "3.2.9",url = "https://atlassian.cfmc.ru/display/CFMC/3.2.9")
    @Test
    public void t3_2_9(){
        ge.fullscreenClick();
    }

    @Description("\tНазвания тест кейса: Сценарий \"Проверка работоспособности элемента" +
            " Фильтры в ЭФ \"Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров\"")
    @Link(name = "3.2.10",url = "https://atlassian.cfmc.ru/display/CFMC/3.2.10")
    @Test
    public void t3_2_10(){
        ge.filterElemClick();
        //кол-во полей в фильтрах
        Assertions.assertEquals(6,driver.findElements(By.xpath("//div[contains(@class,'filters__fields')]//label")).size());
        el.enterPoolFilterElem();
        el.enterDistrictProductFilterElem();
        el.clickClearFilterElem();
        el.enterNameUserFilterElem();
        el.enterVbrFilterElem();
    }


    @Description("\tНазвания тест кейса: Сценарий \"Проверка работоспособности элемента" +
            " Фильтры в ЭФ \"Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров\"")
    @Link(name = "3.2.11",url = "https://atlassian.cfmc.ru/display/CFMC/3.2.11")
    @Test
    public void t3_2_11(){
        el.setHeadElem();
        el.setPartOfPairDistrictElem();
        ge.fullscreenElem();
        ge.optionsButtons(16,7);

    }
    @Description("Названия тест кейса: Сценарий  \"Поиск всех долей по паре ВБР-Район\"")
    @Link(name = "3.2.5",url = "https://atlassian.cfmc.ru/display/CFMC/3.2.5")
    @Test
    public void t3_2_5(){
        ge.PartOfPairVBRButtonElClick();
        ge.enterVBR();
        ge.enterDistrict();
        Assertions.assertEquals(5,driver.findElements(By.xpath("//th")).size());

    }



}
