package com.genericfile.demoqa;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BsCls {

   public  WebDriver driver;
   public FileLib f = new FileLib();
   
	@BeforeClass()
	public void OpenBrowser() {
		
		driver= new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass()
	public void CloseBrower() {
		
		driver.close();
		
	}
	
	@BeforeMethod()
	public void LoginApp() throws IOException {
		
		String urls = f.PropertyFile("url");
		driver.get(urls);
		
	}
	
	@AfterMethod()
	public void LogoutApp() {
		
		
	}
}

