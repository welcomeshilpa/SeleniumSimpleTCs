package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RetailDeleteObjectsPOM {
	
	public static WebElement element;
		
	public static WebElement adminID(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-username']"));
		return element;
	}
	
	public static WebElement adminPwd(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-password']"));
		return element;
	}
	
	public static WebElement loginbutton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/div[3]/button"));
		return element;
	}
	
	
	public static WebElement menuSale(WebDriver driver) throws InterruptedException
	{
		Actions actions = new Actions(driver);
		WebElement salemenu = driver.findElement(By.xpath("//*[@id='menu-sale']/a/i"));
		actions.moveToElement(salemenu).build().perform();
		WebElement orderbtn = driver.findElement(By.xpath("/html/body/div/nav/ul/li[6]/ul/li[1]/a"));
		actions.moveToElement(orderbtn).build().perform();
		orderbtn.click();
		Thread.sleep(3000);
		return element;
	}
	
	public static WebElement addItem(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a/i"));
		return element;
	}
	
	public static WebElement addFname(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-firstname']"));
		return element;
	}
	
	public static WebElement addLname(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-lastname']"));
		return element;
	}
	
	public static WebElement addEmail(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-email']"));
		return element;
	}
	
	public static WebElement addTelephone(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-telephone']"));
		return element;
	}
	
	public static WebElement addOrderID(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-order-id']"));
		return element;
	}
	
	public static WebElement clickFilter(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='button-filter']"));
		return element;
	}
	
	
	public static WebElement checkOrder(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='form-order']/div/table/tbody/tr/td[2]"));
		return element;
	}
	
	public static WebElement addCustomer(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='input-customer']"));
		return element;
	}

	
	public static WebElement checkCustomerName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='form-order']/div/table/tbody/tr/td[3]"));
		return element;
	}
	
	public static WebElement selectCheckbox(WebDriver driver)
	{
	if(!driver.findElement(By.xpath("//*[@id=\"form-order\"]/div/table/tbody/tr/td[1]/input[1]")).isSelected())
	{
		element = driver.findElement(By.xpath("//*[@id=\"form-order\"]/div/table/tbody/tr/td[1]/input[1]"));
	}
		return element;
	}
	
	//*[@id="button-delete"]
	
	public static WebElement deleteBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"button-delete\"]"));
		return element;
	}
	
	public static void alertbutton(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
}
