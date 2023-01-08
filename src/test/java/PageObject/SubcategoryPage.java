package PageObject;

import PageObject.Helpers.WebDriverContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SubcategoryPage {

    private By subCategoryMenuLocator = By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']");
    private By rubberDucksLocator = By.linkText("Rubber Ducks");

    private By yellowDuckLocator = By.xpath("//a[@class='link'][@title='Yellow Duck']");

    private By greenDuckLocator = By.xpath("//a[@class='link'][@title='Green Duck']");

    private By saleLabelLocator = By.cssSelector("div.sticker.sale");

    private By newLabelLocator = By.cssSelector("div.sticker.new");

    private By priceLocator = By.xpath("//*[text()='Price']");

    private By nameLocator = By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/?category_id=2&page=1&sort=name']");


    private WebDriver driver;

    public SubcategoryPage(WebDriver driver){this.driver = driver;}

    public void clickSubcategory() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(rubberDucksLocator)).click(driver.findElement(subCategoryMenuLocator)).perform();
    }
    public WebElement getYellowDuckelement() {
        return driver.findElement(yellowDuckLocator);
    }

        public WebElement getGreenDuckelement() {
            return driver.findElement(greenDuckLocator);
        }

        public WebElement getYellowDuckLabel() {
            return getYellowDuckelement().findElement(saleLabelLocator);
        }

        public WebElement getGreenDuckLabel(){
            return getGreenDuckelement().findElement(newLabelLocator);
    }

    public void selectByName() {
        driver.findElement(nameLocator).click();
    }

    public void selectByPrice() {
        driver.findElement(priceLocator).click();
    }
   }




