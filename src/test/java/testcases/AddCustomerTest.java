package testcases;

import com.enums.UserConfig;
import com.pages.CreateNewCustomerPage;
import com.pages.DashBoardPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.reports.ListenerTestNG;
import com.utils.JsonUtils;
import com.utils.XlsxUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTestNG.class)
public class AddCustomerTest extends BaseTest{
    @Test(dataProviderClass = XlsxUtils.class,dataProvider = "customersData")
    public void tc_addCustomer(String name,String company,String address,String city,String phone,String email){
        new HomePage().setNavBar("Login");
        DashBoardPage dashBoardPage=new LoginPage()
                .setUsername(JsonUtils.getValue(UserConfig.USERNAME))
                .setPassword(JsonUtils.getValue(UserConfig.PASSWORD)).clickLogin();
        CreateNewCustomerPage createNewCustomerPage=dashBoardPage.clickCreateNewCustomerBtn();
        createNewCustomerPage
                .setName(name)
                .setCompany(company)
                .setAddress(address)
                .setCity(city)
                .setPhone(phone)
                .setEmail(email)
                .clickCreate();
        Assert.assertEquals(dashBoardPage.getPageTitle(),"- Testautomation practice page");

    }
}
