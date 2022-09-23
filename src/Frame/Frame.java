package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/laksh/OneDrive/Documents/SoftwareTesting/pageframe.html");
        //for entering into frame
        WebElement f = driver.findElement(By.xpath("//input[@type='text']"));
        f.sendKeys("Lakshmi");
        //switching frame by index value
        driver.switchTo().frame(0);
        WebElement f1 = driver.findElement(By.xpath("//input[@type='text']"));
        f1.sendKeys("Arkeri");
        //switching frame by id
       // driver.switchTo().frame("a1");
        //WebElement f2 = driver.findElement(By.xpath("//input[@type='text']"));
        //f2.sendKeys("Arkeri");
   
        //go back to main page
       //switching the frame by address
        
        driver.switchTo().defaultContent();
        f.sendKeys("@123");
        
}
}