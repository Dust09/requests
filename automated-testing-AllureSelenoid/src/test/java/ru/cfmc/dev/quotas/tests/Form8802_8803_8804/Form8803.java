package ru.cfmc.dev.quotas.tests.Form8802_8803_8804;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8802.PageObject88_02;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

@Epic("Форма 88.02")
@Feature("Форма 88.03")
public class Form8803 extends TestBaseFor8802_8803_8804 {
    PageObject88_02 pageObject88_02 = new PageObject88_02();

    @Description("Названия тест кейса: Сценарий  \"Добавить  новые ВБР, ОДУ которых устанавливается - откытие диалогового окна")
    @Link(name="2.3.1", url="https://atlassian.cfmc.ru/display/CFMC/2.3.1")
    @Test
    public void t2_3_1(){

        //Выбрать любой проект и в столбце действий нажать "Просмотр и редактирование проектов ОДУ"
        odu();
        Assertions.assertEquals("Проект ОДУ - Ввод и редактирование общих допустимых уловов",getText("//h1[contains(text(),'Проект ОДУ - Ввод и редактирование общих допустимы')]"));

    }
    //@RepeatedTest(10)
    @Description("Названия тест кейса: Сценарий выбора ВБР в районах добычи (вылова)")
    @Link(name="2.3.2", url="https://atlassian.cfmc.ru/display/CFMC/2.3.2")
    @Test
    public void t2_3_2(){
        //step("Создать проект приказа");
        createOrder();
        //step("Нажать ОК");
        window_accept();
        String comm = stringBuilder();

        //Ввести комментарий: "+ comm
        enterComment(comm);

        //Нажать сохранить
        saveButton();
        //Навести курсор на кнопку "Меню" и нажать "Добавить пары ОДУ в проект приказа"
        menuAddOdu();
        //step("Выбираем (ставим галочки) напротив нескольких ВБР");
        addVbrCase();
        //step("Нажать сохранить");
        saveButton();
        //step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav 2) кликнуть иконку 88.02.");
        goTo88_02();
        //step("В поле комментарий ввести: "+ comm);
        findByComment(comm);
        //step("Наводим на курсор на меню действие и нажимаем \"\"Просмотр и редактирование проектов ОДУ\"");

        odu();
        //проверка
        assertVbrCase();
        step("Делаем шаг назад в браузере");
        driver.navigate().back();
        //step("в поле фильтра по колонке \"Комментарий\" набираем: "+ comm);
        findByComment(comm);
        //step("Наводим на курсор на меню действие и нажимаем \"\"Просмотр и редактирование проектов ОДУ\"");
        odu();
        //step("Навести курсор на меню и нажать отправить проект приказа в архив");
        menuDelete();
        //step("Нажать ок");
        window_accept();
        sleep(300);
        //проверка
        //goTo88_02();
        findByCommentDelete(comm);

    }


    @Description("Названия тест кейса:  Сценарий  \"Отправить в архив (удалить)\"")
    @Link(name="2.3.3", url="https://atlassian.cfmc.ru/display/CFMC/2.3.3")
    @Test
    public void t2_3_3(){
        String comm = stringBuilder();
        //step("Нажать кнопку \"Создать новый проект приказа\"");
        createOrder();
        //step("Нажать Ок");
        window_accept();
        //step("в поле комментарий вносим текст: " + comm);
        enterComment(comm);
        //step("нажимаем кнопку \"Сохранить\"");
        saveButton();
        //step("навести курсор на кнопку \"Меню\" и нажать \"отправить проект приказа в архив(удалить)\"");
        menuDelete();
        //step("нажимаем кнопку \"Ок\"");
        window_accept();
        //проверка
        //goTo88_02();
        findByCommentDelete(comm);
    }

   // @RepeatedTest(10)
    @Test
    @Description("Названия тест кейса:  Сценарий открытие диалогового окна добавления сносок")
    @Link(name="2.3.4", url="https://atlassian.cfmc.ru/display/CFMC/2.3.4")
    public void t2_3_4(){
        String comm = stringBuilder();
        //step("Нажать кнопку \"Создать новый проект приказа\"");
        createOrder();
        //step("Нажать Ок");
        window_accept();
        //step("в поле комментарий вносим текст: " + comm);
        enterComment(comm);
        //step("нажимаем кнопку \"Сохранить\"");
        saveButton();
        //step("Навести курсор на кнопку \"Меню\" и нажать \"Добавить пары ОДУ в проект приказа\"");
        menuAddOdu();
        //step("Выбираем (ставим галочки) напротив нескольких ВБР");
        addVbrCase();
        //step("Нажимаем кнопку \"Сохранить\"");
        saveButton();
        //step("Делаем \"Шаг назад\" в браузере");
        driver.navigate().back();
        assertVbrCase();
        //step("навести курсор на меню \"Действие и нажать \"Редактирование добавление\" сносок\"");
        menuEditSnoski();
        //step("Нажимаем кнопку \"Добавить строку\"");
        createSnoski();
        //step("нажимаем кнопку \" Созранить\"");
        saveButton();
        //step("нажимаем \"шаг назад\" в браузере\"");
        driver.navigate().back();
        //step("навести курсор на меню \"Действие и нажать \"Выбор сносок\"");
        selectSnoski();
        //проверка
        //step("Нажать сохранить");
        saveButton();
        //step("перейти в форму 88.02");
        goTo88_02();
        //step("найти приказ ");
        findByComment(comm);
        odu();
        //проверка
        correctSnoski();
        //step("Меню удалить приказ");
        menuDelete();
        //step("ок");
        window_accept();
        //проверка
        //goTo88_02();
        sleep(1000);
        findByCommentDelete(comm);
    }




    @Test
    @Description("Названия тест кейса:  Сценарий удаления сноски из строки формы 88.03/88.04")
    @Link(name="2.3.8", url="https://atlassian.cfmc.ru/display/CFMC/2.3.8")
    public void t2_3_8(){
        //step("создать пустой проект приказа");
        createOrder();
        //step("Нажать ок");
        window_accept();
        String comm = stringBuilder();
        //step("в поле комментарий ввести "+comm);
        enterComment(comm);
        //step("нажать сохранить");
        saveButton();
        //step("Навести курсор на кнопку 'Меню' и нажать 'Добавить пары ОДУ в проект приказа'");
        menuAddOdu();
        //step("Выбираем (ставим галочки) напротив нескольких ВБР");
        addVbrCase();
        //step("нажать сохранить");
        saveButton();
        step("Делаем \"Шаг назад\" в браузере");
        driver.navigate().back();
        assertVbrCase();
        //step("навести курсор на меню \"Действие и нажать \"Редактирование добавление\" сносок\"");
        menuEditSnoski();
        createSnoski();
        //step("нажимаем кнопку \" Сохранить\"");
        saveButton();
        //step("нажимаем \"шаг назад\" в браузере\"");
        driver.navigate().back();
        //step("навести курсор на меню \"Действие и нажать \"Выбор сносок\"");
        //добавляем сноски
        selectSnoski();
        saveButton();
        correctSnoski();
        //step("перейти в форму 88.02");
        goTo88_02();
        findByComment(comm);
        odu();
        //step("Нажать на меню Выбор сносок");
        //selectSnoskiDisable();
        selectSnoski();
        //step("нажать сохранить");
        saveButton();
        //step("Кликнуть на Действие Просмотр и редактирование сносок");
        menuEditSnoski();
        //step("удалить сноски");
        driver.navigate().refresh();
        deleteSnoski(4);
        //step("нажать Сохранить");
        saveButton();
        driver.navigate().back();
        //проверка
        driver.navigate().refresh();
        actionSnoski();
        try {
            click("//tbody/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/div[1]");
            step("сноски не удалены");
            driver.get("http://quotas-dev.cfmc.ru:8172/fishery/quotatest/applications/applications-nav");
        }catch (Exception e){
            step("сноски удалены");
            driver.navigate().refresh();
        }
        //step("удалить проект приказа");
        menuDelete();
        //step("ок");
        window_accept();
        sleep(1000);
        findByCommentDelete(comm);
    }


    @Test
    @Description("Названия тест кейса: Сценарий просмотра сносок")
    @Link(name="2.3.9", url="https://atlassian.cfmc.ru/display/CFMC/2.3.9")
    //дубликат кейса 2.15.1
    public void t2_3_9(){
       // step("Создать пустой проект приказа");
        createOrder();
        //step("Ok");
        window_accept();
        String comm = stringBuilder();
       // step("в поле комментарий ввести "+ comm);
        enterComment(comm);
        saveButton();
        menuAddOdu();
        addVbrCase();
        saveButton();
        driver.navigate().back();
        menuEditSnoski();
        createSnoski();
        saveButton();
        driver.navigate().back();
        driver.navigate().refresh();
        selectSnoski();
        saveButton();
        correctSnoski();
        menuDelete();

        window_accept();
        sleep(1000);
        findByCommentDelete(comm);
    }



    @Description("Названия тест кейса: Сценарий  \"открытие диалогового окна выбора сносок (проверка наличия элементов)\"")
    @Link(name = "2.3.6", url = "https://atlassian.cfmc.ru/display/CFMC/2.3.6")
    @Tag("smoke")
    @Test
    public void t2_3_6(){
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        menuAddOdu();
        addVbrCase();
        saveButton();
        driver.navigate().back();
        assertVbrCase();
        menuEditSnoski();
        createSnoski();
        saveButton();
        driver.navigate().back();
        selectSnoski();

        goTo88_02();
        findByComment(comm);
        odu();
        sleep(500);
        menuDelete();
        window_accept();
        //goTo88_02();
        sleep(300);
        findByCommentDelete(comm);
    }

    @Description("Названия тест кейса: Сценарий  удаления ряда\t")
    @Link(name = "2.3.10",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.10")
    @Test
    public void t2_3_10(){
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        menuAddOdu();
        addVbrCase();
        saveButton();
        driver.navigate().back();
        menuEditSnoski();
        createSnoski();
        saveButton();
        deleteSnoski(4);
        saveButton();
        driver.navigate().back();
        menuDelete();
        window_accept();
        //goTo88_02();
        sleep(1000);
        findByCommentDelete(comm);
    }

    @Description("Названия тест кейса: Сценарий  удаления ряда\t")
    @Link(name = "2.3.11",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.11")
    @Tag("smoke")
    @Test
    public void t2_3_11(){
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        goTo88_02();
        findByComment(comm);
    }

    @Description("Названия тест кейса: Сценарий  удаления ряда\t")
    @Link(name = "2.3.13",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.13")
    @Tag("smoke")
    @Test
    public void t2_3_13(){
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        cancelButton();
        sleep(500);
        window_accept();
        goTo88_02();
        findByCommentDelete(comm);
    }



    @Description("Названия тест кейса: Сценарий перевода проекта в статус " +
            "\"Приказ утвержден\" и проверка доступности для изменения полей приказа в статусе \"Приказ утвержден\"\t")
    @Link(name = "2.3.15",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.15")
    @Tag("smoke")
    @Test
    public void t2_3_15() {
        createOrder();
        window_accept();
        String comm = stringBuilder();
        String num = numBuilder();
        enterComment(comm);
        saveButton();
        enterNumOrder(num);
        delDateOfOrder();
        enterDateOfOrder();
        statusOrderClick();
        statusOrderApprovedClick();
        saveButton();
        goTo88_02();
        //проверка
        findByComment(comm);
        //assertTableComm(comm);
        assertTableDateApproved();
        assertTableOrderNum(num);
        assertTableStatus("Приказ утвержден");
        assertTableDateApprovedLast();
        odu();
        //проверка
        try {
            menuDelete();
            step("Кнопка меню отображается!!!");
            Assertions.assertEquals("Кнопка меню открывается","кнопка");
        } catch (Exception e) {
            step("Кнопка Меню не отображается");
        }


        try {
            for (int i = 1; i < 5; i++) {

                sendKeys("(//input[contains(@readonly,'readonly')]//preceding-sibling::label/following-sibling::input)[" + i + "]", "111");
            }
        }catch (Exception e){
            Assertions.assertEquals(1,2);
        }

        try {
            saveButton();
            step("Кнопка сохранить Кликабельна!!");
            driver.get("https://cfmc.ru/");
        }catch (Exception e){
            step("Кнопка сохранить не кликабельна");
        }
        Assertions.assertEquals(7,statusApprovedAll());
        goTo88_02();

    }

    @Description("Названия тест кейса: Сценарий перевода проекта в статус " +
            "\"Согласование\" и проверка доступности для изменения полей приказа в статусе \"Согласование\".\t")
    @Link(name = "2.3.16",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.16")
    @Test
    public void t2_3_16() {
        createOrder();
        window_accept();
        String comm = stringBuilder();
        String num = numBuilder();
        enterComment(comm);
        saveButton();
        enterNumOrder(num);
        enterDateOfOrder();
        saveButton();


        statusOrderClick();
        statusOrderAgreeClick();
        sleep(500);
        saveButton();
        sleep(500);
        goTo88_02();

        findByComment(comm);
        assertTableComm(comm);
        assertTableOrderNum(num);
        assertTableDateApproved();
        assertTableStatus("Согласование");
        odu();
        try{
            menuAddOdu();
            step("Добавить пары ОДУ в проект приказа отображается!!!");
            driver.get("https://cfmc.ru/");
            menuBtn();
        }catch (Exception e){
            step("Меню-Добавить пары ОДУ в проект приказ не кликабельна");
        }
        try {
            find("//th[contains(text(),'Действие')]");
            step("Кнопка Действие отображается!!!");
            driver.get("https://cfmc.ru/");
            menuBtn();
        }catch (Exception e){
            step("Колонка Действие не отображается");
        }
        System.out.println("----------------------");
        Assertions.assertEquals(4,statusApprovedAll()); // в статусе согласование нельзя менять поля год ОДУ и комментарий

        String num2 = numBuilder();
        delNumOrder();
        enterNumOrder(num2);
        statusOrderClick();
        statusOrderAgreeClick();
        saveButton();
        goTo88_02();
        clearCommTable();
        findByComment(comm);
        assertTableStatus("Согласование");
        assertTableOrderNum(num2);
        assertTableComm(comm);
        odu();
        menuDelete();
        window_accept();
        //goTo88_02();
        findByCommentDelete(comm);
    }


    @Description("Названия тест кейса: Сценарий \"Проверка ввода в поле 'Поиск' в  ЭФ \"Таблица сносок\"\t")
    @Link(name = "2.3.22",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.22")
    @Test
    public void t2_3_22() {
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        menuAddOdu();
        addVbrCase();
        saveButton();
        driver.navigate().back();
        menuEditSnoski();
        createSnoski();
        saveButton();
        searchInSnoskiField(2);

        Assertions.assertEquals(3,driver.findElements(By.xpath("//tr")).size());
        driver.navigate().back();
        menuDelete();
        window_accept();
        sleep(1000);
        findByCommentDelete(comm);
    }


    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопок 'Опции' в  ЭФ \"Таблица сносок\"\"\t")
    @Link(name = "2.3.28",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.28")
    @Test
    public void t2_3_28() {
        createOrder();
        window_accept();
        String comm = stringBuilder();
        enterComment(comm);
        saveButton();
        menuAddOdu();
        addVbrCase();
        saveButton();
        driver.navigate().back();
        //optionClick();
        optionButtonsClick(12);
        pageObject88_02.options_click();
        Assertions.assertEquals("Опции для таблицы",
                getText("//p[contains(text(),'Опции для таблицы ')]"));
        pageObject88_02.options_close();
        driver.navigate().refresh();
        menuDelete();
        window_accept();
        sleep(1000);
        findByCommentDelete(comm);

    }

    @Description("Названия тест кейса: Сценарий \"Добавить пары в приказ и перевести его в статус Согласование\"")
    @Link(name = "2.3.30",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.30")
    @Test
    public String t2_3_30() {
        generalElements.createProjectClick();
        window_accept();
        String com = stringBuilder();
        enterComment(com);
        deleteYear();
        enterYear2020();
        generalElements.saveButton();

        String num = numBuilder();
        enterNumOrder(num);
        generalElements.saveButton();
        menuAddOdu();
        addVbrCase();
        generalElements.saveButton();
        driver.navigate().back();
        enterODUcase();
        generalElements.saveButton();
        statusOrderClick();
        statusOrderAgreeClick();
        enterDateOfOrder();
        generalElements.saveButton();
        return com;
    }




}
