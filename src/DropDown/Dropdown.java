package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/laksh/OneDrive/Documents/SoftwareTesting/dropdown.html");
        WebElement ele = driver.findElement(By.xpath("//select[@id='skills']"));
	    Select s = new Select(ele);
	    s.selectByIndex(3);
	    s.selectByValue("j");
	    s.selectByVisibleText("Python");
	    Thread.sleep(3000);
	    s.deselectByIndex(3);
	    s.deselectByValue("j");
	    s.deselectByVisibleText("Python");
	    s.deselectAll();
	}

}
