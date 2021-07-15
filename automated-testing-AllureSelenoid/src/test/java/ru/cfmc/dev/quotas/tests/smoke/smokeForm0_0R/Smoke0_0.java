package ru.cfmc.dev.quotas.tests.smoke.smokeForm0_0R;

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
        goTo0_0();
    }

    public void goTo0_0() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 0.0");
        click("//div[contains(text(),'Работа с документами ')]");
        Assertions.assertEquals("Работа с документами",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form0_0"),driver.getCurrentUrl());
    }

    @Test
    public void t0_0(){
        Assertions.assertEquals(8,driver.findElements(By.xpath("//th")).size());
        ge.setFinish();
        ge.setOptionButton();
        ge.setSaveElem();
        ge.setCancelElem();
        elementsTable.setNumElemTable();
        elementsTable.setActionElemTable();


        //Доделать
    }
    @Test
    public void allForms(){
        driver.navigate().back();
        Assertions.assertEquals(31,driver.findElements(By.xpath("//div[@class = 'applications__card-right']")).size());
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}