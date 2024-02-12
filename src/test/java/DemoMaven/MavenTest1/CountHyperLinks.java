package DemoMaven.MavenTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		
		List<WebElement> listoflinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links on webpage  " +listoflinks.size());
		
		for(WebElement e1:listoflinks) 
		{
			
			System.out.println(e1.getText());
		}
		
		
		

	}

}
