package com.simcord.ui.tests.Providing;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T1ProvidingDesign extends Methods {
//      Остальные кейсы уже сделаны нет смысла добавлять в данные тесты именно в этом блоке
//		C257377	Дизайн *
//		C255269	Отображение поля по умолчанию и с сохраненным cookies *
//		C255268	Переход на страницу с шапки, футера и карты сайта
//		C255278	При загрузке странице плавно подгружается фон и контент

    public static void GoToProviding() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderProviding));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.ProvidingBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt1, "C257377");
    }

    public static void Check2() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(ProvidingBlock2));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt2, "C257377");
    }

    public static void Check3() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(ProvidingBlock3));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt3, "C257377");
    }

    public static void Check4() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(ProvidingBlock4));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt4, "C257377");
    }

    public static void Check5() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(ProvidingBlock5));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt5, "C257377");
    }

    public static void Check6() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(ProvidingBlock6));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt6, "C257377");
    }

    public static void Check7() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(ProvidingBlock7));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt7, "C257377");
    }

    public static void Check8() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(ProvidingBlock8));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ProvidingGetTxt8, "C257377");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToProviding();
        WaitLoadPage();
        Check1();
        Scroll500();
        Check2();
        Scroll1500();
        Check3();
        Scroll2500();
        Check4();
        Scroll3000();
        Check5();
        Scroll3500();
        Check6();
        Scroll5000();
        Check7();
        Scroll5500();
        Check8();


    }
}
