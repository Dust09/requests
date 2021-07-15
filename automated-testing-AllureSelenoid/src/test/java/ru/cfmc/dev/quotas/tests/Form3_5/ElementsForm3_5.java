package ru.cfmc.dev.quotas.tests.Form3_5;

import ru.cfmc.dev.quotas.MethodsSelenium;

import static io.qameta.allure.Allure.step;

public class ElementsForm3_5 extends MethodsSelenium {

    public String headPage = "//h1[contains(text(),'Заявление об определении вида рыболовства, осущест')]";

    String tabQutsMorsk = "//span[contains(text(),'Квоты добычи (вылова) водных биоресурсов в морских')]";
    public void setTabQutsMorsk(){
        step("Найти вкладку 'Квоты добычи (вылова) водных биоресурсов в морских водах ");
        find(tabQutsMorsk);
    }
    public void tabQutsMorskClick(){
        step("Кликнуть на вкладку 'Квоты добычи (вылова) водных биоресурсов в морских водах ");
        click(tabQutsMorsk);
    }

    String tabQuotsMeghdunarod = "//span[contains(text(),'Квоты добычи (вылова) водных биоресурсов в районах')]";
    public void setTabQuotsMeghdunarod(){
        step("Найти вкладку   Квоты добычи (вылова) водных биоресурсов в районах действия международных договоров ");
        find(tabQuotsMeghdunarod);
    }
    public void tabQuotsMeghdunarodClick(){
        step("Кликнуть на вкладку   Квоты добычи (вылова) водных биоресурсов в районах действия международных договоров ");
        click(tabQuotsMeghdunarod);
    }



}
