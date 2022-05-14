package week4.day1.assignments;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {
	
	public static void main(String[] args) {
		List<String> actualList = new LinkedList<String>();
		 //if we dont need duplicate use this
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@id=\"navbtn_stockmarket\"]")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		WebElement tableelement = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-condensed table-striped\"]"));
		List<WebElement> rowelement = tableelement.findElements(By.tagName("tr"));
		for (int i=1; i<rowelement.size();i++ ) {    //4. Get all the Security names
			List<WebElement> cols = rowelement.get(i).findElements(By.tagName("td"));
				String text = cols.get(2).getText();
				actualList.add(text);
		}
//		for(int j = 1 ; j < actualList.size(); j++) {
//			if (actualList.get(j).equals(actualList.get(actualList.size()-j)))
//			{
//				System.out.println("Output contains duplicate values" +actualList);
//			}
//		}
		LinkedHashSet<String> newList = new LinkedHashSet<String>(actualList);
		newList.addAll(actualList);
		
		for (String eachvalue :  newList)
			
	
		{
			for (int j=1 ; j < actualList.size(); j++)
			
			 {
				if(eachvalue.equals(actualList.get(j)))
				{
					System.out.println("Output values contains duplicates " +eachvalue);
				}
				
			}
		}
		System.out.println(actualList);  //5. Ensure whether there are duplicate Security names
	}

}


//

