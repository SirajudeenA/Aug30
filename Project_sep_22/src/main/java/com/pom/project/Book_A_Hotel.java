package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Book_A_Hotel {

	public static WebDriver driver;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num' and @type='text']")
	private WebElement CardNum;
	
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expYear;
	
	@FindBy(xpath="//input[@name='cc_cvv' and @type='text']")
	private WebElement ccvNum;
	
	@FindBy(xpath="//input[@name='book_now' and @type='button']")
	private WebElement bookNow;
	

	
	
	public Book_A_Hotel(WebDriver driver2) {

		driver = driver2;
		PageFactory.initElements(driver, this);
	
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCardNum() {
		return CardNum;
	}


	public WebElement getCardType() {
		return cardType;
	}


	public WebElement getExpMonth() {
		return expMonth;
	}


	public WebElement getExpYear() {
		return expYear;
	}


	public WebElement getCcvNum() {
		return ccvNum;
	}


	public WebElement getBookNow() {
		return bookNow;
	}


		
	public static void main(String[] args) {

	}

}
