package ru.cfmc.dev.quotas.tests.smoke.smokeForm88_22R;

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

public class Smoke88_22 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo88_22();
    }

    public void goTo88_22() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 88.02");
        click("//div[contains(text(),'Просмотр утвержденных национальных квот ')]");
        Assertions.assertEquals("Просмотр утвержденных национальных квот",
                getText("//h1[contains(text(),'Просмотр утвержденных национальных квот' )]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form88_22"),driver.getCurrentUrl());
    }

    @Test
    public void t88_22(){
        Assertions.assertEquals("Просмотр утвержденных национальных квот",
                getText("//h1[contains(text(),'Просмотр утвержденных национальных квот')]"));
        Assertions.assertEquals(13,driver.findElements(By.xpath("//th")).size());
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