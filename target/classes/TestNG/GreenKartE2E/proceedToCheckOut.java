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
public class proceedToCheckOut {

	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	public proceedToCheckOut(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	//@Test
	public void CheckOut() throws IOException
	{
		
		//Will try create page object classes and will call here together
		
		//selectVegetablesToCart VegeCart = new selectVegetablesToCart(driver);
		
		//proceedToCheckOut obj = new proceedToCheckOut();
		
		//selectVegetablesToCart.addVegetablesToCart(driver);
		
		
		
		  //driver = initializeDriver();
		  
		 // String urlName = prop.getProperty("url"); driver.get(urlName);
		 
		pageFactoryGreenKart pf1 = new pageFactoryGreenKart(driver);
		
		//Thread.sleep(3000);
		//WebElement imgCart;
		//imgCart = driver.findElement(By.cssSelector("img[alt='Cart']"));
		//imgCart.click();
		
		pf1.selectCart().click();
		
		//WebElement checkOut;
		//checkOut = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		//checkOut.click();
    	////button[contains(text(),'PROCEED TO CHECKOUT')]
    	//Thread.sleep(2000);
    	//Explicit wait until promo code box is displayed
    	//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		pf1.proceedCheckOut().click();
		
		log.info("Vegetables in Cart are now checked-out");
		Reporter.log("Vegetables in Cart are now checked-out");
		
	}

}
