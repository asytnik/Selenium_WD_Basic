package com.thoughtworks.selenium;

public class DefaultSelenium {

	
	public DefaultSelenium(String serverHost, int serverPort, String browserStartCommand, String browserURL){
		
		System.out.println("Server host : "+serverHost);
		System.out.println("Server Port : "+serverPort);
		System.out.println("Browser : "+browserStartCommand);
		System.out.println("URL : "+browserURL);
		
	}
	
	public void start(){
		
		System.out.println("starting the selenium session");
		
	}
	
	public void click(String locator){
		
		System.out.println("Clicked on an Element : "+locator);
		
	}
	
	
	public void type(String locator, String value){
		
		System.out.println("selected the element as : "+locator+" typed the value as : "+value);
		
	}
	
	
}
