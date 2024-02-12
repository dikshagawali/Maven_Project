package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
		
		//maximize browser
	    driver.manage().window().maximize();
	    
	    
		//open url
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
	 driver.findElement(By.xpath("//input[@id='target']"));
	
	Actions act = new Actions(driver);
	 act.keyDown(Keys.ARROW_DOWN).perform();
	 

	}

}
