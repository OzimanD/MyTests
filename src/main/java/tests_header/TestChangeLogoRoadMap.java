package tests_header;

import XpathSelectors.Methods;
import XpathSelectors.XpathMainPage;
import XpathSelectors.XpathRoadMap;
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

public class TestChangeLogoRoadMap {
    //C257299
    //Нажатие на "иконку вызова карты сайта" -> плавно меняется с точек на крестик + блок с картой сайта плавно выезжает вниз
    static Methods methods = new Methods();

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

        XpathMainPage xpathMainPage = new XpathMainPage();
        Connect();
        WebElement element = driver.findElement(By.xpath(xpathMainPage.HeadetRoadMap));
//        System.out.println(element.getAttribute("class"));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(xpathMainPage.HeadetRoadMap));
//        System.out.println(element1.getAttribute("class"));
        if(element1.getAttribute("class").equals("icon-sitemap active")) {
            System.out.println("Pass Test C257299 ");
        }else{
            System.out.println("Fail Test C257299");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}