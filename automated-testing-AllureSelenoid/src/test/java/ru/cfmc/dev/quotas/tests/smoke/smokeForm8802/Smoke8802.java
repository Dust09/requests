package ru.cfmc.dev.quotas.tests.smoke.smokeForm8802;


import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static io.qameta.allure.Allure.step;
@Epic("Форма 88.02")
@Feature("Smoke 88.02")

public class Smoke8802 extends PageObject88_02  {


    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме \"Журнал приказов ОДУ\"\"\t")
    @Link(name="2.2.9", url="https://atlassian.cfmc.ru/display/CFMC/2.2.9")
    @Tag("smoke")
    @Test
    public void t2_2_9(){
         goToForm88_02();
         journalODU();
         createProject();
         driver.navigate().refresh();
        ge.assertMainElements();

         numberTable1();
         numberTable2();
         year();
         status();
         numberOrderUtv();
         dateOrderUtv();
         numberOrderCh();
         dateOrderCh();
         comment();
         utverdil();
         dateUtv();
         action();

         cancel();
         save();
        Assertions.assertEquals(15, actionBtnSize());

    }


    @Description("Названия тест кейса: Сценарий  \"Проверка работоспособности кнопки 'Создать проект приказа\"")
    @Link(name = "2.2.10",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.10")
    @Tag("smoke")
    @Test
    public void t2_2_10(){
        goToForm88_02();
        tb.createOrder();
        Assertions.assertEquals("Для создания корректирующего приказа следует воспользоваться соответствующим пунктом в меню столбца Действие.\n" +
                "Там же можно создать копию существующего приказа или проекта.\n" +
                "Вы уверены, что требуется создать пустой отдельный проект?", driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());
        window_dismiss();
    }

    @Description("Названия тест кейса: Сценарий  \"Проверка работоспособности кнопки 'Создать проект приказа\"")
    @Link(name = "2.2.11",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.11")
    @Tag("smoke")
    @Test
    public void t2_2_11(){
        goToForm88_02();
        tb.createOrder();
        Assertions.assertEquals("Для создания корректирующего приказа следует воспользоваться соответствующим пунктом в меню столбца Действие.\n" +
                "Там же можно создать копию существующего приказа или проекта.\n" +
                "Вы уверены, что требуется создать пустой отдельный проект?", driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());
        window_dismiss();
        tb.createOrder();
        window_accept();
        Assertions.assertEquals("Проект ОДУ - Ввод и редактирование общих допустимых уловов",getText("//h1[contains(text(),'Проект ОДУ - Ввод и редактирование общих допустимы')]"));
    }

    @Description("Названия тест кейса: Сценарий 'Проверка работоспособности кнопки Расширить [ ](расширить)'")
    @Link(name = "2.2.12",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.12")
    @Tag("smoke")
    @Test
    public void t2_2_12(){
        goToForm88_02();
        fullscreenClick();
        try {
            click("//a[contains(text(),'Квоты')]");
            step("Таблица НЕ расширена!!!");
            driver.get("http://cfmc.ru/");
            Assertions.assertEquals("Ошбка", "Ошибка");
        }catch (Exception e){
            step("Таблица расширена ");

            options_click();

        }

    }


    @Description("Названия тест кейса:  Сценарий \"Проверка работоспособности кнопок 'Опции'\"\"")
    @Link(name = "2.2.13",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.13")
    @Tag("smoke")
    @Test
    public void t2_2_13(){
        goToForm88_02();
        optionsButtons(11);
    }



    @Description("Названия тест кейса: Сценарий  \"Проверка работоспособности кнопки Действие и ее дополнительных функций\"")
    @Link(name = "2.2.15",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.15")
    @Tag("smoke")
    @Test
    public void t2_2_15(){
        goToForm88_02();
        actionBtnClick(1);
        showAndEditProdject();
        Assertions.assertEquals("Проект ОДУ - Ввод и редактирование общих допустимых " +
                "уловов",getText("//h1[contains(text(),'Проект ОДУ - Ввод и редактирование общих допустимы')]"));
        driver.navigate().back();
        actionBtnClick(1);
        copyProdject();
        window_dismiss();
        actionBtnClick(1);
        copyProdject();
        window_accept();
        Assertions.assertEquals("Проект ОДУ - Ввод и редактирование общих допустимых " +
                "уловов",getText("//h1[contains(text(),'Проект ОДУ - Ввод и редактирование общих допустимы')]"));
        driver.navigate().back();
        actionBtnClick(1);
        createCorrect();
        window_dismiss();

        tb.findByStatus("Приказ утвержден");
        String com = numBuilder();
        sendKeys("(//input[@type='text'])[1]",com.substring(0,3));
        stringBuilder();
        actionBtnClick(1);
        createCorrect();
        window_accept();
        Assertions.assertEquals("Проект ОДУ - Ввод и редактирование общих допустимых " +
                "уловов",getText("//h1[contains(text(),'Проект ОДУ - Ввод и редактирование общих допустимы')]"));
    }

    @Description("Названия тест кейса: Сценарий  \"Проверка работоспособности кнопки 'Строк на странице'\"\t")
    @Link(name = "2.2.16",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.16")
    @Tag("smoke")
    @Test
    public void t2_2_16(){
        goToForm88_02();
        Assertions.assertEquals(15,driver.findElements(By.xpath("(//i[contains(text(),'list')])")).size());
        flagClick();
        step("Выбрать 20");
        click("//div[contains(text(),'20')]");
        Assertions.assertEquals(20,driver.findElements(By.xpath("(//i[contains(text(),'list')])")).size());
        flagClick();
        step("Выбрать 30");
        click("//div[contains(text(),'30')]");
        Assertions.assertEquals(30,driver.findElements(By.xpath("(//i[contains(text(),'list')])")).size());
    }

    @Description("Названия тест кейса: Сценарий  \"Проверка ввода в поле 'Поиск'\"")
    @Link(name = "2.2.17",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.17")
    @Tag("smoke")
    @Test
    public void t2_2_17(){
        goToForm88_02();
        step("В поле \"Поиск\" ввести \"тест\"\t");
        sendKeys("(//input[contains(@type,'text')])[1]","тест");
        find("//td[contains(text(),'тест')]");
    }


    @Description("Названия тест кейса: Сценарий   \"Проверка работоспособности кнопок перелистывания \"\t")
    @Link(name = "2.2.18",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.18")
    @Tag("smoke")
    @Test
    public void t2_2_18(){
        goToForm88_02();
        scroolDown();
        scroolDown();
        step("Кликнуть на элемент \">\"(кнопка перелистывания страницы)\t");
        click("//i[contains(text(),'chevron_right')]");
        String assertS = getText("//span[contains(text(),'16 - 30 из ')]");
        if(assertS.contains("16 - 30 из ") == true){
            step("на странице 16 - 30 записей");
        }else{
            step("На странице некорректное кол-во записей");
            driver.get("http://cfmc.ru/");
            click("111");
        }
        scroolDown();
        step("Кликнуть на последнюю страницу");
        //click("//i[contains(text(),'last_page')]");

        clickLastPageElem();
        String numb = getText("(//tr/td[contains(text(),' ')])[1]");
        assertS = getText("(//span[contains(text(),'из ')])");

        if(assertS.contains(numb) == true){
            step("Корректное отображение");
        }else{
            step("На странице некорректное кол-во записей");
            driver.get("http://cfmc.ru/");
            click("111");
        }

        step("Кликнуть на пред.страницу");
        click("//i[contains(text(),'chevron_left')]");

        numb = getText("(//tr/td[contains(text(),' ')])[1]");
        assertS = getText("(//span[contains(text(),'из ')])");

        if(assertS.contains(numb) == true){
            step("корректное отображение");
        }else{
            step("На странице некорректное кол-во записей");
            driver.get("http://cfmc.ru/");
            click("111");
        }

        step("Кликнуть на первую страницу");
        click("//i[contains(text(),'first_page')]");

        numb = getText("(//tr/td[contains(text(),' ')])[1]");
        assertS = getText("(//span[contains(text(),'из ')])");

        if(assertS.contains(numb) == true){
            step("корректное отображение");
        }else{
            step("На странице некорректное кол-во записей");
            driver.get("http://cfmc.ru/");
            click("111");
        }


    }

}


