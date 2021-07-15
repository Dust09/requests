package ru.cfmc.dev.quotas.tests.smoke.smokeForm2_9_3;


import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.tests.Form2_9_3.TestBaseFor2_9_3;


import static io.qameta.allure.Allure.step;

public class Smoke2_9_3 extends TestBaseFor2_9_3 {

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме Во вкладке морская квота добычи(вылова) \"")
    @Link(name = "1.9.8",url = "https://atlassian.cfmc.ru/display/CFMC/1.9.8")
    @Tag("smoke")
    @Test
    public void t1_9_8(){
        find(el.elemHead);
        el.setTabMegdynarodnayaQuots();
        el.setTabMorskayaQuots();

        gl.assertMainElements();
        //Таблица
        elementsTable.setNumElemTable();
        elementsTable.setNumOfApplicationElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setINNElemTable();
        elementsTable.setNumbAndDateOfOrderElemTable();
        elementsTable.setDistrictProductElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setPartPercentElemTable();
        elementsTable.setPribRibElemTable();
        elementsTable.setPromrRibElemTable();
        elementsTable.setStatusElemTable();
        elementsTable.setActionElemTable();
        step("Кол во столбцов");
        Assertions.assertEquals(12,driver.findElements(By.xpath("//th")).size());

        Assertions.assertEquals(15,driver.findElements(By.xpath(gl.action)).size());

        //Фильтры
        gl.setFilterElem();
        gl.filterElemClick();
        el.setNumApplicationFilter();
        el.setUserVBRFilter();
        el.setINNFilter();
        el.setDistrictFilter();
        el.setVBRFilter();
        el.setStatusFilter();
        gl.setClearButtonFilter();
        step("Кол во Фильтров");
        Assertions.assertEquals(7,driver.findElements(By.xpath("//div[@class = 'v-select__slot']")).size());

        gl.setCancelElem();
        gl.setSaveElem();
    }

    @Description("Названия тест кейса: Сценарий  \"Посмотреть решение заявки в морских квотах в статусе Отказано\"")
    @Link(name = "1.9.1",url = "https://atlassian.cfmc.ru/display/CFMC/1.9.1")
    @Tag("smoke")
    @Test
    public void t1_9_1(){
        step("Кликнуть на действие");
        click(gl.action);
        showResolve();
        el.setApplication();
        el.setNameOrg();
        el.setReasonCancel();
        el.setBaseCancel();
        el.setFioSolve();
        el.setDateSolve();
        el.setCloseApplication();
        el.closeApplicationClick();
    }
    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме во вкладке Международная квота добычи (вылова) ВБР\"")
    @Link(name = "1.9.9",url = "https://atlassian.cfmc.ru/display/CFMC/1.9.9")
    @Tag("smoke")
    @Test
    public void t1_9_9(){
        el.tabMegdynarodnayaQuotsClick();
        step("Найти заголовок формы");
        find(el.elemHead);
        el.setTabMorskayaQuots();
        el.setTabMegdynarodnayaQuots();
        gl.assertMainElements();

        //Таблица
        elementsTable.setNumElemTable();
        elementsTable.setNumOfApplicationElemTable();
        elementsTable.setUserVBRElemTable();
        elementsTable.setINNElemTable();
        elementsTable.setDistrictRegularElemTable();
        elementsTable.setDistrictPromElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setPartPercentElemTable();
        elementsTable.setPribRibElemTable();
        elementsTable.setPromrRibElemTable();
        elementsTable.setStatusElemTable();
        elementsTable.setActionElemTable();
        step("Кол во столбцов");
        Assertions.assertEquals(12,driver.findElements(By.xpath("//th")).size());

        Assertions.assertEquals(15,driver.findElements(By.xpath(gl.action)).size());

        //Фильтры
        gl.setFilterElem();
        gl.filterElemClick();
        el.setNumApplicationFilter();
        el.setUserVBRFilter();
        el.setINNFilter();
        el.setDistrictRegFilter();
        el.setDistrictPromFilter();
        el.setVBRFilter();
        el.setStatusFilter();
        gl.setClearButtonFilter();
        step("Кол во Фильтров");
        Assertions.assertEquals(8,driver.findElements(By.xpath("//div[@class = 'v-select__slot']")).size());

        gl.setCancelElem();
        gl.setSaveElem();
    }
    @Description("Названия тест кейса: Сценарий  \"Посмотреть решение заявки в морских квотах в статусе Одобрено\"")
    @Link(name = "1.9.7",url = "https://atlassian.cfmc.ru/display/CFMC/1.9.7")
    @Tag("smoke")
    @Test
    public void t1_9_7(){
        step("Кликнуть на действие");
        gl.actionClickIter(2);
        showResolve();
        el.setApplication();
        el.setNameOrg();
        el.setApprovedApplication();
        el.setFioSolve();
        el.setDateSolve();
        el.setCloseApplication();
        el.closeApplicationClick();
    }




}
