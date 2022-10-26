package com.junit.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_Demo {

	@Before

	public void logIn() {
		System.out.println("login");
	}

	@After
	public void logout() {
		System.out.println("logout");
	}

	@Test
	public void Casual_dress() {

		System.out.println("Casual dress purchase");
	}

	@Test
	public void Summer_Dress() {
		System.out.println("summer dress purchase");
	}

	@Test

	public void t_shirt() {

		System.out.println("purchase t shirt ");
	}

}
