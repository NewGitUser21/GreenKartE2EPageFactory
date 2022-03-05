/**
 * 
 */
package TestNG.GreenKartE2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author DELL
 * Its awesome
 */
public class coreNavigator extends base {
	
	public static WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialized");
		Reporter.log("Driver is initialized");
		
        String urlName = prop.getProperty("url");	
		driver.get(urlName);
		log.info("Navigated to Home Page");
		Reporter.log("Navigated to Home Page");
		
	}
	
	@Test
	public static void PageNavigation() throws IOException, InterruptedException
	{ 
	
		
		/*
		 * driver = initializeDriver();
		 * 
		 * String urlName = prop.getProperty("url");
		 * 
		 * driver.get(urlName);
		 */
		
		selectVegetablesToCart sv = new selectVegetablesToCart(driver);
		sv.addVegetablesToCart(driver);
		
		proceedToCheckOut pc = new proceedToCheckOut(driver);
		pc.CheckOut();
		
		applyCouponToPlaceOrder ac = new applyCouponToPlaceOrder(driver);
		ac.applyCoupon();
		
		selectCountryToProceed sp = new selectCountryToProceed(driver);
		sp.countryToProceed();
		
		
	}
	
	/*
	 * @AfterTest public void tearDown() { driver.close(); //sdriver.quit();
	 * 
	 * log.info("Driver closed"); Reporter.log("Driver closed"); }
	 */

}
