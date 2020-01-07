package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeforeLoginPage extends BasePage{

    @FindBy(id="signin_button")
    public WebElement signInButton;

    public static String getPageTitle(){
        return Driver.get().getTitle();
    }

    public void clickSignInButton(){
        signInButton.click();}

        public BeforeLoginPage() {

            PageFactory.initElements(Driver.get(), this);
        }


}
