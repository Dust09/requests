package ru.cfmc.dev.quotas.tests.smoke.smokdeForm3_5;


import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.Form3_5.TestBaseFor3_5;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;



public class Smoke3_5 extends TestBaseFor3_5 {
    @Description("Названия тест кейса: Сценарий  'Наличие элементов в форме во вкладке   'Квоты добычи (вылова) водных биоресурсов в морских водах '' ")
    @Link(name = "1.7.6",url = "https://atlassian.cfmc.ru/display/CFMC/1.7.6")
    @Tag("smoke")
    @Test
    public void t1_7_6(){
        step("Найти заголовок страницы");
        find(el.headPage);
        Assertions.assertEquals("Заявление об определении вида рыболовства, осуществляемого в расчетном году, с лицом, с которым заключен договор о " +
                        "закреплении доли квоты добычи (вылова) водных биологических ресурсов во внутренних морских водах Российской Федерации, в территориальном " +
                        "море Российской Федерации, на континентальном шельфе Российской Федерации, в исключительной экономической зоне Российской Федерации, Каспийском " +
                        "море или договор о закреплении доли квоты добычи (вылова) водных биологических ресурсов в районах действия международных договоров для осуществления " +
                        "промышленного рыболовства и (или) прибрежного рыболовства (ТУ или Управление организации рыболовства)",
                getText(el.headPage));
        el.setTabQuotsMeghdunarod();
        el.setTabQutsMorsk();
        ge.search_str();
        ge.loopElem();
        ge.fullscreenElem();
        ge.setOptionButton();
        ge.setFilterElem();
        //Фильтры
        ge.filterElemClick();
        Assertions.assertEquals(6,driver.findElements(By.xpath("//div[@class = 'v-select__slot']")).size());
        ge.setClearButtonFilter();

        //Таблица
        elementsTable.setNumElemTable();
        elementsTable.setRibDistrictElemTable();
        elementsTable.setDistrictProductElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setOrderNumElemTable();
        elementsTable.setDateZaklOrder();
        elementsTable.setSizeOfPartElemTable();
        elementsTable.setPribRibElemTable();
        elementsTable.setPromrRibElemTable();
        elementsTable.setOrganizationElemTable();
        elementsTable.setAddToApplicationElemTable();
        Assertions.assertEquals(11,driver.findElements(By.xpath("//th")).size());

        scroolDown();
        ge.strOnPage();
        ge.elem15();
        ge.flag();
        //ge.o1To15();
        ge.nextPage();
        ge.lastPage();
        ge.beforeAllBtn();
        ge.beforeBtn();
        ge.setCancelElem();
        ge.setSaveElem();
    }
    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме во вкладке   ' Квоты добычи (вылова) водных биоресурсов в районах действия международных договоров ' \"")
    @Link(name = "1.7.6",url = "https://atlassian.cfmc.ru/display/CFMC/1.7.6")
    @Tag("smoke")
    @Test
    public void t1_7_7(){
        el.tabQuotsMeghdunarodClick();
        step("Найти заголовок страницы");
        find(el.headPage);
        Assertions.assertEquals("Заявление об определении вида рыболовства, осуществляемого в расчетном году, с лицом, с которым заключен договор о " +
                        "закреплении доли квоты добычи (вылова) водных биологических ресурсов во внутренних морских водах Российской Федерации, в территориальном " +
                        "море Российской Федерации, на континентальном шельфе Российской Федерации, в исключительной экономической зоне Российской Федерации, Каспийском " +
                        "море или договор о закреплении доли квоты добычи (вылова) водных биологических ресурсов в районах действия международных договоров для осуществления " +
                        "промышленного рыболовства и (или) прибрежного рыболовства (ТУ или Управление организации рыболовства)",
                getText(el.headPage));
        el.setTabQuotsMeghdunarod();
        el.setTabQuotsMeghdunarod();
        ge.search_str();
        ge.loopElem();
        ge.fullscreenElem();
        ge.setOptionButton();
        //Таблица
        elementsTable.setNumElemTable();
        elementsTable.setDistrictRegularElemTable();
        elementsTable.setDistrictProductElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setOrderNumElemTable();
        elementsTable.setDateZaklOrder();
        elementsTable.setSizeOfPartElemTable();
        elementsTable.setPribRibElemTable();
        elementsTable.setPromrRibElemTable();
        elementsTable.setOrganizationElemTable();
        elementsTable.setAddToApplicationElemTable();
        Assertions.assertEquals(11,driver.findElements(By.xpath("//th")).size());

        ge.strOnPage();
        ge.elem15();
        ge.flag();
        ge.nextPage();
        ge.lastPage();
        ge.beforeBtn();
        ge.beforeAllBtn();
        ge.setCancelElem();
        ge.setSaveElem();

    }
}
