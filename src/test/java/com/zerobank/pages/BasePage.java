package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(xpath="//*[normalize-space()='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[normalize-space()='Settings']")
    public WebElement settings;

    @FindBy(id ="searchTerm")
    public WebElement searchButton;


    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }


    public static String getPageTitle(){

        return Driver.get().getTitle();
    }
}
