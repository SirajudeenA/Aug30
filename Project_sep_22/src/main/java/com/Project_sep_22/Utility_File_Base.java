package com.Project_sep_22;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility_File_Base {

	public static  WebDriver driver; // ---->null
	public static WebElement element;

	//getBrowser
	public static WebDriver browser_Launch(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
			driver = new ChromeDriver();
			
		} 
		else if (type.equalsIgnoreCase("firefox")) {

		}
		else if (type.equalsIgnoreCase("edge")) {

		}
		return driver;
	}

	//getURL
	public static void get_url(String url) {
		driver.get(url);
	}

	//Click
	public static void click_on_Element(WebElement element) {
		element.click();

	}

	//SendKeys
	public static void send_Keys(WebElement element, String value) {
		element.sendKeys(value);
	}

	//getText
	public static String get_Text(WebElement element) {
		String text = element.getText();
		return text;

	}
	
	public static void clear(WebElement element) {
		element.clear();
	}

	//isDisplayed
	public static boolean is_Displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;

	}

	//isSelected
	public static boolean is_Selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	//isEnabled
	public static boolean is_Enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	//close
	public static void close() {
		driver.close();
	}
	
	//Quit
	public static void quit_browser() {
		driver.quit();

	}
	
	//maximize
	public static void maximize() {

		driver.manage().window().maximize();
	}

	//SelectBY_index
	public static void SelectBy_intex(WebElement element, int value) {

		Select select = new Select(element);
		select.selectByIndex(value);
	}

	//SelectBY_Value
	public static void selectBy_Value(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	//SelectBY_Text
	public static void selectBy_Text(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	//screenShot
	public static void TakesScreenshot() throws IOException {
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File Source = tc.getScreenshotAs(OutputType.FILE);
		String path = "D:\\screenshot";
		java.util.Date d1 = new java.util.Date();
		String date1 = d1.toString();
		String date = date1.replaceAll(":", "-");
		File destination = new File(path + date + ".png");

		FileUtils.copyDirectory(Source,destination);
	}

	public static void main(String[] args) throws Throwable {

	}

}
