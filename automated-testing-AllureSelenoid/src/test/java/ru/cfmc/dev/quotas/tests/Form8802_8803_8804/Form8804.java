package ru.cfmc.dev.quotas.tests.Form8802_8803_8804;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8802.PageObject88_02;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8804.PageObject88_04;

@Epic("Форма 88.02")
@Feature("Форма 88.04")
public class Form8804 extends TestBaseFor8802_8803_8804 {
    PageObject88_02 pageObject88_02 = new PageObject88_02();
    PageObject88_04 pageObject88_04 = new PageObject88_04();
    //Ошибка
    @Test
    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопки [ ] (расширить) в  ЭФ 'Добавить пары ОДУ в проект приказа'\"")
    @Link(name = "2.4.3",url = "https://atlassian.cfmc.ru/display/CFMC/2.4.3")
    public void t2_4_3(){
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        menuAddOdu();
        pageObject88_02.fullscreenClick();
        driver.navigate().back();
        //driver.navigate().refresh(); //-- можно добавить
        menuDelete();
        window_accept();
        findByCommentDelete(comm);
    }
    @Test
    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопок 'Опции' в  ЭФ 'Добавить пары ОДУ в проект приказа' \"\t")
    @Link(name = "2.4.4",url = "https://atlassian.cfmc.ru/display/CFMC/2.4.4")
    public void t2_4_4(){
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        menuAddOdu();
        pageObject88_02.optionsButtons(6);
        driver.navigate().back();
        menuDelete();
        window_accept();
        findByCommentDelete(comm);
    }

    //ошибка
    @Test
    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности чекбокса 'Выбрать все' в  ЭФ 'Добавить пары ОДУ в проект приказа' \"\t")
    @Link(name = "2.4.5",url = "https://atlassian.cfmc.ru/display/CFMC/2.4.5")
    public void t2_4_5(){
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        menuAddOdu();
        pageObject88_04.clickChooiseAllTableElem();
        Assertions.assertEquals(16,driver.findElements(By.xpath("//input[contains(@aria-checked,'true')]")).size());
        driver.navigate().back();
        menuDelete();
        window_accept();
        findByCommentDelete(comm);

    }
}
