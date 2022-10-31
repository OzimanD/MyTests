package tests_phuter;

import XpathSelectors.XpathFutter;
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

public class ClickLinksAppOneSpace {
//    //	C236419	Каждая категория -> список статей-гиперссылок
//    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
//
//    private static WebDriver driver;
//
//    @BeforeMethod(alwaysRun = true)
//    public void setUpDriver() {
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
//    }
//
//    public static void Connect(){
//        try {
//            driver.manage().window().maximize();
//            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
//            driver.get("http://stg.bitbon.space/ru");
//        } catch (Exception e) {
//        }
//    }
//    @Test(description = "Tests of Futter")
//    public static void MethodClickLogoT620561() throws InterruptedException {
//        XpathFutter xpathFutter = new XpathFutter();
//        Connect();
//        Thread.sleep(500);
//        ((JavascriptExecutor)driver).executeScript("scroll(0,5000)");
//        Thread.sleep(500);
//        //ios
//        WebElement element1 = driver.findElement(By.xpath(xpathFutter.FutterAppOnespaceIOS));
//        element1.click();
//        Thread.sleep(1000);
//        String Link1 = driver.getCurrentUrl();
//        driver.close();
//        //android
//        WebElement element2 = driver.findElement(By.xpath(xpathFutter.FutterAppOneSpaceAndroid));
//        element2.click();
//        Thread.sleep(1000);
//        String Link2 = driver.getCurrentUrl();
//        driver.close();
//        //web
//        WebElement element3 = driver.findElement(By.xpath(xpathFutter.FutterAppOneSpaceWeb));
//        element3.click();
//        Thread.sleep(1000);
//        String Link3 = driver.getCurrentUrl();
//        driver.close();
//
//        if(Link1.equals(xpathFutter.s12) & Link2.equals(xpathFutter.s13) & Link3.equals(xpathFutter.s14)) {
//            System.out.println("Pass Test C236420 ");
//        }else{
//            System.out.println("Fail Test C236420");
//        }
//
//    }
//
//    @AfterMethod(alwaysRun = true)
//    public void closeBrowser() {
//        driver.quit();
//    }
}
