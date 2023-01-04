package test;

import PageObject.HomePageFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageFactoryTest extends TestBase {


    @Test
    void AcmeRubberDucksTest() {
        HomePageFactory homePage = PageFactory.initElements(driver, HomePageFactory.class);
        homePage.goToRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");
    }

    @Test
    void AcmeDeliveryInfoTest() {
        HomePageFactory homePage = PageFactory.initElements(driver, HomePageFactory.class);
        homePage.getDeliveryInfo();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store");
    }

    @Test
    void AcmeTermsTest() {
        HomePageFactory homePage = PageFactory.initElements(driver, HomePageFactory.class);
        homePage.getTerms();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store");
    }

    @Test
    void returnToHomePage() {
        HomePageFactory homePage = PageFactory.initElements(driver, HomePageFactory.class);
        homePage.getDeliveryInfo();
        homePage.returnToHomePage();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");
    }
}