package testcases;

import com.enums.UserConfig;
import com.pages.HomePage;
import com.pages.SignupPage;
import com.reports.ListenerTestNG;
import com.utils.JsonUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTestNG.class)
public class SignupTest extends BaseTest{

    @Test
    public void tc_signup(){
        new HomePage().setNavBar("Sign Up");
       String value= new SignupPage()
                .setFirstname(JsonUtils.getValue(UserConfig.FIRSTNAME))
                .setLastname(JsonUtils.getValue(UserConfig.LASTNAME))
                .setEmail(JsonUtils.getValue(UserConfig.EMAIL))
                .setMobile(JsonUtils.getValue(UserConfig.MOBILE))
                .setUsername(JsonUtils.getValue(UserConfig.USERNAME))
                .setPassword(JsonUtils.getValue(UserConfig.PASSWORD))
                .setConfirmPassword(JsonUtils.getValue(UserConfig.CONFIRM_PASSWORD))
                .clickSubmit()
                .getSiteResponseMessage();
        Assert.assertEquals(value,"Registration Successful");

    }
}
