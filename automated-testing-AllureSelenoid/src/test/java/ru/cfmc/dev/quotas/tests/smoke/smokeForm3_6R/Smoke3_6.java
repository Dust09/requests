package ru.cfmc.dev.quotas.tests.smoke.smokeForm3_6R;

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

class Smoke3_6 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo3_6();
    }

    public void goTo3_6() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 3.6");
        click("//div[contains(text(),'Перечень лиц, в отношении которых имеется решение о прекращении права на добычу (вылов) водных биоресурсов ')]/span[contains(text(),'(3.6)')]");
        Assertions.assertEquals("Перечень лиц, в отношении которых имеется решение о прекращении права на добычу (вылов) водных биоресурсов",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form3_6"),driver.getCurrentUrl());
    }

    @Test
    public void t3_6(){
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