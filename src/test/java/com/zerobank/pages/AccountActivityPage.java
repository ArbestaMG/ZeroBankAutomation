package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage  extends  BasePage{

    @FindBy(css = "[value='1']")
    public WebElement savingsAccountType;

    public AccountActivityPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    public static String getPageTitle(){
        return Driver.get().getTitle();
    }
}
