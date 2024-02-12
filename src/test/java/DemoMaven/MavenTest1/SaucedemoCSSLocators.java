package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaucedemoCSSLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		//locate uername = tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		
		//locate password = tag[attribute=value]
		
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		
		//locate login button = tag.valueofclass
		
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//switch to product page
		
		String CurrentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(CurrentWindowHandle);
		
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		driver.findElement(By.cssSelector("a[class=shopping_cart_link]")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("span.shopping_cart_badge")).getText());
		
		driver.findElement(By.cssSelector("button[name=remove-sauce-labs-backpack]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[name=continue-shopping]")).click();
		
		
	} 

}
