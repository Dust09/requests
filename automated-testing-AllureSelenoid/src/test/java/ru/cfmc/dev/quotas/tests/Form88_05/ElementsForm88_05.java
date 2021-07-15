package ru.cfmc.dev.quotas.tests.Form88_05;

import org.junit.jupiter.api.Assertions;
import ru.cfmc.dev.quotas.MethodsSelenium;

import static io.qameta.allure.Allure.step;

public class ElementsForm88_05 extends MethodsSelenium {

    public String headElem = "//h1[contains(text(),'Журнал приказов (проектов приказов) об общих допус')]";

    public String secondHeadElem = "//h3[contains(text(),'Журнал приказов ОДУ по видам квот')]";

    public String headAfterCreateOrderEl = "//h1[contains(text(),'Распределение общих допустимых уловах применительн')]";

    public String showEditProdB = "(//div[contains(text(),'Просмотр и редактирование')])[1]";

    public String poolField = "(//label[contains(text(),'Бассейн')]/following-sibling::input)[1]";

    public String showEditDataStrEl = "//div[contains(text(),'Просмотр/редактирование данных по строке')]";

    public void setPoolField(){
        step("Найти поле Бассейн");
        find(poolField);
    }

    public String districtField = "(//label[contains(text(),'Район добычи (вылова)')]/following-sibling::input)[1]";
    public void setDistrictField(){
        step("Найти поле Район добычи(вылова)");
        find(districtField);
    }

    public String VBRField = "(//label[contains(text(),'ВБР')]/following-sibling::input)[1]";
    public void setVBRField(){
        step("Найти поле ВБР");
        find(VBRField);
    }

    public String numOrderField = "(//label[contains(text(),'№ приказа')]/following-sibling::input)[1]";
    public void setNumOrderField(){
        step("Найти поле № приказа");
        find(numOrderField);
    }

    public String dateOrderField = "(//label[contains(text(),'Дата приказа')]/following-sibling::input)[1]";
    public void setDateOrderField(){
        step("Найти поле Дата приказа");
        find(numOrderField);
    }

    String detailOnStr = "//p[contains(text(),'Детализация по строке:')]";
    public void setDetailOnStr(){
        step("Найти элемент Детализация по строке");
        find(detailOnStr);
    }

    String checkBoxMath = "//label[contains(text(),'Осуществлять расчёт зависимых')]";
    public void setCheckBoxMath(){
        step("Найти чекбокс Осуществлять расчет зависимых");
        find(checkBoxMath);
    }

    public String ODUField = "(//label[contains(text(),'ОДУ (нац.квота)')]/following-sibling::input)[1]";
    public void setODUField(){
        step("Найти поле Дата приказа");
        find(ODUField);
    }

    String nazcField = "(//label[contains(text(),'Сверх нац.квоты')]/following-sibling::input)[1]";
    public void setNazcField(){
        step("Найти поле Сверх нац.квоты");
        find(nazcField);
    }

    String rasprKvt = "//span[contains(text(),'Распределение квот')]";
    public void bookRasprKvt(){
        step("Найти вкладку распределение квот");
        find(rasprKvt);
    }

    String investPairBook = "//span[contains(text(),'Инвестиционные доли')]";
    public void setInvestPairBook(){
        step("Найти вкладку Инвестиционные доли");
        find(investPairBook);
    }

    String formulaField = "(//label[contains(text(),'Методика расчёта зависимых')]/following-sibling::input)[1]";
    public void setFormulaField(){
        step("Найти поле Методика расчёта зависимых");
        find(formulaField);
    }

    String countBtn = "//span[contains(text(),'Пересчитать')]";
    public void setCountBtn(){
        step("Найти кнопку Пересчитать");
        find(countBtn);
    }

    String chooiseMethodField = "(//label[contains(text(),'Критерий выбора метода расчета')]/following-sibling::input)[1]";
    public void setChooiseMethodField(){
        step("Найти поле Методика расчёта зависимых");
        find(formulaField);
    }

    String chooiseShowHead = "//h1[contains(text(),'Изменение/просмотр ОДУ по видам квот')]";
    public void setChooiseShowHead(){
        step("Найти элемент Изменение/просмотр ОДУ по видам квот");
        find(chooiseShowHead);
    }

    public String nameTable8805 = "//h3[contains(text(),'Распределение квот')]";
    public void setNameTable8805(){
        step("Найти название таблицы Распределение квот");
        find(nameTable8805);
    }

    public String addStr = "//span[contains(text(),'Добавить строки')]";
    public void setAddStr(){
        step("Найти кнопку Добавить строки");
        find(addStr);
    }

    public String kmns = "//div[contains(text(),'Загрузить данные из заявок КМНС')]";
    public void setKmns(){
        step("Найти элемент 'Загрузить данные из заявок КМНС'");
        find(kmns);
    }
    public String nir = "//div[contains(text(),'Загрузить данные из заявок НИР')]";
    public void setNir(){
        step("Найти элемент 'Загрузить данные из заявок НИР'");
        find(nir);
    }
    public String ucheb = "//div[contains(text(),'Загрузить данные из заявок УЧЕБ')]";
    public void setUcheb(){
        step("Найти элемент 'Загрузить данные из заявок УЧЕБ'");
        find(ucheb);
    }
    public String lub = "//div[contains(text(),'Загрузить данные из заявок ЛЮБ')]";
    public void setLub(){
        step("Найти элемент 'Загрузить данные из заявок ЛЮБ'");
        find(lub);
    }

    String step1 = "//h1[contains(text(),'Шаг 1: выбор приказа из перечня')]";
    public void setStep1(){
        step("Найти элемент Шаг 1: выбор приказа из перечня");
        Assertions.assertEquals("Шаг 1: выбор приказа из перечня",getText(step1));
        find(step1);
    }

    String step2 = "//h1[contains(text(),'Шаг 2: выбор строк для добавления в проект приказа')]";
    public void setStep2(){
        step("Найти элемент \"Шаг 2: выбор строк для добавления в проект приказа ОДУ применительно к видам квот\"");
        Assertions.assertEquals("Шаг 2: выбор строк для добавления в проект приказа ОДУ применительно к видам квот",getText(step2));
        find(step2);
    }

    public String sformPrikaz = "//div[contains(text(),'Сформировать приказ')]";

    String sformPrikazForm = "//p[contains(text(),'Формирование и загрузка приказа')]";
    public void setSformPrikazForm(){
        step("Найти элемент Формирование и загрузка приказа");
         find(sformPrikazForm);

    }

    public String fieldSformPrikaz = "//div[@class='v-input context-row-field v-input--hide-details v-input--is-label-active v-input--is-dirty v-input--is-readonly theme--light v-text-field v-text-field--is-booted']//input";

    public String listOrder = "//h3[contains(text(),'Перечень приказов')]";
    public void setListOrder(){
        step("Найти элемент Перечень приказов");
        find(listOrder);
    }

    public String goTOData = "(//a[contains(text(),'Перейти к данным')])[1]";

    String akvaCBox = "//label[contains(text(),'АКВА')]";
    public void setAkvaCBox(){
        step("Найти чкбокс Аква");
        find(akvaCBox);
    }

    String krabCBox = "//label[contains(text(),'добычи (вылова) крабов, предоставленные в инвестиц')]";
    public void setKrabCBox(){
        step("Найти чекбокс добычи (вылова) крабов, предоставленные в инвестиционных целях");
        find(krabCBox);
        Assertions.assertEquals("добычи (вылова) крабов, предоставленные в инвестиционных целях",getText(krabCBox));
    }

    String investCBox = "//label[contains(text(),'ИНВЕСТ')]";
    public void setInvestCBox(){
        step("Найти чекбокс добычи (вылова) крабов, предоставленные в инвестиционных целях");
        find(investCBox);
        Assertions.assertEquals("ИНВЕСТ",getText(investCBox));
    }

    String inostrCBox = "//label[contains(text(),'ИНОСТР')]";
    public void setInostrCBox(){
        step("Найти чекбокс ИНОСТР");
        find(inostrCBox);
    }

    String kmnsCBox = "//label[contains(text(),'КМНС')]";
    public void setKmnsCBox(){
        step("Найти чекбокс КМНС");
        find(kmnsCBox);
    }

    String lubCBox = "//label[contains(text(),'ЛЮБ')]";
    public void setLubCBox(){
        step("Найти чекбокс ЛЮБ");
        find(lubCBox);
    }

    String morskCBox = "//label[contains(text(),'Морская (пром/приб)')]";
    public void setMorskCBox(){
        step("Найти чекбокс Морская (пром/приб)");
        find(morskCBox);
    }

    String nirCBox = "//label[contains(text(),'НИР')]";
    public void setNirCBox(){
        step("Найти чекбокс НИР");
        find(nirCBox);
    }

    String uchebCBox = "//label[contains(text(),'УЧЕБ')]";
    public void setUchebCBox(){
        step("Найти чекбокс УЧЕБ");
        find(uchebCBox);
    }

    String formatFile = "//p[contains(text(),'Формат файла:')]";
    public void setFormatFile(){
        step("Найти элемент Формат приказа");
        find(formatFile);
    }

    String downloadOrder = "//span[contains(text(),' Загрузить приказ ')]";
    public void setDownloadOrder(){
        step("Найти кнопку Загрузить приказ");
        find(downloadOrder);
    }

    String excelElem = "//label[contains(text(),'Excel')]";
    public void setExcelElem(){
        step("Найти элемент Excel");
        find(excelElem);
    }
}
