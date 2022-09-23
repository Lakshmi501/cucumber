package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot1 {
	
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        WebElement t = driver.findElement(By.xpath("//a[text()='YouTube channel!']" ));
	    Actions a = new Actions(driver);
	    a.contextClick(t).perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	  
		r.keyRelease(KeyEvent.VK_T);
	}
	

}
