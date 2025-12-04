package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ListenerImplementation implements ITestListener {

    // Called when test starts
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("⚡ TEST STARTED: " + result.getName());
    }

    // Called when test passes
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("✔ TEST PASSED: " + result.getName());
    }

    // Called when test fails
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("❌ TEST FAILED: " + result.getName());

        WebDriver driver = BaseClass.driver;

        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            String screenshotPath = System.getProperty("user.dir") +
                    "/Screenshots/" + result.getName() + ".png";

            File dest = new File(screenshotPath);

            try {
                Files.copy(src.toPath(), dest.toPath());
                System.out.println("📸 Screenshot Saved At: " + screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("⚠ TEST SKIPPED: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("===== TEST EXECUTION STARTED =====");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("===== TEST EXECUTION FINISHED =====");
    }
}
