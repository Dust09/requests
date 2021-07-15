package ru.cfmc.dev.quotas.tests.smoke.smokeForm5_9R;

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

class Smoke5_9 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo5_9();
    }

    public void goTo5_9() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 5.9");
        click("//div[contains(text(),'Реестр долей квот добычи (вылова) водных биоресурсов, предоставленные на инвестиционные цели ')]");
        Assertions.assertEquals("Реестр долей квот добычи (вылова) водных биоресурсов, предоставленные на инвестиционные цели",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form5_9"),driver.getCurrentUrl());
    }

    @Test
    public void t5_9(){

        Assertions.assertEquals(16,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setNumbAndDateOfOrderElemTable();
        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}