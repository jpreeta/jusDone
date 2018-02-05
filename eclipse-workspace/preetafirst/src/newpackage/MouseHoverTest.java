package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_files\\geckodriver.exe\\");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.bookmeds.com/");	
		 
				driver.manage().window().maximize();		    
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
				// Refering to Products Link
				    WebElement element = driver.findElement(By.xpath(".//*[@id='headerMenuParent']/div/ul[1]/li[2]/a"));		 
		        Actions action = new Actions(driver);  
		        // Mouse Hover on the Products link 
		        action.moveToElement(element).build().perform();        
		        // Click on Home Products Link
		        driver.findElement(By.xpath(".//*[@id='headerMenuParent']/div/ul[1]/li[2]/div/div/div[1]/div[2]/div[1]/strong/a")).click();


	}

}
