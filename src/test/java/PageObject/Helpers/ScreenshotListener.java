package PageObject.Helpers;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenshotListener implements ITestListener {
    Logger LOG = Logger.getLogger(ScreenshotListener.class);

    @Override
    public void onTestFailure(ITestResult testResult) {
        File screenshot = ((TakesScreenshot) WebDriverContainer.getDriver()).getScreenshotAs(OutputType.FILE);
        String fileName = testResult.getTestName() + "screenshot.png";
        File destinationFile = new File("D:\\" + fileName);
        try {
            FileUtils.copyFile(screenshot, destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

