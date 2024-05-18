package com.asianpaints.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homedecor{
	
		Actions act;
		@FindBy(xpath="//a[@data-target='#HOMEDECOR']")
		WebElement homedecor;
		@FindBy(xpath="//a[@href='https://www.asianpaints.com/home-decor/furniture/sofa.html']")
		WebElement sofa;
		@FindBy(xpath="//a[@href='https://www.asianpaints.com/home-decor/furniture/sofa/sicily-sectional-sofa-2-seater-plus-chaise-lh-cs052l2trfrw.html']")
		WebElement sofasub;
		@FindBy(xpath="//input[@id='enqurire-visit-time']")
		WebElement selectcity;
		@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div[7]/div[1]/div[1]/ul/li[1]/a")
		WebElement Amritsar;
		@FindBy(xpath="//button[text()='Find Store']")
		WebElement findstore;
		

	private WebDriver driver;	
    public  Homedecor(WebDriver driver){	
	  this.driver=driver; 
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
	
	public void homedecor() throws InterruptedException{		
		act.moveToElement(homedecor).perform();
		Thread.sleep(2000);	
	}
	
	public void sofa() throws InterruptedException{ 		
		//act.moveToElement(sofa).click().perform();
		sofa.click();
		Thread.sleep(2000);
	}
	
	public void sofasub() throws InterruptedException{
		//act.moveToElement(sofa_sub).click().perform();
		sofasub.click();
		Thread.sleep(2000);
	}
	
	public void selectcity() throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,350)", "");
		//act.moveToElement(selectcity).click().perform();
        selectcity.click();
		Thread.sleep(2000);
	}
	
	//public void dropdown() throws InterruptedException{
		//act.moveToElement(dropdown).click().perform();
//		dropdown.click();
//		Thread.sleep(2000);
//	}
	
	public void Amritsar() throws InterruptedException{
		Amritsar.click();
		Thread.sleep(1000);
	}
	
	public void findstore() throws InterruptedException{
		//act.moveToElement(findstore).click().perform();
		findstore.click();
		Thread.sleep(2000);

	}
}

