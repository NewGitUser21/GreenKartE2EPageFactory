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
public class applyCouponToPlaceOrder {
	
	
public WebDriver driver;
	
public static Logger log = LogManager.getLogger(base.class.getName());


	public applyCouponToPlaceOrder(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void applyCoupon() throws IOException
	{
		
		pageFactoryGreenKart pg2 = new pageFactoryGreenKart(driver);
		
		pg2.applyCoupon().sendKeys("rahulshettyacademy");
		
		pg2.clickCouponButton().click();
		
		log.info("Coupon code is applied");
		Reporter.log("Coupon code is applied");
		
		pg2.placeOrder().click();
		
		log.info("Order is now placed successfully");
		Reporter.log("Order is now placed successfully");
		
	}

}
