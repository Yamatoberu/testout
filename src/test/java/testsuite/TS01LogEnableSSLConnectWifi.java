package testsuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import components.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.SetupFromConfigFile;
import utilities.WebDriverSetup;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TS01LogEnableSSLConnectWifi {

    public static WebDriver driver;
    public static ExtentReports extentReports;
    public static ExtentTest logger;
    public static Properties prop;
    public static WebDriverWait wait;

    @BeforeSuite
    public void testSuiteSetup() {
        SetupFromConfigFile config = new SetupFromConfigFile();
        prop = config.retrieveProperties();

        WebDriverSetup setup = new WebDriverSetup(prop);
        driver = setup.setupWebDrivers(driver);

        wait = new WebDriverWait(driver, 20);

        ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/src/test/reports/TestOutReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
    }

    @Test
    public void completeLab() {
        logger = extentReports.createTest("Test: Log into TestOut URL and complete lab");
        driver.manage().window().maximize();
        // Navigate to the simulation URL
        driver.get(prop.getProperty("url"));
        // Setting up the SSL and verifying port
        IpadHomePage.clickSettingsApp();
        IpadSettings.goToMailContactCalendars();
        IpadMailContactsCalendars.clickMaggieBrown();
        IpadMailContactsCalendars.clickGmailAccount();
        IpadAccountPopup.clickAdvancedButton();
        IpadAccountPopup.activateSSL();
        IpadAccountPopup.validatePort();
        IpadAccountPopup.clickAccount();
        IpadAccountPopup.clickDone();
        // Connecting to Corpnet Network
        IpadSettings.goToWifi();
        IpadWifi.connectToCorpnetNetwork();
        BasePage.finishLab();
        LabReportPopup.validateScore();
        LabReportPopup.clickDone();
    }

    @AfterSuite
    public void testTeardown() {
        driver.quit();
        extentReports.flush();
    }
}
