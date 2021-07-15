package ru.cfmc.dev.quotas.tests.smoke.smokeForm1_2_2R;

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

class Smoke1_2_2 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo1_2_2();
    }

    public void goTo1_2_2() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 1.2.2");
        click("//div[contains(text(),'Прекращение права на добычу (вылов) водных биоресурсов')] ");
        Assertions.assertEquals("Прекращение права на добычу (вылов) водных биоресурсов",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form1_2_2"),driver.getCurrentUrl());
    }

    @Test
    public void t1_2_2(){
        Assertions.assertEquals(8,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setUserVBRElemTable();

        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}
