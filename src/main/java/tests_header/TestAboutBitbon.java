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

public class TestAboutBitbon {
    //C236411
    //Нажатие на выбранный пункт меню -> открытие соответствующего раздела
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

        WebElement element = driver.findElement(By.xpath(xpath.HeaderAboutBitbon));
        element.click();
        String s1 = "http://stg.bitbon.space/ru/bitbon-system";
        Thread.sleep(1500);
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