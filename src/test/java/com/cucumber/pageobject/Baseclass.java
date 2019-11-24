package com.cucumber.pageobject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.cucumber.utilities.Readconfigfile;

public class Baseclass {
	

Readconfigfile rc=new Readconfigfile();
	
	public String url=rc.getUrl();
	public String userid=rc.getUname();
	public String password=rc.getPassword();
	public static WebDriver driver;
	public static Logger log;
  // @Parameters("browser")
	@BeforeClass
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	/*if(br.equals("chrome")){
	   System.setProperty("webdriver.chrome.driver",rc.getChromepath());
		driver =new ChromeDriver();	
	}
	if(br.equals("firefox")){
	*/
		System.setProperty("webdriver.gecko.driver", rc.getFirefox());
		driver=new FirefoxDriver();
	
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	log=Logger.getLogger("banking");
	PropertyConfigurator.configure("log4j.Properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}


}


