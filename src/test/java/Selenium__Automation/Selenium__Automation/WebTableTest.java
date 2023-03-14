package Selenium__Automation.Selenium__Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
	
	@Test
	public void web_Table_Test() {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/CZL/pages.html");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		int countNumberValue = 0;
		int sum=0;
		for (WebElement cell : allCells) {
		String cellValue = cell.getText();
		try{
		int number = Integer.parseInt(cellValue);
		System.out.print("print only the numeric value present is: " +number);
		countNumberValue++;
		sum = sum+number;
		}catch (Exception e) {
		}
		}
		System.out.println("Total count of numeric values is :"+countNumberValue);
		System.out.println("Total sum of all the numeric values is :"+sum);
		driver.close();
		}
	
	@Test
	public void AutosuggestionEx_GoogleSearch_Test() {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/CZL/pages2.html");
		driver.manage().window().minimize();
		List<WebElement> allOptions=
				driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
				int count = allOptions.size();
				System.out.println("Number of values present in the dropdown is : " + count);
				String expectedValue="selenium interview questions";
				for (WebElement option : allOptions) {
				String text = option.getText();
				System.out.println("Print the list of auto suggestion values: " +text);
				if (text.equalsIgnoreCase(expectedValue)) {

				option.click();

				break;
				}

				}
		}
	@Test
	public void check_Box_Test() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
//		select specific check boxes
		driver.findElement(By.id("//input[@id='monday']")).click();
				
		List<WebElement> checkbox = driver.findElements(By.id("//input[@type=checkbox' and contains(@id,'day')]"));
		System.out.print("Total No of check boxes:");
//		//using for loop
//		for (int i=0;i<checkbox.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
  //   	for(WebElement chbox:checkbox)
//		{
//			chbox.click();

 //       }
	
		for(WebElement chbox:checkbox)
		{
			String checkboxname=chbox.getAttribute("id");
			if(checkboxname.equals("monday") || checkboxname.equals("tuesday"))
		    {
				chbox.click();
			}
						
				
					
		}

		
	}



}
