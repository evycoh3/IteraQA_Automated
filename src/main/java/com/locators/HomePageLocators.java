package com.locators;

public final  class HomePageLocators {
    private static final String NAVBAR="//ul[@class='navbar-nav mr-auto']//a[text()='%value%']";

    public static String getNavBAR() {
        return NAVBAR;
    }
}
