package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage extends BasePage {

    @FindBy(id = "sp_amount")
    public WebElement payAmount;

    @FindBy(id="sp_date")
    public WebElement payDate;

    @FindBy(id="sp_description")
    public WebElement payDescription;

    @FindBy(css = "[value='Pay']")
    public WebElement payButton;

    public PayBillsPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void payBill(int payingAmount,String payingDate,String payingDescription){

        String realPayingAmount=""+payingAmount;
        if(payingAmount==0 ||realPayingAmount.equals(null) || payingDate.equals(null) ){
            System.out.println("Please fill out this field message!");
        }
        else {
            payAmount.sendKeys(realPayingAmount);
            payDate.sendKeys(payingDate);
            payDescription.sendKeys(payingDescription);

            System.out.println("The payment was succefsully submitted");
        }
    }
    public static String getPageTitle(){
        return Driver.get().getTitle();
    }

}
