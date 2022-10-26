package com.test.features;

import java.io.IOException;

public class Test_Data_Manager {

	
	private  Test_Data_Manager() {

		
	}
	
	public static Test_Data_Manager getInstanceFRM() {

		Test_Data_Manager manager= new Test_Data_Manager();
	
		return manager;
	}
	
	public Test_Data_Reader getInstanceReader() throws IOException {

	Test_Data_Reader reader = new Test_Data_Reader();
	
	return reader;
	
	}
	
}
