package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Waiter;

import static utilities.WebDriverSetup.driver;

public class IpadSettings {
    // Inventory of objects
    public static By mailContactsCalendars = By.id("siMailContactsCalendars.Grid.tbText"); // Mail Contacts and Calendars
    public static By wifi = By.id("rectClickArea"); // Wifi
    public static By emailAccount = By.id("siAccount.Grid.tbStateText");
    public static By accountMaggieBrown = By.id("lbAccounts.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.SettingsItemSubMenu.Grid.ContentPresenter.StackPanel.TextBlock");

    public static void goToMailContactCalendars() {
        Waiter.waiting(1);
        driver.findElement(mailContactsCalendars).click();
    }

    public static void goToWifi() {
        Waiter.waiting(1);
        driver.findElement(wifi).click();
    }

    public static void clickMaggieBrown(){
        Waiter.waiting(1);
        driver.findElement(accountMaggieBrown).click();
    }

    public static void clickGmailAccount(){
        Waiter.waiting(1);
        driver.findElement(emailAccount).click();
    }
}
