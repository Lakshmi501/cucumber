package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToKart {
  @Test
  public void addtocart() {
	 Assert.fail();
	  System.out.println("add to cart");
  }
  
  @Test(dependsOnMethods = "addtocart")
  public void removefromcart()
  {
	  System.out.println("remove from cart"); 
  }
  
}
