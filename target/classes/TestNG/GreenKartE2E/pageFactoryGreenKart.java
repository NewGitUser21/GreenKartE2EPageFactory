/**
 * 
 */
package TestNG.GreenKartE2E;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author DELL
 *
 */
public class pageFactoryGreenKart {
	

	public WebDriver driver;
	
	/*
	 * By productName = By.cssSelector("h4.product-name");
	 * 
	 * By addVegtables = By.xpath("//div[@class='product-action']/button");
	 */
	
	
	By productName = By.cssSelector("h4.product-name");
	
	By selectProductFromList = By.xpath("//div[@class='product-action']/button");
	
	By imgCart = By.cssSelector("img[alt='Cart']");
	
	By doCheckOut = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	By coupon = By.cssSelector("input.promoCode");
	
	By couponButton = By.cssSelector("button.promoBtn");
	
	By order = By.xpath("//button[text()='Place Order']");
	
	By CountryName = By.xpath("//div[@class='wrapperTwo']/div/select");
	
	By agreementTerms = By.cssSelector("input.chkAgree");
	
	By proceedON = By.xpath("//button[text()='Proceed']");
	
	
	
	
	public pageFactoryGreenKart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	/*
	 * public WebElement selectProductCategory() {
	 * 
	 * return driver.findElement(productName); }
	 * 
	 * public WebElement selectVegtables() {
	 * 
	 * return driver.findElement(addVegtables); }
	 */
	
	public List<WebElement> productName() 
	{
		
		return driver.findElements(productName);	
	}
	
	public List<WebElement> selectProductFromList() 
	{
		
		return driver.findElements(productName);	
	}
	
	public WebElement selectCart() 
	{
		
		return driver.findElement(imgCart);	
	}
	
	public WebElement proceedCheckOut() 
	{
		
		return driver.findElement(doCheckOut);	
	}
	
	public WebElement applyCoupon() 
	{
		
		return driver.findElement(coupon);	
	}
	
	public WebElement clickCouponButton() 
	{
		
		return driver.findElement(couponButton);	
	}
	
	public WebElement placeOrder() 
	{
		
		return driver.findElement(order);	
	}
	
	public WebElement selectCountry() 
	{
		
		return driver.findElement(CountryName);	
	}
	
	public WebElement selectAgreement() 
	{
		
		return driver.findElement(agreementTerms);	
	}
	
	public WebElement clickProceed() 
	{
		
		return driver.findElement(proceedON);	
	}
	

}
