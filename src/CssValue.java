import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement a = driver.findElement(By.xpath("//button[@name='login']"));
        String color  = a.getCssValue("background-color");
        System.out.println(color);
       if(color.equals("rgba(24, 119, 242, 1)"))
       {
    	  System.out.println("it is blue color"); 
       }else
       {
    	   System.out.println("it is some other color");   
       }

	}

}
