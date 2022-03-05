/**
 * 
 */
package TestNG.GreenKartE2E;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

/**
 * @author DELL
 *
 */
public class selectVegetablesToCart {
	
	public static WebDriver driver;


	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@SuppressWarnings("static-access")
	public selectVegetablesToCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	//@Test
	public void addVegetablesToCart(WebDriver driver) throws IOException
	{
		
		//pageFactoryGreenKart pf = new pageFactoryGreenKart(driver);
		
		//driver = initializeDriver();
		
		/*
		 * String urlName = prop.getProperty("url"); driver.get(urlName);
		 */
		
		//Add items into the cart - first select Cucumber to cart which has 30 web elements - hard to figure out
    	String[] itemsNeeded = {"Cauliflower", "Brocolli", "Tomato", "Brinjal"}; //Adding array of string variables
    	int j = 0; //to check for 2 iteration based upon string array
    	
    	List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
    	
    	//@SuppressWarnings("unchecked")
		//List<WebElement> products =(List<WebElement>) pf.selectProductCategory();
    	
    	for(int i=0;i<products.size();i++)
    	{
    		
    	
    		String[] name =products.get(i).getText().split("-"); // "-"
    		String formattedName = name[0].trim(); // "Brocolli "
    		//Converting array to arrayList
    		
    		List<String> itemsNeededList = Arrays.asList(itemsNeeded); //List Util
    		
    		if(itemsNeededList.contains(formattedName))
    		{
    			j++;
    			
    			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); 
    			//driver clicks on wrong item because text() is static xpath which clicks on dynamic web element
    			
    			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); 
    			//this shall select correct items
    			
    			//I know here the select item problem ***********/////
    			
    			//pf.selectVegtables().click();
    			
    			if(j==itemsNeeded.length)
    			{
    				break;
    			}
    			
    			//System.out.println("Selected items are :"+ formattedName);
    
    			
    		}
    		//System.out.println("Selected items are :"+ formattedName);
    	}
		
		// return driver;
    	
    	log.info("Selected vegetables are added to Cart");
		Reporter.log("Selected vegetables are added to Cart");
	}


}
