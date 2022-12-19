package com.locators;

import org.openqa.selenium.By;

public final class LoginLocators {
    private static final By USERNAME= By.id("Username");
    private static final By PASSWORD=By.id("Password");
    private static final By LOGIN_BTN=By.name("login");

    public static By getUSERNAME() {
        return USERNAME;
    }

    public static By getPASSWORD() {
        return PASSWORD;
    }

    public static By getLoginBtn() {
        return LOGIN_BTN;
    }
}
