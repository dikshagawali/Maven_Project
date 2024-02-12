package DemoMaven.MavenTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		System.out.println("Page Title :  "+ driver.getTitle());
		System.out.println("Current URL : "+ driver.getCurrentUrl());

	}

}
