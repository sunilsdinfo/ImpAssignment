/* Class Created from Sunil S Daivajna on 06/02/2020
 * */
package Assignment.Demo.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_Landing_Page {
	
	static WebDriver driver=Utilities.getDriver();
	/*Page Objects	 */	
   public static By searchBoxID = By.id("twotabsearchtextbox");
   public  static By searchBoxSubmitButton = By.cssSelector("#nav-search > form > div.nav-right > div > input");
    
   /*-------------------------------Functions --------------*/
    /*  Function Name: sendTextToSearchBox
      *  Function Desciption: function to send Text
      *  Input Parameter =N/A
      */
    public  static void sendTextToSearchBox(){
    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	String text=Utilities.getMessage("textToSearch");
        driver.findElement(searchBoxID).sendKeys(text);

    };
    /*  Function Name: clickOnSearchButton
      *  Function Desciption: function to click on Search Button
      *  Input Parameter =N/A
      **/
    public static void clickOnSearchButton(){

        driver.findElement(searchBoxSubmitButton).click();

    }
	
}
