package com.zerobank.step_definitions;


import com.zerobank.pages.BeforeLoginPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefinitions  {
    LoginPage loginPage=new LoginPage();
    BeforeLoginPage beforeLoginPage=new BeforeLoginPage();
    HomePage homePage=new HomePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on homepage");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        beforeLoginPage.clickSignInButton();
    }

    @Then("user logs in as valid credentials")
    public void user_logs_in_as_valid_credentials() {
        System.out.println("Entering valid credentials");

        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }

    @Then("Account Summary should be displayed")
    public void account_Summary_should_be_displayed() {
        System.out.println("Test final step");
    }



    @Then("user logs in as invalid credentials")
    public void user_logs_in_as_invalid_credentials() {
        System.out.println("Entering INVALID credentials");

        String userName = ConfigurationReader.getProperty("password");
        String password = ConfigurationReader.getProperty("username");
        loginPage.login(userName, password);
    }

    @Then("user see error message")
    public void user_see_error_message() {
    loginPage.warningMessage.isDisplayed();
    }


    @Then("page elements should be displayed")
    public void page_elements_should_be_displayed() {
     homePage.verifyPageElements();
    }


}
