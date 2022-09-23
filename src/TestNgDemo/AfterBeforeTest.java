package TestNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class AfterBeforeTest {
  @Test
  public void test1() {
	  System.out.println("i am a test1"); 
  }
  
  @Test
   public void test2() {
	  System.out.println("i am a test2"); 
  }
  
  
  @BeforeTest
  public void beforeClass() {
	  System.out.println("i am executing before all tests");
  }

  @AfterTest
  public void afterClass() {
	  System.out.println("i am executing after all tests");
  }

}
