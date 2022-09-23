package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.timesjobs.com/candidate/register.html");
	    WebElement d = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		d.click();
		
        

	}
}
