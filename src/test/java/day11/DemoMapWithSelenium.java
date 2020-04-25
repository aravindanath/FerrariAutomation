package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class DemoMapWithSelenium {

    WebDriver driver;

    HashMap<String,String> mp = new   HashMap<String,String>();

    @Test
    public void test001() throws InterruptedException {

        mp.put("url","https://www.google.com");
        mp.put("search","Covid-19 updates in india");
        mp.put("search2","Selenium Appium Jobs in bangalore");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(mp.get("url"));
        driver.findElement(By.name("q")).sendKeys(mp.get("search"), Keys.ENTER);
        Thread.sleep(4000);
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys(mp.get("search2"), Keys.ENTER);

        Thread.sleep(4000);

        driver.quit();

    }
}
