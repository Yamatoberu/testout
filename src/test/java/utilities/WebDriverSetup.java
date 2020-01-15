package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class WebDriverSetup {

    private String projectResourcesLocation = System.getProperty("user.dir")+"/src/test/resources";
    private Properties prop;

    public WebDriverSetup (Properties prop){
        this.prop = prop;
    }

    public WebDriver setupWebDrivers(WebDriver driver){
        System.setProperty("webdriver.gecko.driver", projectResourcesLocation+"/webdrivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", projectResourcesLocation+"/webdrivers/chromedriver.exe");
        System.setProperty("webdriver.edge.driver", projectResourcesLocation+"/webdrivers/MicrosoftWebDriver.exe");

        String browser = prop.getProperty("browser");

        if (browser.equals("chrome")){
            System.out.println("Your picked browser is chrome");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")){
            System.out.println("Your picked browser is firefox");
            driver = new FirefoxDriver();
        } else if (browser.equals("edge")){
            System.out.println("Your picked browser is edge");
            driver = new EdgeDriver();
        } else{
            System.out.println("Please pick edge, firefox or chrome for the browser");
        }

        return driver;

    }
}
