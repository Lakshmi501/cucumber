package TestNgDemo;

import org.testng.annotations.Test;

public class AddToCart2 {
 
  @Test(groups="apple") 
  public void addtocart()
  {
	  System.out.println("add to cart");
  }
 
 @Test(groups="apple") 
 public void selectproduct()
 {
	  System.out.println("select product");
	  
 }
 @Test(groups="orange") 
 public void removefromcart()
 {
	  System.out.println("remove from the cart");
	  
 }
 
  
}
