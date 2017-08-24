import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testSample {

	
	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
		/*
		WebElement element = driver.findElement(By.id("Email"));
		element.sendKeys("raman@way2automation.com");
		
		element = driver.findElement(By.xpath("//*[@id='Passwd']"));
		element.sendKeys("sdfdf");
		
		element = driver.findElement(By.name("signIn"));
		element.click();
		
		element = driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']"));
		System.out.println(element.getText());
		*/
		
		
		driver.findElement(By.id("Email")).sendKeys("raman@way2automation.com");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("dfdf");
		driver.findElement(By.name("signIn")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).getText());
		

	}

}
