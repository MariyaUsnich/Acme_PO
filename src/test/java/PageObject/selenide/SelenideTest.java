package PageObject.selenide;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Browsers.CHROME;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void selenideTest() {
        Configuration.baseUrl = "https://litecart.stqa.ru/";
        Configuration.assertionMode = AssertionMode.STRICT;
        Configuration.browser = CHROME;
        Configuration.pageLoadTimeout = 5000;
        Configuration.browserSize = "1920x1080";

        open(Configuration.baseUrl);
        $(By.linkText("Rubber Ducks")).click();
        Assert.assertEquals(title(), "Rubber Ducks | My Store");
       // title().equalsIgnoreCase("Rubber Ducks | My Store");
        Selenide.closeWindow();
    }

}

