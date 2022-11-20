package com.simcord.ui.tests.mainPage.oneSpaceCommunity;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;
import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.CheckBuyBitBonBox;

public class OneSpaceCommunityAnimations extends Methods {
//C257336	Дизайн *
//		C257337	Анимация 1-й блок *
//		C257338	Анимация 4-й блок *
//		C257339	Анимация 5-й блок *
//		C257340	Анимация 6-й блок *

    public static void GoToOneSpaceComuniy() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityBox));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityPage1Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText1OneSpace, "C257321");
    }

    public static void Check2() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityPage2Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText2OneSpace, "C257322");
    }

    public static void Check3() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityPage3Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText3OneSpace, "C257323");
    }

    public static void Check4() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityPage4Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText4OneSpace, "C257324");
    }

    public static void Check5() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityPage5Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText5OneSpace, "C257324");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(500);
        GoToOneSpaceComuniy();
        Check1();
        scroll(1000);
        Check2();
        scroll(1500);
        Check3();
        scroll(3000);
        Check4();
        scroll(4000);
        Check5();

    }
}
