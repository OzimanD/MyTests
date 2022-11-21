package com.simcord.ui.tests.XpathSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Methods {
    protected static WebDriver driver;

    @BeforeClass
    public static void Connect() {
        try {

            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            driver.get("http://stg.bitbon.space/ru");
        } catch (Exception e) {
        }
    }

    public static void StopLoadPaige() {
        try {
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Page not load");
        }
    }

    public static void waitUntil(String selector) {
        WebElement element = (new WebDriverWait(driver, java.time.Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
    }

    public static void Scroll0() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,0)");
        Thread.sleep(1000);
    }

    public static void Scroll500() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
        Thread.sleep(1000);
    }

    public static void Scroll1000() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
        Thread.sleep(1000);
    }

    public static void Scroll1500() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1500)");
        Thread.sleep(1000);
    }

    public static void Scroll2000() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
        Thread.sleep(1000);
    }

    public static void Scroll2500() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
        Thread.sleep(1000);
    }

    public static void Scroll3000() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,3000)");
        Thread.sleep(1000);
    }

    public static void Scroll3500() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,3500)");
        Thread.sleep(1000);
    }

    public static void Scroll4000() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
        Thread.sleep(1000);
    }

    public static void Scroll5000() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
        Thread.sleep(1000);
    }

    public static void Scroll5500() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,5500)");
        Thread.sleep(1000);
    }

    public static void WaitLoadPage() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void back() {
        driver.navigate().back();
    }

    public static void ClickIconMapSites() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMapButton));
        element.click();
        Thread.sleep(1000);
    }

    public static void CloseNewWindowBrowser() {
        driver.close();
    }

    public static void GoToNewTabBrowser() {
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
//        System.out.println(driver.getCurrentUrl());
    }


    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
