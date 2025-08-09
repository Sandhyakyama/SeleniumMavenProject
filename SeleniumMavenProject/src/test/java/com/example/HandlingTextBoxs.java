package com.example;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTextBoxs extends App{
	
	public void TextBoes() {
		Setup();
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://github.com/login");
    WebElement  UsernameText=  driver.findElement(By.id("login_field"));
	if(UsernameText.isDisplayed()) {
		if(UsernameText.isEnabled()) {
			UsernameText.sendKeys("Sandhyakyama");
			String Enteredtext=UsernameText.getAttribute("Value");
			UsernameText.clear();
		}else {
			System.out.println("Username textbox is not Enabled");
		}
		
	}else {
		System.out.println("Username textbox is not displayed");
	}
	
	TearDown();
	}
	public static void main(String[] args) {
		HandlingTextBoxs Hb=new HandlingTextBoxs();
		Hb.TextBoes();
		
	}
}

