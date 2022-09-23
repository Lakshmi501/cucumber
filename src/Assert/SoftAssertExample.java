package Assert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertExample
{       
	@Test
		public void test1() 
		{
		   System.setProperty("webdriver.chrome.driver", "C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
	       RemoteWebDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com");
	       driver.manage().window().maximize();
	       String title=driver.getTitle();
	       SoftAssert s = new SoftAssert();
	       //assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	       s.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture");
	       System.out.println("Test run successfully");	
	       s.assertAll();
		}



}
















