package com.test.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_Parameter {

	@Parameters({"user" ,"pass"})
	@Test
	public void login(String username , String password) {

	}
	
}
