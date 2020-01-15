package components;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static testsuite.TS01LogEnableSSLConnectWifi.*;

public class LabReportPopup {
    // Inventory of objects
        public static By yourScore = By.xpath("//div[@id='reportDiv']/div/div/div[2]"); // Your score
        public static By done = By.id("btDone.Grid.contentPresenter.TextBlock"); // Done
        public static By iframe = By.id("_ifrmreport_");
        public static String parentWindow;

    public static void validateScore(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parentWindow = driver.getWindowHandle();
        driver.switchTo().frame(driver.findElement(iframe));
        WebElement score = driver.findElement(yourScore);
        String scoreText = score.getText();
        if (scoreText.contains("100%")){
            logger.log(Status.PASS, "Lab completion at 100%");
        } else {
            logger.log(Status.FAIL, "Lab completion not 100%");
        }
    }

    public static void clickDone(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().window(parentWindow);
        WebElement doneButton = driver.findElement(done);
        doneButton.click();
    }
}
