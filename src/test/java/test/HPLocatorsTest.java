package test;

import PageObject.HomePageLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HPLocatorsTest extends TestBase {


    @Test
    void AcmeRubberDucksTest() throws Exception {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.goToRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");
    }

    @Test
    void AcmeDeliveryInfoTest() throws Exception {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.getDeliveryInfo();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store");
    }

    @Test
    void AcmeTermsTest() throws Exception {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.getTerms();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store");
    }

    @Test
    void returnToHomePage() throws Exception {
        HomePageLocators homePage = new HomePageLocators(driver);
        homePage.getDeliveryInfo();
        homePage.returnToHomePage();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");
    }
}
