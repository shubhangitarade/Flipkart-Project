package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.HTMLReportGenerator;

public class Hookable
{
	
	
	
	
	
@Before
public void before(Scenario scenario) throws UnknownHostException
{
	HTMLReportGenerator.TestSuiteStart("G:\\My Drive\\report.html","Flipkart1");
	HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	
	System.out.println("---------------------Starts-------------------------");
	
}

	
@After
public void after(Scenario scenario)
{
	
	System.out.println("---------------------Ends-------------------------");
    HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
