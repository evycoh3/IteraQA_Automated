package com.reports;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {

    @Override
    public void onStart(ITestContext context){
        ExtentReportsManager.initReport();
    }
    @Override
    public void onTestStart(ITestResult result){
        ExtentReportsManager.createTest(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        ExtentLogger.setPass(result.getMethod().getMethodName()+" Pass",true);
    }
    @Override
    public void onTestSkipped(ITestResult result){
        ExtentLogger.setSkip(result.getMethod().getMethodName()+"Skipped",true);
      ;
    }
    @Override
    public void onTestFailure(ITestResult result){
        ExtentLogger.setFail(result.getMethod().getMethodName()+"Failed",true);
    }
    @Override
    public void onFinish(ITestContext context){
        ExtentReportsManager.flushReport();
    }


}
