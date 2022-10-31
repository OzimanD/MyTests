package tests_phuter;

import XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DesignFuter {
    //C257311	Состоит из трех блоков: Верхний футер, футер сайта, нижний футер сайта. Блоки разделены белой сплошной линией
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
    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        XpathMainPage xpath = new XpathMainPage();
        Connect();
        Thread.sleep(500);
        ((JavascriptExecutor)driver).executeScript("scroll(0,5000)");
        Thread.sleep(500);

        WebElement element1 = driver.findElement(By.xpath(xpath.Futter1));
//        System.out.println(element1.getText());
        WebElement element2 = driver.findElement(By.xpath(xpath.Futter2));
//        System.out.println(element2.getText());
        WebElement element3 = driver.findElement(By.xpath(xpath.Futter3));
//        System.out.println(element3.getText());
        WebElement element4 = driver.findElement(By.xpath(xpath.Futter4));
//        System.out.println(element4.getText());
        Thread.sleep(500);
        if(xpath.Futter1Text.equals(element1.getText()) & xpath.Futter2Text.equals(element2.getText()) &
                xpath.Futter3Text.equals(element3.getText()) & xpath.Futter4Text.equals(element4.getText()) ) {
            System.out.println("Pass Test C257311 ");
        }else{
            System.out.println("Fail Test C257311");
        }
//        if(xpath.Futter2Text.equals(element1.getText())) {
//            System.out.println("Pass Test C257311 ");
//        }else{
//            System.out.println("Fail Test C257311");
//        }
//
//        if(xpath.Futter3Text.equals(element2.getText())) {
//            System.out.println("Pass Test C257311 ");
//        }else{
//            System.out.println("Fail Test C257311");
//        }
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}