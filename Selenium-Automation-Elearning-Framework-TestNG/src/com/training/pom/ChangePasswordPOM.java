package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPOM {
	private WebDriver driver; 
	
	public ChangePasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	
	private WebElement changePwd; 
		
@FindBy(xpath="//input[@id='input-confirm']")
	
	private WebElement confirmPwd; 

@FindBy(xpath="//input[@class='btn btn-primary']")
private WebElement continueBtn; 

@FindBy(xpath="//div[@class='text-danger']")
private WebElement messageDisplay; 

	public void changePassword(String changePwd) {
		this.changePwd.clear();
		this.changePwd.sendKeys(changePwd);
		
	}
	
	public void confirmPassword(String confPwd) {
		this.confirmPwd.clear();
		this.confirmPwd.sendKeys(confPwd);
		
	}
	
	public void continueButtonPerform() {
		this.continueBtn.click();
	}
	
	public String confirmMessageDisplay() {
	 String str=this.messageDisplay.getText();
	 System.out.println("Error Message is: "+str);
	 return str;
	
	}	
	}
