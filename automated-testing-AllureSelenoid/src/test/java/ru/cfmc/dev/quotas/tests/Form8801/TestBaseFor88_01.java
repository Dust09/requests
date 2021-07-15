package ru.cfmc.dev.quotas.tests.Form8801;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class TestBaseFor88_01 extends TestBaseForAll {
    ElementsForm8801 elementsForm8801 = new ElementsForm8801();
    GeneralElements generalElements = new GeneralElements();
    @BeforeEach
    public void setUp(){
        browser();

        //перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav
        goTo88_01();
        //driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div[2]/div[2]/div/div/a[2]/div[2]")).click();
    }
    public void goTo88_01() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get("http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        step("кликнуть иконку 88.01");
        click("//div[contains(text(),'Общие допустимые уловы водных биоресурсов во внутренних морских водах РФ, на континентальном шельфе РФ, в исключительной экономической зоне РФ и Каспийском море ')]");
        Assertions.assertEquals("Общие допустимые уловы водных биоресурсов во внутренних морских " +
                        "водах РФ, на континентальном шельфе РФ, в исключительной экономической зоне РФ и Каспийском море"
                , getText("//h1[contains(text(),'Общие допустимые уловы водных биоресурсов во внутр')]"));


        click(generalElements.optionButton);
        click("//label[contains(text(),'Отображать поиск по колонкам в таблицах')]");
        generalElements.optionClose();



    }
    public void clickOn2020() {
        step("Выбрать значение года 2020");
        click(elementsForm8801.chooiseYear);
    }
//(//input[contains(@type,'text')])[1]
    public void year88_01() {
        step("Нажать на спадающее меню \"Выберите год\".");
        click(elementsForm8801.yearList);
    }

    public void optionButton(){
        step("Кликнуть на Опции");
        click(generalElements.optionButton);
    }
    @AfterEach
    public void tearDown() {
       /* Allure.addAttachment("ps1",
                "image/png",
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64));*/
        //Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        /*saveScreenshot();
        //driver.close();
         */
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }
}
