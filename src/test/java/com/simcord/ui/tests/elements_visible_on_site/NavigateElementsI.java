package com.simcord.ui.tests.elements_visible_on_site;

import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//C257414
//Наведении/нажатие курсора на элемент "i" -> вызов всплывающего окна с соответствующим контентом

public class NavigateElementsI {
    private static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        try {
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
            driver.get("http://stg.bitbon.space/ru/cooperation/bitup-agency");
        } catch (Exception e) {
        }
    }

    @Test(description = "Tests Elements visible")
    public static void MethodClickLogoT620561() throws InterruptedException {

        XpathMainPage xpath = new XpathMainPage();
        try {
            WebElement element = driver.findElement(By.xpath(xpath.ElementsI));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().clickAndHold().release().build().perform();
            Thread.sleep(1000);
            WebElement element1 = driver.findElement(By.xpath(xpath.GetElemetsI));
            element1.getTagName();
            System.out.println("Pass test C257414");

        } catch (Exception e) {
            System.out.println("Fail test C257414");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}

