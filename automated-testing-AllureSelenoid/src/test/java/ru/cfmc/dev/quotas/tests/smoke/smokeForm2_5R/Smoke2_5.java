package ru.cfmc.dev.quotas.tests.smoke.smokeForm2_5R;

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

class Smoke2_5 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo2_5();
    }

    public void goTo2_5() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 2.5");
        click("//div[contains(text(),'Реестр видов ВБР, в отношении которых осуществляется ПРОМ/ПРИБ ')]");
        Assertions.assertEquals("Реестр видов ВБР, в отношении которых осуществляется ПРОМ/ПРИБ",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form2_5"),driver.getCurrentUrl());
    }

    @Test
    public void t2_5(){
        Assertions.assertEquals(9,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setCommElemTable();
        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}