package DemoMaven.MavenTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		
	WebElement element = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select dropdown = new Select(element);
		
		//dropdown.selectByVisibleText("Option 2");
		//dropdown.selectByValue("2");
		
		dropdown.selectByIndex(2);
		
		//to check is it multiple selective dropdown
		
	     if(dropdown.isMultiple()) {
	    	 
	    	 System.out.println("Dropdown is multiple");
	     }
	     
	     else {
	    	 
	    	 System.out.println("Dropdown is not multiple");
	     }
	     
	     
	     //print all dropdown options
	    
	     List <WebElement> alldropdownoption = dropdown.getOptions();
	     
	     System.out.println("Total Options:  " + alldropdownoption.size() );
	     for(WebElement e1: alldropdownoption) {
	    	 
	    	 System.out.println(e1.getText());
	     }
	     
	     driver.close();
	}
	

}
