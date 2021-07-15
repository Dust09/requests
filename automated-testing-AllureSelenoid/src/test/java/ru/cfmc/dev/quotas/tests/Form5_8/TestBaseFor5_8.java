package ru.cfmc.dev.quotas.tests.Form5_8;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.Form5_4.ElementsForm5_4;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class TestBaseFor5_8 extends TestBaseForAll {
    public ElementsForm5_8 el = new ElementsForm5_8();
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();

    @BeforeEach
    public void setUp(){
        browser();
        goTo5_8();
    }

    public void goTo5_8() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 5.8");
        click("//div[contains(text(),'Реестр долей квот добычи (вылова) крабов, предоставленных в инвестиционных целях ')]");
        Assertions.assertEquals("Реестр долей квот добычи (вылова) крабов, предоставленных в инвестиционных целях",
                getText("//h1[contains(text(),'Реестр долей квот добычи (вылова) крабов, предоста')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form5_8"),driver.getCurrentUrl());
    }

    public void historyOfPair() {
        click("//span[contains(text(),'История владения долей')]");
        Assertions.assertEquals(14,driver.findElements(By.xpath("//th")).size());
    }





    @AfterEach
    public void tearDown(){
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }
}
