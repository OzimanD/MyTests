package com.simcord.ui.tests.mainPage;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T1_4MainPage extends Methods {
//      C257321	Поведение анимации 1-го блока *
//		C257322	Поведение анимации 2-го блока *
//		C257323	Поведение анимации 3-го блока *
//		C257324	Поведение анимации 4-го блока *

    public static void Check1() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityBox));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, CheckCommunityBox, "C257321");
    }

    public static void Check2() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessBox));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, CheckBusinessBox, "C257322");
    }

    public static void Check3() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.OneSpaceBox));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, CheckOneSpaceBox, "C257323");
    }

    public static void Check4() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BuyBitBonBox));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, CheckBuyBitBonBox, "C257324");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll500();
        Check1();
        Scroll1000();
        Check2();
        Scroll1500();
        Check3();
        Scroll2000();
        Check4();


    }
}
