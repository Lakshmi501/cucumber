package SceenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
       File dst = new File("C:\\Users\\laksh\\OneDrive\\Documents\\SoftwareTesting\\photos\\.png");
        FileHandler.copy(src,dst);	
	}

}
