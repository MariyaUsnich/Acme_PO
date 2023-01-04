package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePageFactory {
    @FindBy(css = "i.fa.fa-home")
    private WebElement homePageButton;

    @FindBy(linkText = "Rubber Ducks")
    private WebElement rubberDucks;

    @FindBy(linkText = "Delivery Information")
    private WebElement deliveryInfo;

    @FindBy(linkText = "Terms & Conditions")
    private WebElement terms;

    public void returnToHomePage() {
        homePageButton.click();
    }

    public void goToRubberDucks() {
        rubberDucks.click();
    }

    public void getDeliveryInfo() {
        deliveryInfo.click();
    }

    public void getTerms() {
        terms.click();
    }
}


