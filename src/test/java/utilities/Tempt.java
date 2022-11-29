package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws InterruptedException {
		//launch Browser
 	System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");
     	ChromeDriver driver=new ChromeDriver();
	        //open application
      driver.get("https://flipkart.com/");
     
          //click
     driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
     
                 //moveto element
       Actions act=new Actions(driver);
       WebElement a=driver.findElement(By.xpath("//*[@href='/account/login?ret=/']"));
       act.moveToElement(a).build().perform();
     
              //click
       driver.findElement(By.xpath("(//*[@class='_3vhnxf'])[1]")).click();
         Thread.sleep(5000);
             //sendkeys
       driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9370462129");
       driver.findElementByXPath("//*[@type='password']").sendKeys("9921741725");
         //click
       driver.findElementByXPath("(//*[@type='submit'])[2]").click();
       Thread.sleep(5000);
  
      driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
      Thread.sleep(5000);
     
      driver.findElementByXPath("//*[@class='qkYgWG']").click();
     
     driver.findElementByXPath("//*[@autocomplete='name']").sendKeys("shubhangi");
     
     driver.findElementByXPath("//*[@name='phone']").sendKeys("9370462129");
    
     driver.findElementByXPath("//*[@name='pincode']").sendKeys("412210");
     
     driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("BaburaoNagar");
     
     driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("1169,Utkarsh building");
     
     driver.findElementByXPath("(//*[@class='_1XFPmK'])[1]").click();
     
     driver.findElementByXPath("//*[text()='Save']").click();
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}
}