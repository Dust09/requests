package ru.cfmc.dev.quotas;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.apache.commons.lang3.SystemUtils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.cfmc.dev.quotas.config.ConfProperties;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.OutputType.BYTES;

public class TestBaseForAll extends MethodsSelenium {


    @BeforeAll
    public static void setPathChromeDriver(){
        /*if(SystemUtils.IS_OS_LINUX) System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("dev.chromedriver.lin"));
        if(SystemUtils.IS_OS_WINDOWS) System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("dev.chromedriver.win"));*/

    }

    @AfterAll
    public static void afterClass(){
        System.out.println("all");

    }

    public void  browser() {

        //Для Selenoid

       /* final  DesiredCapabilities browser = DesiredCapabilities.chrome();
        browser.setBrowserName("chrome");
        browser.setVersion("89.0");
        browser.setCapability("enableVNC",true);
        browser.setCapability("screenResolution","1920x1080x24");*/
        //---------
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("enableVNC",true);
        chromeOptions.setCapability("env", new ArrayList<String>(){
            {
                add("LANG=ru_RU.UTF-8");
                add("LANGUAGE=ru:RU");
                add("LC_ALL=ru_RU.UTF-8");
            }
        });

        Configuration.browserCapabilities = new DesiredCapabilities(chromeOptions);
//awd

        //http://localhost:4444/wd/hub
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.206.14:4444/wd/hub"),Configuration.browserCapabilities);

        }catch (Exception e){
            e.printStackTrace();
        }
        //--------------
        

        //driver.manage().window().setSize(new Dimension(1920,1080));

        //

       // driver = new ChromeDriver();

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        login();

    }


    @Description("login")
    public void login() {
        driver.get(ConfProperties.getProperty("dev.loginpage"));
        driver.findElement(By.id("id3")).sendKeys(ConfProperties.getProperty("dev.login"));
        driver.findElement(By.id("id4")).sendKeys(ConfProperties.getProperty("dev.password"));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void start(){
        step(" перейти на сайт http://quotas-dev.cfmc.ru/fishery/quotatest/applications/applications-nav");
        driver.get(ConfProperties.getProperty("dev.loginpage.cabinet"));
    }


    public void tearDown(){
        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));
        driver.quit();
    }
    @AfterAll
    public static void bb(){

    }








}
