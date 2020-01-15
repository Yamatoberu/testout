package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static testsuite.TS01LogEnableSSLConnectWifi.driver;
import static testsuite.TS01LogEnableSSLConnectWifi.prop;

public class IpadWifi {
    // Inventory of objects
        public static By corpnetNetwork = By.id("SettingsItemNetwork.Grid.tbText"); // Corpnet Network
        public static By password = By.id("psbx"); // Password textbox
        public static By join = By.id("btnJoin.grid.contentPresenter.TextBlock"); // Join button

    public static void connectToCorpnetNetwork(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement network = driver.findElement(corpnetNetwork);
        network.click();

        WebElement passwordInput = driver.findElement(password);
        passwordInput.clear();
        passwordInput.sendKeys(prop.getProperty("wifi.password"));

        WebElement joinButton = driver.findElement(join);
        joinButton.click();
    }
}
