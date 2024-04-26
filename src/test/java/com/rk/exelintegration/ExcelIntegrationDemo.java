package com.rk.exelintegration;

import java.io.File;
import java.io.FileInputStream;
//import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ExcelIntegrationDemo {

	@DataProvider
	public Object[][] getData() throws Exception {
		File excelsheet= new File("./src/test/resources/Test.xlsx");
		System.out.println(excelsheet.exists());
		FileInputStream fis= new FileInputStream(excelsheet);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		
		Object[][] data= new Object[noOfRows-1][noOfColumns];
		for (int i = 0; i < noOfRows-1; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j)); 
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		workbook.close();
		fis.close();
	
		/*for (Object[] dataArr : data) {
			System.out.println(Arrays.toString(dataArr));
		}*/
		return data;
	}
}
