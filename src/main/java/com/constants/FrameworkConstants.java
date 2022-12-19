package com.constants;

public final class FrameworkConstants {
    private static final int IMPLICIT_WAIT=10;
    private static final int EXPLICIT_WAIT=15;
    private static final int PAGE_LOAD_TIME=10;
    private static final int EXPLICIT_MILLI_SEC_WAIT=150;
    private static final String PROPERTY_UTILS_FILE=System.getProperty("user.dir")+"/src/main/resources/config.properties";
    private static final String LOGGER_FILE=System.getProperty("user.dir")+"/src/main/resources/log4j.properties";
    private static final String JSON_FILE=System.getProperty("user.dir")+"/src/main/resources/user.json";
    private static  final String TEST_OUTPUT="outputs/report.html";
    private static final String XLSX_FILE=System.getProperty("user.dir")+"/src/main/resources/Book1.xlsx";

    public static int getExplicitWait() {
        return EXPLICIT_WAIT;
    }

    public static int getImplicitWait() {
        return IMPLICIT_WAIT;
    }

    public static int getPageLoadTime() {
        return PAGE_LOAD_TIME;
    }

    public static int getExplicitMilliSecWait() {
        return EXPLICIT_MILLI_SEC_WAIT;
    }

    public static String getPropertyUtilsFile() {
        return PROPERTY_UTILS_FILE;
    }

    public static String getLoggerFile() {
        return LOGGER_FILE;
    }

    public static String getTestOutput() {
        return TEST_OUTPUT;
    }

    public static String getJsonFile() {
        return JSON_FILE;
    }

    public static String getXlsxFile() {
        return XLSX_FILE;
    }
}
