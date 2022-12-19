package com.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
    private ExtentTestManager(){

    }
    private static ExtentTest test;

    protected static void setExtentTest(ExtentTest extentTest){
        test=extentTest;
    }
    protected static ExtentTest getExtentTest(){
        return test;
    }
}
