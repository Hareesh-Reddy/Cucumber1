package com.cucumber.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.pageobject.Baseclass;
import com.cucumber.pageobject.Loginpage;
import com.cucumber.utilities.XLUtils;

public class TC_LoginDDT_002 extends Baseclass{
	String logindata=System.getProperty("user.dir")+"/src/test/java/com/cucumber/testdata/Data.xlsx";
	String Sheet1="Sheet1";

@Test(dataProvider="Data")
public void loginDDT(String uuid,String ppwd)

{
	
	Loginpage lp=PageFactory.initElements(driver,Loginpage.class);
    lp.setUsername(uuid);
    lp.setPassword(ppwd);
    lp.logIn();
    
    /*if(isAlertpresent()==true){
    	driver.switchTo().alert().accept();
    	driver.switchTo().defaultContent();
    	Assert.assertTrue(false);
    }
    else
    {
    	Assert.assertTrue(true);
    	lp.logOut();
    	driver.switchTo().alert().accept();
    	driver.switchTo().defaultContent();
    }*/
    
}
/*public boolean isAlertpresent()
{
	try {
		driver.switchTo().alert();
		return true;
		
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
*/

@DataProvider(name="Data")
String [][] getData() throws IOException{
	
	
	
	int rownum=XLUtils.getRowCount(logindata,"Sheet1");
	int colnum=XLUtils.getColumnCount(logindata, "Sheet1", 1);
	String[][] login=new String[rownum][colnum];
	for(int i=0;i<rownum;i++)
	{
		for(int j=0;j<colnum;j++)
		{
			login[i-1][j]=XLUtils.getStringCellData(logindata, "Sheet1",i,j);
			System.out.println("login");
			
		}
	}
	return login;
}
}