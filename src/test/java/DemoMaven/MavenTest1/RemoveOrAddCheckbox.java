package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveOrAddCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement remove = driver.findElement(By.xpath("//button[contains(text(), 'Remove')]"));
		
		remove.click();
Thread.sleep(4000);
		
		String message = driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(message);
		
		WebElement add = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		add.click();
		
Thread.sleep(4000);
		
		String msg = driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(msg);
		
	}

}
