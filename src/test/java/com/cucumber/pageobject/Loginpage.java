package com.cucumber.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	@FindBy(name="uid") WebElement userid;
	@FindBy(name="password") WebElement pasword;
	@FindBy(name="btnLogin") WebElement login;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a") WebElement logout;

	public void setUsername(String uname)
	{
		userid.sendKeys(uname);
	}
	public void setPassword(String upwd)
	{
		pasword.sendKeys(upwd);
	}
	public void logIn()
	{
		login.click();
	}
	public void logOut()
	{
		logout.click();
	}
	
}
