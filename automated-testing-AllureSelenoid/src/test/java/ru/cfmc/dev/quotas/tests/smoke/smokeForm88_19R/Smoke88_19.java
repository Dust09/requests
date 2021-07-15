package ru.cfmc.dev.quotas.tests.smoke.smokeForm88_19R;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import static io.qameta.allure.Allure.step;

public class Smoke88_19 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo88_19();
    }

    public void goTo88_19() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 88.19");
        click("//div[contains(text(),'Журнал приказов международных комиссий по национальной квоте' )]");
        Assertions.assertEquals("Журнал приказов международных комиссий по национальной квоте",
                getText("//h1[contains(text(),'Журнал приказов международных комиссий по национальной квоте' )]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form88_19"),driver.getCurrentUrl());
    }

    @Test
    public void t88_19(){
        Assertions.assertEquals("Журнал приказов международных комиссий по национальной квоте",
                getText("//h1[contains(text(),'Журнал приказов международных комиссий по национальной квоте' )]"));
        Assertions.assertEquals(11,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setYearElemTable();
        elementsTable.setStatusElemTable();
        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}