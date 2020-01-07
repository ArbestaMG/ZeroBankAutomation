package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    LoginPage loginPage=new LoginPage();
    BasePage basePage=new BasePage();


    @FindBy(xpath = "//h2[1]")
    public WebElement cashAccountsTable;

    @FindBy(xpath = "//h2[2]")
    public WebElement investmentAccountsTable;

    @FindBy(xpath = "//h2[3]")
    public WebElement creditAccountsTable;

    @FindBy(xpath = "//h2[4]")
    public WebElement loanAccountsTable;

    @FindBy(xpath = "//div[3]//table/thead/tr/th[1]")
    public WebElement creditAccountsTableAccount;

    @FindBy(xpath = "//div[3]//table/thead/tr/th[2]")
    public WebElement getCreditAccountsTableCreditCard;

    @FindBy(xpath = "//div[3]//table/thead/tr/th[3]")
    public WebElement getCreditAccountsTableBalance;

    @FindBy(xpath = "//a[@href='/bank/redirect.html?url=pay-bills.html']")
    public WebElement payBillsFunctionality;

    @FindBy(css = "href=/bank/account-activity.html?accountId=1'")
    public WebElement savingsButton;

    public HomePage() {

        PageFactory.initElements(Driver.get(), this);
    }
    public static String getPageTitle(){
        return Driver.get().getTitle();
    }
    public void verifyPageElements(){
        cashAccountsTable.isDisplayed();
        investmentAccountsTable.isDisplayed();
        creditAccountsTable.isDisplayed();
        loanAccountsTable.isDisplayed();
        creditAccountsTableAccount.isDisplayed();
        getCreditAccountsTableCreditCard.isDisplayed();
        getCreditAccountsTableBalance.isDisplayed();

    }

}
