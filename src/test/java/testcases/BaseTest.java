package testcases;

import com.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup(){
        DriverManager.setup();
    }
    @AfterMethod
    public void tearDown(){
        DriverManager.unloadDriver();
    }
}
