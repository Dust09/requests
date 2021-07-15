package ru.cfmc.dev.quotas.tests.Form88_05;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static io.qameta.allure.Allure.step;

public class Form88_05 extends TestBaseFor88_05{


    @Description("Названия тест кейса: Сценарий  'Создать новый проект'")
    @Link(name = "2_5_1",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.1")

    @Test
    public String t2_5_1(){
        ge.createProjectClick();
        window_accept();
        from8802.deleteYear();
        from8802.enterYear2020();
        String comm = stringBuilder();
        from8802.enterComment(comm);
        choosePool();
        ge.saveButton();
        Assertions.assertEquals("Распределение общих допустимых уловах применительно к видам квот",getText(el.headAfterCreateOrderEl));

        goTo88_05();
        from8802.findByComment(comm);
        from8802.assertTableStatus("Черновик");
        assertYear2020();
        assertPoolDV();
        from8802.assertDateOfOrder();
        return comm;
    }

    @Description("Сценарий  \"Отправить в архив\" (только в статусе проекта \"черновик\"")
    @Link(name = "2_5_5",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.5")
    @Test
    public void t2_5_5(){
        ge.createProjectClick();
        window_accept();
        from8802.deleteYear();
        from8802.enterYear2020();
        String comm = stringBuilder();
        from8802.enterComment(comm);
        choosePool();
        ge.saveButton();
        goTo88_05();

        from8802.findByComment(comm);
        from8802.findByStatus("Черновик");
        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(comm);
    }

    @Description("Названия тест кейса:  Сценарий  \"Создать проект и перевести его в статус 'приказ утвержден' \"")
    @Link(name = "2_5_19",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.19")
    @Test
    public void t2_5_19(){
        ge.createProjectClick();
        window_accept();
        from8802.deleteYear();
        from8802.enterYear2020();
        String comm = stringBuilder();
        from8802.enterComment(comm);
        choosePool();
        ge.saveButton();
        String num = numBuilder();
        from8802.enterNumOrder(num);
        from8802.enterDateOfOrder();
        ge.saveButton();
        goTo88_05();
        from8802.findByComment(comm);
        assertYear2020();
        assertPoolDV();
        from8802.assertTableStatus("Черновик");
        from8802.assertTableOrderNum(num);
        ge.actionClick();
        showEditProject();
        from8802.statusOrderClick();
        from8802.statusOrderApprovedClick();
        ge.saveButton();
        goTo88_05();
        from8802.findByComment(comm);
        from8802.assertTableStatus("Приказ утвержден");
        from8802.assertTableOrderNum(num);
        assertPoolDV();
        from8802.assertDateOfOrder();
        ge.actionClick();
        showEditProject();
        Assertions.assertEquals(6,from8802.statusApprovedAll());
        //проверка
        assertApproveField();

    }

    @Description("Сценарий  Создать проект и перевести его в статус 'Согласование'  ")
    @Link(name = "2_5_20",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.20")
    @Test
    public void t2_5_20(){
        ge.createProjectClick();
        window_accept();
        from8802.deleteYear();
        from8802.enterYear2020();
        String comm = stringBuilder();
        from8802.enterComment(comm);
        choosePool();
        ge.saveButton();
        String  num = numBuilder();
        from8802.enterNumOrder(num);
        from8802.enterDateOfOrder();
        Assertions.assertEquals("Распределение общих допустимых уловах применительно к видам квот",getText(el.headAfterCreateOrderEl));
        from8802.statusOrderClick();
        from8802.statusOrderAgreeClick();
        ge.saveButton();
        Assertions.assertEquals(3, from8802.statusApprovedAll());
        goTo88_05();

        from8802.findByComment(comm);
        from8802.assertDateOfOrder();
        from8802.assertTableStatus("Согласование");
        assertPoolDV();
        assertYear2020();
        ge.actionClick();
        showEditProject();
        Assertions.assertEquals(3, from8802.statusApprovedAll());

        from8802.statusOrderClick();
        from8802.statusOrderDraftClick();
        ge.saveButton();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(comm);
    }

    @Description("Сценарий  Редактирование проекта в статусе 'черновик'  ")
    @Link(name = "2_5_21",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.21")
    @Test
    public void t2_5_21(){
        from8802.findByComment(t2_5_1());
        ge.actionClick();
        showEditProject();
        Assertions.assertEquals(0, from8802.statusApprovedAll());
        String comm = stringBuilder();
        String num = numBuilder();

        from8802.deleteYear();
        from8802.enterYear2020();
        from8802.delComment();
        from8802.enterComment(comm);
        from8802.delNumOrder();
        from8802.enterNumOrder(num);
        //Если браузер Eng Дата типа ммДДгггг
        from8802.enterDateOfOrder();
        changePoolFlag();
        DVclick();
        ge.saveButton();
        goTo88_05();
        from8802.findByComment(comm);
        from8802.assertTableComm(comm);
        from8802.assertTableOrderNum(num);

        from8802.assertDateOfOrder();
        assertYear2020();
        assertPoolDV();
        from8802.assertTableStatus("Черновик");
        //from8802.assertDateOfOrder();
        from8802.assertDateOfOrder();
        Assertions.assertEquals(dateBuilderAssert(),getText("//span[contains(text(),'"+dateBuilderAssert()+"')]"));
        Assertions.assertEquals(2,driver.findElements(By.xpath("//span[contains(text(),'"+dateBuilderAssert()+"')]")).size());

        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(comm);
    }

    @Description("Названия тест кейса: Сценарий  \"Созданиие копии приказа\"  ")
    @Link(name = "2_5_22",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.22")
    @Test
    public void t2_5_22(){
        from8802.findByComment(t2_5_1());
        ge.actionClick();
        from8802.copyProject();
        window_accept();
        from8802.deleteYear();
        from8802.enterYear2020();
        from8802.delComment();
        String comm = stringBuilder();
        from8802.enterComment(comm);
        String num = numBuilder();
        from8802.delNumOrder();
        from8802.enterNumOrder(num);
        ge.saveButton();

        goTo88_05();
        from8802.findByComment(comm);
        from8802.assertDateOfOrder();
        from8802.assertTableOrderNum(num);
        from8802.assertTableComm(comm);
        assertPoolDV();

        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(comm);
    }

    @Description("\tНазвания тест кейса: Сценарий  \"Создать корректировку на утвержденный приказ\"")
    @Link(name = "2_5_23",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.23")
    @Test
    public void t2_5_23(){
        ge.createProjectClick();
        window_accept();
        String com = stringBuilder();
        from8802.enterComment(com);
        from8802.deleteYear();
        from8802.enterYear2020();
        choosePool();
        ge.saveButton();
        String num = numBuilder();
        from8802.enterNumOrder(num);
        from8802.enterDateOfOrder();
        from8802.statusOrderClick();
        from8802.statusOrderApprovedClick();
        ge.saveButton();
        goTo88_05();
        from8802.findByComment(com);
        ge.actionClick();
        from8802.createCorrect();
        window_accept();
        from8802.delComment();
        String com2 = stringBuilder();
        from8802.enterComment(com2);
        String num2 = numBuilder();
        from8802.enterNumOrder(num2);
        from8802.enterDateOfOrder();
        ge.saveButton();
        goTo88_05();
        from8802.clearCommTable();
        from8802.findByComment(com2);
        //Assert
        assertYear2020();
        assertPoolDV();
        from8802.assertTableStatus("Черновик");
        from8802.assertTableOrderNum(num);
        from8802.assertDateOfOrder();
        from8802.assertTableOrderNum(num2);
        from8802.assertDateOfOrder();
        from8802.assertTableComm(com2);

        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();

        from8802.findByCommentDelete(com2);
    }

    @Description("Названия тест кейса: Сценарий  \"Удаление проекта приказа (Отправить в архив)\"")
    @Link(name = "2_5_24",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.24")
    @Test
    public void t2_5_24(){
        String comm = t2_5_1();
        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(comm);
    }

    @Description("Названия тест кейса: Сценарий  \"Перевод приказа из статуса \"Согласоване\" в статус \"Черновик\"\"")
    @Link(name = "2_5_27",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.27")
    @Test
    public void t2_5_27(){
        ge.createProjectClick();
        window_accept();
        String com = stringBuilder();
        from8802.enterComment(com);
        choosePool();
        ge.saveButton();
        String num = numBuilder();
        from8802.enterNumOrder(num);
        from8802.enterDateOfOrder();
        from8802.statusOrderClick();
        from8802.statusOrderAgreeClick();
        ge.saveButton();
        try{
            from8802.menuDelete();
            Assertions.assertEquals("Кнопка меню отображается","кнопка");
        }catch (Exception e){}
        goTo88_05();
        from8802.findByComment(com);
        from8802.assertTableStatus("Согласование");
        from8802.assertDateOfOrder();
        from8802.assertTableOrderNum(num);
        ge.actionClick();
        showEditProject();
        Assertions.assertEquals(3, from8802.statusApprovedAll());
        try{
            from8802.menuDelete();
            Assertions.assertEquals("Кнопка меню отображается","кнопка");
        }catch (Exception e){}
        from8802.statusOrderClick();
        from8802.statusOrderDraftClick();
        ge.saveButton();
        Assertions.assertEquals(0, from8802.statusApprovedAll());
        goTo88_05();
        from8802.findByComment(com);
        from8802.findByStatus("Черновик");
        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(com);
    }


    @Description("\tНазвания тест кейса: Сценарий  \"Добавить пары в приказ\"")
    @Link(name = "2_5_25",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.25")
    @Tag("Regression")
    @Test
    public void t2_5_25(){
        from8802.goTo88_02();
        ge.createProjectClick();
        window_accept();
        String com8802 = stringBuilder();
        from8802.enterComment(com8802);
        from8802.deleteYear();
        from8802.enterYear2020();
        ge.saveButton();
        String num8802 = numBuilder();
        from8802.enterNumOrder(num8802);
        from8802.enterDateOfOrder();
        ge.saveButton();
        from8802.menuAddOdu();
        from8802.addVbrCase();
        ge.saveButton();
        driver.navigate().back();
        from8802.assertVbrCase();
        from8802.statusOrderClick();
        from8802.statusOrderAgreeClick();
        ge.saveButton();

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
        from8802.assertTableOrderNum(num8802);
        from8802.assertTableStatus("Согласование");
        assertYear2020();
        assertKindOfOrder();
        from8802.assertDateOfOrderTableEng();
        goToDataClick();
        driver.navigate().refresh();
        driver.navigate().refresh();
        sleep(2000);
        from8802.assertVbrCase();
        from8802.addVbrCheckboxAll();
        ge.saveButton();
        driver.navigate().back();
        sleep(500);
        driver.navigate().back();
        from8802.assertVbrCase();
        from8802.assertTableComm(com8802);
        from8802.assertNumAndDateOrder(num8802);
        //переход в форму 88.02 для удаления приказа
        from8802.goTo88_02();
        from8802.findByComment(com8802);
        from8802.odu();
        from8802.statusOrderClick();
        from8802.statusOrderDraftClick();
        ge.saveButton();
        from8802.menuDelete();
        window_accept();
        from8802.findByCommentDelete(com8802);
        //переход в 88.05 для удаления приказа
        goTo88_05();
        from8802.findByComment(com8805);
        ge.actionClick();
        showEditProject();
        from8802.menuDelete();
        window_accept();
        driver.navigate().refresh();
        from8802.findByCommentDelete(com8805);
    }


    //Научиться получать и парсить json
    /*@Description("Названия тест кейса: Сценарий  \"Добавление пар и просмотр ЭФ \"Изменение/просмотр ОДУ по видм квот\"\"\t")
    @Link(name = "2_5_31",url = "https://atlassian.cfmc.ru/display/CFMC/2.5.31")
    @Test*/
    public void t2_5_31(){
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
        String num8805 = numBuilder();
        from8802.enterNumOrder(num8805);
        from8802.enterDateOfOrder();
        ge.saveButton();
        addStrClick();
        from8802.findByComment(com8802);
        goToDataClick();
        from8802.addVbrCheckboxAll();
        ge.saveButton();
        driver.navigate().back();
        sleep(500);
        driver.navigate().back();
        driver.navigate().refresh();
        String district = getText("(//td[contains(text(),'1')])[1]/../td[2]");
        String vbr = getText("(//td[contains(text(),'1')])[1]/../td[3]");
        String odu = getText("(//td[contains(text(),'1')])[1]/../td[6]");
        ge.actionClick();
        showEditDataStr();


        //Нужно получить json
        Assertions.assertEquals("2020",getText(from8802.yearField));
        Assertions.assertEquals(com8805,getText(from8802.commField));
        Assertions.assertEquals(num8805,getText(from8802.numOrderField));
        Assertions.assertEquals(dateBuilderAssert(),getText(from8802.dateField));
        Assertions.assertEquals("Черновик",getText(from8802.statusField));
        Assertions.assertEquals("Дальневосточный рыбохозяйственный бассейн",getText(el.poolField));

        //Детализация по строке
        Assertions.assertEquals("",getText(el.districtField));
        Assertions.assertEquals("",getText(el.VBRField));
        Assertions.assertEquals("",getText(el.numOrderField));
        Assertions.assertEquals(dateBuilderAssert(),getText(el.dateOrderField));
        Assertions.assertEquals("",getText(el.ODUField));


        String com = "assf kkjd (226)";
        System.out.println(com.split("[(](\\d)")[0]);
    }



}
