package tests_header;

import XpathSelectors.XpathMainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestsOfHeaderEnableAfterScrollT620562 {

    private static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    public static void Connect(){
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
            Connect();

            try {
                ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
                WebElement element = driver.findElement(By.xpath(xpath.HeaderLogo));
                element.click();
                String s1 = "http://stg.bitbon.space/ru";
                Thread.sleep(1500);
                String s = driver.getCurrentUrl();
                if(s.equals(s1)) {
                    System.out.println("Pass Test T620562");
                }else{
                    System.out.println("Fail test T620562");
                }
            }catch (Exception e){
            }

    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
