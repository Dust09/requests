package ru.cfmc.dev.quotas.tests.Form3_5;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class TestBaseFor3_5 extends TestBaseForAll {
    public ElementsForm3_5 el = new ElementsForm3_5();
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();

    @BeforeEach
    public void setUp(){
        browser();
        goTo3_5();

       /* step("Кликнуть на опции");
        ge.options_click();
        step("Кликнуть на чекбокс Отображать поиск по колонкам ");
        ge.showSearchTableChbx();
        step("Закрыть опции");
        ge.optionClose();*/
    }

    public void goTo3_5() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 3.5");
        click("//div[contains(text() ,'Заявление об определении вида рыболовства, осуществляемого в расчетном году, с лицом, с которым заключен договор о закреплении доли квоты добычи (вылова) " +
                "водных биологических ресурсов во внутренних морских водах Российской Федерации, в территориальном море Российской Федерации, на континентальном шельфе " +
                "Российской Федерации, в исключительной экономической зоне Российской Федерации, Каспийском море или договор о закреплении доли квоты добычи (вылова) водных биологических" +
                " ресурсов в районах действия международных договоров для осуществления промышленного рыболовства и (или) прибрежного рыболовства (ТУ или Управление организации рыболовства) ')]");

        Assertions.assertEquals("Заявление об определении вида рыболовства, осуществляемого в расчетном году, с лицом, с которым заключен договор о " +
                "закреплении доли квоты добычи (вылова) водных биологических ресурсов во внутренних морских водах Российской Федерации, в территориальном " +
                "море Российской Федерации, на континентальном шельфе Российской Федерации, в исключительной экономической зоне Российской Федерации, Каспийском " +
                "море или договор о закреплении доли квоты добычи (вылова) водных биологических ресурсов в районах действия международных договоров для осуществления " +
                "промышленного рыболовства и (или) прибрежного рыболовства (ТУ или Управление организации рыболовства)",
                getText("//h1[contains(text(),'Заявление об определении вида рыболовства, осущест')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form3_5"),driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }


}
