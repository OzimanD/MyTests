package com.simcord.ui.tests.mainPage;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T11MainPageNewsDateNews extends Methods {
    //	C257327	Новости отображаться по дате публикации от более новых (последних опубликованных) к более старым слева направо

    public static void Check1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(NewsDate1));
//        WaitLoadPage();
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText1NewsDate, "C257327");

    }

    public static void Check2() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(NewsDate2));
//        WaitLoadPage();
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText2NewsDate, "C257327");

    }

    public static void Check3() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(NewsDate3));
//        WaitLoadPage();
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText3NewsDate, "C257327");

    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(2000);
        Check1();
        Check2();
        Check3();
    }
}
