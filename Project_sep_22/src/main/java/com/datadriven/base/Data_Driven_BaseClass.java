package com.datadriven.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_BaseClass {
	
	//baseClass for particularCellType
	
	public void Particualar_Cell_Data(int sheet,int row ,int cell) throws IOException {
		File f = new File("C:\\Users\\Sirajudeen A\\OneDrive\\Documents\\OneDrive\\Desktop\\Test_Case1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(sheet);
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String stringvalue = c.getStringCellValue();
			System.out.println(stringvalue);
		}
		else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			
			int a =(int) d;
			
			String numericValue = String.valueOf(a);
			
			System.out.println(numericValue);
		}
	
	}

	public static void main(String[] args) {

		
		
		
	}

}
