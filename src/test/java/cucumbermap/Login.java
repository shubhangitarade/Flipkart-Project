package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.HTMLReportGenerator;
import utilities.SeleniumOperations;

public class Login
      {
      @When ("^user provide \"(.*)\" and exe location as \"(.*)\"$")
	  public void launchB(String key, String exe)
	  {
		Object[] input=new Object[2];
		input[0]=key;
		input[1]=exe;
		SeleniumOperations.launchBrowser(input);
	   }
     
      @When ("^user provide url as \"(.*)\"$")
	  public void openAp(String url)
	  {
		Object[]input1=new Object[1];
		input1[0]=url;
        SeleniumOperations.openApplication(input1);
	   }
	   
      @When ("^user cancle initial login page$")
      public void cancle() throws InterruptedException
       {   
		 Object[]input2=new Object[1];
		 input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	     SeleniumOperations.clickOnelement(input2);
       }	
       
     @ When("^user navigate on Login$")
	 public void login() throws InterruptedException
	   {
		 Object[]input3=new Object[1];
	     input3[0]="//*[@href='/account/login?ret=/']";
	    Hashtable<String,Object> output3= SeleniumOperations.moveElement(input3);
	    HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on Login$", output3.get("MESSAGE").toString());
	     Thread.sleep(5000);   
	   }
	
      @When ("^user click on My profile$")
	  public void click() throws InterruptedException
	  {
	  Object[]input4=new Object[1];
	  input4[0]="(//*[@class='_3vhnxf'])[1]";
	  Hashtable<String,Object> output4= SeleniumOperations.clickOnelement(input4);
	    HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on My profile$", output4.get("MESSAGE").toString()); 
	  }
	
      @When("^user enter (\\d+) as username$")
	public void enter(String name) throws InterruptedException
	{
		Object[]input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
        input5[1]= name ;
        Hashtable<String,Object> output5=SeleniumOperations.sendKeys(input5);
	    HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter (\\d+) as username$", output5.get("MESSAGE").toString()); 

	}
	
      @When("^user enter (\\d+) as password$")
	public void enter2(String pass) throws InterruptedException
	{
		  
        Object[]input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]= pass;
		Hashtable<String,Object> output6=SeleniumOperations.sendKeys(input6);
	    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter (\\d+) as password$", output6.get("MESSAGE").toString()); 

	}
	
	@When ("^user click on Login button$")
	public void click1() throws InterruptedException
	{
		Object[]input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		Hashtable<String,Object> output7= SeleniumOperations.clickOnelement(input7);
	    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString()); 

	}
	
	@Then("^application shows user profile to user$")
	public void myProfile() throws InterruptedException
	{
	  Object[]input8=new Object[1];
	  input8[0]="Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
		Hashtable<String,Object> output8= SeleniumOperations.showProfile(input8);
	    HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows user profile to user$", output8.get("MESSAGE").toString()); 

	  
		  	}
      
      
      
      
      
      }

		
	



		
	 

		


	
	
	

