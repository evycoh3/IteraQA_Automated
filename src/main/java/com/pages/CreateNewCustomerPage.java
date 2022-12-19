package com.pages;

import com.locators.CustomerLocators;

public class CreateNewCustomerPage extends BasePage{

    public CreateNewCustomerPage setName(String name){
        sendKeys(CustomerLocators.getNAME(),name,"name");
        return this;
    }
    public CreateNewCustomerPage setCompany(String company){
        sendKeys(CustomerLocators.getCOMPANY(),company,"company");
        return this;
    }
    public CreateNewCustomerPage setAddress(String address){
        sendKeys(CustomerLocators.getADDRESS(),address,"address");
        return this;
    }
    public CreateNewCustomerPage setCity(String city){
        sendKeys(CustomerLocators.getCITY(),city,"city");
        return this;
    }
    public CreateNewCustomerPage setPhone(String phone){
        sendKeys(CustomerLocators.getPHONE(),phone,"phone");
        return this;
    }
    public CreateNewCustomerPage setEmail(String email){
        sendKeys(CustomerLocators.getEMAIL(),email,"email");
        return this;
    }
    public DashBoardPage clickCreate(){
        click(CustomerLocators.getCreateBtn(),"create ");
        return new DashBoardPage();
    }

}
