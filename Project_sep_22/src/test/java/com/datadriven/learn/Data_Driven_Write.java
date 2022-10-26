package com.datadriven.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Write {

	public static Logger log = Logger.getLogger(Data_Driven_Write.class);

	public static void write() throws IOException {

		BasicConfigurator.configure();

		File f = new File("C:\\Users\\Sirajudeen A\\OneDrive\\Documents\\OneDrive\\Desktop\\test Write.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("StudentData").createRow(0).createCell(0).setCellValue("student name");
		wb.getSheet("StudentData").getRow(0).createCell(1).setCellValue("Siraj");
		wb.getSheet("StudentData").getRow(0).createCell(2).setCellValue("rahman");

		wb.getSheet("StudentData").createRow(1).createCell(0).setCellValue("Student ID");
		wb.getSheet("StudentData").getRow(1).createCell(1).setCellValue("ABD123");
		wb.getSheet("StudentData").getRow(1).createCell(2).setCellValue("ABD567");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

		wb.close();
	}

	public static void main(String[] args) throws IOException {

		write();

	}

}
