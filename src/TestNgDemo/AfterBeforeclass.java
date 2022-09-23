package TestNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AfterBeforeclass {
  @Test
  public void test1() {
	  System.out.println("i am a test1"); 
  }
  
  @Test
   public void test2() {
	  System.out.println("i am a test2"); 
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am executing before all tests");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am executing after all tests");
  }

}
