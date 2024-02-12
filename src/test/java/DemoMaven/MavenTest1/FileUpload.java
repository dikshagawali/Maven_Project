package DemoMaven.MavenTest1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
	    driver.manage().window().maximize();
	    
	    
		//open url
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Find web element to choose file
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\abhis\\OneDrive\\Desktop\\AllLinks.txt");
		
		WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//copy file to clip board
	StringSelection ss = new StringSelection ("C:\\Users\\abhis\\OneDrive\\Desktop\\AllLinks.txt") ;
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	//perform control + V action to paste file
	
	rb.keyPress(KeyEvent.VK_CONTROL); //using robot class
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	}
	

}
