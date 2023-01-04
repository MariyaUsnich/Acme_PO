package test;

import PageObject.htmlelements.HomePageHTML;
import PageObject.htmlelements.SubcategoryHTML;
import org.testng.annotations.Test;


public class HeaderHTMLTest extends TestBase{

    @Test
    public void headerHTMLTest() {
        HomePageHTML homePage = new HomePageHTML(driver);
        //SubcategoryHTML subcategoryPage = new SubcategoryHTML(driver);
        //homePage.header.clickSubcategory();
        homePage.header.clickRubberDucksButton();
        homePage.header.clickHomeButton();
        //subcategoryPage.header.clickHomeButton();

    }
}




