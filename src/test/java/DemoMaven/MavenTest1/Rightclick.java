package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
	    driver.manage().window().maximize();
	    
	    
		//open url
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
	WebElement box = driver.findElement(By.xpath("//div[@id = 'hot-spot']"));
	
	Actions act = new Actions(driver);
	act.contextClick(box).perform();//right click
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	
	
	
	
		
		
		
		

	}

}
