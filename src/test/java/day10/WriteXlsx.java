package day10;

import java.io.File;

import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class WriteXlsx {
	
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"SampleExcel.xlsx";
		String sheetName="login";
		Xls_Reader xls = new Xls_Reader(path);
		xls.setCellData(sheetName, "password", 9, "password&^%$#");
		String val =xls.getCellData(sheetName, 1, 9);
		System.out.println(val);
		
		//https://codoid.com/fillo/
	}

}
