package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.WebDriverSetup.driver;

public class BasePage {
    // Inventory of Objects
        public static By done = By.id("bDone.Grid.contentPresenter.TextBlock"); // Done Button

    public static void finishLab(){
        driver.findElement(done).click();
    }
}
