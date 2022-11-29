package cucumbermap;

import cucumber.api.java.en.When;
import utilities.SeleniumOperations;

public class Manage {
	
	@When ("^user click on Manage Address$")
	public void manageAdd() throws InterruptedException
	{
	    Object[]input8=new Object[1];
		input8[0]="(//*[@class='NS64GK'])[1]";
        SeleniumOperations.clickOnelement(input8);
        Thread.sleep(5000);
        
	}
	
	@When ("^user click on ADD A NEW  ADDRESS$")
	public void addNewaddres() throws InterruptedException
	{
	    Object[]input9=new Object[1];
		input9[0]="//*[@class='qkYgWG']";
	    SeleniumOperations.clickOnelement(input9);

	}
	
	@When ("^user enter name as \"(.*)\"$")
	public void enterName(String name) throws InterruptedException
	{
        Object[]input10=new Object[2];
		input10[0]="//*[@autocomplete='name']";
		input10[1]= name;
		SeleniumOperations.sendKeys(input10);
	}

	@When ("^user enter \"(.*)\"as mobile no.$")
	public void enterMobile(String phone) throws InterruptedException
	{
		Object[]input11=new Object[2];
		input11[0]="//*[@name='phone']";
		input11[1]= phone;
		SeleniumOperations.sendKeys(input11);
	}
	
	@When ("^user enter pincode \"(.*)\"$")
	public void enterPin(String pin) throws InterruptedException
	{
		Object[]input12=new Object[2];
		input12[0]="//*[@name='phone']";
		input12[1]= pin;
		SeleniumOperations.sendKeys(input12);
	}
	
	@When ("^user enter locallity \"(.*)\"$")

		public void enterLocallity(String local) throws InterruptedException
		{
			Object[]input13=new Object[2];
			input13[0]="//*[@name='addressLine2']";
			input13[1]= local;
			SeleniumOperations.sendKeys(input13);	
		}
	
	@When ("^user enter Address as \"(.*)\"$")
	public void enterAddress(String add) throws InterruptedException
	{
		Object[]input14=new Object[2];
		input14[0]="//*[@name='addressLine1']";
		input14[1]= add;
		SeleniumOperations.sendKeys(input14);	
	}
	
	@When ("^user click on  Home button$")
	public void clickOnhome() throws InterruptedException
	{
		Object[]input15=new Object[1];
		input15[0]="(//*[@class='_1XFPmK'])[1]";
        SeleniumOperations.clickOnelement(input15);
	}
	
	@When ("^user click on save$")
	public void save() throws InterruptedException
	{
		Object[]input16=new Object[1];
		input16[0]="//*[text()='Save']";
        SeleniumOperations.clickOnelement(input16);
	}






	
	
	
	
	
	
	
	
	
	
	
	

}
