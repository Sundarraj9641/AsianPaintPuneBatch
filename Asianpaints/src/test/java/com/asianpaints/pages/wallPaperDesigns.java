package com.asianpaints.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wallPaperDesigns{
	static WebDriverWait wait;
	Actions act;
	@FindBy(xpath="//a[@data-target='#HOMEDECOR']")
	WebElement homedecor;
	@FindBy(xpath="//*[@id=\"DECOR\"]/li[1]/a")
	WebElement wallpaper;
	@FindBy(xpath="//img[@data-src='//static.asianpaints.com/content/dam/asian_paints/wall-coverings/others/wallcovering-lp-designer-collection-thumbnail-good-earth-asian-paints.jpg.transform/cc-width-350-height-350/image.webp']")
	WebElement design;
	@FindBy(xpath="//img[@data-src='/content/dam/asian_paints/wall-coverings/hideaway/roomshots/W182XU70N75_02.jpg.transform/cc-width-302-height-302/image.jpg']")
	WebElement paint;
	@FindBy(xpath="//input[@id='checkPincode']")
	WebElement pincode;
	@FindBy(xpath="//button[@class='ctaText js-checkBtn check-pin-code-click']")
	WebElement check;
	@FindBy(xpath="//button[@id='add-to-cart-click']")
	WebElement addToCart;
	private WebDriver driver;	
    public  wallPaperDesigns(WebDriver driver){
	
	  this.driver=driver; 
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
    public void homedecor1() throws InterruptedException{		
		act.moveToElement(homedecor).build().perform();
		Thread.sleep(2000);	
    }
    public void wallpaper() throws InterruptedException{
    	wallpaper.click();
    	Thread.sleep(4000);
    }
    public void design() throws InterruptedException{
    	JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);
    	design.click();
    	Thread.sleep(3000);
    }
    public void paint() throws InterruptedException{
    	Thread.sleep(2000);
        //String parentWindowHandle =driver.getWindowHandle();
        paint.click();  
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
//        for(String handle : allWindowHandles)
//        {
//            if(!handle.equals(parentWindowHandle))
//            {
//                driver.switchTo().window(handle);
//            }
        Iterator<String> itc=allWindowHandles.iterator();
        String window = itc.next();
        String window1 = itc.next();
        driver.switchTo().window(window1);
        }
         public void pincode(String pn) throws InterruptedException{
//    	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//        jsExecutor.executeScript("arguments[0].click();", pincode);
//       	 wait = new WebDriverWait(driver, 30);
//         wait.until(ExpectedConditions.elementToBeClickable(pincode));
        pincode.sendKeys(pn);
    	Thread.sleep(2000);
    }
    public void check() throws InterruptedException{
    	check.click();
    }
    public void addToCart() throws InterruptedException{
    	addToCart.click();
    	Thread.sleep(2000);
    }
}
