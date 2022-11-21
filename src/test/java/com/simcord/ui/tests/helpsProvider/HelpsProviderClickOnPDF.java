package com.simcord.ui.tests.helpsProvider;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class HelpsProviderClickOnPDF extends Methods {
    //      	C257409	Нажатие на гиперссылки Инструкции PDF -> в новой вкладке браузера, открывается соответствующая гиперссылке PDF-файл

    public static final String PDF1Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/providing/obespechenie-konsensusa-po-algoritmu-community-pos-v-sisteme-ucheta-tokenov-raspredelennogo-reestra-sistemy-bitbon.pdf";
    public static final String PDF2Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/providing/prilozhenie-matematicheskoe-obosnovanie-algoritma-community-pos.pdf";
    public static final String PDF3Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/providing/osnovnye-princzipy-postroeniya-pulov-registratorov-i-raspredeleniya-voznagrazhdenij-za-provajding.pdf";
    public static final String PDF4Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/providing/prilozhenie-matematicheskoe-opisanie-obespecheniya-konsensusa-v-sisteme-ucheta-tokenov-raspredelennogo-reestra-sistemy-bitbon.pdf";
    public static final String PDF5Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/appendix/prilozhenie-sistema-bitbon-provajding-v-sisteme-bitbon-ekonomiko-pravovaya-decentralizaciya-sistemy-bitbon.pdf";
    public static final String PDF6Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/appendix/prilozhenie-bitbon-tehnologicheskaya-decentralizaciya-sistemy-bitbon.pdf";
    public static final String PDF7Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/appendix/provajder-sistemy-bitbon.pdf";
    public static final String PDF8Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/providing/analiticheskaya-panel-registratora-instrukcziya.pdf";
    public static final String PDF9Link = "https://s3.eu-central-1.amazonaws.com/information-resources.bitbon.space/pdf/providing/prilozhenie-dlya-virtualnogo-modelirovaniya-pulov-instrukcziya.pdf";

    public static void GoToProvidingHeplpsProvider() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderProviding));
        element.click();
        WaitLoadPage();

    }

    public static void GoToPDF1Providing() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF1));
        element.click();
        WaitLoadPage();
        GoToNewTabBrowser();
    }

    public static void CheckPDFLink1() {
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF1Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF2Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF2));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF2Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF3Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF3));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF3Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF4Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF4));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF4Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF5Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF5));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF5Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF6Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF6));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF6Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF7Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF7));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF7Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF8Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF8));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF8Link, "C257409");
        CloseNewWindowBrowser();
    }

    public static void CheckPDF9Providing() throws InterruptedException {
        GoToNewTabBrowser();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF9));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
//        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, PDF9Link, "C257409");
        CloseNewWindowBrowser();
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToProvidingHeplpsProvider();
        GoToPDF1Providing();
        CheckPDFLink1();
        CheckPDF2Providing();
        CheckPDF3Providing();
        CheckPDF4Providing();
        CheckPDF5Providing();
        CheckPDF6Providing();
        CheckPDF7Providing();
        CheckPDF8Providing();
        CheckPDF9Providing();

    }
}
