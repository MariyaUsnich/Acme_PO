package test;

import PageObject.Helpers.WebDriverContainer;
import PageObject.HomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    @Description("Rubber Ducks Page opening")
    @Test
    void AcmeRubberDucksTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");
    }

    @Description("DeliveryInfo opening")
    @Test
    void AcmeDeliveryInfoTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getDeliveryInfo();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store");
    }
    @Description("Terms and Conditions opening")
    @Test
    void AcmeTermsTest() {
        HomePage homePage = new HomePage(WebDriverContainer.getDriver());
        homePage.getTerms();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store");
    }
 @Description("Return to HomePage")
    @Test
    void returnToHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.getDeliveryInfo();
        homePage.returnToHomePage();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");
    }
}
