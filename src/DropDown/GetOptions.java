package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/laksh/OneDrive/Documents/SoftwareTesting/dropdown.html");
        WebElement ele = driver.findElement(By.xpath("//select[@id='skills']"));
        Select s = new Select(ele);
        //To get all the options in the dropdown list
        List<WebElement> options = s.getOptions();
        //this is for printing the options
        for(WebElement we : options)
        {
        	System.out.println(we.getText());
        }
        //To get all selected options
       List<WebElement> option1 = s.getAllSelectedOptions();
       s.selectByIndex(3);
	   s.selectByValue("j");
	   s.selectByVisibleText("Python");
	}

}

