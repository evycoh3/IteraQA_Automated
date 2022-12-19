package com.pages;

import com.driver.DriverManager;
import com.enums.WaitStrategy;
import com.factories.ExplicitWaitFactory;
import com.logger.MyLogger;
import com.reports.ExtentLogger;
import org.openqa.selenium.By;

public class BasePage {

    protected String getTitle(){
        String title=null;
       try{
           title=DriverManager.getDriver().getTitle();
           String msg="Page Title: "+title;
           MyLogger.setInfo(getClass(),msg);
           ExtentLogger.setPass(msg);
       }catch (Exception e){
           e.printStackTrace();
           String msg="Failed to locate Page Title";
           MyLogger.setFail(getClass(),msg);
           ExtentLogger.setFail(msg);
       }return title;
    }

    protected void sendKeys(By by, String keys, String fieldName){
        try{
            ExplicitWaitFactory.performExplicit(by, WaitStrategy.PRESENCE).sendKeys(keys);
            String msg="Send keys to "+fieldName+" inputBox "+":"+keys;
            MyLogger.setInfo(getClass(),msg);
            ExtentLogger.setPass(msg);
        }catch (Exception e){
            e.printStackTrace();
            String msg="Send Keys to "+fieldName+ "inputBox failed";
            MyLogger.setFail(getClass(),msg);
            ExtentLogger.setFail(msg);
        }
    }
    protected void click(By by,String fieldName) {
        try {
            ExplicitWaitFactory.performExplicit(by, WaitStrategy.CLICKABLE).click();
            String msg="Clicked on "+fieldName;
            MyLogger.setInfo(getClass(),msg);
            ExtentLogger.setPass(msg);
        } catch (Exception e) {
            e.printStackTrace();
            String msg="Failed to click on "+ fieldName;
            MyLogger.setFail(getClass(),msg);
            ExtentLogger.setFail(msg);
        }
    }
    protected String getText(By by,String fieldName){
        String value=null;
        try{
            value=ExplicitWaitFactory.performExplicit(by,WaitStrategy.VISIBLE).getText();
            String msg=fieldName+" text value:  "+value;
            MyLogger.setInfo(getClass(),msg);
            ExtentLogger.setPass(msg);

        }catch (Exception e){
            e.printStackTrace();
            String msg="Failed to return text from "+fieldName;
            MyLogger.setFail(getClass(),msg);
            ExtentLogger.setFail(msg);
        }return value;
    }
}
