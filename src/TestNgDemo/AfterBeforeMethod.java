package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterBeforeMethod {
	public WebDriver driver;
    
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

     }
	@Test
	public void Act()
	{
		 
		driver.findElement(By.xpath("(//input[@type ='text'])[2]")).sendKeys("9731044339");
	    driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("lakshmi123");
	    driver.findElement(By.xpath("(//button[@type ='submit'])[2]")).click();
	}
	
	@AfterMethod
	public void closeAppln()
	{
		driver.close();
	}
	
  }
	
