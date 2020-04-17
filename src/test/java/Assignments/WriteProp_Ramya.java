package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProp_Ramya {

	public static void  main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

        String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"config.properties";
try {
        FileOutputStream fos = new FileOutputStream(path);
			  Properties prop = new Properties();
		        prop.setProperty("url", "www.w3resource.com");
		        prop.store(fos, "Write to prop file");

		        System.out.println(prop.getProperty("url"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

      


    }

	}


