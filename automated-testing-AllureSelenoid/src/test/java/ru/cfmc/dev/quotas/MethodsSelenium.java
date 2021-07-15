package ru.cfmc.dev.quotas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static io.qameta.allure.Allure.step;

public class MethodsSelenium {
    public static WebDriver driver;


    public void  click(String xpath){
        (new WebDriverWait(driver, 6))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public String getText(String xpath){
        //добавить wait
        (new WebDriverWait(driver, 6))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        String a = driver.findElement(By.xpath(xpath)).getText();
        return a;
    }

    public void sendKeys(String xpath, String keys){
        (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).sendKeys(keys);
    }
    public void clear(String xpath){
        driver.findElement(By.xpath(xpath)).clear();
    }

    public static void sleep(int sec){
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void window_accept(){
        sleep(300);
        step("Нажать Ок");
        driver.switchTo().alert().accept();
    }

    public void moveTO(String xpath){
        WebElement el = driver.findElement(By.xpath(xpath));
       /* Actions actions = new Actions(driver);
        actions.moveToElement(element).click(element);
        actions.perform();*/

        //((JavascriptExecutor) driver).executeScript("document.getElementByXpath('"+xpath+"').click();");


        Actions builder = new Actions(driver);
        builder.moveToElement( el ).click( el );
        builder.perform();
    }

    public void window_dismiss(){
        sleep(300);
        step("Нажать Отмена");
        driver.switchTo().alert().dismiss();
    }


    public String stringBuilder() {
        char[] chars = "abcdefghijklmnABCDEFGHIKLMN".toCharArray();
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        System.out.println(output);
        return "AT"+output;

    }
    public String numBuilder() {
        char[] chars = "123456789".toCharArray();
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        System.out.println(output);
        return "AT"+output;
    }

    public String snoskiBuilder() {
        char[] chars = "123456789".toCharArray();
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        System.out.println(output);
        return output;
    }

    public String dateBuilder(){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("ddMMyyyy");
        return dateFormat.format(currentDate);
    }

    public String dateBuilderENG(){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(currentDate);
    }

    public String dateBuilderAssert(){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(currentDate);
    }

    public String getAttribute(String xpath){
        String a = driver.findElement(By.xpath(xpath)).getAttribute("innerText");
        return a;
    }
    public static void find(String xpath){
        (new WebDriverWait(driver, 6))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath));
    }

    public void scroolDown(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scroolUp(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0, -250);");
        js.executeScript("scroll(0, -250);");
        js.executeScript("scroll(0, -250);");
        js.executeScript("scroll(0, -250);");
    }
}
