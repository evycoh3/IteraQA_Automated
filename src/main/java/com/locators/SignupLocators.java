package com.locators;

import org.openqa.selenium.By;

public final class SignupLocators {
    private static final By FIRSTNAME= By.id("FirstName");
    private static final By LASTNAME=By.id("Surname");
    private static final By EMAIL=By.id("E_post");
    private static final By MOBILE=By.id("Mobile");
    private static final By USERNAME=By.id("Username");
    private static final By PASSWORD=By.id("Password");
    private static final By CONFIRM_PASSWORD=By.id("ConfirmPassword");
    private static final By SUBMIT_BTN=By.id("submit");
    private static final By SUCCESS_SIGNUP_MSG=By.cssSelector(".label-success");

    public static By getEMAIL() {
        return EMAIL;
    }

    public static By getPASSWORD() {
        return PASSWORD;
    }

    public static By getMOBILE() {
        return MOBILE;
    }

    public static By getConfirmPassword() {
        return CONFIRM_PASSWORD;
    }

    public static By getUsername() {
        return USERNAME;
    }

    public static By getFirstname() {
        return FIRSTNAME;
    }

    public static By getSuccessSignupMsg() {
        return SUCCESS_SIGNUP_MSG;
    }

    public static By getLastname() {
        return LASTNAME;
    }

    public static By getSubmitBtn() {
        return SUBMIT_BTN;
    }

}
