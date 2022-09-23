package SceenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshot {
	
	public static void capture(WebDriver driver) {
		
	String path = "C:\\Users\\laksh\\OneDrive\\Documents\\SoftwareTesting\\photos\\.png";
	Date d = new Date();
	String d1 = d.toString();
	String date = d1.replace(":","-" );
	TakesScreenshot ts = (TakesScreenshot)driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File dst = new File(path+date+".png");
    try {
    FileHandler.copy(src,dst);	
    }
    catch(Exception e)
    {
    	System.out.println("Failed to take screenshot");
    }
	
		
	}

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        capture(driver);
	}

}
