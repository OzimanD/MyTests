package com.simcord.ui.tests.mainPage.Accaunt;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountGoToOneSpace extends Methods {
    //  	C235467	Нажатие на "One Space" -> открывается https://one.space/ru
    public static void GoToLogin() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLogin));
        element.click();
        WaitLoadPage();


    }

    public static void GoToOneSpace() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath(XpathMainPage.HeaderLoginGoToPageRegistration));
        element1.click();

//        Assert.assertEquals(txtGetText, HeaderLoginBlock1GetTxt, "C257357");
    }

//    public static void Check1() throws InterruptedException {
//        WaitLoadPage();
//        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLoginBlock1));
//        String txtGetText = element.getText();
////        System.out.println(txtGetText);
//        Assert.assertEquals(txtGetText, HeaderLoginBlock1GetTxt, "C257357");
//    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToLogin();
        GoToOneSpace();
//        Check1();
//        Check2();
//        Check3();
//        Scroll500();
//        Check4();

    }
}