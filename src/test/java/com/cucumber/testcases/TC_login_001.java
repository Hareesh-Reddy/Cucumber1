package com.cucumber.testcases;


import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cucumber.pageobject.Baseclass;
import com.cucumber.pageobject.Loginpage;

public class TC_login_001 extends Baseclass{
	
	
	@Test
	public void login()
	
	{
		
		log=Logger.getLogger("url is opened");
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		
		lp.setUsername(userid);
		log=Logger.getLogger("enter password");
		
		lp.setPassword(password);
		log=Logger.getLogger("click login");
		
		lp.logIn();
		log=Logger.getLogger("loginsucessfully");
		if(driver.getTitle().contains("Bank"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	

}
