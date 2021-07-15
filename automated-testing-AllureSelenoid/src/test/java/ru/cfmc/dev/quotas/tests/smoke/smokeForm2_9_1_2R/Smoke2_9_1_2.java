package ru.cfmc.dev.quotas.tests.smoke.smokeForm2_9_1_2R;


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

public class Smoke2_9_1_2 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo2_9_1_2();
    }

    public void goTo2_9_1_2() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 2.9.1.2");
        click("//div[contains(text(),'Журнал заявок на виды рыболовства НИР, УЧЕБ, АКВА ')]");
        Assertions.assertEquals("Журнал заявок на виды рыболовства НИР, УЧЕБ, АКВА",
                getText("//h1[contains(text(),'Журнал заявок на виды рыболовства НИР, УЧЕБ, АКВА')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form2_9_1_2"),driver.getCurrentUrl());
    }

    @Test
    public void t2_9_1_2(){
        Assertions.assertEquals("Журнал заявок на виды рыболовства НИР, УЧЕБ, АКВА",
                getText("//h1[contains(text(),'Журнал заявок на виды рыболовства НИР, УЧЕБ, АКВА')]"));
        Assertions.assertEquals(8,driver.findElements(By.xpath("//th")).size());
        ge.setFilterElem();
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
