package com.pages;

import com.locators.HomePageLocators;
import com.utils.DynamicXpathUtils;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public HomePage setNavBar(String menu){
       String value=DynamicXpathUtils.getXpath(HomePageLocators.getNavBAR(),menu);
       click(By.xpath(value),menu+" Link");
       return this;
    }
}
