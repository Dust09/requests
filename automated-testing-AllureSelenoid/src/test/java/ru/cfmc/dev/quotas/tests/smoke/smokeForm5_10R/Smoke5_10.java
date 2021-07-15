package ru.cfmc.dev.quotas.tests.smoke.smokeForm5_10R;

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

class Smoke5_10 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo5_10();
    }

    public void goTo5_10() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 5.10");
        click("//div[contains(text(),'Реестр незакрепленных долей квот добычи (вылова) крабов, предоставленных в инвестиционных целях ')]");
        Assertions.assertEquals("Реестр незакрепленных долей квот добычи (вылова) крабов, предоставленных в инвестиционных целях",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form5_10"),driver.getCurrentUrl());
    }

    @Test
    public void t5_10(){

        Assertions.assertEquals(10,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setInnOfUserElemTable();

        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}