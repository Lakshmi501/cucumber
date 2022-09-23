package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotnew {
	
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        WebElement t = driver.findElement(By.xpath("//a[text()='Watch the videos!']" ));
	    Actions a = new Actions(driver);
	    a.contextClick(t).perform();
	    Robot r = new Robot();
	   // r.keyPress(KeyEvent.VK_W);
	    //r.keyRelease(KeyEvent.VK_W);
	    
	    //closing browser
	  //  r.keyPress(KeyEvent.VK_ALT);
	    //r.keyPress(KeyEvent.VK_F4);
	    //r.keyRelease(KeyEvent.VK_ALT);
	    //r.keyRelease(KeyEvent.VK_F4);
	   //minimizing browser 
	    r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_SPACE);
	    r.keyPress(KeyEvent.VK_N);
	   // Thread.sleep(6000);
	   r.keyRelease(KeyEvent.VK_ALT);
	    r.keyRelease(KeyEvent.VK_SPACE);
	    r.keyRelease(KeyEvent.VK_N);
	    
	}
	

}