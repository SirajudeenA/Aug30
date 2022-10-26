package com.features.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_TestNG {

	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}

	@Test
	private void CasualDress() {
		System.out.println("Casual Dress ");
	}

	@Test

	private void tShirt() {
		System.out.println("T Shirt ");

	}

	@Test
	private void summerDress() {
		System.out.println("Summer Dresses");

	}
}
