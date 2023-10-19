package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class elementHelper {

    AppiumDriver driver;
    WebDriverWait wait;


    public elementHelper(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
    }

    public WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

    public void checkElement(By by) {
        Assert.assertTrue(findElement(by).isDisplayed());
    }

    public void click(By by) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By by, String text) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public List<WebElement> findElements(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    public void click1stIf2ndExists(By firstElement, By secondElement){
        try {
            List<WebElement> firstElementList = findElements(firstElement);
            if (!firstElementList.isEmpty()) {
                click(secondElement);
            }
        } catch (Exception e) {
            // It does nothing when pop-up could not be found.
        }

    }


}
