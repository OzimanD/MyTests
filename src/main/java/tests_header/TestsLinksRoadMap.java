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

public class TestsLinksRoadMap {
        //C236411
        //Нажатие на выбранный пункт меню -> открытие соответствующего раздела
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
        public static void MethodClickLogoT620561() throws InterruptedException {

            XpathRoadMap xpathRoadMap = new XpathRoadMap();
            Connect();
            WebElement element = driver.findElement(By.xpath(xpathRoadMap.RoadMapButton));
            element.click();
            WebElement element1 = driver.findElement(By.xpath(xpathRoadMap.RoadMap));
            Thread.sleep(500);
//            System.out.println(element1.getText());
            Thread.sleep(1500);
            String s = driver.getCurrentUrl();
            if(element1.getText().equals(xpathRoadMap.RoadMapLinks)) {
                System.out.println("Pass Test C236411 ");
            }else{
                System.out.println("Fail Test C236411");
            }
        }

        @AfterMethod(alwaysRun = true)
        public void closeBrowser() {
            driver.quit();
        }
    }

