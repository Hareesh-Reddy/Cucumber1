package com.cucumber.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cucumber.pageobject.Baseclass;
import com.cucumber.pageobject.CustomerCreation;
import com.cucumber.pageobject.Loginpage;

public class TC_CCreation_03 extends Baseclass{
	
	@Test
	public void newCustomercreation() throws InterruptedException
	{
		
	
	Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	
	lp.setUsername(userid);
	log=Logger.getLogger("enter password");
	
	lp.setPassword(password);
	log=Logger.getLogger("click login");
	
	lp.logIn();
	CustomerCreation cc=PageFactory.initElements(driver, CustomerCreation.class);
	cc.addCustomer();
	cc.custName("pandith");
	cc.radioButton();
	cc.doBirth("13","11","86");
	Thread.sleep(2000);
	cc.streetAdress("eeee");
	cc.cityName("HYD");
	cc.stateName("karnataka");
	cc.pinNo("333773");
	cc.phoneNumer("8888888877");
	cc.emailID("hdddd567@gmail.com");
	cc.passWord("12345");
	Thread.sleep(2000);
	cc.subMit();

	}
}

