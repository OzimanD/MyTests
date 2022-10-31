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

public class ClickLinksFutterСooperation {
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
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
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
        //бизнесу
        WebElement element1 = driver.findElement(By.xpath(xpathFutter.FutterCooperationBusiness));
        element1.click();
        Thread.sleep(1000);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        //Агентам
        WebElement element2 = driver.findElement(By.xpath(xpathFutter.FutterCooperationBitupAgency));
        element2.click();
        Thread.sleep(1000);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        //Операторам
        WebElement element3 = driver.findElement(By.xpath(xpathFutter.FutterCooperationOperators));
        element3.click();
        Thread.sleep(1000);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        //Разработчикам
        WebElement element4 = driver.findElement(By.xpath(xpathFutter.FutterCooperationDevelopers));
        element4.click();
        Thread.sleep(1000);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();
        //Биржам
        WebElement element5 = driver.findElement(By.xpath(xpathFutter.FutterCooperationExchanges));
        element5.click();
        Thread.sleep(1000);
        String Link5 = driver.getCurrentUrl();
        driver.navigate().back();
        //Юристам
        WebElement element6 = driver.findElement(By.xpath(xpathFutter.FutterCooperationLawyers));
        element6.click();
        Thread.sleep(1000);
        String Link6 = driver.getCurrentUrl();
        driver.navigate().back();
        //Институтам
        WebElement element7 = driver.findElement(By.xpath(xpathFutter.FutterCooperationInstitutes));
        element7.click();
        Thread.sleep(1000);
        String Link7 = driver.getCurrentUrl();
        driver.navigate().back();
        //Форум и СМИ
        WebElement element8 = driver.findElement(By.xpath(xpathFutter.FutterCooperationForums));
        element8.click();
        Thread.sleep(1000);
        String Link8 = driver.getCurrentUrl();
        driver.navigate().back();
        //Государствам
        WebElement element9 = driver.findElement(By.xpath(xpathFutter.FutterCooperationStates));
        element9.click();
        Thread.sleep(1000);
        String Link9 = driver.getCurrentUrl();
        driver.navigate().back();

        if(Link1.equals(xpathFutter.s1) & Link2.equals(xpathFutter.s2) & Link3.equals(xpathFutter.s3) &
                Link4.equals(xpathFutter.s4) & Link5.equals(xpathFutter.s5) & Link6.equals(xpathFutter.s6) &
                Link7.equals(xpathFutter.s7) & Link8.equals(xpathFutter.s8) & Link9.equals(xpathFutter.s9)) {
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
