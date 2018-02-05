package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\selenium_files\\IEDriverServer.exe\\");
	    WebDriver driver = new InternetExplorerDriver();;
	    driver.get("http://www.google.com/");  
	    driver.manage().window().maximize();	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement element = driver.findElement(By.name("q"));		
			Actions builder = new Actions(driver);
			   Action seriesOfActions = builder
				       .moveToElement(element).click()
				       .keyDown(element,Keys.SHIFT)
				       .sendKeys(element,"selenium")
				       .keyUp(element, Keys.SHIFT)
				       .sendKeys(element, Keys.chord(Keys.CONTROL,"a"))
				       .sendKeys(element,Keys.SPACE)
				       .contextClick(element)
				       .sendKeys(Keys.ARROW_DOWN)
				       .sendKeys(Keys.ENTER)
				       .build();
				   seriesOfActions.perform();


	}

}
