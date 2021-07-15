package ru.cfmc.dev.quotas.tests.smoke.smokeForm8804;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Форма 88.02")
@Feature("Smoke 88.04")

public class Smoke8804 extends PageObject88_04 {

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов ЭФ 'Добавить пары ОДУ в проект приказа' \"\t")
    @Link(name = "2.4.1",url = "https://atlassian.cfmc.ru/display/CFMC/2.4.1")
    @Tag("smoke")
    @Test
    public void t2_4_1(){
        testBaseFor8802_8803_8804.createOrder();
        window_accept();
        String comm = stringBuilder();
        testBaseFor8802_8803_8804.enterComment(comm);
        testBaseFor8802_8803_8804.saveButton();
        testBaseFor8802_8803_8804.menuAddOdu();
        setHeadElem();
        ge.assertMainElements();
        //Таблица
        pageObject88_02.numberTable1();
        pageObject8803.setFishPoolTableElem();
        pageObject8803.setDistrictTableElem();
        pageObject8803.setVbrTableElem();
        pageObject8803.setDistrictTableElem();
        setAddInProjectTableElem();
        setChooiseAllTableElem();

        pageObject88_02.save();
        pageObject88_02.cancel();
        driver.navigate().back();
        testBaseFor8802_8803_8804.menuDelete();
        window_accept();
        testBaseFor8802_8803_8804.findByCommentDelete(comm);
    }



    @Description("Названия тест кейса: Сценарий  " +
            "\"Добавление пар из ЭФ 'Добавить пары ОДУ в проект приказа'  в ЭФ \"Проект ОДУ - Ввод и редактирование общих допустимых уловов\"\t")
    @Link(name = "2.4.2",url = "https://atlassian.cfmc.ru/display/CFMC/2.4.2")
    @Tag("smoke")
    @Test
    public void t2_4_2(){
        testBaseFor8802_8803_8804.createOrder();
        window_accept();
        String comm = stringBuilder();
        testBaseFor8802_8803_8804.enterComment(comm);
        testBaseFor8802_8803_8804.saveButton();
        testBaseFor8802_8803_8804.menuAddOdu();
        testBaseFor8802_8803_8804.addVbrCase();
        testBaseFor8802_8803_8804.saveButton();
        driver.navigate().back();
        testBaseFor8802_8803_8804.assertVbrCase();
        testBaseFor8802_8803_8804.menuDelete();
        sleep(500);
        window_accept();
        sleep(1000);
        testBaseFor8802_8803_8804.findByCommentDelete(comm);
    }


}
