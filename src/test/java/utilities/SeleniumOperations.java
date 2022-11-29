package utilities;


import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

  public class SeleniumOperations {
	  
	
  public static ChromeDriver driver=null;
  
  public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
  
	  public static Hashtable<String,Object> launchBrowser(Object[]inputparameters)
	  {
		try
		{
		String key=(String) inputparameters[0];
		String value=(String) inputparameters[1];
		
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodused:launchBrowser,InputGiven:"+inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodused:launchBrowser,InputGiven:"+inputparameters[0].toString());
	    }
		return outputparameters;
	    }
	  
	
	    public static Hashtable<String,Object> openApplication(Object[]input1parameters) {
		try
		   {
		String url=(String) input1parameters[0];
	    driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		outputparameters.put("STATUS", "PASS");
 		outputparameters.put("MESSAGE", "methodused:openApplication,InputGiven:"+input1parameters[0].toString());

           } 
	     catch(Exception e)
	       {
	    	 outputparameters.put("STATUS", "FAIL");
	 		outputparameters.put("MESSAGE", "methodused:openApplication,InputGiven:"+input1parameters[0].toString());
	       }
		return outputparameters;

         }
	    
	
	    public static Hashtable<String,Object> clickOnelement(Object[]input2parameters) throws InterruptedException {
	    try
	    {
		
		String xpath=(String) input2parameters[0];
        driver.findElementByXPath(xpath).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		outputparameters.put("STATUS", "PASS");
 		outputparameters.put("MESSAGE", "methodused:clickOnelement,InputGiven:"+input2parameters[0].toString());

		
	    }
	    catch(Exception e)
	    {
	    	outputparameters.put("STATUS", "FAIL");
	 		outputparameters.put("MESSAGE", "methodused:clickOnelement,InputGiven:"+input2parameters[0].toString());

	    }
	    
	    return outputparameters;

        }
	    
	
	     public static Hashtable<String,Object> moveElement(Object[]input3parameters) throws InterruptedException {
			try
			{
		 String xpath=(String) input3parameters[0];
    	 Actions act=new Actions(driver);
	     WebElement a=driver.findElement(By.xpath(xpath));
	    act.moveToElement(a).build().perform();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		outputparameters.put("STATUS", "PASS");
 		outputparameters.put("MESSAGE", "methodused:moveElement,InputGiven:"+input3parameters[0].toString());

			}
			catch(Exception e)
			{
				outputparameters.put("STATUS", "FAIL");
		 		outputparameters.put("MESSAGE", "methodused:moveElement,InputGiven:"+input3parameters[0].toString());

			}
			return outputparameters;

	       }
	
	     
	     public static Hashtable<String,Object>	sendKeys(Object[]input5parameters) throws InterruptedException {
	    	 try
	    	 {
		 Thread.sleep(5000);
		 String name=(String) input5parameters[0];
		 String key=(String) input5parameters[1];
		 driver.findElementByXPath(name).sendKeys(key);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 outputparameters.put("STATUS", "PASS");
	 		outputparameters.put("MESSAGE", "methodused:sendKeys,InputGiven:"+input5parameters[1].toString());


	    	 }
	    	 catch(Exception e)
	    	 {
	    		 outputparameters.put("STATUS", "FAIL");
	 	 		outputparameters.put("MESSAGE", "methodused:sendKeys,InputGiven:"+input5parameters[1].toString());

	    	 }
	    	 return outputparameters;

	        } 
	     
		
     	public static Hashtable<String,Object> showProfile(Object[]inputparameters) throws InterruptedException  {
     		try
     	  { 		
     		String requiredurl=(String) inputparameters[0];
     		 		
     		String catchurl=driver.getTitle();
     		Thread.sleep(5000);		
     		outputparameters.put("STATUS", "PASS");
	 		outputparameters.put("MESSAGE", "methodused:showProfile,InputGiven:"+inputparameters[0].toString());
     		Thread.sleep(5000);		
     		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

     		  
     		 		
       	if(catchurl.equalsIgnoreCase(requiredurl))
       	{

       		System.out.println("Test case pass");
       	}

       	else
       	{
       		Thread.sleep(5000);

       		System.out.println("Test case fail");

       	}
     			
     			
          }
     	 catch(Exception e)
  		{
     		outputparameters.put("STATUS", "FAIL");
	 		outputparameters.put("MESSAGE", "methodused:ShowProfile,InputGiven:"+inputparameters[0].toString());

		
	      }
     		return outputparameters;

       }
       }	
	
	


