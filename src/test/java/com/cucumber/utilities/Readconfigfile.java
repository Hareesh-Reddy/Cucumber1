package com.cucumber.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readconfigfile {
	
	Properties pro;
	public Readconfigfile(){
		
		try{
			
		
		File src=new File("./config/config.properties");
		FileReader fr=new FileReader(src);
		pro=new Properties();
		pro.load(fr);
		}
		catch(Exception e)
		{
			System.out.println("get message"+e.getMessage());
		}

}
	public String getUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	public String getUname()
	{
		String uname=pro.getProperty("userid");
		return uname;
	}
	public String getPassword()
	{
		String pword=pro.getProperty("password");
		return pword;
		
	}
	public String getChromepath()
	{
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getFirefox()
	{
		String firefox=pro.getProperty("firefox");
		return firefox;
	}
	
}