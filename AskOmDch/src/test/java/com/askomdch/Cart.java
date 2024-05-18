package com.askomdch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMAHALI\\eclipse-workspace\\Asian_Paint_Pune_Batch\\AskOmDch\\src\\test\\resources\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://askomdch.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void addItemToCart() throws InterruptedException {
		
		WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]"));
		
		cartButton.click();
		Thread.sleep(3000);
		
		System.out.println("Item Added!!!!!!!");
	}
	
	@Test(priority=2)
	public void removeItemFromCart() throws InterruptedException {
		Thread.sleep(3000);
		WebElement cartIcon= driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(cartIcon).build().perform();
		
		
		
		WebElement cancelButton = driver.findElement(By.xpath("//a[@class = 'remove remove_from_cart_button']"));
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
		
		cancelButton.click();
		
		Thread.sleep(3000);
		
		System.out.println("Item Removed!!!!!!!");
		
		

	}
	
	@Test(priority=3)
	public void verifyCart() throws InterruptedException {
		
		Thread.sleep(3000);
        WebElement cartIcon1= driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span"));
	
		Actions a2 = new Actions(driver);
		
		a2.moveToElement(cartIcon1).build().perform();
		
		
		

		
		String command = cartIcon1.getText();
		
		System.out.println(command);
		
		Boolean countOfItemInCart = true;
		
		int count = Integer.parseInt(command);
		
		if(count==0) {
			countOfItemInCart=false;
		}
		
		System.out.println(countOfItemInCart);
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
	}

}
