package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSeleniumExample {

    WebDriver driver;
    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
        List<WebElement> lang = driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));

        System.out.println("Total lang in the dropdown: "+lang.size());

        ArrayList<String> empty = new ArrayList<String>();

        for(WebElement ele : lang){
           empty.add(ele.getText());

        }

        System.out.println("Before sort:" + empty);

        Collections.sort(empty);

        System.out.println("After sort:" + empty);


    }


    @AfterTest
    public void close(){
        driver.close();
    }
}
