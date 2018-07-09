package com.qa.marketplace.cwc.pages;





import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.marketplace.cwc.base.TestBase;

import model.AddBrokerTestData;

public class ReadExcel extends TestBase{
	


	public static void main(String args[]) {
		
		ArrayList<AddBrokerTestData> list=new ArrayList<AddBrokerTestData>();
			 
			 try {
				  // Specify the path of file
				  File src=new File("/home/rajnish/Desktop/Selenium/workplace1/cwc/src/AddNewBroker/AddBroker1.xlsx");
				 
				   // load file
				   FileInputStream fis=new FileInputStream(src);
				 
				   // Load workbook
				   XSSFWorkbook wb=new XSSFWorkbook(fis);
				   
				   // Load sheet- Here we are loading first sheetonly
				      XSSFSheet sh1= wb.getSheetAt(0);
				 
				  // getRow() specify which row we want to read.
				 
				  // and getCell() specify which column to read.
				  // getStringCellValue() specify that we are reading String data.
				 
				     
				      
				     int  noOfRow=sh1.getPhysicalNumberOfRows();
				     
				     for (int i=0;i<noOfRow;i++) {
				    	 AddBrokerTestData testData=new AddBrokerTestData();
				    	 testData.setUser_Type("");
				    	 testData.setUser_Type("");
				    	 
				    	 list.add(testData);
				    	 
				    	 
				     }
				      
				      
				 
				 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
				 
				 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
				 
				 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
				 
				 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
				 
				 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
				 
				 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
				 
				  }
		
			 catch (Exception e) {
				 
				   System.out.println(e.getMessage());
				 
				  }
		}
        
		
		
	
}

		
