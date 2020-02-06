/* Class Created from Sunil S Daivajna on 06/02/2020
 * */

package Assignment.Demo.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FlipKart_Landing_Selection_Page {
	
	static WebDriver driver=Utilities.getDriver();	
	public static By selectionItemText = By.cssSelector("div._3wU53n");
	public static By selectionItemPrice = By.cssSelector("div[class='_1vC4OE _2rQ-NK']");
	
	
 /*  Function Name: gettingPriceOfSelectedText
      *  Function Desc: function to get Price of selected item Text
      *  Input Parameter =N/A
      */
    public static int gettingPriceOfSelectedText(){
    	String price="";
    	int amount=0;
    	String texti=driver.findElement(selectionItemText).getText();
		 if(texti.contains("Apple iPhone XR (Yellow, 64 GB)"))
		 {
			 price=driver.findElement(selectionItemPrice).getText();
			 String amt=price.replaceAll(",","");
			 String amtt=amt.replaceAll("₹","");
			 amount=Integer.parseInt(amtt);
			  
			
		 }
		return amount;

    };
	
}

