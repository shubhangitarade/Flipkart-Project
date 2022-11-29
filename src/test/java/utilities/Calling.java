package utilities;

public class Calling {

	public static void main(String[] args) throws InterruptedException {
		Object[] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="D:\\Automation Support\\chromedriver.exe";
		SeleniumOperations.launchBrowser(input);
		
		Object[]input1=new Object[1];
		input1[0]="https://flipkart.com/";
        SeleniumOperations.openApplication(input1);
		
	
        Object[]input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        SeleniumOperations.clickOnelement(input2);
		
        Object[]input3=new Object[1];
		input3[0]="//*[@href='/account/login?ret=/']";
        SeleniumOperations.moveElement(input3);
        
        Object[]input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
        SeleniumOperations.clickOnelement(input4);
		
        Object[]input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]= "9370462129" ;
		SeleniumOperations.sendKeys(input5);
		       
        Object[]input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]= "9921741725";
		SeleniumOperations.sendKeys(input6);
		
	    Object[]input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
	    SeleniumOperations.clickOnelement(input7);
	    
	    Object[]input8=new Object[1];
		input8[0]="(//*[@class='NS64GK'])[1]";
        SeleniumOperations.clickOnelement(input8);
        Thread.sleep(5000);
        
        Object[]input9=new Object[1];
		input9[0]="//*[@class='qkYgWG']";
        SeleniumOperations.clickOnelement(input9);
        
        Object[]input10=new Object[2];
		input10[0]="//*[@autocomplete='name']";
		input10[1]= "shubhangi";
		SeleniumOperations.sendKeys(input10);
        
		Object[]input11=new Object[2];
		input11[0]="//*[@name='phone']";
		input11[1]= "9921741725";
		SeleniumOperations.sendKeys(input11);
        
		Object[]input12=new Object[2];
		input12[0]="//*[@name='phone']";
		input12[1]= "412210";
		SeleniumOperations.sendKeys(input12);
        
	    Object[]input13=new Object[2];
		input13[0]="//*[@name='addressLine2']";
		input13[1]= "BaburaoNagar";
		SeleniumOperations.sendKeys(input13);
		               
		Object[]input14=new Object[2];
		input14[0]="//*[@name='addressLine1']";
		input14[1]= "1169,Utkarsh building ,shirur";
		SeleniumOperations.sendKeys(input14);
		
		Object[]input15=new Object[1];
		input15[0]="(//*[@class='_1XFPmK'])[1]";
        SeleniumOperations.clickOnelement(input15);
        
      /*  Object[]input16=new Object[1];
		input16[0]=
        SeleniumOperations.clickOnelement(input16);
        */
	
	}

}
