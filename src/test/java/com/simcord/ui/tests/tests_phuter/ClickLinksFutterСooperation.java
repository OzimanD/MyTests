package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.memory.Memory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClickLinksFutterСooperation extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
        //бизнесу
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterCooperationBusiness));
        element1.click();
        waitUntil(XpathFutter.FutterCooperationBusinessME);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        //Агентам
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterCooperationBitupAgency));
        element2.click();
        Thread.sleep(1000);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        //Операторам
        WebElement element3 = driver.findElement(By.xpath(XpathFutter.FutterCooperationOperators));
        element3.click();
        Thread.sleep(1000);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        //Разработчикам
        WebElement element4 = driver.findElement(By.xpath(XpathFutter.FutterCooperationDevelopers));
        element4.click();
        Thread.sleep(1000);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();
        //Биржам
        WebElement element5 = driver.findElement(By.xpath(XpathFutter.FutterCooperationExchanges));
        element5.click();
        Thread.sleep(1000);
        String Link5 = driver.getCurrentUrl();
        driver.navigate().back();
        //Юристам
        WebElement element6 = driver.findElement(By.xpath(XpathFutter.FutterCooperationLawyers));
        element6.click();
        Thread.sleep(1000);
        String Link6 = driver.getCurrentUrl();
        driver.navigate().back();
        //Институтам
        WebElement element7 = driver.findElement(By.xpath(XpathFutter.FutterCooperationInstitutes));
        element7.click();
        Thread.sleep(1000);
        String Link7 = driver.getCurrentUrl();
        driver.navigate().back();
        //Форум и СМИ
        WebElement element8 = driver.findElement(By.xpath(XpathFutter.FutterCooperationForums));
        element8.click();
        Thread.sleep(1000);
        String Link8 = driver.getCurrentUrl();
        driver.navigate().back();
        //Государствам
        WebElement element9 = driver.findElement(By.xpath(XpathFutter.FutterCooperationStates));
        element9.click();
        Thread.sleep(1000);
        String Link9 = driver.getCurrentUrl();
        driver.navigate().back();

        if (Link1.equals(XpathFutter.RU_COOPERATION_BUSINESS) & Link2.equals(XpathFutter.s2) & Link3.equals(XpathFutter.s3) &
                Link4.equals(XpathFutter.s4) & Link5.equals(XpathFutter.s5) & Link6.equals(XpathFutter.s6) &
                Link7.equals(XpathFutter.s7) & Link8.equals(XpathFutter.s8) & Link9.equals(XpathFutter.s9)) {
            System.out.println("Pass Test C236420 ");
        } else {
            System.out.println("Fail Test C236420");
        }

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
