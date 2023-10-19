package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class homePage {

    AppiumDriver driver;
    elementHelper elementHelper;

    By logo = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    By icon = AppiumBy.className("//XCUIElementTypeOther[@name=\"Username Password LOGIN\"]/XCUIElementTypeOther[6]/XCUIElementTypeImage");
    By men = AppiumBy.id("trendyol.com:id/buttonSelectGenderMan");
    By closePopUp = AppiumBy.id("trendyol.com:id/imageButtonClose");
    By tipTitle = AppiumBy.id("trendyol.com:id/textViewTooltipTitle");
    By tipTitleClose = AppiumBy.id("trendyol.com:id/imageViewTooltipClose");
    By favourites = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Favorilerim\"]/android.widget.ImageView");
    By myAccount = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Hesabım\"]/android.view.ViewGroup/android.widget.TextView");
    By noneOfTheAbove = AppiumBy.id("com.google.android.gms:id/cancel");
    By emailField = AppiumBy.id("trendyol.com:id/editTextEmail");
    By passwordField = AppiumBy.id("trendyol.com:id/editTextPassword");
    By loginBtn = AppiumBy.id("trendyol.com:id/buttonLogin");
    By wrongCredentialMsg = AppiumBy.id("trendyol.com:id/snackbar_text");


    public homePage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }

    public void checkLoginPage() {
        elementHelper.click(logo);
    }
    public void chooseTurkeyCountry(){
        elementHelper.click(logo);
    }
    public void chooseMen(){
        elementHelper.click(men);
        elementHelper.click(closePopUp);
    }
    public void checkHomePage(){
        elementHelper.click1stIf2ndExists(tipTitle,tipTitleClose);
        elementHelper.checkElement(favourites);

    }
    public void goToLoginPage(){
        elementHelper.click(myAccount);
        elementHelper.click1stIf2ndExists(noneOfTheAbove,noneOfTheAbove);
    }
    public void fillEmailField(String emailText){
        elementHelper.sendKeys(emailField,emailText);
    }
    public void fillPasswordField(String passwordText){
        elementHelper.sendKeys(passwordField,passwordText);
    }
    public void clickLoginBtn(){
        elementHelper.click(loginBtn);
    }
    public void checkTheWrongCredentialMessage(){
        elementHelper.checkElement(wrongCredentialMsg);
    }
    public void checkIcon() {
        elementHelper.checkElement(icon);
    }
}
