package ru.cfmc.dev.quotas.tests.smoke.smokeForm88_13R;

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

public class Smoke88_13 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo88_13();
    }

    public void goTo88_13() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 88.13");
        click("//div[contains(text(),'Распределенные между лицами, имеющими право на добычу (вылов), объемы части общего допустимого улова утвержденные применительно к морской и международной квоте ' )]");
        Assertions.assertEquals("Распределенные между лицами, имеющими право на добычу (вылов), объемы части общего " +
                        "допустимого улова утвержденные применительно к морской и международной квоте",
                getText("//h1[contains(text(),'Распределенные между лицами, имеющими право на добычу (вылов)," +
                        " объемы части общего допустимого улова утвержденные применительно к морской и международной квоте' )]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form88_13"),driver.getCurrentUrl());
    }

    @Test
    public void t88_13(){
        Assertions.assertEquals("Распределенные между лицами, имеющими право на добычу (вылов), объемы части общего " +
                        "допустимого улова утвержденные применительно к морской и международной квоте",
                getText("//h1[contains(text(),'Распределенные между лицами, имеющими право на добычу (вылов)," +
                        " объемы части общего допустимого улова утвержденные применительно к морской и международной квоте' )]"));
        Assertions.assertEquals(14,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setVbrElemTable();
        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}