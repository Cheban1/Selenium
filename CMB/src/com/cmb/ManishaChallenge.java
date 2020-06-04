package com.cmb;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManishaChallenge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cheban\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//create browser driver/launch chrome browser window with blank URL
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//navigate the specified URL
		driver.get("http://testautomationpractice.blogspot.com/");
		
		
		
	}

}
