package com.training.sanity.tests;
//package com.training.sanity.tests.RetailLoginDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailUserLoginPOM;
import com.training.pom.ChangePasswordPOM;
import com.training.utility.Driver;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.MyAccountPOM;
import junit.framework.Assert;

import org.testng.asserts.SoftAssert;

public class RTTC_007ChangePassword {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private MyAccountPOM MyAccountPOM;
	private RetailUserLoginPOM retailUserLoginPOM;
	private ChangePasswordPOM ChangePasswordPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//RetailLoginDriver = (RetailLoginPOM) DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		retailUserLoginPOM = new RetailUserLoginPOM(driver);
		MyAccountPOM = new MyAccountPOM(driver);
		ChangePasswordPOM = new ChangePasswordPOM(driver);
		baseUrl = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void validLoginTest() throws InterruptedException
	{
		retailUserLoginPOM.userLogin();
		retailUserLoginPOM.sendUserName("shilpa24_in@yahoo.com");
		retailUserLoginPOM.sendPassword("ganesha123");
		retailUserLoginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		MyAccountPOM.changePassword();
		ChangePasswordPOM.changePassword("reveal");
		ChangePasswordPOM.confirmPassword("reveal123");
		ChangePasswordPOM.continueButtonPerform();
		ChangePasswordPOM.confirmMessageDisplay();
		screenShot.captureScreenShot("Second");
		Assert.assertEquals("Password confirmation does not match password!", ChangePasswordPOM.confirmMessageDisplay() );
	}
	
}
