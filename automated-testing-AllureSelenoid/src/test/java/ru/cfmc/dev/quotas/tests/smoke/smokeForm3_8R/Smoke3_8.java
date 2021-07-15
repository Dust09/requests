package ru.cfmc.dev.quotas.tests.smoke.smokeForm3_8R;

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

class Smoke3_8 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo3_8();
    }

    public void goTo3_8() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 3.8");
        click("//div[contains(text(),'Обращение о реорганизации ')]");
        Assertions.assertEquals("Обращение о замене стороны по договору о закреплении долей квот и прилагаемых к ней документов",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form3_8"),driver.getCurrentUrl());
    }

    @Test
    public void t3_8(){
        ge.sethomeinc();
        ge.setFinish();
        Assertions.assertEquals(10,driver.findElements(By.xpath("//div/label")).size());

        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}