package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class driverFactory {

    static AppiumDriver driver;

    public static void setDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");
        options.setUdid("9889db46435448305a");
        options.setAppPackage("trendyol.com");
        options.setNoReset(false);
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

}
