package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
	    driver.manage().window().maximize();
	    
	    
		//open url
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		//find source and target web element
	WebElement source = driver.findElement(By.xpath("//div[@id='column-b']"));
	WebElement target =	driver.findElement(By.xpath("//div[@id='column-a']"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(source, target).perform();
	
		

	}

}
