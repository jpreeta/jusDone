package com.jusdone.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	
	public static WebDriver driver;
	public static String browserType;
	public static String url;
	public static long pageLoadTimeOut;
	public static long implicitWait;
	
	/**
	 * @param browserType - <p><br>Chrome for Google Chrome</br>
	 * <br>Firefox for Mozila Firefox</br>
	 * <br>IE for Internet Explorer</br>
	 * @param url - URL of JustDone Project
	 * @param pageLoadTimeOut - Load timeout for page
	 * @param implicitWait- Implicit wait
		 **/
	//object Inti
	public BaseTest(String browserType, String url, long pageLoadTimeOut, long implicitWait){
		//Get new driver if no driver is initialized
		if(driver==null) {
			this.browserType = browserType;
			this.url = url;
			this.pageLoadTimeOut = pageLoadTimeOut;
			this.implicitWait = implicitWait;
			initialization();
		}
		
	}
	
	public static void initialization(){
			
		if(browserType.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe\\");	
			driver = new ChromeDriver(); 
		}
		else if(browserType.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\selenium_files\\geckodriver.exe\\");	
			driver = new FirefoxDriver(); 
		} 
		else if(browserType.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\selenium_files\\IEDriverServer.exe\\");	
			driver = new InternetExplorerDriver(); 
		}
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOut, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
	
	driver.get(url);
	}

}