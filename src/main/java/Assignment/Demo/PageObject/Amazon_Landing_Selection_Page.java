/* Class Created from Sunil S Daivajna on 06/02/2020
 * */
package Assignment.Demo.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_Landing_Selection_Page {
	
	static WebDriver driver=Utilities.getDriver();
	/*Page Objects	 */	
	public static By selectionItemText = By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");
	public static By selectionItemPrice = By.cssSelector("span.a-price-whole");
	
	/*-------------------------------Functions --------------*/	
	
 /*  Function Name: gettingPriceOfSelectedText
      *  Function Desc: function to get Price of selected item Text
      *  Input Parameter =N/A
      **/
    public  static int gettingPriceOfSelectedText(){

    	List<WebElement> elmtext=driver.findElements(selectionItemText);
		int size=driver.findElements(selectionItemText).size();
		
		String price="";
		 int amt=0;
		for(int i=0;i<size;i++)
		{
		String text=elmtext.get(i).getText();
		 if(text.contains("iPhone XR (64GB) - Yellow"))
		 {
			  price=driver.findElements(selectionItemPrice).get(i-1).getText();
			  String amount=price.replaceAll(",","");
			   amt=Integer.parseInt(amount);
			  
			 break;
		 }
		}
		return amt;

    };
	
}
