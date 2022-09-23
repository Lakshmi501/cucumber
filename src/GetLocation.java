import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
	    WebElement e =  driver.findElement(By.xpath("//input[@name='email']"));
	    org.openqa.selenium.Point p = e.getLocation();
	    int x = p.getX();
	    int y = p.getY();
	    System.out.println(x+" "+y);
	}

}
