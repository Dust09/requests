package ru.cfmc.dev.quotas.tests.Form8801;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import static io.qameta.allure.Allure.step;
@Epic("Форма 88.01")

public class Form8801 extends TestBaseFor88_01{
  /*  @Test
    @Description("Названия тест кейса: Сценарий  \"выбор года в диалоговом окне\"")
    @Link(name = "2,1,4",url = "https://atlassian.cfmc.ru/display/CFMC/2.1.4")
    public void t2_1_4()  {
        //Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        //Нажать на спадающее меню "Выберите год".
        year88_01();
        //Выбрать значение года 2020
        clickOn2020();
        sleep(500);
        Assertions.assertEquals(getText("//th[contains(text(),'ОДУ 2020')]"), "ОДУ 2020");
    }
    */

    @Test
    @Description("Названия тест кейса: Сценарий  \"Выгрузить в Excel\"")
    @Link(value = "2.1.3",url = "https://atlassian.cfmc.ru/display/CFMC/2.1.3")
    public void t2_1_3(){
        step("Кликнуть на Опции");
        click(generalElements.optionButton);
        sleep(1000);
        step("Выгрузить в Excel");
        click("//span[contains(text(),'Выгрузить в excel')]");
        generalElements.optionClose();
    }



}
