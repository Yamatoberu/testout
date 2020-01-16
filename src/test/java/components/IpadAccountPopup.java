package components;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testsuite.TS01LogEnableSSLConnectWifi;
import utilities.Waiter;

import java.util.concurrent.TimeUnit;

import static testsuite.TS01LogEnableSSLConnectWifi.logger;
import static utilities.WebDriverSetup.driver;

public class IpadAccountPopup {
    // Inventory of objects
        // Advanced
        public static By advanced = By.id("siAdvanced.Grid.tbText");
        // Use SSL slider
        public static By sslFrom = By.id("siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchThumb.Grid.Border.Grid.Background");
        // Server Port
        public static By serverPort = By.id("tbServerPort");
        // Account
        public static By account = By.id("btnAccount.grid.contentPresenter.TextBlock");
        // Done
        public static By done = By.id("btnDone.grid.contentPresenter.TextBlock");

        public static void clickAdvancedButton(){
            Waiter.waiting(1);
            driver.findElement(advanced).click();
        }

        public static void activateSSL(){
            Waiter.waiting(1);
            Actions actions = new Actions(driver);
            WebElement sslSlider = driver.findElement(sslFrom);
            int xOffset = sslSlider.getLocation().getX();
            int yOffset = sslSlider.getLocation().getY();
            actions.moveByOffset(xOffset + 21, yOffset).click().build().perform();
        }

        public static void validatePort(){
            Waiter.waiting(1);
            String port = driver.findElement(serverPort).getAttribute("value");
            if (port.equals("993")){
                logger.log(Status.PASS, "Port equals '993'");
            } else {
                logger.log(Status.FAIL, "Port does not equal '993'");
            }
        }

        public static void clickAccount(){
            Waiter.waiting(1);
            driver.findElement(account).click();
        }

        public static void clickDone(){
            Waiter.waiting(1);
            driver.findElement(done).click();
        }

        public static void proceedSetSSLAndValidatePort(){
            IpadAccountPopup.clickAdvancedButton();
            IpadAccountPopup.activateSSL();
            IpadAccountPopup.validatePort();
            IpadAccountPopup.clickAccount();
            IpadAccountPopup.clickDone();
        }
}