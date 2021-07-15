package ru.cfmc.dev.quotas.tests.Form2_9_3;

import org.junit.jupiter.api.Assertions;
import ru.cfmc.dev.quotas.MethodsSelenium;

import static io.qameta.allure.Allure.step;

public class ElementsForm2_9_3 extends MethodsSelenium {

    public String elemHead = "//h1[contains(text(),'Консолидация заявлений об определении вида рыболов')]" ;

    String tabMorskayaQuots = "//span[contains(text(),'Морская квота добычи (вылова) ВБР')]";
    public void setTabMorskayaQuots(){
        step("Найти вкладку Морская квота добычи (вылова) ВБР')");
        find(tabMorskayaQuots);
    }
    String tabMegdynarodnayaQuots = "//span[contains(text(),'Международная квота добычи (вылова) ВБР')]";
    public void setTabMegdynarodnayaQuots(){
        step("Найти вкладку Международная квота добычи (вылова) ВБР");
        find(tabMegdynarodnayaQuots);
    }
    public void tabMegdynarodnayaQuotsClick(){
        step("Кликнуть на вкладку Международная квота добычи (вылова) ВБР");
        click(tabMegdynarodnayaQuots);
    }

    //Фильтры
    String numApplicationFilter = "//label[contains(text(),'Заявления')]";
    public void setNumApplicationFilter(){
        step("Найти № Заявления в фильтрах");
        find(numApplicationFilter);
    }
    String userVBRFilter = "//label[contains(text(),'Пользователь ВБР')]";
    public void setUserVBRFilter(){
        step("Найти Пользователь ВБР в фильтрах");
        find(userVBRFilter);
    }
    String INNFilter = "//label[contains(text(),'ИНН')]";
    public void setINNFilter(){
        step("Найти ИНН в фильтрах");
        find(INNFilter);
    }
    String districtFilter = "//label[contains(text(),'Район добычи (вылова)')]";
    public void setDistrictFilter(){
        step("Найти Район добычи(вылова) в Фильтрах");
        find(districtFilter);
    }
    String districtRegFilter = "//label[contains(text(),'Район регулирования')]";
    public void setDistrictRegFilter(){
        step("найти элемент Район регулирования в фильтрах");
        find(districtRegFilter);
    }
    String districtPromFilter = "//label[contains(text(),'Район промысла')]";
    public void setDistrictPromFilter(){
        step("Найти элемент Район промысла в таблице");
        find(districtPromFilter);
    }
    String VBRFilter = "(//label[contains(text(),'ВБР')])[2]";
    public void setVBRFilter(){
        step("Найти ВБР в фильтрах ");
        find(VBRFilter);
    }
    String statusFilter = "(//label[contains(text(),'Статус')])";
    public void setStatusFilter(){
        step("Найти Статус в Фильтрах");
        find(statusFilter);
    }

    //Заявки
    String reasonCancel = "//p[contains(text(),'Причина отказа, комментарий:')]";
    public void setReasonCancel(){
        step("Найти элемент Причина отказа,комментарии");
        find(reasonCancel);
    }

    String baseCancel = "//p[contains(text(),'Основание отказа:')]";
    public void setBaseCancel(){
        step("Найти основания отказа");
        find(baseCancel);
    }

    String nameOrg = "//label[contains(text(),'Наименование организации')]";
    public void setNameOrg(){
        step("найти элемент Наименование организации");
        find(nameOrg);
    }

    //Убрали поле
    String fioSolve = "//p[contains(text(),'ФИО принявшего решение')]";
    public void setFioSolve(){
        try {
            find(fioSolve);
            step("Найти элемент ФИО принявшего решение");
            Assertions.assertEquals("Появилось поле ФИО","поле");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    String dateSolve = "//p[contains(text(),'Дата принятия решения:')]";
    public void setDateSolve(){
        step("Найти элемент Дата принятия решения");
        find(dateSolve);
    }

    String application = "//span[contains(text(),'Заявка № ')]";
    public void setApplication(){
        step("Найти элемент Заявка №");
        find(application);
    }

    String closeApplication = "//button[@class='v-btn v-btn--fab v-btn--flat v-btn--round v-btn--text theme--light v-size--small blue--text text--darken-1']";
    public void setCloseApplication(){
        step("Найти элемент Закрыть заявку");
        find(closeApplication);
    }
    public void closeApplicationClick(){
        step("Закрыть заявку");
        click(closeApplication);
    }

    String approvedApplication = "//p[contains(text(),'Заявка одобрена')]";
    public void setApprovedApplication(){
        step("Найти элемент Заявка одобрена");
        find(approvedApplication);
    }

    //Просмотр заявления
    public String headApplication = "//h1[contains(text(),'Просмотр поданных заявлений на вид рыболовства Мор')]";

    String tabQuotsMegdunarodn = "//span[contains(text(),'Квоты добычи (вылова) водных биоресурсов в районах')]";
    public void tabMegdunarodnQuotsClick(){
        step("Кликнуть на вкладку Квоты добычи (вылова) водных биоресурсов в районах действия еждународных договоров");
        click(tabQuotsMegdunarodn);
    }


}
