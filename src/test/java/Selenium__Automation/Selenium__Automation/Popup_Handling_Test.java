package Selenium__Automation.Selenium__Automation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Popup_Handling_Test {
	WebDriver driver;

	@BeforeTest
	public void setUP() {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
  		driver = new ChromeDriver();
	}
	@Test
	public void hidden_Division_Popup() throws InterruptedException {
		
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(300);
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.findElement(By.xpath( "//button[@class='flex flex-middle  t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@aria-label='Sat Feb 04 2023']")).click();


	}
	@Test
	public void file_Uploaded_Popup() throws InterruptedException, IOException {
		
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		Thread.sleep(300);
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.findElement(By.linkText("Choose PDF file")).click();
		Thread.sleep(300);
		Runtime.getRuntime().exec("C:\\Users\\CZL\\Documents\\selenium.au3");
		Thread.sleep(300);

	}
	@Test
	public void get_The_Window_Id_Test() {
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    String windowid = driver.getWindowHandle();
	    System.out.print("The current window id is: " +windowid);

	}
	@Test
	public void child_Browser_Popup() throws InterruptedException {
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().window().maximize();
		Thread.sleep(300);
	    String parentId = driver.getWindowHandle();
		Thread.sleep(300);
	    System.out.println("The current window id is: " +parentId);
		Thread.sleep(300);
//      driver.findElement(By.linkText("FLIGHTS")).click();
	    driver.findElement(By.xpath("//a['@aria-label=\"Menu Flight. Website will be opened in new tab']"));
		Thread.sleep(300);
	    Set<String> allWindowID = driver.getWindowHandles();
	    System.out.println("The all window id's are: " +allWindowID);
	    int count = allWindowID.size();
        System.out.println("The number of windows opened by selenium are: " +count);
	    for(String windowHandle : allWindowID) {
	    	driver.switchTo().window(windowHandle);
	    	if(windowHandle.equals(parentId)) {
	    		driver.close();
	    	}
	    }

		
		

	    
	}
	@Test
	public void close_Main_Browser() throws InterruptedException {
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().window().maximize();
		Thread.sleep(300);
		String parentId = driver.getWindowHandle();
		Thread.sleep(300);
	    System.out.println("The current window id is: " +parentId);
		Thread.sleep(300);
//      driver.findElement(By.linkText("FLIGHTS")).click();
	    driver.findElement(By.xpath("//a['@aria-label=\"Menu Flight. Website will be opened in new tab']"));
		Thread.sleep(300);
	    Set<String> allWindowID = driver.getWindowHandles();
	    System.out.println("The all window id's are: " +allWindowID);
	    int count = allWindowID.size();
	    System.out.println("The number of windows opened by selenium are: " +count);
	    for(String windowHandle : allWindowID) {
	    	driver.switchTo().window(windowHandle);
	    	if(windowHandle.equals(parentId)) {
	    		driver.close();
	    System.out.println("The number of windows closed by selenium are: " +count);
	    
	    	}
	    	
	    }
	    
	}
	@Test
	public void close_All_Child_Browser_Only() throws InterruptedException {
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().window().maximize();
		Thread.sleep(300);
	    String parentId = driver.getWindowHandle();
		Thread.sleep(300);
	    System.out.println("The current window id is: " +parentId);
	    Thread.sleep(300);
//      driver.findElement(By.linkText("FLIGHTS")).click();
	    driver.findElement(By.xpath("//a['@aria-label=\"Menu Flight. Website will be opened in new tab']"));
		Thread.sleep(300);
	    Set<String> allWindowID = driver.getWindowHandles();
	    System.out.println("The all window id's are: " +allWindowID);
	    int count = allWindowID.size();
	    System.out.println("The number of windows opened by selenium are: " +count);
	    for(String windowHandle : allWindowID) {
	    	driver.switchTo().window(windowHandle);
	    	if(windowHandle.equals(parentId)) {
	    		driver.close();
	    System.out.println("child Browser windows closed by selenium are: " +count);
	    
	    	}
	    	
	    }
	    
	}
	@Test
	public void Close_Any_Specified_Browser() throws InterruptedException {
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().window().maximize();
		Thread.sleep(300);
	    String parentId = driver.getWindowHandle();
		Thread.sleep(300);
	    System.out.println("The current window id is: " +parentId);
	    Thread.sleep(300);
//      driver.findElement(By.linkText("FLIGHTS")).click();
	    driver.findElement(By.xpath("//a['@aria-label=\"Menu Flight. Website will be opened in new tab']"));
		Thread.sleep(300);
	    Set<String> allWindowID = driver.getWindowHandles();
	    System.out.println("The all window id's are: " +allWindowID);
	    int count = allWindowID.size();
	    System.out.println("The number of windows opened by selenium are: " +count);
	    for(String windowHandle : allWindowID) {
	    	driver.switchTo().window(windowHandle);
	    	if(windowHandle.equals(parentId)) {
	    		driver.close();
	    System.out.println("child Browser windows closed by selenium are: " +count);
	    System.out.println("Any specifie browser windows closed by selenium are: " +count);
	    
	    	}
	    	
	    }
	    
	}
	@Test
	public void HandleTabs_using_getWindowHandles() {
	driver.get("https://demo.actitime.com/login.do");
	String parentwindowHandle = driver.getWindowHandle();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
    Set<String> allWindowHandle= driver.getWindowHandles();
    System.out.println("The all window id's are: " +allWindowHandle);
    int title = allWindowHandle.size();
	//  System.out.println("The number of windows opened: " +title);
    for(String windowHandle : allWindowHandle) {
    	driver.switchTo().window(windowHandle);
    	if(windowHandle.equals(parentwindowHandle)) {
  	System.out.println("window of the child tab is :"+ title);	
  	System.out.println("window of the parent window is closed :"+ title);		
         	driver.close();
    	     }
       
  	
    	  }
    	
       }
    @Test
        public void file_Download_With_Chrome() throws InterruptedException {

        //Create Hashmap object and assign the profile settings

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>(); 

        chromePrefs.put("profile.default_content_settings.popups", 0); 

        chromePrefs.put("download.default_directory", "C:\\Users\\admin\\Downloads\\Default Folder"); 

        //Assign this chromePrefs object with ChromeOptions object 

        ChromeOptions options = new ChromeOptions(); 

        options.setExperimentalOption("prefs", chromePrefs);

        //Create Capability object and assign the option object 

        DesiredCapabilities cap = new DesiredCapabilities(); 

        cap.setCapability(ChromeOptions.CAPABILITY, options); 

        driver.get("http://www.seleniumhq.org/download/"); 

        Thread.sleep(3000);

        String xp = "//div[3]//div[1]//div[2]//p[2]//a[1]"; 

        driver.findElement(By.xpath(xp)).click();

        

    }
    
	
   
	

}
