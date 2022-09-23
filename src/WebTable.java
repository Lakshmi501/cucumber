import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("file:///C:/Users/laksh/OneDrive/Documents/SoftwareTesting/table.html");
		driver.get("https://sports.ndtv.com/ipl-2022/points-table");
        //WebElement a = driver.findElement(By.xpath("//td[text()='RCB']/../td[3]"));	
        //WebElement a = driver.findElement(By.xpath("//td[text()='RCB']/../following-sibling::tr[2]/td[2]"));
		//WebElement a = driver.findElement(By.xpath("//td[text()='Gujarat Titans']/../td[3]"));
		WebElement a = driver.findElement(By.xpath("//td[text()='Lucknow Super Giants']/../preceding-sibling::tr[2]td[5]"));


        String s = a.getText();
        System.out.println(s);
	}
	
}
