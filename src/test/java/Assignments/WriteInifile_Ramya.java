package Assignments;

import java.io.File;
import java.io.FileOutputStream;

import org.ini4j.Ini;
//import day10.Genric;


public class WriteInifile_Ramya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Genric.setVal("tc004", "name", "Ramya", "demo");
		
		
		String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"demo.ini";
		try {
		
		FileOutputStream fos = new FileOutputStream(path);
		Ini ini = new Ini();
		ini.put("tc001","url","www.amazon.com");
		ini.put("tc002","url","www.google.com");
		ini.put("tc003","url","www.w3resource.com");
		ini.store(fos);
		System.out.println(ini.get("tc003","url"));
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
