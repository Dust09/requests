package ru.cfmc.dev.quotas.tests.Form5_4;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class TestBaseFor5_4 extends TestBaseForAll {
   public ElementsForm5_4 el = new ElementsForm5_4();
   public GeneralElements ge = new GeneralElements();
   public ElementsTable elementsTable = new ElementsTable();

    @BeforeEach
    public void setUp(){
        browser();
        goTo5_4();

       /* step("Кликнуть на опции");
        ge.options_click();
        step("Кликнуть на чекбокс Отображать поиск по колонкам ");
        ge.showSearchTableChbx();
        step("Закрыть опции");
        ge.optionClose();*/
    }

    public void goTo5_4() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 5.4");
        click("//div[contains(text(),\"Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров \")]");
        Assertions.assertEquals("Реестр долей квот добычи (вылова) водных биоресурсов в морских водах и в районах действия международных договоров",getText("//h1[contains(text(),'Реестр долей квот добычи (вылова) водных биоресурс')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form5_4"),driver.getCurrentUrl());

    }


    @AfterEach
    public void tearDown() {
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }
}
