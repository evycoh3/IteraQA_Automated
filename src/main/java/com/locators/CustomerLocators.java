package com.locators;

import org.openqa.selenium.By;

public final class CustomerLocators {

    private static final By NAME= By.id("Name");
    private static final By COMPANY=By.id("Company");
    private static final By ADDRESS=By.id("Address");
    private static final By CITY=By.id("City");
    private static final By PHONE=By.id("Phone");
    private static final By EMAIL=By.id("Email");
    private static final By CREATE_BTN=By.cssSelector("input[value='Create']");

    public static By getEMAIL() {
        return EMAIL;
    }

    public static By getCITY() {
        return CITY;
    }

    public static By getADDRESS() {
        return ADDRESS;
    }

    public static By getNAME() {
        return NAME;
    }

    public static By getCOMPANY() {
        return COMPANY;
    }

    public static By getCreateBtn() {
        return CREATE_BTN;
    }

    public static By getPHONE() {
        return PHONE;
    }
}
