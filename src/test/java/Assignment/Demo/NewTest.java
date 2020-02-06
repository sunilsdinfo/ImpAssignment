package Assignment.Demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	 
	    public WebDriver driver ; 
  @Test
  public void gettingIphonePriceFromAmazon() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone XR (64GB) - Yellow");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
		Thread.sleep(5000);
		
		List<WebElement> elmtext=driver.findElements(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']"));
		int size=driver.findElements(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).size();
		
		String price="";
		
		for(int i=0;i<size;i++)
		{
		String text=elmtext.get(i).getText();
		 if(text.contains("iPhone XR (64GB) - Yellow"))
		 {
			  price=driver.findElements(By.cssSelector("span.a-price-whole")).get(i).getText();
			
			  System.out.println("Price "+(price));
			 break;
		 }
		}
		
			
  }
  @Test
  public void gettingIphonePriceFromFlipCart() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		String MainWindow=driver.getWindowHandle();	
	    driver.switchTo().window(MainWindow);	                                                                                                           
	                  
		driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > button")).click();
		
	   driver.findElement(By.cssSelector("input.LM6RPg")).sendKeys("iPhone XR (64GB) - Yellow");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#container > div > div._3ybBIU > div._1tz-RS > div._3pNZKl > div.Y5-ZPI > form > div > button")).click();
		Thread.sleep(5000);
		
		String texti=driver.findElement(By.cssSelector("div._3wU53n")).getText();
		 if(texti.contains("Apple iPhone XR (Yellow, 64 GB)"))
		 {
			 String price=driver.findElement(By.cssSelector("div[class='_1vC4OE _2rQ-NK']")).getText();
			 System.out.println(price+"df");
			
		 }
		
		
		
			
  }
  
}
