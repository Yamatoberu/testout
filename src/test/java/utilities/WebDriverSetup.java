package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class WebDriverSetup {

    public static WebDriver driver;
    private static String projectResourcesLocation = System.getProperty("user.dir")+"/src/test/resources";

    public void setupWebDrivers(Properties prop){

        String browser = prop.getProperty("browser");

        if (browser.equals("chrome")){
            System.out.println("Your picked browser is chrome");
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
        } else if (browser.equals("firefox")){
            System.out.println("Your picked browser is firefox");
            WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
        } else if (browser.equals("edge")){
            System.out.println("Your picked browser is edge");
            WebDriverManager.edgedriver().setup();
            this.driver = new EdgeDriver();
        } else{
            System.out.println("Please pick edge, firefox or chrome for the browser");
        }

    }
}
