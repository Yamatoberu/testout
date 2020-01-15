package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static testsuite.TS01LogEnableSSLConnectWifi.driver;

public class BasePage {
    // Inventory of Objects
        public static By done = By.id("bDone.Grid.contentPresenter.TextBlock"); // Done Button

    public static void finishLab(){
        WebElement doneButton = driver.findElement(done);
        doneButton.click();
    }
}
