package tests_header;

import XpathSelectors.XpathMainPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ClickLogoT620561 {
    private static WebDriver driver;
    protected static Logger log = LogManager.getLogger();

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
            driver.get("http://stg.bitbon.space/ru");
        } catch (Exception e) {
        }
    }

    @Test(description = "Tests of Header")
    public static void Check() throws InterruptedException {

        XpathMainPage xpath = new XpathMainPage();

        try {
            ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
            WebElement element = driver.findElement(By.xpath(xpath.HeaderMain));
            element.click();
            System.out.println("Pass test T620561");

        } catch (Exception e) {
            System.out.println("Fail test T620561");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
