package com.Project_sep_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanage.learn.Page_object_Manager;


public class Adactin_RunnerPom extends Utility_File_Base{

		public static WebDriver driver =browser_Launch("chrome");
		
		public static Page_object_Manager manager = new Page_object_Manager(driver);
		
		public static void main(String[] args) throws Throwable {

			get_url("https://adactinhotelapp.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

			send_Keys(manager.getSignin_Page().getUserName(), "Sirarahman20");
			
			send_Keys(manager.getSignin_Page().getPassWord(), "Baby@0815");
			
			click_on_Element(manager.getSignin_Page().getLogin_btn());

			SelectBy_intex(manager.getAdactin_home().getDropdown1(), 1);

			SelectBy_intex(manager.getAdactin_home().getDropdown2(), 2);

			selectBy_Text(manager.getAdactin_home().getDropdown3(), "Double");

			SelectBy_intex(manager.getAdactin_home().getDropdown4(), 2);
			
			clear(manager.getAdactin_home().getCheckin());
			send_Keys(manager.getAdactin_home().getCheckin(),"09/10/2022");

			clear(manager.getAdactin_home().getCheckout());
			send_Keys(manager.getAdactin_home().getCheckout(), "10/10/2022");

			selectBy_Value(manager.getAdactin_home().getDropdown5(), "3");

			SelectBy_intex(manager.getAdactin_home().getDropdown6(), 2);

			click_on_Element(manager.getAdactin_home().getSubmit_btn());
			
			click_on_Element(manager.getSelect_Hotel().getRadioButton());
			
			click_on_Element(manager.getSelect_Hotel().getContinue_btn());
			
			send_Keys(manager.getBook_A_Hotel().getFirstName(),"sirajudeen");
			
			send_Keys(manager.getBook_A_Hotel().getLastName(), "Rahman");
			
			send_Keys(manager.getBook_A_Hotel().getAddress(), "po box 12435 Salt lake city UT 97096");
			
			send_Keys(manager.getBook_A_Hotel().getCardNum(), "1234 7897 1457 1475");
			
			selectBy_Value(manager.getBook_A_Hotel().getCardType(),"MAST");
			
			selectBy_Text(manager.getBook_A_Hotel().getExpMonth(), "March");
			
			selectBy_Text(manager.getBook_A_Hotel().getExpYear(), "2022");
			
			send_Keys(manager.getBook_A_Hotel().getCcvNum(), "114");
			
			click_on_Element(manager.getBook_A_Hotel().getBookNow());
			
		}

		

	}

