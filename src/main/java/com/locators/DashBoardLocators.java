package com.locators;

import org.openqa.selenium.By;

public final  class DashBoardLocators {
    private static final By WELCOME_MSG= By.cssSelector("div>h3");
    private static final By CREATE_NEW_CUSTOMER=By.cssSelector("a.btn-primary");

    public static By getWelcomeMsg() {
        return WELCOME_MSG;
    }

    public static By getCreateNewCustomer() {
        return CREATE_NEW_CUSTOMER;
    }
}
