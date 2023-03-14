package Selenium__Automation.Selenium__Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProperty {
	static WebDriver driver;
	
	public static void main(String[] arg) throws IOException {
		
		//how to read property file:
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Config.Properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
		      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
		      driver = new ChromeDriver();
		}
		else if(browserName.equals("ff")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("Safari")) {
			driver = new SafariDriver();
		}
		else if(browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("np browser value is given");
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.className(prop.getProperty("facebook_loginpage_classname"))).isDisplayed();
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("login")).click();
		}
                  
		
	}

}
