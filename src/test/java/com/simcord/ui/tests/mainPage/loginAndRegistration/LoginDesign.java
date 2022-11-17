package com.simcord.ui.tests.mainPage.loginAndRegistration;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class LoginDesign extends Methods {
//C257357	Дизайн *
    //  C235331	Вход в раздел "Вход/Регистрация" -> нажатие на кнопку "Вход"
//	C257358	Активный заголовок отображается в левом верхнем углу, неактивный в правом верхнем углу

    public static void GoToLogin() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLogin));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLoginBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HeaderLoginBlock1GetTxt, "C257357");
    }

    public static void Check2() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLoginBlock2));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HeaderLoginBlock2GetTxt, "C257351");
    }

    public static void Check3() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLoginBlock3));
        String txtGetText = element.getText();
        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HeaderLoginBlock3GetTxt, "C257351");
    }

    public static void Check4() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLoginBlock4));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HeaderLoginBlock4GetTxt, "C257351");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToLogin();
        WaitLoadPage();
        Check1();
        Check2();
        Check3();
        Scroll500();
        Check4();

    }
}