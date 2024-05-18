package com.asianpaints.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class storageAndWardrobes {
	Actions act;
	@FindBy(xpath="//a[@data-target='#HOMEDECOR']")
	WebElement Homedecor;
	@FindBy(xpath="//a[@href='https://www.asianpaints.com/home-decor/furniture/sideboards-and-cabinets.html']")
	WebElement wardrobes;
	@FindBy(xpath="//img[@data-src='//static.asianpaints.com/content/dam/asian_paints/new-furniture/furniture-categories/sideboards-and-cabinets/osaka/UFDANSGSBWHTE06033-PLP.jpg.transform/cc-width-302-height-302/image.jpg']")
	WebElement storage;
	@FindBy(xpath="//input[@class='form-global__field form-dropdown__field commonTextComp selected-quantity']")
	WebElement Selectcity;
	@FindBy(xpath="//a[text()='Ahmedabad']")
	WebElement onecity;
	@FindBy(xpath="//button[text()='Find Store']")
	WebElement findstore;
	@FindBy(xpath="//button[text()='Book A Visit']")
	WebElement Bookavisit;
	@FindBy(xpath="//input[@id='product-name']")
	WebElement name;
	@FindBy(xpath="//button[@class='ctaText enquireForm--step-1-submit productFormSubmitBtn']")
	WebElement submit;
	private WebDriver driver;
	public  storageAndWardrobes(WebDriver driver){
		
		  this.driver=driver; 
			PageFactory.initElements(driver,this);
			act=new Actions(driver);
	}
		public void Homedecor() throws InterruptedException{		
			act.moveToElement(Homedecor).perform();
			Thread.sleep(2000);	
		}
		public void wardrobes() throws InterruptedException{		
			act.moveToElement(wardrobes).perform();
			wardrobes.click();
			Thread.sleep(2000);	
		}
		public void storage() throws InterruptedException{ 		
			storage.click();
			Thread.sleep(2000);
		}
		public void Selectcity() throws InterruptedException{
			JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,350)", "");
			Selectcity.click();
			Thread.sleep(2000);
		}
		public void onecity()throws InterruptedException{
			onecity.click();
			Thread.sleep(2000);
		}
		public void findstore() throws InterruptedException{
			findstore.click();
			Thread.sleep(2000);
		}
		public void Bookavisit() throws InterruptedException{
			Bookavisit.click();
			Thread.sleep(2000);
			//(crossbutton.isDisplayed()){
			//crossbutton.click();
		//}
		}
		public void name() throws InterruptedException{
			name.click();
			Thread.sleep(2000);
		}
		public void submit() {
			submit.click();
		}
}
