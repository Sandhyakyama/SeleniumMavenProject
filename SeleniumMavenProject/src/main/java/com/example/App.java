package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App {
    public WebDriver driver;
	
	
	public void Setup() {
	WebDriverManager.chromedriver().setup();
		      driver =new ChromeDriver();
		     driver.manage().window().maximize();
		        driver.get("https://www.google.com");
		        
	}
		        public void TearDown() {
		            if (driver != null) {
		                driver.quit();
		            }
		        }
	
}
