package day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionHandlingWithSelenium {

    WebDriver driver;

    @Test
    public void example() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();


        driver.get("https://www.hdfcbank.com/");

        Thread.sleep(1000); // sync
        try{
            driver.findElement(By.xpath("//a[text()='X']")).click();
        }catch (Exception e){

        }

        driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();


        driver.close();


    }




}
