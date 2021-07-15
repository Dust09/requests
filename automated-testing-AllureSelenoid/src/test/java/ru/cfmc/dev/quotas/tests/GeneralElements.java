package ru.cfmc.dev.quotas.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.MethodsSelenium;
import ru.cfmc.dev.quotas.TestBaseForAll;

import static io.qameta.allure.Allure.step;

public class GeneralElements extends MethodsSelenium {

    MethodsSelenium methodsSelenium = new MethodsSelenium();

    //Во весь экран
    String fullscreen ="//i[contains(text(),'fullscreen')]";
    public void fullscreenElem(){
        step("Найти элемент \"[ ](Развернуть таблицу)\"");
        find(fullscreen);
    }
    //кликнуть на кнопку Во весь экран
    public void fullscreenClick(){
        step("Кликнуть на элемент \"[ ](Развернуть таблицу)\"");
        click(fullscreen);
        //Проверка
        try {
            click("(//a[contains(text(),'Квоты')])[1]");
            step("Таблица не раскрыта!!!");
            driver.get("https://cfmc.ru/");
            saveButton();
        }catch (Exception e){
            step("Таблица раскрыта");
        }
    }
    // Элемент Поиск
    String  searchElem = "//label[contains(text(),'Поиск')]";
    public void search_str(){
        step("Найти элемент 'Поиск'");
        find(searchElem);
    }
    // Значок Лупы
    String loopElem = "//i[contains(text(),'search')]";
    public void loopElem(){
        step("Найти элемент' Значок <Лупа>'");
        find(loopElem);
    }

    //Фильтры
    String filterElem = "//summary[contains(text(),'Фильтры')]";
    public void setFilterElem(){
        step("Найти элемент Фильтры");
        find(filterElem);
    }
    public void filterElemClick(){
        step("Кликнуть на Фильтры");
        click(filterElem);
    }
    String clearButtonElemFilter = "//span[contains(text(),'Очистить')]";
    public void setClearButtonFilter(){
        step("Найти кнопку отчистить");
        find(clearButtonElemFilter);
    }


    //кнопка Опции
    public String optionButton = "//span[contains(text(),'Опции')]";
    public void setOptionButton(){
        step("Найти кнопку опции");
        find(optionButton);
    }
    //Открыть опции
    public void options_click(){
        step("Кликнуть элемент 'Опции'");
        try{
            click("//span[contains(text(),'Опции')]");
        }catch (Exception e){
            click("(//span[contains(text(),'Опции')])[2]");
        }
    }
    public void showSearchTableChbx(){
        step("Кликнуть на чекбокс Отображать поиск по колонкам");
        click("//label[contains(text(),'Отображать поиск по колонкам в таблицах')]");
    }
    //Закрыть опции
    public void optionClose(){
        click("(//i[contains(@class,'v-icon notranslate material-icons theme--dark')])[2]");
    }

    //Кнопка Доли по паре ВБР-Район
    String partOfPairVBRButtonEl = "//span[contains(text(),'Доли по паре ВБР-Район')]";
    public void setPartOfPairVBRButtonEl(){
        step("Найти кнопку Доли по паре ВБР-Район");
        find(partOfPairVBRButtonEl);
    }
    public void PartOfPairVBRButtonElClick(){
        step("Кликнуть кнопку Доли по паре ВБР-Район");
        click(partOfPairVBRButtonEl);
    }
    public void enterDistrict() {
        step("В поле Регион ввести 275");
        sendKeys("(//label[contains(text(),'Регион')]/following-sibling::input)[1]","275");
        step("Кликнуть Восточно-Сахалинская подзона");
        click("//div[contains(text(),'Восточно-Сахалинская подзона')]");
    }

    public void enterVBR() {
        step("В поле ВБР ввести 400");
        sendKeys("(//label[contains(text(),'ВБР')]/following-sibling::input)[1]","400");
        step("Кликнуть на Минтай");
        click("//div[contains(text(),'Минтай')]");
    }



    // Надпись Строк на странице снизу страницы
    String strOnPageElem = "//span[contains(text(),'Строк на странице')]";
    public void strOnPage(){
        step("Найти элемент ' Строк на странице ' под таблицей\t");
        find(strOnPageElem);
    }
    //Элемент  15 '(15-кол-во отраженных записей по умолчанию)
    String elem15 = "//div[contains(text(),'15')]";
    public void elem15(){
        step("Найти элемент ' 15 '(15-кол-во отраженных записей по умолчанию) под таблицей справа от элемента 'Строк на странице'\t");
        find(elem15);
    }
    // Элемент Флаг
    String flagElem = "//i[contains(text(),'arrow_drop_down')]";
    public void flag(){
        step("Найти элемент \"▼\" справа от элемента \"15\"\t");
        //find("//i[contains(@class,'v-icon notranslate material-icons theme--light primary--text')]");
        find(flagElem);
    }

    String o1To15Elem = "//span[contains(text(),'1 - 15 из ')]";
    public void o1To15(){
        try {
            step("Найти элемент \"1-15 из ххх\" справа от элемента \"▼\"(ххх - общее кол-во записей)\t");
            find(o1To15Elem);
        }catch (Exception e){
            find("//span[contains(text(),'1 - ')]");
        }

    }
    //Кнопка Перейти на последнюю страницу
    String beforeAllBtnElem = "(//button[contains(@class,'mx-1 v-btn v-btn--disabled v-btn--flat v-btn--icon v-btn--round theme--light v-size--default')])[1]";
    public void beforeAllBtn(){
        step("Найти элемент \"|<\" справа от элемента \"1-15 из ххх\"\t");
        find(beforeAllBtnElem);
    }
    //Кнопка перейти на 1 страницу назад
    String beforeBtnElem = "(//button[contains(@class,'mx-1 v-btn v-btn--disabled v-btn--flat v-btn--icon v-btn--round theme--light v-size--default')])[2]";
    public void beforeBtn(){
        step("Найти элемент \"<\" справа от элемента \"|<\"\t");
        find(beforeBtnElem);
    }
    //Элемент следующая страница
    String nextPageElem = "//i[contains(text(),'chevron_right')]";
    public void nextPage(){
        step("Найти элемент \">\" справа от элемента \"<\"\t");
        find(nextPageElem);
    }
    //Элемент последняя страница
    public String lastPageElem = "//i[contains(text(),'last_page')]";
    public void lastPage(){
        step("Найти элемент \">|\" справа от элемента \">\"\t");
        find(lastPageElem);
    }

    //Кнопка сохранить
    public  String save = "//span[contains(text(),'Сохранить')]";
    public void saveButton(){
        step("Кликнуть на кнопку сохранить");
        try{
            try{
                sleep(500);
                //для примера
                //click("//span[contains(text(),'Сохранить')]");
                click(save);
                sleep(200);
            }catch (Exception e){
                driver.navigate().refresh();
                sleep(100);
                //click("//span[contains(text(),'Сохранить')]");
                //для примера
                click(save);
            }
        } catch (Exception e){
            click("(//span[contains(text(),'Сохранить')])[1]");
        }
        //driver.findElement(By.xpath(save)).click();
    }

    //Кнопка Отменить
    public String cancel = "//span[contains(text(),'Отменить')]";
    public void setCancel(){
        click(cancel);
    }
    public void setCancelElem(){
        step("Найти кнопку Отменить");
        find(cancel);
    }
    //Кнопка Сохранить
    public void setSaveElem(){
        step("Найти кнопку сохранить");
        find(save);
    }


    //Кликает на чекбоксы в опциях
    public void optionsButtons(int iter ,int position  ) {
        //position - С какого элемента начинается счет чекбоксов
        //iter  - Сколько всего чекбоксов

        options_click();
        //проверка сколько всего чекбоксов
        Assertions.assertEquals(iter,driver.findElements(By.xpath("//div[contains(@class,' v-input--checkbox main--text')]")).size());
        click("//span[contains(text(),'Выгрузить в excel')]");
        optionClose();
        for (int i = 1;i<iter;i++){
            int n = position;
            driver.findElement(By.xpath("//span[contains(text(),'Опции')]")).click();
            //options_click();
            //sleep(400);
            click("(//label[contains(text(),'')])["+(n+i)+"]");
            //click("(//div[contains(@class,' v-input--checkbox main--text')])["+(i)+"]");
            optionClose();
            try {
                //sendKeys("(//input[contains(@placeholder,'Поиск по колонке...')])[1]","111");
                driver.findElement(By.xpath("//th["+i+"]")).click();
                step("Эелемент под порядковым номером "+i+" в таблице НЕ скрыт");
                driver.get("http://cfmc.ru/");
                Assertions.assertEquals(1,2);
            }catch (Exception e){
                step("Эелемент "+i+" скрыт");
            }
        }

        //Assertions.assertEquals(1,driver.findElements(By.xpath("")).size());

    }
    //Действие
    public String action = "//i[contains(text(),'list')]";
    public void setAction(){
        step("Найти элемент Действие");
        find(action);
    }

    //определенная кнопка Действия
    public void actionClickIter(int iter){
        //iter - порядковый номер кнопки в таблице
        click("(//i[contains(text(),'list')])"+"["+iter+"]");
    }

    public void actionClick(){
        //iter - порядковый номер кнопки в таблице
        step("Кликнуть на действие");
        click("(//i[contains(text(),'list')])"+"[1]");
    }
    String createProject = "//span[contains(text(),'Создать проект приказа')]";
    public void setCreateProject(){
        step("Найти кнопку Создать проект приказа");
        find(createProject);
    }
    public void createProjectClick(){
        step("Кликнуть на кнопку Создать проект приказа");
        click(createProject);
    }

    String finish = "//span[contains(text(),'Завершить')]";
    public void setFinish(){
        step("Найти кнопку Завершить");
        find(finish);
    }
    public void finishClick(){
        step("Кликнуть на кнопку Завершить");
        click(finish);
    }

    String homeinc = "//i[contains(text(),'home')]";
    public void sethomeinc(){
        step("Найти значкок Домик");
        find(homeinc);
    }

    String pointer = "//i[contains(text(),'keyboard_arrow_right')]";
    public void setPointer(){
        step("Найти элемент > справа от элемента  Дом(home)");
        find(pointer);
    }
    public void assertMainElements(){
        sethomeinc();
        setPointer();
        search_str();
        loopElem();
        fullscreenElem();
        setOptionButton();
        scroolDown();

        strOnPage();
        elem15();
        o1To15();
        flag();
        nextPage();
        lastPage();
        beforeBtn();
        beforeAllBtn();
        setFinish();

        scroolUp();
    }



}
