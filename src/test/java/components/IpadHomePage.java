package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Waiter;

import static utilities.WebDriverSetup.driver;

import static testsuite.TS01LogEnableSSLConnectWifi.*;

public class IpadHomePage {
    // Inventory of Objects
       public static By settingsAppButton = By.id("wpDesktop.DesktopIcon15.Grid.gContent.imImage"); // Settings App

    public static void clickSettingsApp(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(settingsAppButton));
        Waiter.waiting(1);
        driver.findElement(settingsAppButton).click();
    }
}
