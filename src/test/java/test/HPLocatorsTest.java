package test;

import PageObject.HomePageLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HPLocatorsTest extends TestBase {


    @Test
    void AcmeRubberDucksTest() {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.goToRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");
    }

    @Test
    void AcmeDeliveryInfoTest() {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.getDeliveryInfo();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store");
    }

    @Test
    void AcmeTermsTest() {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.getTerms();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store");
    }

    @Test
    void returnToHomePage() {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.getDeliveryInfo();
        homePage.returnToHomePage();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");
    }
}
