import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		//driver.get("file:///C:/Users/laksh/OneDrive/Documents/SoftwareTesting/sample.html");
		//WebElement ele = driver.findElement(By.tagName("input"));
		//ele.sendKeys("Mobiles");
		//WebElement m = driver.findElement(By.id("icp-nav-flyout"));
		//m.click();
		//WebElement n = driver.findElement(By.name("field-keywords"));
	    //n.sendKeys("Mobiles");
		//WebElement p = driver.findElement(By.cssSelector("input[class='n1']"));
		
		//WebElement p = driver.findElement(By.xpath("//input[@type='text']"));
       // p.sendKeys("Accessories")
       
		//WebElement p = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
	    //p.click();
        
		WebElement p = driver.findElement(By.xpath("(//span[contains(text(),'Log')])[2]"));
	    p.click();



	}

}
