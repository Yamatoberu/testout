package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testsuite.TS01LogEnableSSLConnectWifi;

import static testsuite.TS01LogEnableSSLConnectWifi.*;

public class IpadHomePage {
    // Inventory of Objects
       public static By settingsAppButton = By.id("wpDesktop.DesktopIcon15.Grid.gContent.imImage"); // Settings App

    public static void clickSettingsApp(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(settingsAppButton));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(settingsAppButton).click();
    }
}
