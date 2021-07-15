package ru.cfmc.dev.quotas.tests.Form5_8;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Form5_8 extends TestBaseFor5_8 {

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме \"")
    @Link(name = "3.3.6",url = "https://atlassian.cfmc.ru/display/CFMC/3.3.6")
    @Test
    public void t3_3_6(){
        ge.PartOfPairVBRButtonElClick();
        ge.enterVBR();
        ge.enterDistrict();
        Assertions.assertEquals(4,driver.findElements(By.xpath("//th")).size());

    }
}
