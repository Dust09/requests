package ru.cfmc.dev.quotas.tests.smoke.smokeForm88_05;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.tests.Form88_05.TestBaseFor88_05;

import static io.qameta.allure.Allure.step;

public class Smoke88_05 extends TestBaseFor88_05 {

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме\"")
    @Link(name = "2.5.10",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.10")
    @Tag("smoke")
    @Test
    public void t2_5_10(){
        step("Найти заголовок формы");
        Assertions.assertEquals("Журнал приказов (проектов приказов) об общих допустимых уловах применительно к видам квот в морских водах",getText(el.headElem));
        step("Найти элемент Журнал приказов ОДУ по видам квот");
        Assertions.assertEquals("Журнал приказов ОДУ по видам квот",getText(el.secondHeadElem));
        ge.setCreateProject();
        ge.assertMainElements();
        //Таблица
        elementsTable.setNumElemTable();
        elementsTable.setYearElemTable();
        elementsTable.setPoolElmTable();
        elementsTable.setStatusElemTable();
        elementsTable.setNumOrderElemTable();
        elementsTable.setDateOrderTable();
        elementsTable.setNumOrderChangeTable();
        elementsTable.setCommElemTable();
        elementsTable.setDateCreateEditTable();
        elementsTable.setActionElemTable();
    }

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в ЭФ \"Распределение общих допустимых уловов\"\"")
    @Link(name = "2.5.26",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.26")
    @Tag("smoke")
    @Test
    public void t2_5_26(){
        ge.createProjectClick();
        Assertions.assertEquals("Для создания корректирующего приказа следует воспользоваться соответствующим пунктом в меню столбца Действие.\n" +
                "Там же можно создать копию существующего приказа или проекта.\n" +
                "Вы уверены, что требуется создать пустой отдельный проект?",driver.switchTo().alert().getText());
        window_accept();
        Assertions.assertEquals("Распределение общих допустимых уловах применительно к видам квот",getText(el.headAfterCreateOrderEl));
        from8802.setYearField();
        from8802.setCommField();
        from8802.setStatusField();
        el.setPoolField();
        changePoolFlag();
        Assertions.assertEquals(9,driver.findElements(By.xpath("//div[@role = 'option']")).size());
        ge.setFinish();
        ge.setSaveElem();
        ge.setCancelElem();
        String comm = stringBuilder();
        from8802.enterComment(comm);
        choosePool();
        ge.saveButton();
        ge.assertMainElements();
        from8802.setYearField();
        from8802.setCommField();
        from8802.setNumOrderField();
        from8802.setDateField();
        from8802.setStatusField();
        el.setPoolField();
        el.setAddStr();
        from8802.menuBtn();
        el.setKmns();
        el.setNir();
        el.setUcheb();
        el.setLub();
        from8802.setDeleteElem();
        //--Table
        elementsTable.setNumElemTable();
        elementsTable.setDistrictPromElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setCommODUElemTable();
        elementsTable.setNumDateOrderODU();
        elementsTable.setOduTable();
        elementsTable.setKmnsTable();
        elementsTable.setNirTable();
        elementsTable.setAkvaTable();
        elementsTable.setInostrTable();
        elementsTable.setUchebTable();
        elementsTable.setLubTable();
        elementsTable.setInvestTable();
        elementsTable.setMorskPromPribTable();
        elementsTable.setRejectionTable();
        elementsTable.setActionElemTable();

        from8802.menuDelete();
        window_accept();
    }
    @Description("Названия тест кейса: Сценарий   \"Наличие элементов в ЭФ Перечень приказов\"")
    @Link(name = "2.5.28",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.28")
    @Tag("smoke")
    @Test
    public void t2_5_28(){
        ge.createProjectClick();
        window_accept();
        String com = stringBuilder();
        from8802.enterComment(com);
        choosePool();
        ge.saveButton();
        addStrClick();
        ge.assertMainElements();
        el.setStep1();
        el.setListOrder();
        //Table
        elementsTable.setNumElemTable();
        elementsTable.setYearElemTable();
        elementsTable.setKindOfOrder();
        elementsTable.setStatusElemTable();
        elementsTable.setNumOrderODU();
        elementsTable.setDateOrderODU();
        elementsTable.setCommElemTable();
        elementsTable.setChooseElemTable();
        Assertions.assertEquals(8,driver.findElements(By.xpath("//th")).size());
        goToDataClick();

        ge.assertMainElements();
        el.setStep2();
        //Table
        elementsTable.setNumElemTable();
        elementsTable.setRibDistrictElemTable();
        elementsTable.setDistrictProductElemTable();
        elementsTable.setVbrElemTable();
        elementsTable.setOduTable();
        elementsTable.setNumTableOrder();
        elementsTable.setAddToProdOrder();

        driver.navigate().back();
        sleep(500);
        driver.navigate().back();
        sleep(500);
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(com);
    }

    @Description("Названия тест кейса: Сценарий \"Наличие элементов при Сформировании приказа\"")
    @Link(name = "2.5.29",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.29")
    @Tag("smoke")
    @Test
    public void t2_5_29(){
        ge.createProjectClick();
        window_accept();
        from8802.deleteYear();
        from8802.enterYear2020();
        String com = stringBuilder();
        from8802.enterComment(com);
        choosePool();
        ge.saveButton();
        String num = numBuilder();
        from8802.enterNumOrder(num);
        from8802.enterDateOfOrder();
        ge.saveButton();
        goTo88_05();
        from8802.findByComment(com);
        ge.actionClick();
        sformPrikazClick();
        el.setSformPrikazForm();
        //Не могу достать текст из полей, поэтому взял размер
        Assertions.assertEquals(3,driver.findElements(By.xpath(el.fieldSformPrikaz)).size());
        el.setAkvaCBox();
        el.setKrabCBox();
        el.setInvestCBox();
        el.setInostrCBox();
        el.setKmnsCBox();
        el.setLubCBox();
        el.setMorskCBox();
        el.setNirCBox();
        el.setUchebCBox();
        el.setFormatFile();
        el.setDownloadOrder();
        ge.optionClose();
        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(com);
    }




    @Description("Названия тест кейса: Сценарий \"Наличие элементов при Сформировании приказа\"")
    @Link(name = "2.5.30",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.30")
    @Tag("smoke")
    @Test
    public void t2_5_30(){
        from8802.goTo88_02();
        String com8802 = testsf8803.t2_3_30();
        goTo88_05();
        ge.createProjectClick();
        window_accept();
        from8802.deleteYear();
        from8802.enterYear2020();
        String com8805 = stringBuilder();
        from8802.enterComment(com8805);
        choosePool();
        ge.saveButton();
        addStrClick();
        from8802.findByComment(com8802);
        goToDataClick();
        from8802.addVbrCheckboxAll();
        ge.saveButton();
        driver.navigate().back();
        sleep(1000);
        driver.navigate().refresh();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        //ge.saveButton();
        ge.actionClick();
        showEditDataStr();

        el.setChooiseShowHead();
        ge.assertMainElements();
        from8802.setYearField();
        from8802.setCommField();
        from8802.setNumOrderField();
        from8802.setStatusField();
        from8802.setDateField();
        el.setPoolField();

        el.setDistrictField();
        el.setVBRField();
        el.setNumOrderField();
        el.setDateOrderField();
        el.setODUField();
        el.setNazcField();
        el.setFormulaField();
        el.setChooiseMethodField();

        el.setDetailOnStr();
        el.setCheckBoxMath();
        el.bookRasprKvt();
        el.setInvestPairBook();
        elementsTable.setNumElemTable();
        elementsTable.setKindOfKvt();
        elementsTable.setSubjRF();
        elementsTable.setZaprocheno();
        elementsTable.setVkvt();
        elementsTable.order();
        Assertions.assertEquals(6, driver.findElements(By.xpath("//th")).size());
        Assertions.assertEquals(14,driver.findElements(By.xpath("//fieldset")).size());

        from8802.goTo88_02();
        from8802.findByComment(com8802);
        from8802.odu();
        from8802.statusOrderClick();
        from8802.statusOrderDraftClick();
        ge.saveButton();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(com8802);

        goTo88_05();
        from8802.findByComment(com8805);
        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        sleep(500);
        from8802.findByCommentDelete(com8805);
    }

}
