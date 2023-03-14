package Selenium__Automation.Selenium__Automation;



import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Drop_Down_Handling_Test {
	
	WebDriver driver;
	@Test
    public void drop_Down_Handling_Test() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("shivani");
        Thread.sleep(3000);
        driver.findElement(By.name("lastname")).sendKeys("korwan");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("shivanikorwan63232@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shivanikorwan63232@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("vani123");
        Thread.sleep(3000);
        WebElement daydrop = driver.findElement(By.name("birthday_day"));
        Select day = new Select(daydrop);
        day.selectByIndex(9);
        Thread.sleep(3000);
        WebElement monthdrop = driver.findElement(By.name("birthday_month"));
        Select month = new Select(monthdrop);
        month.selectByIndex(1);
        Thread.sleep(3000);
        WebElement yeardrop = driver.findElement(By.name("birthday_year"));
        Select year = new Select(yeardrop);
        year.selectByIndex(25);
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
    }
	
	
	@Test
	public void PrintListValues_SortedOrder_test() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			WebElement daydrop = driver.findElement(By.name("birthday_day"));
			Select day = new Select(daydrop);
			List<WebElement> allOptions = day.getOptions();
			System.out.println("-----print the values in the list ----");
			for (WebElement option : allOptions) {
				if(option.getText().equals("11"))
				{
					option.click();
					break;
				}
				
			}
			
	}
	@Test
	public void print_Unique_Element_Sorted_test() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			WebElement listElement = driver.findElement(By.name("email"));
			Select day = new Select(listElement);
			List<WebElement> allOptions = day.getOptions();
			System.out.println("-----print the values in the list ----");
			TreeSet<Integer> allElement = new TreeSet<Integer>();
			for (WebElement option : allOptions) {
				String text = option.getText();	
				System.out.println(text);
				
				}
			System.out.println("allElements");
	
			
	}
	@Test
	public void PrinttheDUPLICATEItem_intheList_HashSet_Test() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			WebElement list = driver.findElement(By.id("day"));
			Select day = new Select(list);
			List<WebElement> allElement = day.getOptions();
			HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
			for (WebElement element : allElement) {

			String text = element.getText();
			if (hashMapObj.containsKey(text)) {
			Integer value = hashMapObj.get(text);
			value++;
			hashMapObj.put(text, value);
			}else{
			hashMapObj.put(text, 3);
			}
			}
			Set<String> allKeys = hashMapObj.keySet();
			for (String key : allKeys) {
			Integer value = hashMapObj.get(key);
			System.out.println(key +"------------"+ value);
			if (value>3) {
				System.out.println("Occurance of " + key + " is :" + value);
			}
			}
			
	}
	@Test
	public void checklisthasDUPLICATEvalues_HashSetTest() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement listbox = driver.findElement(By.id("email"));
			Select s = new Select(listbox);
			List<WebElement> allOptions = s.getOptions();
			int count1 = allOptions.size();
			System.out.println("Number of elements in the list is :" +count1);
			HashSet<String> allElementText = new HashSet<String>();
			for (int i = 0; i < count1; i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
			allElementText.add(text);
			}
			int count2 = allElementText.size();
			System.out.println("Number of elements in the hashset is :" +count2);
			if (count1==count2) {
			System.out.println("list box has NO duplicate values");
			}
			else{
			System.out.println("list box has duplicate values");
			}
		}
	@Test
	public void print_Unique_Element_in_the_listbox_test() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			WebElement listElement = driver.findElement(By.name("birthday_day"));
			Select day = new Select(listElement);
			List<WebElement> allOptions = day.getOptions();
			System.out.println("-----print the values in the list ----");
			HashSet<Integer> allElement = new HashSet<Integer>();
			for (WebElement option : allOptions) {
				if(option.getText().equals("15"))
				{
					option.click();
					break;
				}
			System.out.println("allElements");
			}
			
	}
	
			

}
