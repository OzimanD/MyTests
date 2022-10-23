package tests_header;

import XpathSelectors.XpathMainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickLogoT620561 {
    private static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @Test(description = "Tests of Header")
    public static void MethodClickLogoT620561() throws InterruptedException {

        XpathMainPage xpath = new XpathMainPage();
        driver.get("http://stg.bitbon.space/ru");
        driver.manage().window().setSize(new Dimension(1920, 1080));

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
