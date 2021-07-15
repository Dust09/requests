package ru.cfmc.dev.quotas.tests.smoke.smokeForm2_1_1R;

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

class Smoke2_1_1 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo2_1_1();
    }

    public void goTo2_1_1() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 2.1.1");
        click("//div[contains(text(),'Виды ВБР - Районы добычи (вылова) (УФПиМ) ')]");
        Assertions.assertEquals("Виды ВБР - Районы добычи (вылова) (УФПиМ)",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form2_1_1"),driver.getCurrentUrl());
    }

    @Test
    public void t3_8(){
        Assertions.assertEquals(7,driver.findElements(By.xpath("//th")).size());
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