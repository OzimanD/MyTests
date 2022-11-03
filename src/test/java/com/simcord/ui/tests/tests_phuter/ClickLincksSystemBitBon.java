package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClickLincksSystemBitBon extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    public static boolean BitBonNews() {
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonNews));
        element1.click();
        waitUntil(XpathFutter.FutterSystemBitBonNewsME);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res1 = Link1.equals(XpathFutter.s22);
        return res1;
    }

    public static boolean BonEconomic() {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonEconomic));
        element2.click();
        waitUntil(XpathFutter.FutterSystemBitBonEconomicME);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res2 = Link2.equals(XpathFutter.s23);
        return res2;
    }

    public static boolean BonTechnology() {
        WebElement element3 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonTechnology));
        element3.click();
        waitUntil(XpathFutter.FutterSystemBitBonTechnologyME);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res3 = Link3.equals(XpathFutter.s24);
        return res3;
    }

    public static boolean BuyBitBon() {
        WebElement element4 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonBuyBitBon));
        element4.click();
        waitUntil(XpathFutter.FutterSystemBitBonBuyBitBonME);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res4 = Link4.equals(XpathFutter.s25);
        return res4;
    }

    public static boolean ServiceBonpay() {
        WebElement element5 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonServiceBonpay));
        element5.click();
        waitUntil(XpathFutter.FutterSystemBitBonServiceBonpayME);
        String Link5 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res5 = Link5.equals(XpathFutter.s26);
        return res5;
    }

    public static boolean ProtocolBitBon() {
        WebElement element6 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonProtocolBitBon));
        element6.click();
        waitUntil(XpathFutter.FutterSystemBitBonProtocolBitBonME);
        String Link6 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res6 = Link6.equals(XpathFutter.s27);
        return res6;
    }

    public static boolean BitBonSecurity() {
        WebElement element7 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonSecurity));
        element7.click();
        waitUntil(XpathFutter.FutterSystemBitBonSecurityME);
        String Link7 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res7 = Link7.equals(XpathFutter.s28);
        return res7;
    }

    public static boolean BitBonTermins() {
        WebElement element8 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonTermins));
        element8.click();
        waitUntil(XpathFutter.FutterSystemBitBonTerminsME);
        String Link8 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res8 = Link8.equals(XpathFutter.s29);
        return res8;
    }

    public static void Result() {
        Assert.assertTrue(BitBonNews() & BonEconomic() & BonTechnology() &
                BuyBitBon() & ServiceBonpay() & ProtocolBitBon() &
                BitBonTermins() & BitBonSecurity(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        BitBonNews();
        BonEconomic();
        BonTechnology();
        BuyBitBon();
        ServiceBonpay();
        ProtocolBitBon();
        BitBonSecurity();
        BitBonTermins();
        Result();
    }
}
