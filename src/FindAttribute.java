import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAttribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
	    List<WebElement> li =  driver.findElements(By.xpath("//a"));
	    for(int i=0;i<li.size();i++)
	    {
	    	WebElement we = li.get(i);
	    }
	    
  
        char[] count = null;
		System.out.println(count);
	

	}

}
