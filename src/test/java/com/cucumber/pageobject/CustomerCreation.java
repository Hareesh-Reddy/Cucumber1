package com.cucumber.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerCreation {
	
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a") WebElement addnewcustomer;
	@FindBy(name="name") WebElement name;
	@FindBy(name="rad1") WebElement Radio;
	@FindBy(id="dob") WebElement dob;
	@FindBy(name="addr") WebElement addr;
	@FindBy(name="city") WebElement city;
	@FindBy(name="state") WebElement state;
	@FindBy(name="pinno") WebElement pin;
	@FindBy(name="telephoneno") WebElement tph;
	@FindBy(name="emailid") WebElement email;
	@FindBy(name="password") WebElement password;
	@FindBy(name="sub") WebElement submit;
	
	
	public void addCustomer()
	{
		addnewcustomer.click();
	}
	public void custName(String Cname)
	{
		name.sendKeys(Cname);
	}
	public void radioButton()
	{
		Radio.click();
	}
	public void doBirth(String dd,String mm,String yy )
	{
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yy);
	}
	public void streetAdress(String sname){
		addr.sendKeys(sname);
	}
	public void cityName(String cname){
		city.sendKeys(cname);	
	}
	public void stateName(String statename){
		state.sendKeys(statename);
	}
	public void pinNo(String pinno){
		pin.sendKeys(String.valueOf(pinno));
	}
	public void phoneNumer(String phno)
	{
	tph.sendKeys(String.valueOf(phno));	
	}
	public void emailID(String emailid){
		email.sendKeys(emailid);
	}
	public void passWord(String pword){
		password.sendKeys(pword);
	}
	public void subMit(){
	submit.click();
	}
	}

