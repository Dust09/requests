package ru.cfmc.dev.quotas.tests.smoke.smokeForm8803;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.TakesScreenshot;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.tests.Form8802_8803_8804.TestBaseFor8802_8803_8804;
import ru.cfmc.dev.quotas.tests.smoke.smokeForm8802.PageObject88_02;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class PageObject88_03 extends TestBaseForAll {
    TestBaseFor8802_8803_8804 tb = new TestBaseFor8802_8803_8804();
    PageObject88_02 to = new PageObject88_02();

    @BeforeEach
    public void setUp(){
        browser();
        //перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav
        //driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div[2]/div[2]/div/div/a[2]/div[2]")).click();
    }
    public void goToForm88_02(){
        tb.BgoTo88_02();
    }
    public void findHeadSnoski(){
        step("Найти элемент Таблица сносок");
        find("//h1[contains(text(),'Таблица сносок')]");
    }

    public void addStr(){
        step("Найти элемент Добавить строку");
        find("//span[contains(text(),'Добавить строку')]");
    }

    public void numSnoski(){
        step("Найти элемент Номер сноски");
        find("(//th[contains(text(),'Номер сноски')])[1]");
    }

    public void txtSnoski(){
        step("Найти элемент Текст сноски");
        find("(//th[contains(text(),'Текст сноски')])");
    }
    public void oneToZero(){
        find("//span[contains(text(),'1 - 0 из 0')]");
    }



    public String headOduElem = "//h1[contains(text(),'Проект ОДУ - Ввод и редактирование общих допустимы')]";
    public void headOduElem(){
        step("Найти элемент Проект ОДУ - Ввод и редактирование общих допустимы");
        find(headOduElem);
    }

    public String yearOduElem ="//label[contains(text(),'Год ОДУ')]";
    public void setYearOduElem(){
        step("Найти элемент Год ОДУ");
        find(yearOduElem);
    }
    public String commElem ="//label[contains(text(),'комментарий')]";
    public void setCommElem(){
        step("Найти элемент комментарий");
        find(commElem);
    }
    public String numOrderElem ="//label[contains(text(),'номер приказа')]";
    public void setNumOrderElemOduElem(){
        step("Найти элемент номер приказа");
        find(numOrderElem);
    }
    public String dataOrderElem ="//label[contains(text(),'дата приказа')]";
    public void setDataOrderElem(){
        step("Найти элемент дата приказа");
        find(dataOrderElem);
    }
    public String statusElem = "//label[contains(text(),'Статус проекта')]";
    public void setStatusElem(){
        step("Найти элемент Статус проекта ");
        find(statusElem);
    }

    public String menuElem = "//span[contains(text(),'Меню')]";
    public void setMenuElem(){
        step("Найти элемент Меню");
        find(menuElem);
    }
    //-------------------------------------------------------------------Table
    public String fishPoolTableElem = "//th[contains(text(),'Рыбохозяйственный бассейн')]";
    public void setFishPoolTableElem(){
        step("Найти элемент Рыбохозяйственный бассейн в таблице");
        find(fishPoolTableElem);
    }
    public String districtTableElem = "//th[contains(text(),'Район добычи (вылова)')]";
    public void setDistrictTableElem(){
        step("Найти элемент Район добычи (вылова) в таблице ");
        find(districtTableElem);
    }
    public String vbrTableElem = "//th[contains(text(),'ВБР')]";
    public void setVbrTableElem(){
        step("Найти элемент ВБР в таблице");
        find(vbrTableElem);
    }
    public String unitTableElem = "//th[contains(text(),'Ед. изм.')]";
    public void setUnitTableElem(){
        step("Найти элемент Ед.изм. в таблице");
        find(unitTableElem);
    }
    public String odu2021TableElem = "//th[contains(text(),'ОДУ на 2021 год')]";
    public void setOdu2021TableElem(){
        step("Найти элемент ОДУ на 2021 год");
        find(odu2021TableElem);
    }
    public String odu2022TableElem = "//th[contains(text(),'ОДУ на 2022 год')]";
    public void setOdu2022TableElem(){
        step("Найти элемент ОДУ на 2022 год в таблице");
        find(odu2022TableElem);
    }
    public String interestTableElem = "//th[contains(text(),' Δ % ')]";
    public void setInterestTableElem(){
        step("Найти элемент Δ % в таблице");
        find(interestTableElem);
    }
    public String snoskiTableElem = "//th[contains(text(),' Сноски')]";
    public void setSnoskiTableElem(){
        step("Найти элемент Сноски в таблице");
        find(snoskiTableElem);
    }
    public String numOrderTableElem = "//th[contains(text(),' № таблицы по приказу ')]";
    public void setNumOrderTableElem(){
        step("Найти элемент № таблицы по приказу");
        find(numOrderTableElem);
    }
    public String actionTableElem = "//th[contains(text(),'Действие')]";
    public void setActionTableElem(){
        step("Найти элемент Действие");
        find(actionTableElem);
    }
    @AfterEach
    public void tearDown(){
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }
}
