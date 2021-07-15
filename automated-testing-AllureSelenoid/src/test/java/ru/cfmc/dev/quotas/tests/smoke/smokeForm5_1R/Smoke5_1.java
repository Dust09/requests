package ru.cfmc.dev.quotas.tests.smoke.smokeForm5_1R;

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

class Smoke5_1 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo5_1();
    }

    public void goTo5_1() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 5.1");
        click("//div[contains(text(),'Реестр договоров и дополнительных соглашений о закреплении долей квот добычи (вылова) водных ресурсов ')]");
        Assertions.assertEquals("Реестр договоров и дополнительных соглашений о закреплении долей квот добычи (вылова) водных ресурсов",
                getText("//h1[@class = 'form-title']"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form5_1"),driver.getCurrentUrl());
    }

    @Test
    public void t5_1(){
        Assertions.assertEquals(13,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setStatusElemTable();

        //Доделать
    }


    //Загрузка файла на портал
   /* @Test
    public void rre(){
        driver.get("http://quotas-dev.cfmc.ru/fishery/quotatest/applications/std/15?name=contract_edit");
        //click("(//span[contains(text(),'Прикрепить файл')])");

        String filePath = "/etc/debconf.conf";

        driver.findElement(By.xpath("(//input[@type = 'file'])")).sendKeys(filePath);
        sleep(10000);
    }
*/
    @AfterEach
    public void teardown(){
        tearDown();
    }

}