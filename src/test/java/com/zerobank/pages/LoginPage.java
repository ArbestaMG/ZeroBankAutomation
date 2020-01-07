package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user_login")
    public WebElement userName;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@href='/forgot-password.html']")
    public WebElement forgotYourPasswordButton;

    @FindBy(css = "[class='alert alert-error']")
    public WebElement warningMessage;


    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }
    public static String getPageTitle(){
        return Driver.get().getTitle();
    }
    public void login(String userNameCre, String passwordCre){
        userName.sendKeys(userNameCre);
        //Keys.ENTER to replace login click
        password.sendKeys(passwordCre, Keys.ENTER);
    }
}
