package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Home {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//table[@class='login']//child::select[@name='location']")
	private WebElement dropdown1;

	@FindBy(xpath="//span[@id='hotel_span']//preceding-sibling::select[@id='hotels']") 
	private WebElement dropdown2;
	
	@FindBy(xpath="//table[@class='login']//child::select[@name='room_type']")
	private WebElement dropdown3;
	
	@FindBy(xpath="//table[@class='login']//child::select[@name='room_nos' and @id='room_nos']")
	private WebElement dropdown4;
	
	@FindBy(xpath="//span[@id='checkin_span']//preceding-sibling::input[@name='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath="//span[@id='checkout_span']//preceding-sibling :: input[@type='text']")
	private WebElement checkout;
	
	@FindBy(xpath="//table[@class='login']//child :: select[@name='adult_room']")
	private WebElement dropdown5;
	
	
	@FindBy(xpath="//table[@class='login']//child :: select[@name='child_room' and @id ='child_room']")
	private WebElement dropdown6;
	
	
	@FindBy(xpath="//table[@class='login']//child :: input[@type='submit']")
	private WebElement submit_btn;
	

	
	
	public Adactin_Home(WebDriver driver1) {
		
		Adactin_Home.driver= driver1;
		
		PageFactory.initElements(driver, this);

	}



	public WebElement getDropdown1() {
		return dropdown1;
	}



	public WebElement getDropdown2() {
		return dropdown2;
	}



	public WebElement getDropdown3() {
		return dropdown3;
	}



	public WebElement getDropdown4() {
		return dropdown4;
	}



	public WebElement getCheckin() {
		return checkin;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getDropdown5() {
		return dropdown5;
	}



	public WebElement getDropdown6() {
		return dropdown6;
	}



	public WebElement getSubmit_btn() {
		return submit_btn;
	}



	public static void main(String[] args) {

	}

}
