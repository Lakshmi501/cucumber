import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement a = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        String str  = a.getTagName();
        System.out.println(str);
	}

}
