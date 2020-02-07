/* Class Created from Sunil S Daivajna on 06/02/2020
 * */
package Assignment.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Assignment.Demo.PageObject.Amazon_Landing_Page;
import Assignment.Demo.PageObject.Amazon_Landing_Selection_Page;
import Assignment.Demo.PageObject.FlipKart_Landing_Page;
import Assignment.Demo.PageObject.FlipKart_Landing_Selection_Page;
import Assignment.Demo.PageObject.Utilities;

public class PriceCheck {
	
	WebDriver driver=Utilities.getDriver();
	 int pricefromamazon=0;
	 int pricefromflipcart=0;
	 
	 @BeforeSuite
	 public void launchdriver()
	 {
		 driver.manage().window().maximize();
		 
	 };
	 @AfterSuite
	 public void closedriver()
	 {
		 driver.close();
		 
	 };
	 
  @Test(priority=0)
  public void gettingIphonePriceFromAmazon() {
	 
	  driver.get("https://www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Amazon_Landing_Page.sendTextToSearchBox();
	  Amazon_Landing_Page.clickOnSearchButton();
	  pricefromamazon=Amazon_Landing_Selection_Page.gettingPriceOfSelectedText();
	  System.out.println("Price From Amazon "+pricefromamazon);	 	 	  
  };
  
  @Test(priority=1)
  public void gettingIphonePriceFromFlipkart() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.flipkart.com");
	  FlipKart_Landing_Page.switchingToPopUp();
	  FlipKart_Landing_Page.closingPopUp();
	  FlipKart_Landing_Page.sendTextToSearchBox();
	  FlipKart_Landing_Page.clickOnSearchButton();
	  pricefromflipcart=FlipKart_Landing_Selection_Page.gettingPriceOfSelectedText();
	  System.out.println("Price from Flipcart "+pricefromflipcart);
		  
  };
  
  @Test(priority=2)
  public void comparingIphonePriceAndDisplyingResult() {
	  
	  int iphonevaluefroamazon=pricefromamazon;
	  int iphonevaluefromflipcart=pricefromflipcart;
	  if(iphonevaluefroamazon<iphonevaluefromflipcart)
	  {
		  System.out.println("Amazon website has lesser value for Iphone ");  
	  }
	  else if(iphonevaluefroamazon>iphonevaluefromflipcart)
	  {
		  System.out.println("FlipKart website has lesser value for Iphone ");
	  }
		  
  };
};
