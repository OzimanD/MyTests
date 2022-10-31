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

public class ClickLincksSystemBitBon {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области

    private static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    public static void Connect(){
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get("http://stg.bitbon.space/ru");
        } catch (Exception e) {
        }
    }
    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        XpathFutter xpathFutter = new XpathFutter();
        Connect();
        Thread.sleep(500);
        ((JavascriptExecutor)driver).executeScript("scroll(0,5000)");
        Thread.sleep(500);
        //Новости
        WebElement element1 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonNews));
        element1.click();
        Thread.sleep(3000);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        //Экономико-правовая природа
        WebElement element2 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonEconomic));
        element2.click();
        Thread.sleep(1000);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        //Технологическая природа
        WebElement element3 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonTechnology));
        element3.click();
        Thread.sleep(1000);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        //Приобрести BitBon
        WebElement element4 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonBuyBitBon));
        element4.click();
        Thread.sleep(1000);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();
        //Сервис Bonpay
        WebElement element5 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonServiceBonpay));
        element5.click();
        Thread.sleep(1000);
        String Link5 = driver.getCurrentUrl();
        driver.navigate().back();
        //Протокол Bitbon
        WebElement element6 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonProtocolBitBon));
        element6.click();
        Thread.sleep(1000);
        String Link6 = driver.getCurrentUrl();
        driver.navigate().back();
        //Обеспечение безопасности
        WebElement element7 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonSecurity));
        element7.click();
        Thread.sleep(1000);
        String Link7 = driver.getCurrentUrl();
        driver.navigate().back();
        //Термины и определения
        WebElement element8 = driver.findElement(By.xpath(xpathFutter.FutterSystemBitBonTermins));
        element8.click();
        Thread.sleep(1000);
        String Link8 = driver.getCurrentUrl();
        driver.navigate().back();


        if(Link1.equals(xpathFutter.s22) & Link2.equals(xpathFutter.s23) & Link3.equals(xpathFutter.s24) &
                Link4.equals(xpathFutter.s25) & Link5.equals(xpathFutter.s26) & Link6.equals(xpathFutter.s27) &
                Link7.equals(xpathFutter.s28) & Link8.equals(xpathFutter.s29)) {
            System.out.println("Pass Test C236420 ");
        }else{
            System.out.println("Fail Test C236420");
        }

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
