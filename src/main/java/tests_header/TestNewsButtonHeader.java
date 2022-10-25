package tests_header;

import XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNewsButtonHeader {
    //C236411
    //Нажатие на выбранный пункт меню -> открытие соответствующего раздела
    private static WebDriver driver;

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
    public static void MethodClickLogoT620561() throws InterruptedException {

        XpathMainPage xpath = new XpathMainPage();
        WebElement element = driver.findElement(By.xpath(xpath.HeaderNews));
        element.click();
        String s1 = "http://stg.bitbon.space/ru/news";
        Thread.sleep(2000);
        String s = driver.getCurrentUrl();
        if(s.equals(s1)) {
            System.out.println("Pass Test C236411 ");
        }else{
            System.out.println("Fail Test C236411"+ s);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
