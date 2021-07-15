package ru.cfmc.dev.quotas.tests.smoke.smokeForm2_9_1aR;

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

public class Smoke2_9_1a extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo2_9_1a();
    }

    public void goTo2_9_1a() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 2.9.1.2");
        click("//div[contains(text(),'Журнал предложений ОИВ КМНС')]");
        Assertions.assertEquals("Журнал предложений ОИВ КМНС",
                getText("//h1[contains(text(),'Журнал предложений ОИВ КМНС')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form2_9_1a"),driver.getCurrentUrl());
    }

    @Test
    public void t2_9_1a(){
        Assertions.assertEquals(7,driver.findElements(By.xpath("//th")).size());
        //ge.setFilterElem(); были фильтры ?
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setStatusElemTable();
        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}
