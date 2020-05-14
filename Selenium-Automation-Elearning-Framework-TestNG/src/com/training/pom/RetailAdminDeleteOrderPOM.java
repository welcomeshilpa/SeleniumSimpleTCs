package com.training.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class RetailAdminDeleteOrderPOM {

	// public static int country_count;
	// public static String country_text;

	public static void execute(WebDriver driver) throws IOException {
		// Verify Registration Button exist in the Web Page
		try {

			RetailDeleteObjectsPOM.adminID(driver).sendKeys("admin");
			RetailDeleteObjectsPOM.adminPwd(driver).sendKeys("admin@123");
			RetailDeleteObjectsPOM.loginbutton(driver).click();
			RetailDeleteObjectsPOM.menuSale(driver);
			Thread.sleep(2000);
			
			RetailDeleteObjectsPOM.addOrderID(driver).sendKeys("284");
			RetailDeleteObjectsPOM.clickFilter(driver).click();
			RetailDeleteObjectsPOM.selectCheckbox(driver).click();
			RetailDeleteObjectsPOM.deleteBtn(driver).click();
			RetailDeleteObjectsPOM.alertbutton(driver);
			
			
			
		} catch (Exception e) {
			
			System.out.println("Test Message");

		}
	}
}
