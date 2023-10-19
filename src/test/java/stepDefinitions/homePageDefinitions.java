package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import utils.driverFactory;

public class homePageDefinitions {

    homePage login = new homePage(driverFactory.getDriver());

    @Given("user is on the Login Page")
    public void userIsOnTheLoginPage() {
        login.checkLoginPage();
    }
    @Then("should see Icon on Login Page")
    public void shouldSeeIconOnLoginPage() {
        login.checkIcon();
    }
    @Given("Start the Application")
    public void startTheApplication() {
        //It starts automatically by the hooks
    }
    @When("Choose Turkey Country")
    public void chooseTurkeyCountry() {
        login.chooseTurkeyCountry();
    }
    @When("Choose Men option")
    public void chooseMenOption() {
        login.chooseMen();
    }
    @Then("Check Whether User in Home Page")
    public void checkWhetherUserInHomePage() {
        login.checkHomePage();
    }
    @When("Go To Login Page")
    public void goToLoginPage() {
        login.goToLoginPage();
    }
    @When("Fill the Email Field with {string}")
    public void fillTheEmailFieldWith(String email) {
        login.fillEmailField(email);
    }
    @When("Fill the Password Field with {string}")
    public void fillThePasswordFieldWith(String password) {
        login.fillPasswordField(password);
    }
    @When("Click the Login Button")
    public void clickTheLoginButton() {
        login.clickLoginBtn();
    }
    @Then("Check the Error Message")
    public void checkTheErrorMessage() {
        login.checkTheWrongCredentialMessage();
    }
    @Given("Run the App and Go to Home Page")
    public void runTheAppAndGoToHomePage() {
        login.chooseTurkeyCountry();
        login.chooseMen();
        login.checkHomePage();
    }
}
