package ru.cfmc.dev.quotas.tests.smoke.smokeForm5_4;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.tests.Form5_4.TestBaseFor5_4;

public class Smoke5_4 extends TestBaseFor5_4 {


    @Description("Названия тест кейса: Сценарий  'Наличие элементов в форме' Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров")
    @Link(name = "3.2.7",url = "https://atlassian.cfmc.ru/display/CFMC/3.2.7")
    @Tag("smoke")
    @Test
    public void t3_2_7(){
        el.setHeadElem();
        el.setPartOfPairDistrictElem();
        ge.assertMainElements();
        //Таблица
        elementsTable.setNumElemTable();
        elementsTable.setHistoryOfPartTable();
        elementsTable.setLockElemTable();
        elementsTable.setPartOfKvotsElemTable();
        elementsTable.setPoolElmTable();

        elementsTable.setDistrictProductElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setSizeOfPartElemTable();
        elementsTable.setNameOfUserElemTable();
        elementsTable.setInnOfUserElemTable();
        elementsTable.setNumbAndDateOfOrderElemTable();
        elementsTable.setDateOfStartAndEndOrderElemTable();
        elementsTable.setNumAndDateOrderRosribolovElemTable();
        elementsTable.dateExtraElemTableProb();
        elementsTable.setNumAndOrderChangeTable();
        Assertions.assertEquals(16,driver.findElements(By.xpath("//th[contains(text(),' ')]")).size());
        // Конец Таблицы

    }

    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопки 'Доли по паре ВБР-район\" в ЭФ \"Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров\"\t")
    @Link(name = "3.2.8",url = "https://atlassian.cfmc.ru/display/CFMC/3.2.8")
    @Tag("smoke")
    @Test
    public void t3_2_8(){
        ge.PartOfPairVBRButtonElClick();
        Assertions.assertEquals("Выберите необходимые данные:", getText("//p[contains(text(),'Выберите необходимые данные:')]"));
    }

    @Description("Названия тест кейса: Сценарий  \"Просмотр истории доли\"\t")
    @Link(name = "3.2.1",url = "https://atlassian.cfmc.ru/display/CFMC/3.2.1")
    @Tag("smoke")
    @Test
    public void t3_2_1(){
        el.goToHistoryClick();
        Assertions.assertEquals("Состав пакета долей и история владения",getText("//h1[contains(text(),'Состав пакета долей и история владения')]"));
        el.ownerHistoryClick();
        Assertions.assertEquals(14,driver.findElements(By.xpath("//th")).size());
    }

}
