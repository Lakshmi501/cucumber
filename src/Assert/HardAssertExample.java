package Assert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample 
{
    @Test
	public void test() 
	{
	   System.setProperty("webdriver.chrome.driver", "C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
       RemoteWebDriver driver = new ChromeDriver();
       driver.get("https://www.flipkart.com");
       driver.manage().window().maximize();
       String title=driver.getTitle();
       Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery");
       //Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!" );
       System.out.println("Test run successfully");	
	}

}
