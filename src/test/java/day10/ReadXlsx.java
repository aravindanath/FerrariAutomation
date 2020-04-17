package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.java_cup.internal.runtime.Symbol;

public class ReadXlsx {


    public static void main(String arg[]) throws Exception {

    	 
    	String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"SampleExcel.xlsx";
		 
  	  FileInputStream fos = new FileInputStream(path);
  	  Workbook wb = new XSSFWorkbook(fos);
  	  Sheet sheet=  wb.getSheetAt(0);
  	  DataFormatter df = new DataFormatter();
  	//String val =  df.formatCellValue(sheet.getRow(3).getCell(1));
  	//String val = sheet.getRow(2).getCell(1).getStringCellValue();
  	//System.out.println(val);
  	  
  	 int rowCount = sheet.getLastRowNum();
  	  
  	 for(int i=0; i<=rowCount;i++) {
  			String fisrt =  df.formatCellValue(sheet.getRow(i).getCell(0));
  			String second =  df.formatCellValue(sheet.getRow(i).getCell(1));
  			
  			System.out.println(fisrt  +"  "+ second );

  	 }
  	  
  	  wb.close();
  	 
  	 System.out.print(Genric.getValue(0, 1, 1));
    	 
    }
    
    
    
    
}
