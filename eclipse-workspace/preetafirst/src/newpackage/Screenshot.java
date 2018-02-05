package newpackage;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe\\");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");  
	    driver.manage().window().maximize();	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    File screenShot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			String screenLocation = "C:\\ScreenShots\\exception.png";	
			FileUtils.copyFile(screenShot, new File(
					screenLocation));			
			System.out.println("<a href=file:///" + screenLocation + ">Screen Shot Link</a>");
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}

	}
