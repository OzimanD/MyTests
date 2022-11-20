package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DesignFuter extends Methods {
    //C257311	Состоит из трех блоков: Верхний футер, футер сайта, нижний футер сайта. Блоки разделены белой сплошной линией

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

    }

//    Уже наследован
//    @AfterMethod(alwaysRun = true)
//    public void closeBrowser() {
//        driver.quit();
//    }
}