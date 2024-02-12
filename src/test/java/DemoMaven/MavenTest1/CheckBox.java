package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.findElement(By.xpath("//input['checkbox'][1]")).click();
	
		
WebElement element = driver.findElement(By.xpath("//input['checkbox'][1]"));
		
	if(element.isSelected()) {
		
	
		System.out.println("Option 1 is selected");
		
		element.click();
	}
	
	else {
		

		System.out.println("Option 1 is deselected");
	}
	
	
		
		
		
		 
		
		
		
		
	

	}

}
