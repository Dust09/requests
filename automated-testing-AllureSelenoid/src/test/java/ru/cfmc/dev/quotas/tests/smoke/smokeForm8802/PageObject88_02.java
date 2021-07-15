package ru.cfmc.dev.quotas.tests.smoke.smokeForm8802;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.tests.Form8802_8803_8804.TestBaseFor8802_8803_8804;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;


public class PageObject88_02 extends TestBaseForAll {
    TestBaseFor8802_8803_8804 tb = new TestBaseFor8802_8803_8804();
    GeneralElements ge = new GeneralElements();




    @BeforeEach
    public void setUp(){
        browser();
        //перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav
        //driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div[2]/div[2]/div/div/a[2]/div[2]")).click();
    }
    public void goToForm88_02(){
        tb.BgoTo88_02();
    }

    public void journalODU(){
        step("Найти элемент \"Журнал приказов ОДУ\"");
        find("//h1[contains(text(),'Журнал приказов ОДУ')]");
    }

    public void createProject(){
        step("Найти элемент \"Создать проект приказа\"");
        find("//span[contains(text(),'Создать проект приказа')]");
    }


    public void fullscreen(){
        step("Найти элемент \"[ ](Развернуть таблицу)\"");
        find("//i[contains(text(),'fullscreen')]");
    }
    public void fullscreenClick(){
        step("Кликнуть на элемент \"[ ](Развернуть таблицу)\"");
        click("//i[contains(text(),'fullscreen')]");
    //Проверка
        try {
            sleep(1000);
            click("(//a[contains(text(),'Квоты')])[1]");
            step("Таблица не раскрыта!!!");
            driver.get("https://cfmc.ru/");
            tb.saveButton();
        }catch (Exception e){
            step("Таблица раскрыта");
        }
    }


    public void options(){
        step("Найти элемент 'Опции'");
        find("//span[contains(text(),'Опции')]");
    }
    public void options_click(){
        step("Кликнуть элемент 'Опции'");
        try{
            click("//span[contains(text(),'Опции')]");
        }catch (Exception e){
            click("(//span[contains(text(),'Опции')])[2]");
        }

    }

    public void optionsButtons(int iter) {
        //position - С какого элемента начинается счет чекбоксов
        //iter  - Сколько всего чекбоксов

        options_click();
        //проверка сколько всего чекбоксов
        //Assertions.assertEquals(iter,driver.findElements(By.xpath("//div[contains(@class,' v-input--checkbox main--text')]")).size());
        Assertions.assertEquals(iter,driver.findElements(By.xpath("//span[@aria-expanded='false']")).size());
        click("//span[contains(text(),'Выгрузить в excel')]");
        options_close();
        for (int i = 1;i<iter;i++){

            options_click();
            sleep(400);
            click("(//div[@class='column-checkboxes my-5']//following-sibling::label)["+(i)+"]");
            options_close();
            try {
                sleep(200);
                driver.findElement(By.xpath("//input[contains(@placeholder,'Поиск по колонке...')])[1]")).sendKeys("111");
                step("Эелемент под порядковым номером "+i+" в таблице НЕ скрыт");
                driver.get("http://cfmc.ru/");
            }catch (Exception e){
                step("Эелемент "+i+" скрыт");
            }
        }

    }



    public void options_close(){
        click("(//i[contains(@class,'v-icon notranslate material-icons theme--dark')])[2]");
    }


    public void search_str(){
        step("Найти элемент 'Поиск'");
        find("//label[contains(text(),'Поиск')]");
    }


    public void loop(){
        step("Найти элемент' Значок <Лупа>'");
        find("//i[contains(text(),'search')]");
    }

    //----------------------------------------------------------------- таблица
    public void numberTable1(){
        step("Найти элемент' №' в таблице");
        find("(//th[contains(text(),'№')])[1]");
    }



    public void numberTable2(){
        step("Найти элемент' №' в таблице под порядковым номером - 2");
        find("(//th[contains(text(),'№')])[2]");
    }



    public void year(){
        step("Найти элемент' Год' в таблице под порядковым номером - 3");
        find("(//th[contains(text(),'Год')])");
    }


    public void status(){
        step("Найти элемент 'Статус' в таблице под порядковым номером - 4");
        find("//th[contains(text(),'Статус')]");
    }


    public void numberOrderUtv(){
        step("Найти элемент ' № приказа об утверждении ОДУ ' в таблице под порядковым номером - 5");
        find("(//th[contains(text(),'№ приказа об')])");
    }


    public void dateOrderUtv(){
        step("Найти элемент ' Дата приказа об утверждении ОДУ ' в таблице под порядковым номером - 6");
        find("//th[contains(text(),'Дата приказа об')]");
    }


    public void numberOrderCh(){
        step("Найти элемент ' № приказа о внесении изменений ОДУ ' в таблице под порядковым номером - 7");
        find("//th[contains(text(),'№ приказа о внесении')]");
    }


    public void dateOrderCh(){
        step("Найти элемент ' Дата приказа о внесении изменений ОДУ ' в таблице под порядковым номером - 8");
        find("//th[contains(text(),'Дата приказа о внесении')]");
    }


    public void comment(){
        step("Найти элемент ' Комментарий ' в таблице под порядковым номером - 9");
        find("//th[contains(text(),'Комментарий')]");
    }


    public void utverdil(){
        step("Найти элемент 'Утвердил' в таблице под порядковым номером - 10");
        find("//th[contains(text(),'Утвердил')]");
    }


    public void dateUtv(){
        step("\"Найти элемент ' Дата утв. ' в таблице под порядковым номером - 11\"");
        find("//th[contains(text(),'Дата утв.')]");
    }


    public void action(){
        step("Найти элемент ' Действие ' в таблице ");
        find("//th[contains(text(),'Действие')]");
    }


    public void strOnPage(){
        step("Найти элемент ' Строк на странице ' под таблицей\t");
        find("//span[contains(text(),'Строк на странице')]");
    }


    public void elem15(){
        step("Найти элемент ' 15 '(15-кол-во отраженных записей по умолчанию) под таблицей справа от элемента 'Строк на странице'\t");
        find("//div[contains(text(),'15')]");
    }


    public void flag(){
        step("Найти элемент \"▼\" справа от элемента \"15\"\t");
        //find("//i[contains(@class,'v-icon notranslate material-icons theme--light primary--text')]");
        find("//i[contains(text(),'arrow_drop_down')]");
    }
    public void flagClick(){
        sleep(1000);
        scroolDown();
        WebElement element = driver.findElement(By.xpath("//i[contains(text(),'arrow_drop_down')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        //WebElement element = driver.findElement(By.id("my-id"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        step("Кликнуть на флаг");
        click("//i[contains(text(),'arrow_drop_down')]");
        sleep(500);
    }


    public void o1To15(){
        step("Найти элемент \"1-15 из ххх\" справа от элемента \"▼\"(ххх - общее кол-во записей)\t");
        find("//span[contains(text(),'1 - 15 из ')]");
    }


    public void beforeAllBtn(){
        step("Найти элемент \"|<\" справа от элемента \"1-15 из ххх\"\t");
        find("(//button[contains(@class,'mx-1 v-btn v-btn--disabled v-btn--flat v-btn--icon v-btn--round theme--light v-size--default')])[1]");
    }

    public void beforeBtn(){
        step("Найти элемент \"<\" справа от элемента \"|<\"\t");
        find("(//button[contains(@class,'mx-1 v-btn v-btn--disabled v-btn--flat v-btn--icon v-btn--round theme--light v-size--default')])[2]");
    }


    public void nextPage(){
        step("Найти элемент \">\" справа от элемента \"<\"\t");
        find("//i[contains(text(),'chevron_right')]");
    }

    public String lastPageElem = "//i[contains(text(),'last_page')]";
    public void lastPage(){
        step("Найти элемент \">|\" справа от элемента \">\"\t");
        find(lastPageElem);
    }
    public void clickLastPageElem(){

            try{
                scroolDown();
                sleep(1000);
                scroolDown();
                sleep(500);
                click(lastPageElem);
            }catch (Exception e){
                driver.navigate().refresh();
                sleep(500);
                scroolDown();
                sleep(500);
                click(lastPageElem);
            }


    }


    public void cancel(){
        step("Найти элемент \"Отменить\" снизу справа страницы\t");
        find("//span[contains(text(),'Отменить')]");
    }


    public void save(){
        step("Найти элемент \"Сохранить\" справа от элемента \"Сохранить\"\t");
        find("//span[contains(text(),'Сохранить')]");
    }

    public static int actionBtnSize(){
        step("Найти элемент \"≡\"(Действие) с краю таблицы (по умолчанию 15 шт.)\t");

        return driver.findElements(By.xpath("//i[contains(text(),'list')]")).size();
    }

    public void actionBtnClick(int numberInPage){
        step("Кликнуть на Действие");
        //click("(//i[contains(text(),'list')])["+numberInPage+"]");
        tb.actionBtnClick(numberInPage);
    }

    public void showAndEditProdject(){
        step("Кликнуть на Просмотр и редактирование ОДУ");
        click("(//div[contains(text(),'Просмотр и редактирование проектов ОДУ')])");
    }

    public void copyProdject(){
        step("Кликнуть на Создать на основании");
        click("//div[contains(text(),'Создать на основании')]");
    }
    public void createCorrect() {
        tb.createCorrect();
    }

    @AfterEach
    public void tearDown(){
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }

}