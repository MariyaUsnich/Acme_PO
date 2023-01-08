package PageObject;

import PageObject.Helpers.Locators;
import PageObject.Helpers.WebDriverContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageLocators {

    private By homePageButtonLocator = Locators.getLocator("HomePageLocators.homePageButton");
    private By rubberDucksLocator =Locators.getLocator("HomePageLocators.rubberDuck");
    private By deliveryInfoLocator = Locators.getLocator("HomePageLocators.deliveryInfo");
    private By termsLocator = Locators.getLocator("HomePageLocators.terms");

    private WebDriver driver;

    public HomePageLocators(WebDriver driver) {this.driver = driver;}

    public void returnToHomePage() {
        driver.findElement(homePageButtonLocator).click();
    }

    public void goToRubberDucks(){
        driver.findElement(rubberDucksLocator).click();
    }
    public void getDeliveryInfo(){
        driver.findElement(deliveryInfoLocator).click();
    }

    public void getTerms(){
        driver.findElement(termsLocator).click();

    }
}
