package PageObject.Helpers;

import org.openqa.selenium.By;

import java.io.InputStream;
import java.util.Properties;

public class Locators {
    private static Properties locators;

    static {
        locators = new Properties();
        InputStream is =
                Locators.class.getResourceAsStream("/locators.properties");

        try {
            locators.load(is);
        } catch (Exception e) {
            System.out.println("Error reading from property file");
        }
    }

    public static By getLocator(String locator) {
        String value = locators.getProperty(locator);
        String[] result = value.split("=", 2);
        LocatorType locatorType = LocatorType.valueOf(result[0]);
        String selector = result[1];
        return switch (locatorType) {
            case id -> By.id(selector);
            case css -> By.cssSelector(selector);
            case name -> By.name(selector);
            case xpath -> By.xpath(selector);
            case linkText -> By.linkText(selector);
            case className -> By.className(selector);
        };
    }
}