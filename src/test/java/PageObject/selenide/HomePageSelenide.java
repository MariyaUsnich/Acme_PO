package PageObject.selenide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class HomePageSelenide {
    private By homePageButtonLocator = By.cssSelector("i.fa.fa-home");
    private By rubberDucksLocator = By.linkText("Rubber Ducks");
    private By deliveryInfoLocator = By.linkText("Delivery Information");
    private By termsLocator = By.linkText("Terms & Conditions");

    private WebDriver driver;

    public HomePageSelenide(WebDriver driver) {
        this.driver = driver;
    }
    public void returnToHomePage() {
        $(homePageButtonLocator).click();
    }

    public void goToRubberDucks(){
        $(rubberDucksLocator).click();
    }
    public void getDeliveryInfo(){
        $(deliveryInfoLocator).click();
    }

    public void getTerms(){
        $(termsLocator).click();
    }
}
