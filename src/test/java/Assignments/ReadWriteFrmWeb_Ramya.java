package Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadWriteFrmWeb_Ramya {
	
	WebDriver driver;

	        @Test
	        public void textfromweb() throws InterruptedException, IOException {

	            WebDriverManager.chromedriver().setup();
	            driver= new ChromeDriver();


	            driver.get("https://www.wikipedia.org/");

	            List<String> lang = new ArrayList<String>();
	            List<WebElement> languages = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
	            for(WebElement options : languages ) {
	                String Value = options.getText();
	                lang.add(Value);
	                Collections.sort(lang);

	            }
	                String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"Webdata.txt";
	                File f = new File(path);
	                if(f.exists()){
	                  System.out.println("File exist!");
	                }else{
	                    f.createNewFile();
	                    System.out.println("File successfully created!");
	                }
	              //  f.createNewFile();

	               FileWriter fw =  new FileWriter(path);
	                BufferedWriter bw = new BufferedWriter(fw);
	                int len = lang.size();
	                for(int i=0;i<len;i++)
	                {
	                    bw.write(String.valueOf(lang.get(i)));
	                    bw.newLine();
	                }

	                bw.flush();
	                bw.close();
	                Reader rf = new FileReader(path);
	                BufferedReader br = new BufferedReader(rf);
	                String line = "";
	                while(line!=null)
	                {
	                    line = br.readLine();
	                    System.out.println(line);
	                  
	                }
	             /*  while(br.readLine()!=null){
	                    String reader = br.readLine();
	                    System.out.println(reader);
	                }*/


	                br.close();

	            }

}


