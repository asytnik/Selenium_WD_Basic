package com.openqa.selenium;

public class ChromeDriver implements WebDriver {

	
	public ChromeDriver(){
		
		System.out.println("Launching Chrome");
	}
	
	@Override
	public void click(String locator) {

		System.out.println("Clicked on an Element in chrome : "+locator);
		
		
	}

	@Override
	public void sendKeys(String locator, String value) {
		
		
		System.out.println("Typed in an Element in chrome : "+locator+" value entered : "+value);
		
	}

}
