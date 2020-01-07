package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefinitions {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    PayBillsPage payBillsPage=new PayBillsPage();
    BasePage basePage=new BasePage();
    AccountActivityNavigationStepDefinitions accountActivityNavigationStepDefinitions=new AccountActivityNavigationStepDefinitions();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
      loginPage.login("username","password");
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
    homePage.savingsButton.click();
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String title=Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Activity",title);
    }

    @Then("Account drop down should have Savings selected Scenario: Brokerage account redirect")
    public void account_drop_down_should_have_Savings_selected_Scenario_Brokerage_account_redirect() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Account drop down should have Brokerage selected Scenario: Checking account redirect")
    public void account_drop_down_should_have_Brokerage_selected_Scenario_Checking_account_redirect() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Account drop down should have Checking selected Scenario: Credit Card account redirect")
    public void account_drop_down_should_have_Checking_selected_Scenario_Credit_Card_account_redirect() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Account drop down should have Credit Card selected Scenario: Loan account redirect")
    public void account_drop_down_should_have_Credit_Card_selected_Scenario_Loan_account_redirect() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
