package test;
import PageObject.Helpers.ScreenshotListener;
import PageObject.Helpers.WebDriverContainer;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {

  protected WebDriver driver;
  protected String baseUrl = "https://litecart.stqa.ru/en/";
    protected Logger LOG = Logger.getLogger(TestBase.class);

   @BeforeTest
    public void setup() {
       LOG.debug("Initializing webdriver");
       WebDriverContainer.initDriver();
       driver = WebDriverContainer.getDriver();
       //driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(baseUrl);
       LOG.debug("Webdriver initialized successfully");
   }

       @AfterTest
       public void teardown() {
       LOG.debug("Closing webdriver");
       WebDriverContainer.closeDriver();
           //driver.quit();
           LOG.debug("Webdriver closed");
       }
   }

