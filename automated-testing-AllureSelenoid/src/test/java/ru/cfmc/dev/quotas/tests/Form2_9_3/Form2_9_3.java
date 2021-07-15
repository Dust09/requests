package ru.cfmc.dev.quotas.tests.Form2_9_3;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;

import static io.qameta.allure.Allure.step;

public class Form2_9_3 extends TestBaseFor2_9_3 {

    @Description("Названия тест кейса: Сценарий  \"Просмотр заявления в морских квотах\"")
    @Link(name = "1.9.5",url = "https://atlassian.cfmc.ru/display/CFMC/1.9.5")
    @Test
    public void t1_9_5(){
        numApplicationClick();
        Assertions.assertEquals("Просмотр поданных заявлений на вид рыболовства Морская и Международная",getText(el.headApplication));

        //В этой вкладке 8 столбцов
        Assertions.assertEquals(8,driver.findElements(By.xpath("//th")).size());
    }



    @Description("Названия тест кейса: Сценарий  \"Просмотр заявления в морских квотах\"")
    @Link(name = "1.9.6",url = "https://atlassian.cfmc.ru/display/CFMC/1.9.6")
    @Test
    public void t1_9_6(){
        el.tabMegdynarodnayaQuotsClick();
        numApplicationClick();
        el.tabMegdunarodnQuotsClick();
        Assertions.assertEquals("Просмотр поданных заявлений на вид рыболовства Морская и Международная",getText(el.headApplication));
        //В этой вкладке 9 столбцов
        Assertions.assertEquals(9,driver.findElements(By.xpath("//th")).size());
    }




}
