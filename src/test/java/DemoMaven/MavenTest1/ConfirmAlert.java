package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//launch browser
				WebDriver driver = new ChromeDriver();
				
				//maximize browser
			    driver.manage().window().maximize();
			    
			    
				//open url
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				
				driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
				
				// Switch to alert window and accept the alert
					//driver.switchTo().alert().accept(); // ok button is clicked
				driver.switchTo().alert().dismiss();
					
				
				
	}

}
