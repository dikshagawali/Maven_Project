package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableAndDisable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	//	driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();
		WebElement enable = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
		
		enable.click();
		/*
		 * String message = enable.getText(); 
		 */
		
		Thread.sleep(4000);
		
		String message = driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(message);
		
		Thread.sleep(4000);
		
		WebElement disable  = driver.findElement(By.xpath("//button[contains(text(),'Disable')]"));
		disable.click();
		Thread.sleep(4000);
		
		String msg = driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(msg);
		
		
		


			  
	
		
	}

}
