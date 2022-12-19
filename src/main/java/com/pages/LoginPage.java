package com.pages;

import com.locators.LoginLocators;

public class LoginPage extends BasePage {

    public LoginPage setUsername(String userName){
        sendKeys(LoginLocators.getUSERNAME(),userName,"Username");
        return this;
    }
    public LoginPage setPassword(String password){
        sendKeys(LoginLocators.getPASSWORD(),password,"Password");
        return this;
    }
    public DashBoardPage clickLogin(){
        click(LoginLocators.getLoginBtn(),"LoginBtn");
        return new DashBoardPage();
    }

}
