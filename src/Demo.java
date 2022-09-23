import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://flipkart.com");
			String s = driver.getTitle();
			System.out.println(s);
			String s1 = driver.getCurrentUrl();
			System.out.println(s1);
			driver.manage().window().maximize();
			//driver.quit();//closes the entire browser
			//driver.close();//closes the current tab
			//System.setProperty("webdriver.edge.driver","C://Users//laksh//Downloads//edgedriver_win64//msedgedriver.exe");
			//EdgeDriver driver = new EdgeDriver();
			//driver.get("https://flipkart.com");
			//System.setProperty("webdriver.gecko.driver","C://Users//laksh//Downloads//edgedriver_win64//msedgedriver.exe");
			//FirefoxDriver driver = new FirefoxDriver();
			//driver.get("https://flipkart.com");
		}

	


}
