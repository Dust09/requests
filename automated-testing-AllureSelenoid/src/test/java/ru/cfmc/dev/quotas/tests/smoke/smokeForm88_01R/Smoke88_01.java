package ru.cfmc.dev.quotas.tests.smoke.smokeForm88_01R;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.cfmc.dev.quotas.TestBaseForAll;
import ru.cfmc.dev.quotas.config.ConfProperties;
import ru.cfmc.dev.quotas.tests.ElementsTable;
import ru.cfmc.dev.quotas.tests.GeneralElements;

import static io.qameta.allure.Allure.step;

public class Smoke88_01 extends TestBaseForAll {
    public GeneralElements ge = new GeneralElements();
    public ElementsTable elementsTable = new ElementsTable();
    @BeforeEach
    public void start(){
        browser();
        goTo88_01();
    }

    public void goTo88_01() {
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
        step("кликнуть иконку 88.01");
        click("//div[contains(text(),'Общие допустимые уловы водных биоресурсов во внутренних морских водах РФ, " +
                "на континентальном шельфе РФ, в исключительной экономической зоне РФ и Каспийском море ')]");
        Assertions.assertEquals("Общие допустимые уловы водных биоресурсов во внутренних морских водах РФ, на континентальном шельфе РФ, " +
                        "в исключительной экономической зоне РФ и Каспийском море",
                getText("//h1[contains(text(),'Общие допустимые уловы водных биоресурсов во внутренних морских водах РФ, на континентальном " +
                        "шельфе РФ, в исключительной экономической зоне РФ и Каспийском море' )]"));
        Assertions.assertEquals(ConfProperties.getProperty("dev.loginpage.Form88_01"),driver.getCurrentUrl());
    }

    @Test
    public void t88_01(){
        Assertions.assertEquals("Общие допустимые уловы водных биоресурсов во внутренних морских водах РФ, на континентальном шельфе РФ, " +
                        "в исключительной экономической зоне РФ и Каспийском море",
                getText("//h1[contains(text(),'Общие допустимые уловы водных биоресурсов во внутренних морских водах РФ, " +
                        "на континентальном шельфе РФ, в исключительной экономической зоне РФ и Каспийском море')]"));
        Assertions.assertEquals(13,driver.findElements(By.xpath("//th")).size());
        ge.assertMainElements();
        elementsTable.setNumElemTable();
        elementsTable.setVbrElemTable();
        //Доделать
    }

    @AfterEach
    public void teardown(){
        tearDown();
    }

}