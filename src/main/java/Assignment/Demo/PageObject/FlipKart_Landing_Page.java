/* Class Created from Sunil S Daivajna on 06/02/2020
 * */
package Assignment.Demo.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipKart_Landing_Page {
	static WebDriver driver=Utilities.getDriver();
	/*Page Objects	 */	
    public static By searchBox = By.cssSelector("input.LM6RPg");
    public static By searchBoxSubmitButton = By.cssSelector("#container > div > div._3ybBIU > div._1tz-RS > div._3pNZKl > div.Y5-ZPI > form > div > button");
    
   public  static By closingPopUp = By.cssSelector("body > div.mCRfo9 > div > div > button");
    
   /*-------------------------------Functions --------------*/
   /*  Function Name: sendTextToSearchBox
     *  Function Desciption: function to send Text
     *  Input Parameter =N/A
     */
    public static void sendTextToSearchBox(){
    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	String text=Utilities.getMessage("textToSearch");
        driver.findElement(searchBox).sendKeys(text);

    };
    /*  Function Name: sendTextToSearchBox
     *  Function Desciption: function to send Text
     *  Input Parameter =N/A
     */
    public static void clickOnSearchButton(){

    	driver.findElement(searchBoxSubmitButton).click();

    }
    /*  Function Name: switchingToPopUp
     *  Function Desciption: function switch to pop up
     *  Input Parameter =N/A
     */
    public static void switchingToPopUp(){
    	
    String MainWindow=driver.getWindowHandle();	
    driver.switchTo().window(MainWindow);
    };
    
    /*  Function Name: closingPopUp
     *  Function Desciption: function to close pop up
     *  Input Parameter =N/A
     */
    public static void closingPopUp(){
    	
    	driver.findElement(closingPopUp).click();
        }
}
