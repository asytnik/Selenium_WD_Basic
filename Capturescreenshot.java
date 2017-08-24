import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Capturescreenshot {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	public static void main(String[] args) throws IOException, MessagingException {
		WebDriver driver = new FirefoxDriver();
		SendMailUsingAuthentication mail = new SendMailUsingAuthentication();
		
		driver.get("http://gmail.com");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\capturescreen.jpg"));
		
		/*
		 * 
		 * Screenshot in case of an error
		 * 
		 */
		
		
		try{
		driver.findElement(By.xpath("//*[@id='dddd']"));
		
		}catch(Throwable t){
			
			FileUtils.copyFile(scrFile, new File("c:\\errorscreen1.jpg"));
		mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt, SendMailUsingAuthentication.emailFromAddress);
			
		}

	}
	
	

}
