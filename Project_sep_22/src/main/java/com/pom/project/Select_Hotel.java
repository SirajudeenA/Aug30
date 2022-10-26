package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioButton;

	@FindBy(xpath = "//input[@type='submit'and @name='continue']")
	private WebElement continue_btn;

	
	public Select_Hotel(WebDriver driver2) {
		Select_Hotel.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
