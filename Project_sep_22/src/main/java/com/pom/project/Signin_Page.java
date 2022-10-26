package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	
	public static WebDriver driver; //--- > null 
	
	
	@FindBy(xpath="//span[@id='username_span']//preceding-sibling::input")
	private WebElement userName;
	
	@FindBy(xpath="//span[@id='password_span']//preceding-sibling::input")
	private WebElement passWord;
 
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login_btn;
	
	


	public static WebDriver getDriver() {
		return driver;
	}

	public Signin_Page(WebDriver driver2) {
		Signin_Page.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	//Getters 

	public WebElement getUserName() {
		return userName;
	}



	public WebElement getPassWord() {
		return passWord;
	}


	public WebElement getLogin_btn() {
		return login_btn;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
