package com.scholasticlearningzone.common.utils;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlsHelper {
	
	public static Sheet getSheet(String path,String sheetName){
		Sheet sheet=null;
		try {
			System.out.println("Hiii");
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			sheet = wb.getSheet(sheetName);
						
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheet;
	}
	
	//String pwd=XlsHelper.getStringCellVal(XlsHelper.getRow(XlsHelper.getSheet(path, "input"), 2), 1);
	//wb.getSheet("sheet").getRow(0).getCell(0).getStringCellValue();
	
	 
	public static Row getRow(Sheet sheet, int r){
		return (sheet.getRow(r));
}

	public static String getStringCellVal(Row row, int c){
		return row.getCell(c).getStringCellValue();
		
	}
	public static double getDoubleCellVal(Row row, int c){
		return row.getCell(c).getNumericCellValue();	
	}
}
