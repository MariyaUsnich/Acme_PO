package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageStatic {
    private static By homePageSignLocator = By.cssSelector("i.fa.fa-home");
    private static By rubberDucksLocator = By.linkText("Rubber Ducks");
    private static By deliveryInfoLocator = By.linkText("Delivery Information");
    private static By termsLocator = By.linkText("Terms & Conditions");

    public static void returnToHomePage(WebDriver driver) {
        driver.findElement(homePageSignLocator).click();
    }

    public static void goToRubberDucks(WebDriver driver) {
        driver.findElement(rubberDucksLocator).click();
    }

    public static void getDeliveryInfo(WebDriver driver) {
        driver.findElement(deliveryInfoLocator).click();
    }

    public static void getTerms(WebDriver driver) {
        driver.findElement(termsLocator).click();

    }
}