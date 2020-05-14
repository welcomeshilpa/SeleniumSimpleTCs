package com.training.sanity.tests;
//package com.training.sanity.tests.RetailLoginDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
  
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailAdminActionsPOM;
import com.training.utility.Driver;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import junit.framework.Assert;
import org.testng.asserts.SoftAssert;

public class RTTC_016PlaceOrder {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	

	@Test
	public void testMethod()throws IOException
	{
		RetailAdminActionsPOM.execute(driver);
		screenShot.captureScreenShot("Second");
	}
	
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
}
