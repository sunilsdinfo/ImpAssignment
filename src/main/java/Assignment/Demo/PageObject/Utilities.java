package Assignment.Demo.PageObject;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities {
	 public static WebDriver driver=Utilities.getDriver();
	public static WebDriver getDriver()
	{  
	   if(driver==null)
	   {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	   }
	   return driver;
		
	};
	
	public static String getMessage(String a)
	{
		ResourceBundle resourcebundle=ResourceBundle.getBundle("config",Locale.getDefault());
		return resourcebundle.getString(a);
	}

}
