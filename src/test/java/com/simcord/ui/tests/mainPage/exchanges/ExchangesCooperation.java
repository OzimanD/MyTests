package com.simcord.ui.tests.mainPage.exchanges;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.LinkBitTradeKnowsMore;

public class ExchangesCooperation extends Methods {
    // 	C257355	Наведение на гиперссылку "Узнать больше" -> текст ссылки становится подчеркнутым.Стрелка ">" должна сместиться вправо.
    //  C257356	Нажатие на гиперссылку "Узнать больше" -> переход на страницу Сотрудничество с биржами

    public static void GoToOneSpaceExchanges() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchanges));
        element.click();
        WaitLoadPage();

    }

    public static void GoToBiBonKnowsMore() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BitBonKnowsMore));
        element.click();

    }

    public static void Check1() {
        String txtGetLink = driver.getCurrentUrl();
//        System.out.println(txtGetLink);
        Assert.assertEquals(txtGetLink, LinkBitTradeKnowsMore, "C257356");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll2000();
        GoToOneSpaceExchanges();
        GoToBiBonKnowsMore();
        WaitLoadPage();
        StopLoadPaige();
        Check1();
    }
}