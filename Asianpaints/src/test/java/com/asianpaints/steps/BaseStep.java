package com.asianpaints.steps;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseStep 
{
	public static WebDriver driver;
	public static ChromeOptions options;
	public static WebDriver setupDriver()
{
	        System.out.println("Launching Chrome Browser");
	        String userProfile ="C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome\\User Data";
	        //System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

	        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMAHALI\\eclipse-workspace\\Asian_Paint_Pune_Batch\\Asianpaints\\src\\test\\resources\\driver\\chromedriver.exe");
	 

	        options = new ChromeOptions();

	        options.addArguments("--user-data-dir="+userProfile);

	        options.addArguments("--profile-directory=Default");

	        options.addArguments("--start-maximized");

	        options.addArguments("--disable-popup-blocking");

	        options.addArguments("--disable-notifications");

	        driver = new ChromeDriver(options);

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        return driver;

	    }
	}    





