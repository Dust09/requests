package ru.cfmc.dev.quotas.tests.smoke.smokeForm88_16R;



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

class Smoke88_01 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo88_16();
    }

    public void goTo88_16() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 88.16");
        click("//div[contains(text(),'Утвержденное распределение между лицами квот  с которыми заключены договора о закреплении доли квот добычи (вылова) ВБР/крабов предоставленных на инвестиционные цели ')]");
        Assertions.assertEquals("Утвержденное распределение между лицами квот с которыми заключены договора о закреплении доли квот добычи (вылова) ВБР/крабов предоставленных на инвестиционные цели",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form88_16"),driver.getCurrentUrl());
    }

    @Test
    public void t88_16(){

        Assertions.assertEquals(12,driver.findElements(By.xpath("//th")).size());
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