package com.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.constants.FrameworkConstants;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ExtentReportsManager {
    private ExtentReportsManager(){

    }
    private static ExtentReports extent=null;

    protected static void initReport() {
        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getTestOutput());
            spark.config().setDocumentTitle("Guru99");
            spark.config().setReportName("Guru99 Report");
            spark.config().setTheme(Theme.DARK);
            extent.attachReporter(spark);
        }
    }
        protected static void flushReport(){
            if(Objects.nonNull(extent)){
                extent.flush();
                try{
                    Desktop.getDesktop().browse(new File(FrameworkConstants.getTestOutput()).toURI());
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }

    protected static void createTest(String testName){
        ExtentTest test=extent.createTest(testName);
        ExtentTestManager.setExtentTest(test);
    }
}
