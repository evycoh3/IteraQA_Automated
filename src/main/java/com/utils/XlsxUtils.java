package com.utils;

import com.constants.FrameworkConstants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class XlsxUtils {
    private static Object[][] getExcelData(String sheetName) {
        Object[][] data;
        try {
            FileInputStream fis = new FileInputStream(FrameworkConstants.getXlsxFile());
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(0).getLastCellNum();
            data = new Object[rows][cols];
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < cols; j++) {
                    data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    @DataProvider(name = "customersData")
    public Object[][] getCustomersData() {
        Object[][] data = getExcelData("customers");
        return data;
    }


}


