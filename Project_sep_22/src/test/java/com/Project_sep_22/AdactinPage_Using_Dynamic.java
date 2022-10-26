package com.Project_sep_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinPage_Using_Dynamic extends Utility_File_Base {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = browser_Launch("chrome");

		get_url("https://adactinhotelapp.com/");

		WebElement userName = driver.findElement(By.xpath("//span[@id='username_span']//preceding-sibling::input"));

		send_Keys(userName, "sirarahman20");

		WebElement password = driver.findElement(By.xpath("//span[@id='password_span']//preceding-sibling::input"));

		send_Keys(password, "Baby@0815");

		WebElement loginButton = driver.findElement(By.xpath("//input[@type='Submit']"));

		click_on_Element(loginButton);

		WebElement drop1 = driver.findElement(By.xpath("//table[@class='login']//child::select[@name='location']"));

		SelectBy_intex(drop1, 1);

		WebElement drop2 = driver
				.findElement(By.xpath("//span[@id='hotel_span']//preceding-sibling::select[@id='hotels']"));
		SelectBy_intex(drop2, 2);

		WebElement drop3 = driver.findElement(By.xpath("//table[@class='login']//child::select[@name='room_type']"));
		selectBy_Text(drop3, "Double");

		WebElement drop4 = driver
				.findElement(By.xpath("//table[@class='login']//child::select[@name='room_nos' and @id='room_nos']"));

		SelectBy_intex(drop4, 2);
		
		WebElement date = driver
				.findElement(By.xpath("//span[@id='checkin_span']//preceding-sibling::input[@name='datepick_in']"));
		clear(date);
		send_Keys(date, "09/10/2022");

		WebElement date2 = driver
				.findElement(By.xpath("//span[@id='checkout_span']//preceding-sibling :: input[@type='text']"));
		clear(date2);
		send_Keys(date2, "10/10/2022");

		WebElement drop5 = driver.findElement(By.xpath("//table[@class='login']//child :: select[@name='adult_room']"));

		selectBy_Value(drop5, "3");

		WebElement drop6 = driver.findElement(
				By.xpath("//table[@class='login']//child :: select[@name='child_room' and @id ='child_room']"));

		SelectBy_intex(drop6, 2);

		WebElement button = driver.findElement(By.xpath("//table[@class='login']//child :: input[@type='submit']"));

		click_on_Element(button);

		TakesScreenshot();
	}
}
