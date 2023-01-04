package test;

import PageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {


    @Test
    void AcmeRubberDucksTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");
    }

    @Test
    void AcmeDeliveryInfoTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getDeliveryInfo();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store");
    }

    @Test
    void AcmeTermsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getTerms();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store");
    }

    @Test
    void returnToHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.getDeliveryInfo();
        homePage.returnToHomePage();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");
    }
}
