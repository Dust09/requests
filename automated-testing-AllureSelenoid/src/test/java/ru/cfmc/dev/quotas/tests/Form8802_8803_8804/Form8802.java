package ru.cfmc.dev.quotas.tests.Form8802_8803_8804;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;
@Epic("Форма 88.02")
//@Feature("Форма 88.02")
public class Form8802 extends TestBaseFor8802_8803_8804 {

    @Description("Названия тест кейса: Сценарий  \"Создать новый проект приказа\"")
    @Link(name = "2.2.1",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.1")
    @Test
    public void t2_2_1(){
        //step("создать проект приказа");
        createOrder();
        //step("нажать ок");
        window_accept();
        // год оду
        //удалить год
        deleteYear();
        //step("ввести год оду 2020");
        enterYear2020();
        //step("ввести комменарий");
        String comm = stringBuilder();
        enterComment(comm);
        //step("нажать 'сохранить'");
        saveButton();
        //проверка
        goTo88_02();
        findByComment(comm);
    }

    @Description("Сценарий  \"Просмотр и редактирование проекта\" для статуса приказа \"Утвержден\"")
    @Link(name = "2.2.2",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.2")
    @Test
    public void t2_2_2(){
        step("ввод в поле статус 'Приказ утвержден'");
        //sendKeys("(//input[contains(@placeholder,'Поиск по колонке')])[3]","Приказ утвержден");
        findByStatus("Приказ утвержден");
        //step("Нажать на Действие");
        //step("Нажать на 'Просмотр и редактирование приказов ОДУ'");
        odu();
        //проверка
        Assertions.assertEquals(7,statusApprovedAll());
        //statusApprovedAll();
    }



    @Test
    @Description("Названия тест кейса: Сценарий  \"Просмотр и редактирование проекта\" для статуса приказа \"Черновик\"")
    @Link(name = "2.2.3",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.3")
    public void t2_2_3(){
        step("ввод в поле статус 'Черновик'");
        sendKeys("(//input[contains(@placeholder,'Поиск по колонке')])[3]","Черновик");
        String orderForEdit = stringBuilder();
        realCreateOrder(orderForEdit);
        findByComment(orderForEdit);
        //step("Действие - > просмотр и редактирование приказов ОДУ");
        odu();
        //step("удалить старый год");
        deleteYear();
        //step("ввести год оду 2020");
        enterYear2020();
        //step("удалить комментарий");
        delComment();
        //step("ввести комменарий");
        String comm = stringBuilder();
        enterComment(comm);
        //step("удалить номер приказа");
        delNumOrder();
        String num = numBuilder();
        //step("ввести номер приказа");
        enterNumOrder(num);
        //step("удалить дату приказа");
        delDateOfOrder();
        //step("ввести дату приказа");
        enterDateOfOrder();
        //step("нажать 'сохранить'");
        saveButton();
        //проверка
        //проверка по году

        goTo88_02();
        clearCommTable();
        findByComment(comm);
        assertDateOfOrder();
        assertTableOrderNum(num);
    }


    @Test
    @Description("Названия тест кейса: Сценарий  'Создать на основании'")
    @Link(name = "2.2.4",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.4")
    public void t2_2_4(){
        copyProject();
        //step("нажать ок");
        window_accept();
        //редактируем все поля
        String comm = stringBuilder();
        String num = numBuilder();
        editHead(comm,num);
        //step("Сохранить");
        saveButton();
        //проверка
        goTo88_02();
        //проверка по году
        findByComment(comm);
        //проверка по номеру приказа
        //assertOrder(num);
        assertTableOrderNum(num);
        //проверка по дате приказа
        assertTableDateApproved();
    }

    @Test
    @Description("Названия тест кейса: Сценарий \"Создать  корректировку\"\t")
    @Link(name = "2.2.5",url = "https://atlassian.cfmc.ru/display/CFMC/2.2.5")
    public void t2_2_5(){
        createOrder();
        window_accept();
        String com = stringBuilder();
        String num = numBuilder();
        enterComment(com);
        saveButton();
        enterNumOrder(num);
        enterDateOfOrder();
        saveButton();
        statusOrderClick();
        statusOrderApprovedClick();
        saveButton();
        goTo88_02();

        findByComment(com);
        actionBtnClick(1);
        createCorrect();
        window_accept();
        menuDelete();
        window_accept();
    }



}

