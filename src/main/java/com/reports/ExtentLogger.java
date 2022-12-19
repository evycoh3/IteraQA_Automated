package com.reports;


import com.aventstack.extentreports.MediaEntityBuilder;
import com.utils.ScreenshotUtils;



public class ExtentLogger {
    public static void setSkip(String message){
        ExtentTestManager.getExtentTest().skip(message);
    }
    public static void setPass(String message){
        ExtentTestManager.getExtentTest().pass(message);
    }
    public static void setFail(String message){
        ExtentTestManager.getExtentTest().fail(message);
    }
    public static void setSkip(String message,boolean isScreenshotNeeded){
        ExtentTestManager.getExtentTest().skip(message);
        if(isScreenshotNeeded) {
            ExtentTestManager.getExtentTest().skip(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.get64BaseImg()).build());
        }
    }
    public static void setPass(String message,boolean isScreenshotNeeded){
        ExtentTestManager.getExtentTest().pass(message);
        if(isScreenshotNeeded){
            ExtentTestManager.getExtentTest().pass(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.get64BaseImg()).build());
        }
    }
    public static void setFail(String message,boolean isScreenshotNeeded){
        ExtentTestManager.getExtentTest().fail(message);
        if(isScreenshotNeeded){
            ExtentTestManager.getExtentTest().fail(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.get64BaseImg()).build());
        }
    }
}
