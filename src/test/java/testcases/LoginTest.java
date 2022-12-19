package testcases;

import com.enums.UserConfig;
import com.pages.DashBoardPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.reports.ListenerTestNG;
import com.utils.JsonUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTestNG.class)
public class LoginTest extends BaseTest{

    @Test
    public void tc_login(){
        new HomePage().setNavBar("Login");
        DashBoardPage dashBoardPage =new LoginPage()
                .setUsername(JsonUtils.getValue(UserConfig.USERNAME))
                .setPassword(JsonUtils.getValue(UserConfig.PASSWORD))
                .clickLogin();
        Assert.assertEquals(dashBoardPage.getAppWelcomeMsg(),"Welcome "+JsonUtils.getValue(UserConfig.USERNAME));
    }
}
