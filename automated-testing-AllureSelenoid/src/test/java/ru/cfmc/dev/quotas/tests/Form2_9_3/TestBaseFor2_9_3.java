package ru.cfmc.dev.quotas.tests.Form2_9_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import static io.qameta.allure.Allure.step;

public class TestBaseFor2_9_3 extends TestBaseForAll {
    public ElementsForm2_9_3 el = new ElementsForm2_9_3();
    public GeneralElements gl = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();

    @BeforeEach
    public void setUp(){
        browser();
        goTo2_9_3();
    }

    public void goTo2_9_3(){
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 2.9.3");

        click("//div[contains(text(),'Консолидация заявлений об определении вида рыболовства, " +
                "осуществляемого в расчетном году, с лицом, с которым заключен договор о закреплении доли квоты добычи " +
                "(вылова) водных биологических ресурсов во внутренних морских водах Российской Федерации, в территориальном море Российской Федерации," +
                " на континентальном шельфе Российской Федерации, в исключительной экономической зоне Российской Федерации, Каспийском море или договор о закреплении доли квоты " +
                "добычи (вылова) водных биологических ресурсов в районах действия международных договоров для осуществления промышленного рыболовства и (или) прибрежного рыболовства" +
                " (ТУ или Управление организации рыболовства) ')]");
        Assertions.assertEquals("Консолидация заявлений об определении вида рыболовства, " +
                "осуществляемого в расчетном году, с лицом, с которым заключен договор о закреплении " +
                "доли квоты добычи (вылова) водных биологических ресурсов во внутренних морских водах Российской Федерации, " +
                "в территориальном море Российской Федерации, на континентальном шельфе Российской Федерации, в исключительной экономической зоне " +
                "Российской Федерации, Каспийском море или договор о закреплении доли квоты добычи (вылова) водных биологических ресурсов в районах действия " +
                "международных договоров для осуществления промышленного рыболовства и (или) прибрежного рыболовства (ТУ или Управление организации рыболовства)"
                ,getText("//h1[contains(text(),'Консолидация заявлений об определении вида рыболов')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form2_9_3"),driver.getCurrentUrl());
    }

    public void showResolve() {
        step("Кликнуть на смотреть решение");
        click("//div[contains(text(),'Смотреть решение')]");
    }

    public void numApplicationClick() {
        step("Кликнуть на номер заявления");
        click("(//a[@class='main-table__app-number no-decoration'])[1]");
    }

    @AfterEach
    public void end(){
        tearDown();
    }
}
