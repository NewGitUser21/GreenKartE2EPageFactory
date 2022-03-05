/**
 * 
 */
package TestNG.GreenKartE2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

/**
 * @author DELL
 *
 */
public class selectCountryToProceed {
	
public WebDriver driver;

public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	public selectCountryToProceed(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void countryToProceed() throws IOException
	{
		
		pageFactoryGreenKart pg3 = new pageFactoryGreenKart(driver);
	
		pg3.selectCountry().sendKeys("India");
		
		log.info("Country code is selected as 'INDIA'");
		Reporter.log("Country code is selected as 'INDIA'");
		
		pg3.selectAgreement().click();
		
		log.info("Agreement selected");
		Reporter.log("Agreement selected");
		
		pg3.clickProceed().click();
		
		log.info("Order is placed successfully - Now user redirected back to Home Page");
		Reporter.log("Order is placed successfully - Now user redirected back to Home Page");
	}

}
