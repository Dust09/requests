package ru.cfmc.dev.quotas.tests.Form5_8;

import ru.cfmc.dev.quotas.MethodsSelenium;

import static io.qameta.allure.Allure.step;

public class ElementsForm5_8 extends MethodsSelenium {

    public String headElemForm = "//h1[contains(text(),'Реестр долей квот добычи (вылова) крабов, предоста')]";

    public String headInvestCrabElem = "//h3[contains(text(),'Доли инвестиционные для вылова крабов')]";

    //Фильтры
    String filterElem = "//summary[contains(text(),'Фильтры')]";
    public void setFilterElem(){
        step("Найти элемент Фильтры");
        find(filterElem);
    }
    public void filterElemClick(){
        step("Кликнуть на Элемент Фильтры");
        click(filterElem);
    }

    String anchoringElem = "//label[contains(text(),'Закрепление')]";
    public void setAnchoringElem(){
        step("В Фильтрах найти элемент Закрепление");
        find(anchoringElem);
    }

    String nameOfUserElem = "//label[contains(text(),'Наименование пользователя')]";
    public void setNameOfUserElem(){
        step("Найти элемент наименование пользователя");
        find(nameOfUserElem);
    }

    String INNUsrElem = "//label[contains(text(),'ИНН пользователя')]";
    public void INNUsrElem(){
        step("В Фильтрах найти элемент ИНН пользователя");
        find(INNUsrElem);
    }

    String numAndDateOrderElem = "//label[contains(text(),'Номер и дата договора')]";
    public void setNumAndDateOrderElem(){
        step("Найти элемент Номер и дата договора");
        find(numAndDateOrderElem);
    }




}
