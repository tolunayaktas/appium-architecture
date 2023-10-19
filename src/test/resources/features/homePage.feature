@Trendyol
Feature: Trendyol Example Test Cases

  @GoToHomePage
  Scenario: User should go to home page successfully
  Given Start the Application
  When Choose Turkey Country
  When Choose Men option
  Then Check Whether User in Home Page

  @LoginWithWrongPassword
  Scenario: User should not login with wrong password
  Given Run the App and Go to Home Page
  When Go To Login Page
  When Fill the Email Field with "tolunayaktas@gmail.com"
  When Fill the Password Field with "invalid"
  When Click the Login Button
  Then Check the Error Message

