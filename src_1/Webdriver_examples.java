import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webdriver_examples {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://youtube.com");
		
	/*	WebElement element = driver.findElement(By.id("masthead-user")); //1st way
		element.click();

		WebElement element = driver.findElement(By.xpath("//*[@id='masthead-user']/a[1]")); // 2nd
		element.click();
		
		
		WebElement element = driver.findElement(By.linkText("Create Account")); // 3rd
		element.click();
*/		
		
		
		String gettext = driver.findElement(By.xpath("//*[@id='feed-main-youtube']/div[2]/div/ul/li[2]/div/div/div/div[2]/div/div/p[1]")).getText();
		System.out.println(gettext);
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("coaching");
		driver.findElement(By.xpath("//*[@id='submitbutton']")).click();
		
		
		
		
		
	}

}
