package com.simcord.ui.tests.mainPage.mobileApp;

import com.simcord.ui.tests.XpathSelectors.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class MobileAppClicksIconApp extends Methods {
    //C235326	Нажатие на иконки приложения - > "картинка приложения Оne Space" меняется в соответствии с дизайном
    public static void GoToOneMobileApp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(MobileApp));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(MobileAppIcon1));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(MobileAppIcon1Text));
        Assert.assertEquals(element1.getText(), "Новости", "Pass");
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture1));
        String txtGetText = picture.getAttribute("src");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, LinkPictureMobileApp1, "C235326");
    }

    public static void Check2() {
        WebElement element = driver.findElement(By.xpath(MobileAppIcon2));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(MobileAppIcon2Text));
        Assert.assertEquals(element1.getText(), "Bonpay", "Pass");
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture2));
        String txtGetText = picture.getAttribute("src");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, LinkPictureMobileApp2, "C235326");
    }

    public static void Check3() {
        WebElement element = driver.findElement(By.xpath(MobileAppIcon3));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(MobileAppIcon3Text));
        Assert.assertEquals(element1.getText(), "Мои активы", "Pass");
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture3));
        String txtGetText = picture.getAttribute("src");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, LinkPictureMobileApp3, "C235326");
    }

    public static void Check4() {
        WebElement element = driver.findElement(By.xpath(MobileAppIcon4));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(MobileAppIcon4Tex));
        Assert.assertEquals(element1.getText(), "Общение", "Pass");
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture4));
        String txtGetText = picture.getAttribute("src");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, LinkPictureMobileApp4, "C235326");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(1500);
        GoToOneMobileApp();
        scroll(1000);
        Check1();
        WaitLoadPage();
        Check2();
        WaitLoadPage();
        Check3();
        WaitLoadPage();
        Check4();

    }
}
