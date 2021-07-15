package ru.cfmc.dev.quotas.tests;


import org.junit.jupiter.api.Assertions;
import ru.cfmc.dev.quotas.MethodsSelenium;

import static io.qameta.allure.Allure.step;

public class ElementsTable extends MethodsSelenium {
    //5.4
    String numElemTable = "(//th[contains(text(),'№')])[1]";
    public void setNumElemTable(){
        step("Найти элемент № в таблице ");
        find(numElemTable);
    }

    String historyOfPartTable = "//th[contains(text(),' История доли ')]";
    public void setHistoryOfPartTable(){
        step("Найти элемент История доли в таблице ");
        find(historyOfPartTable);
    }

    String lockElemTable = "//th[contains(text(),' Закрепление ')]";
    public void setLockElemTable(){
        step("Найти элемент Закрепление в таблице ");
        find(lockElemTable);
    }

    String partOfKvotsElemTable = "//th[contains(text(),'Доля квоты')]";
    public void setPartOfKvotsElemTable(){
        step("Найти элемент Доля квоты  в таблице ");
        find(partOfKvotsElemTable);
    }

    String poolElmTable = "//th[contains(text(),'Бассейн')]";
    public void setPoolElmTable(){
        step("Найти элемент Бассейн в таблице ");
        find(poolElmTable);
    }

    String districtProductElemTable = "//th[contains(text(),'Район добычи (вылова)')]";
    public void setDistrictProductElemTable(){
        step("Найти элемент Район добычи (вылова)  в таблице ");
        find(districtProductElemTable);
    }

    String vbrElemTable = "//th[contains(text(),'ВБР')]";
    public void setVbrElemTable(){
        step("Найти элемент ВБР в таблице ");
        find(vbrElemTable);
    }

    String partPercentElemTable = "//th[contains(text(),'Доля, %')]";
    public void setPartPercentElemTable(){
        step("Найти 'Доля, %' в таблице");
        find(partPercentElemTable);
    }

    String sizeOfPartElemTable = "//th[contains(text(),'Размер доли, %')]";
    public void setSizeOfPartElemTable(){
        step("Найти элемент Размер доли, % в таблице ");
        find(sizeOfPartElemTable);
    }

    String nameOfUserElemTable = "//th[contains(text(),'Наименование пользователя')]";
    public void setNameOfUserElemTable(){
        step("Найти элемент Наименование пользователя в таблице ");
        find(nameOfUserElemTable);
    }

    String innOfUserElemTable = "//th[contains(text(),'ИНН пользователя')]";
    public void setInnOfUserElemTable(){
        step("Найти элемент ИНН пользователя в таблице ");
        find(innOfUserElemTable);
    }

    String INNElemTable = "//th[contains(text(),'ИНН')]";
    public void setINNElemTable(){
        step("Найти элемент ИНН в таблице");
        find(INNElemTable);
    }

    String userVBRElemTable = "//th[contains(text(),'Пользователь ВБР')]";
    public void setUserVBRElemTable(){
        step("Найти элемент Пользователь ВБР");
        find(userVBRElemTable);
    }

    String numbAndDateOfOrderElemTable = "//th[contains(text(),'Номер и дата договора')]";
    public void setNumbAndDateOfOrderElemTable(){
        step("Найти элемент Номер и дата договора  в таблице ");
        find(numbAndDateOfOrderElemTable);
    }

    String numTableOrder = "//th[contains(text(),'№ таблицы по приказу')]";
    public void setNumTableOrder(){
        step("Найти элемент '№ таблицы по приказу'");
        find(numTableOrder);
    }

    String yearElemTable = "//th[contains(text(),'Год')]";
    public void setYearElemTable(){
        step("Найти элемент Год  в таблице ");
        find(yearElemTable);
    }

    String kindOfOrder = "//th[contains(text(),'Вид приказа')]";
    public void setKindOfOrder(){
        step("Найти элемент Вид приказа в таблице");
        find(kindOfOrder);
    }

    String kindOfKvt = "//th[contains(text(),'Вид квоты')]";
    public void setKindOfKvt(){
        step("Найти элемент Вид квоты в таблице");
        find(kindOfKvt);
    }

    String dateOfStartAndEndOrderElemTable = "//th[contains(text(),' Даты начала и окончания действия договора ')]";
    public void setDateOfStartAndEndOrderElemTable(){
        step("Найти элемент Даты начала и окончания действия договора в таблице ");
        find(dateOfStartAndEndOrderElemTable);
    }

    String actionElemTable = "//th[contains(text(),'Действие')]";
    public void setActionElemTable(){
        step("Найти Действие в таблице");
        find(actionElemTable);
    }


    String commElemTable = "//th[contains(text(),'Комментарий')]";
    public void setCommElemTable(){
        step("Найти Элемент 'Комментарий' в таблице");
        find(commElemTable);
    }

    String choose = "//th[contains(text(),'Выбор')]";
    public void setChooseElemTable(){
        step("Найти Элемент 'Выбор' в таблице");
        find(choose);
    }

    String commODUElemTable = "//th[contains(text(),'Комментарий ОДУ')]";
    public void setCommODUElemTable(){
        step("Найти Элемент 'Комментарий ОДУ' в таблице");
        find(commODUElemTable);
    }


    String dateCreateEditTable = "//th[contains(text(),'Дата создания / редактир.')]";
    public void setDateCreateEditTable(){
        step("Найти Элемент 'Дата создания / редактир.' в таблице");
        find(dateCreateEditTable);
    }

    String dateStartEndElemTable = "//th[contains(text(),'Начало и окончание действия договора')]";
    public void setDateStartEndElemTable(){
        step("Найти Элемент 'Начало и окончание действия договора' в таблице");
        find(dateStartEndElemTable);
    }

    String numAndDateOrderRosribolovElemTable = "//th[contains(text(),'Номер и дата приказа Росрыболовства')]";
    public void setNumAndDateOrderRosribolovElemTable(){
        step("Найти элемент Номер и дата приказа Росрыболовства в таблице ");
        find(numAndDateOrderRosribolovElemTable);
    }

    String numPPpartElemTable = "//th[contains(text(),' № п/п (доля) ')]";
    public void setNumPPpartElemTable(){
        step("Найти элемент № п/п (доля) в таблице ");
        find(numPPpartElemTable);
    }

    String numPPElemTable = "//th[contains(text(),'№ п/п таблицы')]";
    public void setNumPPElemTable(){
        step("Найти Элемент '№ п/п таблицы' в таблице");
        find(numPPElemTable);
    }

    String subjRF = "//th[contains(text(),'Субъект РФ')]";
    public void setSubjRF(){
        step("Найти Элемент 'Субьект РФ' в таблице");
        find(subjRF);
    }

    String zaprocheno = "//th[contains(text(),'Запрошено')]";
    public void setZaprocheno(){
        step("Найти Элемент 'Запрошено' в таблице");
        find(zaprocheno);
    }

    String Vkvt = "//th[contains(text(),' Объём квот (текущий) ')]";
    public void setVkvt(){
        step("Найти Элемент 'Объем квот(текущий)' в таблице");
        find(Vkvt);
    }



    String numOrderElemTable = "(//th[contains(text(),'№ приказа')])[1]";
    public void setNumOrderElemTable(){
        step("Найти Элемент '№ приказа' в таблице");
        find(numOrderElemTable);
    }

    String numChangeElemTable = "//th[contains(text(),' Номер и дата приказа о внесении изменений в приложение к приказу ')]";
    public void setNumChangeElemTable(){
        step("Найти Элемент ' Номер и дата приказа о внесении изменений в приложение к приказу ')] в таблице");
        find(numChangeElemTable);
    }

    String numDateOrderODU = "//th[contains(text(),'Номер и дата приказа ОДУ')]";
    public void setNumDateOrderODU(){
        step("Найти Элемент ' Номер и дата приказа ОДУ ' в таблице");
        find(numDateOrderODU);
    }

    String numOrderODU = "//th[contains(text(),'Номер приказа ОДУ')]";
    public void setNumOrderODU(){
        step("Найти Элемент ' Номер приказа ОДУ ' в таблице");
        find(numOrderODU);
    }

    String dateOrderODU = "//th[contains(text(),'Дата приказа ОДУ')]";
    public void setDateOrderODU(){
        step("Найти Элемент 'Дата приказа ОДУ ' в таблице");
        find(dateOrderODU);
    }


    String numOrderChangeTable = "(//th[contains(text(),'№ приказа о внесении изменений')])[1]";
    public void setNumOrderChangeTable(){
        step("Найти Элемент '№ приказа о внесении изменений' в таблице");
        find(numOrderChangeTable);
    }

    String dateOrderChangeTable = "(//th[contains(text(),'Дата приказа о внесении изменений')])[1]";
    public void setDateOrderChangeTable(){
        step("Найти Элемент 'Дата приказа о внесении изменений' в таблице");
        find(dateOrderChangeTable);
    }

    String dateOrderTable = "//th[contains(text(),'Дата приказа')]";
    public void setDateOrderTable(){
        step("Найти Элемент 'Дата приказа' в таблице");
        find(dateOrderTable);
    }

    String numAndOrderChangeTable = "//th[contains(text(),' Номер и дата приказ о внесении изменений " +
            "в приложение к приказу Росрыболовства ')]";
    public void setNumAndOrderChangeTable(){
        step("Найти элемент Номер и дата приказ о внесении изменений в таблице в приложение к приказу Росрыболовства ");
        find(numAndOrderChangeTable);
    }

    String order = "//th[contains(text(),'Приказ')]";
    public void order(){
        step("Найти Элемент 'Приказ' в таблице");
        find(order);
    }
    String dateExtraElemTable = "//th[contains(text(),' Дата доп. соглашения ')]";
    public void setDateExtraElemTable(){
        step("Найти элемент Дата доп.соглашения  в таблице ");
        find(dateExtraElemTable);
    }

    public void dateExtraElemTableProb(){
        step("Найти элемент Дата доп.соглашения  в таблице");
        find("//th[contains(text(),' Дата доп.соглашения ')]");
        Assertions.assertEquals("Нужно добавить пробел после ." , "Нужно добавить пробел ");
    }

    String ribDistrictElemTable = "//th[contains(text(),' Рыбохозяйственный бассейн')]";
    public void setRibDistrictElemTable(){
        step("Найти элемент Рыбохозяйственный бассейн  в таблице ");
        find(ribDistrictElemTable);
    }
    String districtRegularElemTable = "//th[contains(text(),'Район регулирования')]";
    public void setDistrictRegularElemTable(){
        step("Найти элемент Район регулирования  в таблице ");
    }

    String districtPromElemTable = "//th[contains(text(),'Район промысла')]";
    public void setDistrictPromElemTable(){
        step("Найти элемент Район промысла в таблице");
        find(districtPromElemTable);
    }

    String orderNumElemTable = "//th[contains(text(),' Договор № ')]";
    public void setOrderNumElemTable(){
        step("Найти элемент Договор №  в таблице ");
        find(orderNumElemTable);
    }

    String dateZaklOrder = "//th[contains(text(),' Дата заключения договора ')]";
    public void setDateZaklOrder(){
        step("Найти элемент Дата заключения договора в таблице ");
        find(dateZaklOrder);
    }

    String pribRibElemTable = "//th[contains(text(),'Прибрежное рыболовство, %')]";
    public void setPribRibElemTable(){
        step("Найти элемент в таблице 'Прибрежное рыболовство, %' ");
        find(pribRibElemTable);
    }

    String promrRibElemTable = "//th[contains(text(),'Промышленное рыболовство, %')]";
    public void setPromrRibElemTable(){
        step("Найти элемент 'Промышленное рыболовство, %' в таблице ");
        find(promrRibElemTable);
    }

    String organizationElemTable = "//th[contains(text(),'Организация')]";
    public void setOrganizationElemTable(){
        step("Найти элемент 'Организация' в таблице ");
        find(organizationElemTable);
    }

    String addToApplicationElemTable = "//th[contains(text(),'Добавить в заявку')]";
    public void setAddToApplicationElemTable(){
        step("Найти элемент 'Добавить в заявку' в таблице ");
        find(addToApplicationElemTable);
    }

    String addToProdOrder = "//th[contains(text(),'Добавить в проект приказа')]";
    public void setAddToProdOrder(){
        step("Найти элемент 'Добавить в проект приказа' в таблице ");
        find(addToProdOrder);
    }

    String numOfApplicationElemTable = "//th[contains(text(),'№ Заявления')]";
    public void setNumOfApplicationElemTable(){
        step("Найти № заявления в таблице");
        find(numOfApplicationElemTable);
    }

    String statusElemTable = "//th[contains(text(),'Статус')]";
    public void setStatusElemTable(){
        step("Найти элемент Статус в таблице");
        find(statusElemTable);
    }

    //Form8805
    String oduTable = "(//th[contains(text(),'ОДУ')])";
    public void setOduTable(){
        step("Найти элемент ОДУ в таблице");
        try{
            find(oduTable+"[3]");
        }catch (Exception e){
            find(oduTable);
            Assertions.assertEquals("ОДУ",getText(oduTable));
        }
    }
    String kmnsTable = "(//th[contains(text(),'КМНС')])";
    public void setKmnsTable(){
        step("Найти элемент КМНС в таблице");
        find(kmnsTable);
    }
    String nirTable = "(//th[contains(text(),'НИР')])";
    public void setNirTable(){
        step("Найти элемент НИР в таблице");
        find(nirTable);
    }
    String akvaTable = "(//th[contains(text(),'АКВА')])";
    public void setAkvaTable(){
        step("Найти элемент АКВА в таблице");
        find(akvaTable);
    }

    String inostrTable = "(//th[contains(text(),'ИНОСТР')])";
    public void setInostrTable(){
        step("Найти элемент ИНОСТР в таблице");
        find(inostrTable);
    }

    String uchebTable = "(//th[contains(text(),'УЧЕБ')])";
    public void setUchebTable(){
        step("Найти элемент УЧЕБ в таблице");
        find(uchebTable);
    }

    String lubTable = "(//th[contains(text(),'ЛЮБ')])";
    public void setLubTable(){
        step("Найти элемент ЛЮБ в таблице");
        find(lubTable);
    }

    String investTable = "(//th[contains(text(),'ИНВЕСТ')])";
    public void setInvestTable(){
        step("Найти элемент ИНВЕСТ в таблице");
        find(investTable);
    }

    String morskPromPribTable = "(//th[contains(text(),'Морская (пром/приб')])";
    public void setMorskPromPribTable(){
        step("Найти элемент Морская (пром/приб) в таблице");
        find(morskPromPribTable);
    }

    String rejectionTable = "(//th[contains(text(),'Отклонение')])";
    public void setRejectionTable(){
        step("Найти элемент Отклонение в таблице");
        find(rejectionTable);
    }

}
