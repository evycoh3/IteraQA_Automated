package com.pages;

import com.locators.DashBoardLocators;

public class DashBoardPage extends BasePage {

    public String getAppWelcomeMsg(){
        return getText(DashBoardLocators.getWelcomeMsg(),"Welcome message");
    }
    public CreateNewCustomerPage clickCreateNewCustomerBtn(){
        click(DashBoardLocators.getCreateNewCustomer(),"create new customer btn");
        return new CreateNewCustomerPage();
    }
    public String getPageTitle(){
        return getTitle();
    }
}
