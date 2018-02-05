package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create a new instance of Firefox Webdriver

		        WebDriver driver;
		        System.setProperty("webdriver.gecko.driver", "C:\\selenium_files\\geckodriver.exe\\");
		        driver =new FirefoxDriver();
		        // And now use this to visit Selenium site
		        driver.get("http://www.seleniumhq.org");
		        
		        //clear the text already existing on the text box if any
		        driver.findElement(By.id("q")).clear();

		        // Find the text input element by its id and enter some text
		        driver.findElement(By.id("q")).sendKeys("Selenium Webdriver");
		        
		        //click on the Go button
		        driver.findElement(By.id("submit")).click();

		        // Check the title of the page
		        System.out.println("Page title is: " + driver.getTitle());

                // driver.close();
		    }
		}
