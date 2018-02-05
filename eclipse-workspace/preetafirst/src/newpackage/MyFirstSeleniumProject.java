package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProject {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "C:\\selenium_files\\geckodriver.exe\\");
        driver =new FirefoxDriver();
       signUp(driver); 
       // forgotPassword(driver);     
	}
public static void setup(WebDriver driver) {
	
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
	
public static void signUp(WebDriver driver) {
	driver.get("https://www.facebook.com/");
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.name("email")).sendKeys("Preeta");
    driver.findElement(By.id("pass")).sendKeys("qa123");
    driver.findElement(By.id("loginbutton")).click();
    System.out.println("error");
    
}
public static void forgotPassword(WebDriver driver) {
	driver.get("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("Forgot account")).click();
}

}

