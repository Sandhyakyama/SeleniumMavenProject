package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebelementsLocators extends App {	
		
    public void LocatorsTest() {
    	Setup();  	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://github.com/login");
    driver.findElement(By.id("login_field")).sendKeys("Sandhyakyama");
    highlight(driver, driver.findElement(By.linkText("Forgot password?")));
    driver.findElement(By.name("password")).sendKeys("Sandy@kyama10");
    WebElement Login=driver.findElement(By.name("commit"));
    Login.click();
    
    	
        System.out.println("Running TestNG test...");
 
        TearDown();
    }
    
    public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
    
    public static void main(String[] args) {
    
    	WebelementsLocators test= new WebelementsLocators();
    	test.LocatorsTest();
    }
}
