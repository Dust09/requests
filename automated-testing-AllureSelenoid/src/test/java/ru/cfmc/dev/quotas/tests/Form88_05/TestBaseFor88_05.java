package ru.cfmc.dev.quotas.tests.Form88_05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.Form8802_8803_8804.Form8802;
import ru.cfmc.dev.quotas.tests.Form8802_8803_8804.Form8803;
import ru.cfmc.dev.quotas.tests.Form8802_8803_8804.TestBaseFor8802_8803_8804;
import ru.cfmc.dev.quotas.tests.GeneralElements;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8802.PageObject88_02;

import static io.qameta.allure.Allure.step;

public class TestBaseFor88_05 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsForm88_05 el = new ElementsForm88_05();
    public ElementsTable elementsTable = new ElementsTable();
    public TestBaseFor8802_8803_8804 from8802 = new TestBaseFor8802_8803_8804();
    public Form8803 testsf8803 = new Form8803();

    @BeforeEach
    public void setUp(){
        browser();
        goTo88_05Opt();
    }

    private void goTo88_05Opt() {
        start();
        step("кликнуть иконку 88.05");
        click("//div[contains(text(),'Журнал приказов (проектов приказов) об общих допустимых уловах применительно к видам квот в морских водах ')]");
        Assertions.assertEquals("Журнал приказов (проектов приказов) об общих допустимых уловах применительно к видам квот в морских водах"
                , getText("//h1[contains(text(),'Журнал приказов (проектов приказов) об общих допус')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form88_05"), driver.getCurrentUrl());
        step("Опции");
        ge.options_click();
        step("Отображать поиск по колонкам");
        try {
            ge.showSearchTableChbx();
            ge.optionClose();
        } catch (Exception e) {
            //driver.navigate().back();
            driver.navigate().refresh();
            ge.options_click();
            ge.showSearchTableChbx();
            ge.optionClose();
        }
    }

    public void showEditDataStr(){
        step("Кликнуть на Просмотр/редактирование данных по строке ");
        click(el.showEditDataStrEl);
    }

    public void goTo88_05(){
        start();
        click("//div[contains(text(),'Журнал приказов (проектов приказов) об общих допустимых уловах применительно к видам квот в морских водах ')]");
        Assertions.assertEquals("Журнал приказов (проектов приказов) об общих допустимых уловах применительно к видам квот в морских водах"
                , getText("//h1[contains(text(),'Журнал приказов (проектов приказов) об общих допус')]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form88_05"), driver.getCurrentUrl());
    }

    //Поле Бассейн

    public void choosePool(){
        changePoolFlag();
        sleep(500);
        DVclick();
    }

    public void changePoolFlag(){
        step("Кликнуть на флаг Бассейн");
        click(el.poolField);
    }

    public void DVclick(){
        step("Кликнуть на Дальневосточный");
        click("//div[contains(text(),'Дальневосточный')]");
    }

    public void assertYear2020(){
        Assertions.assertEquals("2020", getText("//td[contains(text(),'2020')]"));
    }

    public void assertCorrect(String num){
        step("Проверка по полю № приказа о внесении изменений");
        //th[contains(text(),'№ приказа о внесении')]/../../following-sibling::tbody/tr/td[contains(text(),'Корректировка')]
        Assertions.assertEquals(num, getText("//td[contains(text(),'"+num+"')]"));
    }

    public void assertKindOfOrder(){
        step("Вид приказа ОДУ");
        find("//td[contains(text(),'ОДУ')]");
    }

    public void addStrClick(){
        step("Кликнуть на кнопку Добавить строки");
        click(el.addStr);
    }

    public void goToDataClick(){
        step("Кликнуть на Перейти к данным");
        click(el.goTOData);
    }

    public void sformPrikazClick(){
        step("Кликнуть на Сформировать приказ");
        click(el.sformPrikaz);
    }

    public void assertPoolDV(){
        Assertions.assertEquals("ДВ (1)",getText("//td[contains(text(),'ДВ (1)')]"));
    }

    public void showEditProject(){
        step("Кликнуть на просмотр и редактирование");
        Assertions.assertEquals("Просмотр и редактирование",getText(el.showEditProdB));
        click(el.showEditProdB);
    }

    public void assertApproveField(){
        //Проверка полей в статусе Утвержден
        try {
            from8802.menuDelete();
            step("Кнопка меню отображается!!!");
            driver.get("https://cfmc.ru/");
            click("112");
        } catch (Exception e) {
            step("Кнопка Меню не отображается");
        }
        try {
            for (int i = 1; i < 6; i++) {

                sendKeys("(//input[contains(@readonly,'readonly')]//preceding-sibling::label/following-sibling::input)[" + i + "]", "111");
            }
        }catch (Exception e){
            Assertions.assertEquals(1,2);
        }
        for (int i = 1; i < 6; i++) {

            sendKeys("(//input[contains(@readonly,'readonly')]//preceding-sibling::label/following-sibling::input)[" + i + "]", "111");
        }

        try {
            ge.saveButton();
            step("Кнопка сохранить Кликабельна!!");
            driver.get("https://cfmc.ru/");
        }catch (Exception e){
            step("Кнопка сохранить не кликабельна");
        }
    }

    @AfterEach
    public void end(){
        tearDown();
    }
}
