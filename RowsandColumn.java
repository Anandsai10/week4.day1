package week4.day1.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowsandColumn {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://html.com/tags/table/");
	driver.manage().window().maximize();
	
	WebElement tableList = driver.findElement(By.xpath("//table[@class=\"attributes-list\"]"));
	 List<WebElement> rowscount = tableList.findElements(By.tagName("tr"));
	 int rowsize = rowscount.size();
	 	List<WebElement> columncount = rowscount.get(1).findElements(By.tagName("td"));
	 	int columnsize = columncount.size();
	 	System.out.println("Row count " +rowsize);
	 	System.out.println("Column Count "+columnsize);
		 	
	 
}
}
