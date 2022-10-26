package com.datadriven.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven_Read {

	public static String value; // ----> Null

	// Particular cell Value

	public static void particualar_Cell_Data() throws IOException {

		File f = new File("C:\\Users\\Sirajudeen A\\OneDrive\\Documents\\OneDrive\\Desktop\\Test_Case1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet Sheet = wb.getSheetAt(0);

		Row row = Sheet.getRow(2);

		Cell cell = row.getCell(6);

		CellType type = cell.getCellType();

		if (type.equals(CellType.STRING)) {

			value = cell.getStringCellValue();

			System.out.println(value);

		} else if (type.equals(CellType.NUMERIC)) {

			double d = cell.getNumericCellValue();

			// double to int

			int a = (int) d; // narrowing type casting

			// int to String

			value = String.valueOf(a);

			System.out.println(value);
		}

		wb.close();

	}
	// All data

	public static void All_Data() throws IOException {

		File f = new File("C:\\Users\\Sirajudeen A\\OneDrive\\Documents\\OneDrive\\Desktop\\Test_Case1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int numberOfRows = s.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {

			Row row = s.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType type = cell.getCellType();

				if (type.equals(CellType.STRING)) {

					String value2 = cell.getStringCellValue();

					System.out.println(value2);

				} else if (type.equals(CellType.NUMERIC)) {

					double d = cell.getNumericCellValue();

					// double to int
					int a = (int) d;

					String value = String.valueOf(a);

					System.out.println(value);

				}
			}
		}
		wb.close();

	}

	public static void main(String[] args) throws IOException {

		particualar_Cell_Data();

		All_Data();
	}

}
