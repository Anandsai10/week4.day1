package week4.day1.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteUsage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		WebElement tableList = driver.findElement(By.xpath("//div[@class=\"render\"]//table//tbody"));
		 List<WebElement> columncount = tableList.findElements(By.tagName("td"));
		 int size = columncount.size();
		 for (int i=0; i < size ; i++)
		 {
			 String text = columncount.get(i).getText();
			 if(text.equals("Absolute Usage"))
			 {
				 System.out.println("absolute library is there");
				 for(int j=i ; j<size ; j++ ) {
					 
					 System.out.println(columncount.get(j).getText());
				 }
			 }
		 }
	}

}
