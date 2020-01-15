package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testsuite.TS01LogEnableSSLConnectWifi;

import java.util.concurrent.TimeUnit;

import static testsuite.TS01LogEnableSSLConnectWifi.*;

public class IpadMailContactsCalendars {
    // Inventory of objects
        // Account Maggie Brown
        public static By accountMaggieBrown = By.id("lbAccounts.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.SettingsItemSubMenu.Grid.ContentPresenter.StackPanel.TextBlock");
        // Email Account
        public static By emailAccount = By.id("siAccount.Grid.tbStateText");

        public static void clickMaggieBrown(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement maggieBrownButton = driver.findElement(accountMaggieBrown);
            maggieBrownButton.click();
        }

        public static void clickGmailAccount(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement gmailButton = driver.findElement(emailAccount);
            gmailButton.click();
        }
}
