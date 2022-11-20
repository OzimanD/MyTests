package com.simcord.ui.tests.mainPage;

import com.simcord.ui.tests.XpathSelectors.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T9MainPageNewsCheckMoveRight extends Methods {
    //	C235322	Прокрутка Новостной ленты при нажатии на стрелки "вправо/влево" по кругу
    // C257325	Каждый блок новости содержит: превью-картинки, заголовка и даты публикации в формате: дд <месяц> ггг

    public static void Check1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(News1ElME));
        WaitLoadPage();
        String txtGetText = element.getText();
        waitUntil(News1El);
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText1News, "C235322");

    }

    public static void Check2() throws InterruptedException {
        WebElement buttonNextNews = driver.findElement(By.xpath(NextNewsRight));
        buttonNextNews.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(News2ElME));
        String txtGetText = element.getText();
        waitUntil(News2El);
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, GetText2tNews, "C235322");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(2000);
        Check1();
        Check2();
    }
}
