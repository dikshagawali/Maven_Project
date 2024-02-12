package DemoMaven.MavenTest1;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.net.HttpURLConnection;

public class brokenimages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		//find images
		
		List <WebElement> list = driver.findElements(By.tagName("img"));
		
		int rescode = 200;
		int brokenimgCnt = 0;
		System.out.println("Total images on page " +list.size());
		
		// get image link
		
		for(WebElement element:list) {
			
			String url = element.getAttribute("src"); // capture URL
				
			try {
				
				URL urllink = new URL(url);
				
				HttpURLConnection huc = (HttpURLConnection)urllink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				rescode = huc.getResponseCode();
				
				if(rescode >= 400) {
					
					System.out.println(url +  "broken link.");
					brokenimgCnt++;
					
				}
				
			}
			
			
			
			catch(MalformedURLException e) {
				
				
			}
			
            catch(Exception e) 
			{
				
				
			}
		
			}
		
		System.out.println("Total broken images: " + brokenimgCnt);
		
	
		}
		
		
		
		
		
		
		
	}


