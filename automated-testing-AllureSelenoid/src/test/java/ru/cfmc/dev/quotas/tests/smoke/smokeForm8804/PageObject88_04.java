package ru.cfmc.dev.quotas.tests.smoke.smokeForm8804;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.tests.Form8802_8803_8804.TestBaseFor8802_8803_8804;
import ru.cfmc.dev.quotas.tests.GeneralElements;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8802.PageObject88_02;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8803.PageObject88_03;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class PageObject88_04 extends TestBaseForAll {
    TestBaseFor8802_8803_8804 testBaseFor8802_8803_8804 = new TestBaseFor8802_8803_8804();
    PageObject88_02 pageObject88_02 = new PageObject88_02();
    PageObject88_03 pageObject8803 = new PageObject88_03();
    GeneralElements ge = new GeneralElements();
    @BeforeEach
    public void setUp(){
        browser();
        //перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav
        //driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div[2]/div[2]/div/div/a[2]/div[2]")).click();
        goToForm88_02B();
    }
    public void goToForm88_02B(){
        testBaseFor8802_8803_8804.BgoTo88_02();
    }

    public String districtActionTableElem = "//th[contains(text(),'Район действия')]";
    public void setDistrictActionTableElem(){
        step("Найти Элемент Район действия в таблице");
        find(districtActionTableElem);
    }

    public String addInProjectTableElem = "//th[contains(text(),'Добавить в проект приказа')]";
    public void setAddInProjectTableElem (){
        step("Найти элемент Добавить в проект приказа в таблице");
        find(addInProjectTableElem);
    }

    public String chooiseAllTableElem  = "//label[contains(text(),'Выбрать всё')]";
    public void setChooiseAllTableElem(){
        step("Найти элемент Выбрать всё в таблице");
        find(chooiseAllTableElem);
    }

    public void clickChooiseAllTableElem(){
        step("Кликнуть на элемент Выбрать всё");
        click(chooiseAllTableElem);
    }

    public String headElem  = "//h1[contains(text(),'Добавить пары ОДУ в проект приказа')]";
    public void setHeadElem(){
        step("Найти элемент Добавить пары ОДУ в проект приказа");
        find(headElem);
    }

    @AfterEach
    public void tearDown(){
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }


}
