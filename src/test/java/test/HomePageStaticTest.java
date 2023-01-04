package test;

import PageObject.HomePageStatic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageStaticTest {

    @Test
    static void AcmeRubberDucksTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        HomePageStatic.goToRubberDucks(driver);
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");
    }

    @Test
    void AcmeDeliveryInfoTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        HomePageStatic.getDeliveryInfo(driver);
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store");
    }

    @Test
    void AcmeTermsTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        HomePageStatic.getTerms(driver);
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store");
    }

    @Test
    void returnToHomePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        HomePageStatic.getDeliveryInfo(driver);
        HomePageStatic.returnToHomePage(driver);
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");
    }
}

