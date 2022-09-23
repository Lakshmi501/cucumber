package TestNgDemo;

import org.testng.annotations.Test;

public class Dependsgroup {
	  
	 @Test(groups="apple",priority=1) 
	 public void selectproduct()
	 {
		  System.out.println("select product");
		  
	 }
	
	  @Test(groups="apple",priority=2,dependsOnGroups="orange") 
	  public void addtocart()
	  {
		  System.out.println("add to cart");
	  }
	 

	 @Test(groups="orange",priority=3) 
	 public void removefromcart()
	 {
		  System.out.println("remove from the cart");
		  
	 }
}
