package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testsuite.TS01LogEnableSSLConnectWifi;

import java.util.concurrent.TimeUnit;

import static testsuite.TS01LogEnableSSLConnectWifi.logger;
import static testsuite.TS01LogEnableSSLConnectWifi.driver;

public class IpadSettings {
    // Inventory of objects
       public static By mailContactsCalendars = By.id("siMailContactsCalendars.Grid.tbText"); // Mail Contacts and Calendars
       public static By wifi = By.id("rectClickArea"); // Wifi

    public static void goToMailContactCalendars(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement mailContactCalButton = driver.findElement(mailContactsCalendars);
        mailContactCalButton.click();
    }

    public static void goToWifi(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement wifiButton = driver.findElement(wifi);
        wifiButton.click();
    }
}
