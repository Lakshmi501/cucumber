import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	    public static void main(String[] args) 
	    {
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
	    List<WebElement> li =  driver.findElements(By.xpath("//a"));
        int count=li.size();
        System.out.println(count);
    
	    }
}
