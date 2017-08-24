import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class web_dropdown {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://paypal.com");
		
		driver.findElement(By.xpath("//*[@id='navPrimary']/ul/li[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='amount_ccode']")).sendKeys("EUR - Euros");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='amount_ccode']"));
		
		List<WebElement> dropoptions = dropdown.findElements(By.tagName("option"));
		
		for(int i=0; i<dropoptions.size(); i++){
			
			System.out.println(dropoptions.get(i).getText());
		}
		
		System.out.println(dropoptions.size());

	System.out.println("------------Print All links on the webpage -----------");
		
		WebElement links = driver.findElement(By.xpath("//*[@id='page']"));
		List<WebElement> alllinks = links.findElements(By.tagName("div"));
		
		System.out.println(alllinks.size());
		
		for(int i=0; i<alllinks.size(); i++){
			
			System.out.println(alllinks.get(i).getText());
		}
		
		
		
		
	}

}
