package DemoMaven.MavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");	
		
		int x=10;
	    WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
	    int width=slider.getSize().getWidth();
	    System.out.println(width);
	    Actions move = new Actions(driver);
	    move.moveToElement(slider, ((width*x)/100), 0).click();
	    move.build().perform();
	    System.out.println("Slider moved");

	}

}
