package ru.cfmc.dev.quotas.tests.smoke.smokeForm5_11R;

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

class Smoke5_11 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo5_11();
    }

    public void goTo5_11() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 5.11");
        click("//div[contains(text(),'Реестр незакрепленных долей квот добычи (вылова) водных биоресурсов, предоставленные на вылов ВБР на инвестиционные цели ')]");
        Assertions.assertEquals("Реестр незакрепленных долей квот добычи (вылова) водных биоресурсов, предоставленные на вылов ВБР на инвестиционные цели",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form5_11"),driver.getCurrentUrl());
    }

    @Test
    public void t5_11(){
        Assertions.assertEquals(12,driver.findElements(By.xpath("//th")).size());
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