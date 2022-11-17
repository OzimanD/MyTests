package com.simcord.ui.tests.systemBitBon;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T3SystemBitBonChangeArticles extends Methods {
    //C257368	Нажатие на подраздел -> меняется описание статьи и изображение ленты статей согласно выбранного подраздела
//	C257373	Изменение изображения -> приводит к переходу между подразделами и изменению контента в зависимости от выбранного подраздела
//		C257374	При прокрутке, плавно наплывает следующая картинка ленты статей, прозрачность плавно уменьшается. Изображение, находившееся по центру смещается, становясь прозрачным
    public static void GoToSystemBitBon() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBon));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonArticles1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div/div[1]/img"));
        String src = element1.getAttribute("src");
//        System.out.println(src);
        Assert.assertEquals(src, AboutSystemBitBonSRC1, "C257362");
        Assert.assertEquals(txtGetText, SystemBitBonArticles1, "C257362");
    }

    public static void Check2() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonDigitalAsset));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonArticles2));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div/div[2]/img"));
        String src = element1.getAttribute("src");
//        System.out.println(src);
        Assert.assertEquals(src, AboutSystemBitBonSRC2, "C257362");
        Assert.assertEquals(txtGetText, SystemBitBonArticles2, "C257362");
    }

    public static void Check3() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonOneSpace));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonArticles3));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div/div[3]/img"));
        String src = element1.getAttribute("src");
//        System.out.println(src);
        Assert.assertEquals(src, AboutSystemBitBonSRC3, "C257362");
        Assert.assertEquals(txtGetText, SystemBitBonArticles3, "C257362");
    }

    public static void Check4() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonBonPay));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonArticles4));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div/div[4]/img"));
        String src = element1.getAttribute("src");
//        System.out.println(src);
        Assert.assertEquals(src, AboutSystemBitBonSRC4, "C257362");
        Assert.assertEquals(txtGetText, SystemBitBonArticles4, "C257362");
    }

    public static void Check5() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonProviding));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonArticles5));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div/div[5]/img"));
        String src = element1.getAttribute("src");
//        System.out.println(src);
        Assert.assertEquals(src, AboutSystemBitBonSRC5, "C257362");
        Assert.assertEquals(txtGetText, SystemBitBonArticles5, "C257362");
    }

    public static void Check6() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonBusiness));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonArticles6));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div/div[6]/img"));
        String src = element1.getAttribute("src");
//        System.out.println(src);
        Assert.assertEquals(src, AboutSystemBitBonSRC6, "C257362");
        Assert.assertEquals(txtGetText, SystemBitBonArticles6, "C257362");
    }

    public static void Check7() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonRoadMap));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonArticles7));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div/div[7]/img"));
        String src = element1.getAttribute("src");
//        System.out.println(src);
        Assert.assertEquals(src, AboutSystemBitBonSRC7, "C257362");
        Assert.assertEquals(txtGetText, SystemBitBonArticles7, "C257362");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToSystemBitBon();
        WaitLoadPage();
        Check1();
        Check2();
        Check3();
        Check4();
        Check5();
        Check6();
        Check7();

    }
}
