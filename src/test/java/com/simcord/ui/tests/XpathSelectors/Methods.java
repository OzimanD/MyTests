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

import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class Methods {
    protected static WebDriver driver;

    @BeforeClass
    public static void Connect() {
        try {
            ChromeOptions options = new ChromeOptions();
            if (Objects.isNull(driver)) {
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            }
            driver.get("http://stg.bitbon.space/ru");
        } catch (Exception e) {
        }
    }

    public static void waitUntil(String selector) {
        new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
    }


    // TODO: Не особо уловил, в чём был смысл городить одинаковые методы, если можно было сделать так
    public static void scroll(int x, int y) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript(String.format("scroll(%d,%d)", x, y));
        Thread.sleep(1000);
    }

    public static void scroll(int y) throws InterruptedException {
        scroll(0, y);
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

    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
