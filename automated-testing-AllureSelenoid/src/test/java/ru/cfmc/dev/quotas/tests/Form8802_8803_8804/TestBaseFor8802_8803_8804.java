package ru.cfmc.dev.quotas.tests.Form8802_8803_8804;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.GeneralElements;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8802.PageObject88_02;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class TestBaseFor8802_8803_8804 extends TestBaseForAll {


    public GeneralElements generalElements = new GeneralElements();


    @BeforeEach
    public void setUp(){
        browser();
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        BgoTo88_02();


    }
    //Только для BeforeEach

    public void BgoTo88_02() {
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        Assertions.assertEquals("Журнал приказов ОДУ (88.02)",getText("//div[contains(text(),'Журнал приказов ОДУ')]"));
        step("Кликнуть на журнал приказов ОДУ");
        click("//div[contains(text(),'Журнал приказов ОДУ')]");


        Assertions.assertEquals(getText("//h1[contains(text(),'Журнал приказов ОДУ')]")
                , "Журнал приказов ОДУ");
        Assertions.assertEquals("http://quotas-dev.cfmc.ru/fishery/quotatest/applications/std?name=unio-orders-odu",driver.getCurrentUrl());
        step("Опции");
        click("//span[contains(text(),'Опции')]");


        step("Отображать поиск по колонкам");
        try{
            PageObject88_02 pageObject88_02 = new PageObject88_02();
            click("//label[contains(text(),'Отображать поиск по колонкам в таблицах')]");
            pageObject88_02.options_close();
        }catch (Exception e){
            PageObject88_02 pageObject88_02 = new PageObject88_02();
            //driver.navigate().back();
            goTo88_02();
            pageObject88_02.options_click();
            sleep(1500);
            click("//label[contains(text(),'Отображать поиск по колонкам в таблицах')]");
            pageObject88_02.options_close();
        }

    }

    public void findByStatus(String key){
        step("Во колонке статус ввести "+ key);
        sendKeys("(//th[contains(text(),'Статус')]//following-sibling::input)[1]",key);
    }

    public void goTo88_02() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav.");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        sleep(2000);
        step("кликнуть иконку 88.02");
        try{
            click("//div[contains(text(),'Журнал приказов ОДУ')]");
            Assertions.assertEquals(getText("//h1[contains(text(),'Журнал приказов ОДУ')]")
                    , "Журнал приказов ОДУ");
        }catch (Exception e){
            driver.navigate().refresh();
            click("//div[contains(text(),'Журнал приказов ОДУ')]");
            Assertions.assertEquals(getText("//h1[contains(text(),'Журнал приказов ОДУ')]")
                    , "Журнал приказов ОДУ");

        }

    }


    public void createOrder() {
        step("Создать проект приказа");
        click("//span[contains(text(),'Создать проект приказа')]");
    }

    public void realCreateOrder(String comm){
        createOrder();
        window_accept();
        enterComment(comm);
        saveButton();
        goTo88_02();

    }

    public String deleteElem = "//div[contains(text(),'Отправить проект приказа в архив (удалить)')]";
    public void setDeleteElem(){
        step("Найти элемент 'Отправить проект приказа в архив (удалить)'");
        find(deleteElem);
    }
    public void menuDelete() {
        step("Навести курсор на меню и нажать отправить проект приказа в архив");
        try {
            click("//span[contains(text(),'Меню')]");
        }catch (Exception e){
            click("(//span[contains(text(),'Меню')])[2]");
        }
        click(deleteElem);
    }


    public void menuBtn() {
        step("кликнуть на Меню");
        click("//span[contains(text(),'Меню')]");
    }

    public void assertVbrCase() {
        //проверка по кол_ву ВБР и Паре-Район
        step("Проверка Добавленных пар");
        Assertions.assertEquals("Восточно-Сахалинская подзона (275)",getText("//td[contains(text(),'Восточно-Сахалинская подзона (275)')]"));
        Assertions.assertEquals("Западно-Беринговоморская зона (261)",getText("//td[contains(text(),'Западно-Беринговоморская зона (261)')]"));
        Assertions.assertEquals("Белое море (393)",getText("//td[contains(text(),'Белое море (393)')]"));

        Assertions.assertEquals("Краб волосатый четырехугольный (839)",getText("//td[contains(text(),'Краб волосатый четырехугольный (839)')]"));
        Assertions.assertEquals("Сельдь тихоокеанская (204)",getText("//td[contains(text(),'Сельдь тихоокеанская (204)')]"));
        Assertions.assertEquals("Гренландский тюлень (974)",getText("//td[contains(text(),'Гренландский тюлень (974)')]"));

        Assertions.assertEquals(5,driver.findElements(By.xpath("//tr")).size());
    }

    public void enterODUcase(){
        click("(//td[contains(text(),'Краб волосатый четырехугольный (839)')]/..//input)[1]");
        sendKeys("(//td[contains(text(),'Краб волосатый четырехугольный (839)')]/..//input)[1]","10");
        click("(//td[contains(text(),'Сельдь тихоокеанская (204)')]/..//input)[1]");
        sendKeys("(//td[contains(text(),'Сельдь тихоокеанская (204)')]/..//input)[1]","20");
        click("(//td[contains(text(),'Гренландский тюлень (974)')]/..//input)[1]");
        sendKeys("(//td[contains(text(),'Гренландский тюлень (974)')]/..//input)[1]","30");

    }
    public void addVbrCheckboxAll(){
        step("Кликнуть на чекбокс Выбрать все");
        click("//label[contains(text(),'Выбрать всё')]");
    }

    public void addVbrCase() {
        step("Выбираем (ставим галочки) напротив нескольких ВБР");
        findAandAddVbr("261","204");
        findAandAddVbr("275","839");
        findAandAddVbr("393","974");
    }

    public void findAandAddVbr(String region, String vbr) {
        step("В поле Район добычи ввести: "+region);
        sendKeys("//thead/tr[1]/th[3]/div[1]/input[1]",region);
        step("В поле ВБР ввести: "+vbr);
        sendKeys("//thead/tr[1]/th[4]/div[1]/input[1]",vbr);
        sleep(500);
        step("Выбрать найденную пару");
        click("//tbody/tr[1]/td[6]/div[1]/div[1]/div[1]");
        step("отчистить поля для поиска");
        clearFieldsForSearch();
    }

    public void clearFieldsForSearch() {
        //clear pool
        for(int i = 0; i<10; i++){
            String multiSelect = Keys.chord(Keys.BACK_SPACE);
            sendKeys("//thead/tr[1]/th[2]/div[1]/input[1]", multiSelect);
        }
        //clear region
        for(int i = 0; i<10; i++){
            String multiSelect = Keys.chord(Keys.BACK_SPACE);
            sendKeys("//thead/tr[1]/th[3]/div[1]/input[1]", multiSelect);
        }
        //clear VBR
        for(int i = 0; i<10; i++){
            String multiSelect = Keys.chord(Keys.BACK_SPACE);
            sendKeys("//thead/tr[1]/th[4]/div[1]/input[1]", multiSelect);
        }

    }

    String menuBtn = "//span[contains(text(),'Меню')]";
    String addPairOdu = "//div[contains(text(),'Добавить пары ОДУ в проект приказа')]";
    public void menuAddOdu() {
        step("Навести курсор на кнопку \"Меню\" и нажать \"Добавить пары ОДУ в проект приказа\"");
        try{
            click(menuBtn);
            click(addPairOdu);
        }catch (Exception e){
            driver.navigate().refresh();
            click(menuBtn);
            click(addPairOdu);
        }

    }

    //Колока Комментарий
    private String columnComTable = "//th[contains(text(),'Комментарий')]//preceding-sibling::input";
    public void findByComment(String comm) {
        clearCommTable();
        step("В поле комментарий ввести: "+ comm);
        find(columnComTable);
        sendKeys(columnComTable, comm);
        find("//td[contains(text(),'"+comm+"')]");
        Assertions.assertEquals(comm,getText("//td[contains(text(),'"+comm+"')]"));

    }

    public void clearCommTable(){
        //Удалить Значение в Колонке Комментарий
        for(int i = 0; i<20; i++){
            String multiSelect = Keys.chord(Keys.BACK_SPACE);
            sendKeys(columnComTable, multiSelect);
        }
    }
    public void findByCommentDelete(String comm) {
        clearCommTable();
        find(columnComTable);
        sendKeys(columnComTable, comm);
        Assertions.assertEquals("Совпадений не обнаружено",getText("//td[contains(text(),'Совпадений не обнаружено')]"));
    }

    public void createCorrect() {
        step("Кликнуть на Создать корректировку");
        click("(//div[contains(text(),'Создать корректировку')])");
    }

    public void actionBtnClick(int numberInPage){
        step("Кликнуть на Действие");
        click("(//i[contains(text(),'list')])["+numberInPage+"]");
        sleep(100);
        click("(//i[contains(text(),'list')])["+numberInPage+"]");
    }

    public void deleteYear() {
        step("удалить год");
        for(int i = 0; i<5; i++){
            String multiSelect = Keys.chord(Keys.BACK_SPACE);
            sendKeys(yearField, multiSelect);
        }
    }

    public void saveButton() {
        step("Нажать сохранить");
        generalElements.saveButton();
    }

    public void cancelButton(){
        step("Нажать Отменить");
        generalElements.setCancel();
    }

    public void enterComment(String comm) {
        step("Ввести комментарий: "+ comm);
        sendKeys(commField,comm);
    }

    public String numForSnoskiInHeadField = "//label[contains(text(),'Номер для сноски в шапке')]/following-sibling::input";
    public void setNumForSnoskiInHeadField(){
        step("Найти элемент поле Номер для сноски в шапке");
        find(numForSnoskiInHeadField);
    }
    public void enterNumForSnoskiHead(){
        String numbuilder = snoskiBuilder();
        step("В поле Номер для сноски в шапке ввести "+ numbuilder);
        sendKeys(numForSnoskiInHeadField, numbuilder);
    }
    public String textForSnoskiInHeadField = "//label[contains(text(),'Текст для сноски в шапке')]/following-sibling::input";
    public void setTextForSnoskiInHeadField(){
        step("Найти элемент поле Текст сноски в шапке");
        find(textForSnoskiInHeadField);
    }
    public void enterTextForSnoskiHead(){
        String numbuilder = snoskiBuilder();
        step("В поле Текс для сноски в шапке ввести "+ numbuilder);
        sendKeys(numForSnoskiInHeadField, numbuilder);
    }

    public String checkboxGEE = "//label[contains(text(),'допуски/ограничения по ГЭЭ внесены')]";
    public void setCheckboxGEE(){
        step("Найти чекбокс допуски/ограничения по ГЭЭ внесены");
        find(checkboxGEE);
    }
    public void clickCheckboxGEE(){
        step("Клинкуть на чекбокс 'допуски/ограничения по ГЭЭ внесены'");
        click(checkboxGEE);
    }

    public String yearField = "//label[contains(text(),'Год')]/following-sibling::input";
    public void enterYear2020() {
        step("ввести год оду 2020");
        sendKeys(yearField,"2020");
    }
    public void setYearField(){
        step("Найти поле Год");
        find(yearField);
    }

    public void setCommField() {
        step("Найти поле Комментарий");
        find(commField);
    }


    public int statusApprovedAll() {
        //находит все элемент которые недоступны для редактирования(Приказ Утвержден)
        return driver.findElements(By.xpath("//input[contains(@readonly,'readonly')]/preceding-sibling::label")).size();
    }

    public void odu() {
        step("Выбрать любой проект и в столбце действий нажать \"Просмотр и редактирование проектов ОДУ\"");
        click("(//i[contains(text(),'list')])[1]");
        sleep(500);
        //sleep(2000);
        click("(//i[contains(text(),'list')])[1]");
        click("(//div[contains(text(),'Просмотр и редактирование проектов ОДУ')])[1]");
        //click("(//div[contains(text(),'Просмотр и редактирование проектов ОДУ')])[1]");

    }

    public String commField = "//label[contains(text(),'комментарий')]/following-sibling::input";
    public void delComment() {
        step("удалить комментарий");
        for(int i = 0; i<60; i++){
            String multiSelect = Keys.chord(Keys.BACK_SPACE);
            sendKeys(commField, multiSelect);
        }
    }

    public String numOrderField = "//label[contains(text(),'номер приказа')]/following-sibling::input";
    public void setNumOrderField(){
        step("Найти поле Номер приказа");
        find(numOrderField);
    }
    public void delNumOrder() {

        step("удалить номер приказа");
        for(int i = 0; i<20; i++){
            String multiSelect = Keys.chord(Keys.BACK_SPACE);
            sendKeys(numOrderField, multiSelect);
        }
    }

    public void enterNumOrder(String num) {
        step("ввести номер приказа: "+num);
        sleep(400);
        sendKeys(numOrderField,num);
        sleep(500);
    }

    public String dateField = "//label[contains(text(),'дата приказа')]/following-sibling::input";
    public void setDateField(){
        step("Найти поле Дата приказа");
        find(dateField);
    }

    public void delDateOfOrder() {
        step("удалить дату приказа");
        clear(dateField);
    }

    public void enterDateOfOrder() {
        String data = dateBuilder();
        step("ввести дату приказа");
        sendKeys(dateField,data);
    }
    public void statusOrderApprovedClick() {
        step("Кликнуть на приказ утвержден");
        click("//div[contains(text(),'Приказ утвержден')]");
        if(driver.getCurrentUrl().contains("unio-resources-odu")){
            step("Отметить чекбокс допуски/ограничения по ГЭЭ внесены ");
            clickCheckboxGEE();
        }

    }

    public void statusOrderDraftClick() {
        step("Кликнуть на Черновик");
        click("//div[contains(text(),'Черновик')]");
    }

    public void statusOrderAgreeClick() {
        step("Кликнуть на Согласование");
        click("//div[contains(text(),'Согласование')]");
    }

    public String statusField = "//label[contains(text(),'Статус проекта')]/following-sibling::input";
    public void statusOrderClick() {
        //открыть список возможных статусов
        step("Кликнуть на стастус приказа");
        click(statusField);
    }
    public void setStatusField(){
        step("найти поле Статус проекта");
        find("("+ statusField +")[1]");
    }

    public void editHead(String comm,String num){
        //step("удалить год");
        deleteYear();
        //step("ввести год");
        enterYear2020();
        //step("удалить комментарии");
        delComment();
        //step("ввести комментарий: " + comm);
        enterComment(comm);
        //step("удалить номер приказа");
        delNumOrder();
        //step("ввети номер приказа: " + num);
        enterNumOrder(num);
        //step("удалить дату приказа");
        delDateOfOrder();
        //step("ввести дату приказа");
        enterDateOfOrder();
    }

    public void copyProject() {
        step("Действие - > Создать на основании");
        click("(//i[contains(text(),'list')])[1]");
        click("//div[contains(text(),'Создать на основании')]");
    }

    public void optionButtonsClick(int iter){
        PageObject88_02 pageObject88_02 = new PageObject88_02();
        pageObject88_02.optionsButtons(iter);
    }



    public void assertDateOfOrder() {
        step("проверка по дате приказа");
        Assertions.assertEquals(dateBuilderAssert(),getText("//span[contains(text(),'"+dateBuilderAssert()+"')]"));
    }

    public void assertDateOfOrderTableEng(){
        step("Проверка по дате приказа");
        Assertions.assertEquals(dateBuilderENG(),getText("//td[contains(text(),'"+dateBuilderENG()+"')]"));
    }


    public void searchInSnoskiField(int i) {
        step("В поле номер сноски ввести "+i);
        sendKeys("(//input[contains(@placeholder,'Поиск по колонке')])[1]",Integer.toString(i));
        step("В поле текст сноски ввести "+ i);
        sendKeys("(//input[contains(@placeholder,'Поиск по колонке')])[2]","сноска "+ (Integer.toString(i)));
    }

    public void selectSnoski() {
        driver.navigate().refresh();
        for(int i = 1 ; i<4;i++){
            click("(//i[contains(text(),'list')])["+i+"]");
            click("(//div[contains(text(),'Выбор сносок')])["+i+"]");
            step(" отметить сноску "+i);
            selectSnoskiSwitch(i);
            step("кликнуть Выбрать");
            click("//span[contains(text(),'Выбрать')]");

        }
    }

    //Выбрать или убрать сноски
    private void selectSnoskiSwitch(int arg){
        if(driver.findElements(By.xpath("(//div[@class = 'v-input--selection-controls__ripple'])")).size() == 3){
            switch (arg){
                case 3: click("(//div[@class = 'v-input--selection-controls__ripple'])[3]");
                case 2: click("(//div[@class = 'v-input--selection-controls__ripple'])[2]");
                case 1: click("(//div[@class = 'v-input--selection-controls__ripple'])[1]");
            }
        }else {
            switch (arg){
                case 3: click("(//div[@class = 'v-input--selection-controls__ripple primary--text'])[3]");
                case 2: click("(//div[@class = 'v-input--selection-controls__ripple primary--text'])[2]");
                case 1: click("(//div[@class = 'v-input--selection-controls__ripple primary--text'])[1]");
            }
        }
    }

    public void createSnoski() {
        for (int i = 1; i < 4; i++) {
            click("//span[contains(text(),'Добавить строку')]");
            step("в поле \"номер сноски\" вносим значение " + i);
            //sendKeys("//tbody/tr[" + i + "]/td[2]/input[1]", Integer.toString(i));
            sendKeys("(//input[contains(@class,'table-input')])["+i+"]",Integer.toString(i));
            step("в поле \"Текст сноски\" вносим текст 'сноска " + i + "'");
            sendKeys("(//textarea[contains(@rows,'5')])["+i+"]", "сноска " + Integer.toString(i));

        }
        sleep(500);
    }

    //редактирование сносок(кнопка)
    public void menuEditSnoski() {
        step("навести курсор на меню \"Действие и нажать \"Редактирование добавление\" сносок\"");
        click("(//i[contains(text(),'list')])[1]");
        sleep(1000);
        click("(//i[contains(text(),'list')])[1]");
        click("//div[contains(text(),'Редактирование/добавление сносок')]");
    }

    public void addStrSnoskiBtn(){
        click("//span[contains(text(),'Добавить строку')]");
    }

    public void correctSnoski() {
        for(int i = 1; i<4; i++){
            click("//tbody/tr["+i+"]/td[9]/ul[1]/li[1]");
            if(i==2){
                Assertions.assertEquals("сноска "+i,getAttribute("//td[contains(text(),'сноска "+i+"')]"));
                Assertions.assertEquals("сноска "+(i-1),getAttribute("//td[contains(text(),'сноска "+(i-1)+"')]"));
                Assertions.assertEquals(2,driver.findElements(By.xpath("//td[@class='text-center']")).size());
            }else if(i==3){
                Assertions.assertEquals("сноска "+i,getAttribute("//td[contains(text(),'сноска "+i+"')]"));
                Assertions.assertEquals("сноска "+(i-1),getAttribute("//td[contains(text(),'сноска "+(i-1)+"')]"));
                Assertions.assertEquals("сноска "+(i-2),getAttribute("//td[contains(text(),'сноска "+(i-2)+"')]"));
                Assertions.assertEquals(3,driver.findElements(By.xpath("//td[@class='text-center']")).size());
            }else if(i ==1){
                Assertions.assertEquals("сноска "+i,getAttribute("//td[contains(text(),'сноска "+i+"')]"));
                Assertions.assertEquals(1,driver.findElements(By.xpath("//td[@class='text-center']")).size());
            }
            driver.navigate().refresh();
        }
    }

    public void actionSnoski() {
        generalElements.actionClick();
        click("//div[contains(text(),'Выбор сносок')]");
    }

    public void deleteSnoski(int iter) {
        for (int i = 1; i < iter; i++) {
            click("(//i[contains(text(),'list')])[1]");
            sleep(500);
            click("(//i[contains(text(),'list')])[1]");
            click("(//div[contains(text(),'Удалить')])");
            window_accept();
        }


    }
    public void assertTableOrderNum(String num) {
        Assertions.assertEquals(num,getText("(//td[contains(text(),'"+num+"')])[1]"));
    }

    public void assertTableStatus(String status){
        Assertions.assertEquals(status, getText("//td[contains(text(),'"+status+"')]"));
    }

    public void assertTableDateApproved() {
        Assertions.assertEquals(dateBuilderAssert(),getText("(//span[contains(text(),'"+dateBuilderAssert()+"')])[1]"));
    }

    public void assertTableComm(String comm) {
        Assertions.assertEquals(comm,getText("(//td[contains(text(),'"+comm+"')])"));
    }

    public void assertTableDateApprovedLast() {
        Assertions.assertEquals(dateBuilderAssert(),getText("(//span[contains(text(),'"+dateBuilderAssert()+"')])[2]"));
    }

    public void assertNumAndDateOrder(String num){
        Assertions.assertEquals(num +" от "+ dateBuilderAssert(),getText("//td[contains(text(),' "+num+" от "+dateBuilderAssert()+" ')]"));
    }


    @AfterEach
    public void tear(){
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }




}
