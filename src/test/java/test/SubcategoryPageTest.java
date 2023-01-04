package test;

import PageObject.SubcategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SubcategoryPageTest extends TestBase{


    @Test
    void AcmeSubCategTest() {
        SubcategoryPage subcategoryPage = new SubcategoryPage(driver);
        subcategoryPage.clickSubcategory();
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store");
    }

    @Test
    void NameOrderTest() {
        SubcategoryPage subcategoryPage = new SubcategoryPage(driver);
        subcategoryPage.clickSubcategory();
        driver.findElement(By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/?category_id=2&page=1&sort=name']")).click();
        List<WebElement> elements = driver.findElements(By.className("name"));
        List<WebElement> example = new ArrayList<>(2);
        WebElement yellowDuck = driver.findElement(By.xpath("//div[@class='name'][text()='Yellow Duck']"));
        WebElement greenDuck = driver.findElement(By.xpath("//div[@class='name'][text()='Green Duck']"));
        example.add(greenDuck);
        example.add(yellowDuck);
        Assert.assertEquals(elements, example);

    }

    @Test
    void PriceOrderTest()
    {
        SubcategoryPage subcategoryPage = new SubcategoryPage(driver);
        subcategoryPage.clickSubcategory();
        driver.findElement(By.xpath("//*[@id=\"box-category\"]/nav/span")).click();
        List<WebElement> elements = driver.findElements(By.className("name"));
        List<WebElement> example = new ArrayList<>(2);
        WebElement yellowDuck = driver.findElement(By.xpath("//div[@class='name'][text()='Yellow Duck']"));
        WebElement greenDuck = driver.findElement(By.xpath("//div[@class='name'][text()='Green Duck']"));
        example.add(yellowDuck);
        example.add(greenDuck);
        Assert.assertEquals(elements, example);
    }
    @Test
    void SaleLabelTest()
    {
        SubcategoryPage subcategoryPage = new SubcategoryPage(driver);
        subcategoryPage.clickSubcategory();
        subcategoryPage.getYellowDuckLabel();
        Assert.assertEquals(subcategoryPage.getYellowDuckLabel().getText(), "SALE");

    }
    @Test
    void NewLabelTest()
    {
        SubcategoryPage subcategoryPage = new SubcategoryPage(driver);
        subcategoryPage.clickSubcategory();
        subcategoryPage.getGreenDuckLabel();
        Assert.assertEquals(subcategoryPage.getGreenDuckLabel().getText(), "NEW");

    }
}
