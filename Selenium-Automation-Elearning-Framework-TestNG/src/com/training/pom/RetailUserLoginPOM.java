package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailUserLoginPOM {
	private WebDriver driver; 
	
	public RetailUserLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement userName; 
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void userLogin() throws InterruptedException
	{
		Actions builder = new Actions(driver);
		Action mouseOver = builder.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user-o']"))).build();
	 	mouseOver.perform();
	 	Thread.sleep(3000);
	 	Actions mouseOver1 = builder.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'LOGIN / REGISTER')]")));
	 	Thread.sleep(3000);
	 	mouseOver1.build();
	 	mouseOver1.click().perform();
		//System.out.println(+user1,+password1);		
	}
	
	public void sendPassword(String password1) {
		this.password.clear(); 
		this.password.sendKeys(password1); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
