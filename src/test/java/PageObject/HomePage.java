package PageObject;

import PageObject.Helpers.WebDriverContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    private By homePageButtonLocator = By.cssSelector("i.fa.fa-home");
    private By rubberDucksLocator = By.linkText("Rubber Ducks");
    private By deliveryInfoLocator = By.linkText("Delivery Information");
    private By termsLocator = By.linkText("Terms & Conditions");

    private WebDriver driver;

    public HomePage(WebDriver driver) {this.driver = driver;}
 public void returnToHomePage() {
        driver.findElement(homePageButtonLocator).click();
 }

 public void goToRubberDucks(){
     LOG.info("Rubber Ducks opening");
        driver.findElement(rubberDucksLocator).click();
     LOG.info("Rubber Ducks opened");
 }
public void getDeliveryInfo(){
    LOG.info("Delivery info opening");
        driver.findElement(deliveryInfoLocator).click();
    LOG.info("Delivery info opened");
}

public void getTerms(){
        driver.findElement(termsLocator).click();

}
}
