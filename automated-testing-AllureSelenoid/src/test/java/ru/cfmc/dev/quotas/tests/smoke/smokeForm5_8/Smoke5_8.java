package ru.cfmc.dev.quotas.tests.smoke.smokeForm5_8;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.tests.Form5_8.TestBaseFor5_8;

import static io.qameta.allure.Allure.step;

public class Smoke5_8 extends TestBaseFor5_8 {

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме \"")
    @Link(name = "3.3.8",url = "https://atlassian.cfmc.ru/display/CFMC/3.3.8")
    @Tag("smoke")
    @Test
    public void t3_3_8(){
        step("Найти элемент Реестр долей квот добычи (вылова) крабов, предоставленных в инвестиционных целях");
        Assertions.assertEquals("Реестр долей квот добычи (вылова) крабов, предоставленных в инвестиционных целях",getText(el.headElemForm));
        step("Найти элемент Доли инвестиционные для вылова крабов");
        Assertions.assertEquals("Доли инвестиционные для вылова крабов",getText(el.headInvestCrabElem));
        ge.assertMainElements();
        ge.setPartOfPairVBRButtonEl();

        //Фильтры
        el.setFilterElem();
        el.filterElemClick();
        el.setAnchoringElem();
        el.setNameOfUserElem();
        el.INNUsrElem();
        el.setNumAndDateOrderElem();
        step("Кол-во Фильтров 5");
        Assertions.assertEquals(5,driver.findElements(By.xpath("//div[@class = 'v-select__slot']")).size());


        //Таблица
        elementsTable.setNumElemTable();
        elementsTable.setHistoryOfPartTable();
        elementsTable.setLockElemTable();
        elementsTable.setNameOfUserElemTable();
        elementsTable.setInnOfUserElemTable();
        elementsTable.setNumbAndDateOfOrderElemTable();
        elementsTable.setDateExtraElemTable();
        elementsTable.setDateStartEndElemTable();
        elementsTable.setNumAndDateOrderRosribolovElemTable();
        elementsTable.setNumPPElemTable();
        elementsTable.setNumChangeElemTable();
        Assertions.assertEquals(11,driver.findElements(By.xpath("//th")).size());

    }

    @Description("Названия тест кейса: Сценарий  \"Наличие элементов в форме \"")
    @Link(name = "3.3.1",url = "https://atlassian.cfmc.ru/display/CFMC/3.3.1")
    @Tag("smoke")
    @Test
    public void t3_3_1(){
        step("Кликнуть на перейти");
        click("(//a[contains(text(),'Перейти')])[1]");
        step("Кликнуть на вкладку история владения долей");
        historyOfPair();
    }




}
