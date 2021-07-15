package ru.cfmc.dev.quotas.tests.smoke.smokeForm8803;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.tests.Form8802_8803_8804.TestBaseFor8802_8803_8804;

import static io.qameta.allure.Allure.step;

@Epic("Форма 88.02")
@Feature("Smoke 88.03")
public class Smoke8803 extends PageObject88_03 {
    TestBaseFor8802_8803_8804 tb = new TestBaseFor8802_8803_8804();

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов ЭФ \"Таблица сносок\"\t")
    @Link(name = "2.3.17",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.17")
    @Tag("smoke")
    @Test
    public void t2_3_17() {
        goToForm88_02();
        tb.createOrder();
        tb.window_accept();
        String comm = tb.stringBuilder();
        tb.enterComment(comm);
        tb.saveButton();
        tb.menuAddOdu();
        tb.addVbrCase();
        tb.saveButton();
        driver.navigate().back();
        tb.menuEditSnoski();
        findHeadSnoski();
        addStr();

        to.fullscreen();
        to.options();
        to.search_str();
        to.loop();
        to.numberTable1();
        numSnoski();
        txtSnoski();
        to.action();
        to.strOnPage();
        to.elem15();
        to.flag();
        oneToZero();
        to.nextPage();
        to.lastPage();
        to.beforeBtn();
        to.beforeAllBtn();
        to.save();
        to.cancel();
        driver.navigate().back();
        tb.menuDelete();
        tb.window_accept();
        sleep(1000);
        tb.findByCommentDelete(comm);
    }

    @Description("Hазваниe тест кейса: Сценарий\"Проверка работоспособности кнопки 'Добавить строку' в ЭФ\"Таблица сносок\"")
    @Link(name = "2.3.18",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.18")
    @Tag("smoke")
    @Test
    public void t2_3_18(){
        to.goToForm88_02();
        tb.createOrder();
        tb.window_accept();
        String comm = tb.stringBuilder();
        tb.enterComment(comm);
        tb.saveButton();
        tb.menuAddOdu();
        tb.addVbrCase();
        tb.saveButton();
        driver.navigate().back();
        tb.menuEditSnoski();
        tb.addStrSnoskiBtn();
        Assertions.assertEquals(1,driver.findElements(By.xpath("(//td[contains(text(),'1')])[1]")).size());
        driver.navigate().back();
        tb.menuDelete();
        tb.window_accept();
        tb.goTo88_02();
        tb.findByCommentDelete(comm);
    }


    @Description("Названия тест кейса: Сценарий  \"Проверка работоспособности кнопки [ ](расширить) в  ЭФ \"Таблица сносок\"\"\t")
    @Link(name = "2.3.19",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.19")
    @Tag("smoke")
    @Test
    public void t2_3_19(){
        goToForm88_02();
        tb.createOrder();
        tb.window_accept();
        String comm = tb.stringBuilder();
        tb.enterComment(comm);
        tb.saveButton();
        tb.menuAddOdu();
        tb.addVbrCase();
        tb.saveButton();
        driver.navigate().back();
        tb.menuEditSnoski();
        to.fullscreenClick();
        try {
            click("(//a[contains(text(),'Квоты')])[1]");
            step("Таблица не раскрыта!!!");
            driver.get("https://cfmc.ru/");
            tb.saveButton();
        }catch (Exception e){
            step("Таблица раскрыта");
        }
        driver.navigate().back();

       // driver.navigate().refresh();
        tb.menuDelete();
        window_accept();
        //tb.goTo88_02();
        sleep(1000);
        tb.findByCommentDelete(comm);
    }

    //Непонятно сколько должно быть чекбоксов, сейчас 1 отсутствует
    @Description("\tНазвания тест кейса: Сценарий \"Проверка работоспособности кнопок 'Опции' в  ЭФ \"Таблица сносок\"\"")
    @Link(name = "2.3.20",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.20")
    @Tag("smoke")
    @Test
    public void t2_3_20(){
        goToForm88_02();
        tb.createOrder();
        window_accept();
        String comm = tb.stringBuilder();
        tb.enterComment(comm);
        tb.saveButton();
        tb.menuAddOdu();
        tb.addVbrCase();
        tb.saveButton();
        driver.navigate().back();
        tb.menuEditSnoski();
        tb.createSnoski();
        to.optionsButtons(5);
        driver.navigate().back();
        tb.menuDelete();
        window_accept();
        tb.findByCommentDelete(comm);
    }


    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопки Действие(удалить) в  ЭФ \"Таблица сносок\"\"")
    @Link(name = "2.3.21",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.21")
    @Tag("smoke")
    @Test
    public void t2_3_21(){
        goToForm88_02();
        tb.createOrder();
        window_accept();
        String comm = tb.stringBuilder();
        tb.enterComment(comm);
        tb.saveButton();
        tb.menuAddOdu();
        tb.addVbrCase();
        tb.saveButton();
        driver.navigate().back();
        tb.menuEditSnoski();
        tb.addStrSnoskiBtn();
        tb.deleteSnoski(2);

        Assertions.assertEquals(0,driver.findElements(By.xpath("//td[contains(text(),'1')]")).size());
        driver.navigate().back();
        tb.menuDelete();
        sleep(500);
        window_accept();
        sleep(1000);
        tb.findByCommentDelete(comm);
    }

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов ЭФ \"Проект ОДУ - Ввод и редактирование общих допустимых уловов \" (статус черновик)\"\t")
    @Link(name = "2.3.23",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.23")
    @Tag("smoke")
    @Test
    public void t2_3_23(){
        goToForm88_02();
        tb.createOrder();
        window_accept();
        String com = tb.stringBuilder();
        tb.enterComment(com);
        tb.saveButton();
        tb.menuAddOdu();
        tb.addVbrCheckboxAll(); //--------------------------


        tb.saveButton();
        driver.navigate().back();
        headOduElem();
        setYearOduElem();
        setCommElem();
        setNumOrderElemOduElem();
        setDataOrderElem();
        setStatusElem();
        setMenuElem();
        to.fullscreen();
        to.options();
        to.search_str();
        to.loop();

        //table
        step("ЭЛЕМЕНТЫ В ТАБЛИЦЕ");
        to.numberTable1();
        setFishPoolTableElem();
        setDistrictTableElem();
        setVbrTableElem();
        setUnitTableElem();
        setOdu2021TableElem();
        setOdu2022TableElem();
        setInterestTableElem();
        setSnoskiTableElem();
        setNumOrderTableElem();
        setActionTableElem();
        //Конец таблицы
        scroolDown();
        to.strOnPage();
        to.elem15();
        to.flag();
        to.o1To15();
        to.nextPage();
        to.lastPage();
        to.beforeBtn();
        to.beforeAllBtn();
        to.save();
        to.cancel();
    }

    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопки 'Меню-Добавить пары оду в проект приказа' в  ЭФ \"Проект ОДУ - Ввод и редактирование общих допустимых уловов\"\t")
    @Link(name = "2.3.24",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.24")
    @Tag("smoke")
    @Test
    public void t2_3_24(){
        goToForm88_02();
        tb.createOrder();
        window_accept();
        String com = tb.stringBuilder();
        tb.enterComment(com);
        tb.saveButton();
        tb.menuAddOdu();
        Assertions.assertEquals("Добавить пары ОДУ в проект приказа",getText("//h1[contains(text(),'Добавить пары ОДУ в проект приказа')]"));
        driver.navigate().back();
        tb.menuDelete();
        window_accept();
        tb.findByCommentDelete(com);
    }

    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопки 'Меню-Отправить проект приказа в архив (удалить)' в  ЭФ \"Проект ОДУ - Ввод и редактирование общих допустимых уловов\"")
    @Link(name = "2.3.25",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.25")
    @Tag("smoke")
    @Test
    public void t2_3_25(){
        goToForm88_02();
        tb.createOrder();
        window_accept();
        String com = tb.stringBuilder();
        tb.enterComment(com);
        tb.saveButton();
        tb.menuDelete();
        window_dismiss();
        tb.menuDelete();
        window_accept();
        tb.findByCommentDelete(com);
    }


    @Description("Названия тест кейса: Сценарий \"Проверка работоспособности кнопки [ ](расширить) в  ЭФ \"Проект ОДУ - Ввод и редактирование общих допустимых уловов\"\t")
    @Link(name = "2.3.27",url = "https://atlassian.cfmc.ru/display/CFMC/2.3.27")
    @Tag("smoke")
    @Test
    public void t2_3_27(){
        goToForm88_02();
        tb.createOrder();
        window_accept();
        String com = tb.stringBuilder();
        tb.enterComment(com);
        tb.saveButton();
        to.fullscreenClick();

        try {
            click("(//a[contains(text(),'Квоты')])[1]");
            step("Таблица не раскрыта!!!");
            driver.get("https://cfmc.ru/");
            tb.saveButton();
        }catch (Exception e){
            step("Таблица раскрыта");
        }

        tb.menuDelete();
        window_accept();
        tb.findByCommentDelete(com);
    }

}
