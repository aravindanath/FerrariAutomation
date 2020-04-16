package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class ReadIniFile {

	public static void main(String[] args) throws Exception {
		
		
		  String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"demo.ini";
		  
		  FileInputStream fis = new FileInputStream(path);
		  Ini ini = new Ini();
		  ini.load(fis);
		  String val =ini.get("tc002", "url");
		  System.out.print(val);
		  
		 System.out.println(Genric.getVal("tc002", "url", "demo")); ;
		  
	        
		
		
 

	}

}
