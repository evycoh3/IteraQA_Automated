package com.pages;

import com.locators.SignupLocators;

public class SignupPage extends BasePage {

    public SignupPage setFirstname(String firstname){
        sendKeys(SignupLocators.getFirstname(),firstname,"Firstname");
        return this;
    }
    public SignupPage setLastname(String lastname){
        sendKeys(SignupLocators.getLastname(),lastname,"Lastname");
        return this;
    }
    public SignupPage setEmail(String email){
        sendKeys(SignupLocators.getEMAIL(),email,"Email");
        return this;
    }
    public SignupPage setMobile(String mobile){
        sendKeys(SignupLocators.getMOBILE(),mobile,"Mobile");
        return this;
    }
    public SignupPage setUsername(String username){
        sendKeys(SignupLocators.getUsername(),username,"Username");
        return this;
    }
    public SignupPage setPassword(String password){
        sendKeys(SignupLocators.getPASSWORD(),password,"Password");
        return this;
    }
    public SignupPage setConfirmPassword(String confirmPassword){
        sendKeys(SignupLocators.getConfirmPassword(),confirmPassword,"ConfirmPassword");
        return this;
    }
    public SignupPage clickSubmit(){
        click(SignupLocators.getSubmitBtn(),"SubmitBtn");
        return this;
    }
    public String getSiteResponseMessage(){
        return getText(SignupLocators.getSuccessSignupMsg(),"Signup Message");
    }
}
