package com.simcord.ui.tests.mainPage.business;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class BusinessDesign extends Methods {
//C257351	Дизайн *

    public static void GoToOneSpaceBusiness() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessBox));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessPage1Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText1Business, "C257351");
    }

    public static void Check2() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessPage2Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText2Business, "C257351");
    }

    public static void Check3() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessPage3Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText3Business, "C257351");
    }

    public static void Check4() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessPage4Block));
        String txtGetText = element.getText();
        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText4Business, "C257351");
    }

    public static void Check5() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessPage5Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText5Business, "C257351");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(500);
        GoToOneSpaceBusiness();
        Check1();
        scroll(1000);
        Check2();
        scroll(1500);
        Check3();
        Check4();
        scroll(2500);
        Check5();

    }
}
