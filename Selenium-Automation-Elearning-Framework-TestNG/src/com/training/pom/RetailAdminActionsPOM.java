package com.training.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RetailAdminActionsPOM {

		public static void execute(WebDriver driver) throws IOException {
		// Verify Registration Button exist in the Web Page
		try {

			RetailPageObjectsPOM.adminID(driver).sendKeys("admin");
			RetailPageObjectsPOM.adminPwd(driver).sendKeys("admin@123");
			RetailPageObjectsPOM.loginbutton(driver).click();
			RetailPageObjectsPOM.menuSale(driver);
			Thread.sleep(2000);
			
			RetailPageObjectsPOM.addOrderID(driver).sendKeys("325");
			RetailPageObjectsPOM.clickFilter(driver).click();
			String orderid = RetailPageObjectsPOM.checkOrder(driver).getText();
			System.out.println("The value of order ID :" + orderid);
			
			if(orderid!=null)
			{
				Assert.assertEquals("325", orderid);	
				System.out.println("The order is successfully matched");
			}
			else
			{
				System.out.println("The search order id is not present");
				
			}
			
			RetailPageObjectsPOM.addCustomer(driver).sendKeys("reva");
			RetailPageObjectsPOM.clickFilter(driver).click();
			String customername = RetailPageObjectsPOM.checkCustomerName(driver).getText();
			System.out.println("The value of Customer Name: " + customername);
			
			if(customername!=null)
			{
				Assert.assertEquals("reva sharma", customername);	
				System.out.println("The Cusomer name is successfully matched");
			}
			else
			{
				System.out.println("The Customer Name id is not present");
				
			}
			
			} catch (Exception e) 
		      {
				System.out.println("Test Message");
		       }
		
				/*
				 * RetailPageObjectsPOM.deleteCustomerName(driver).sendKeys("reva");
				 * RetailPageObjectsPOM.clickFilter(driver).click(); public void deletefn() {
				 * this.deleteitem.click(); }
				 */
		}
			
	}

