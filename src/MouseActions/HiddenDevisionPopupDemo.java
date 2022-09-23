package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDevisionPopupDemo {
	
	 public static void main(String[] args) throws InterruptedException 
	    {
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
		Thread.sleep(200);
		driver.switchTo().alert();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[2]/svg")).click();
        WebElement h = driver.findElement(By.xpath("//div[text()='Tue, Aug 16']"));
		h.click();
        driver.findElement(By.xpath("//div[text()='16'][2]"));
		
	    }
}
