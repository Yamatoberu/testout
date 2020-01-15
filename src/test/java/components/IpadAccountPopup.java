package components;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testsuite.TS01LogEnableSSLConnectWifi;

import java.util.concurrent.TimeUnit;

import static testsuite.TS01LogEnableSSLConnectWifi.logger;
import static testsuite.TS01LogEnableSSLConnectWifi.driver;

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
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement advancedButton = driver.findElement(advanced);
            advancedButton.click();
        }

        public static void activateSSL(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Actions actions = new Actions(TS01LogEnableSSLConnectWifi.driver);
            WebElement sslSlider = driver.findElement(sslFrom);
            int xOffset = sslSlider.getLocation().getX();
            int yOffset = sslSlider.getLocation().getY();
            actions.moveByOffset(xOffset + 21, yOffset).click().build().perform();
        }

        public static void validatePort(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement serverPortTextBox = driver.findElement(serverPort);
            String port = serverPortTextBox.getAttribute("value");
            if (port.equals("993")){
                logger.log(Status.PASS, "Port equals '993'");
            } else {
                logger.log(Status.FAIL, "Port does not equal '993'");
            }
        }

        public static void clickAccount(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement accountButton = driver.findElement(account);
            accountButton.click();
        }

        public static void clickDone(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement doneButton = driver.findElement(done);
            doneButton.click();
        }
}