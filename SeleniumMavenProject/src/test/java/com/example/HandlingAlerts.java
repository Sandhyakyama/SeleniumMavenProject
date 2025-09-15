package com.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlingAlerts extends App{
	@Test
	public void AlertHandling() {
		Setup();
		//Alert box
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");    
		driver.findElement(By.id("alertBox")).click();
		System.out.print(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// confirm box
			//Alert accept
		/*driver.findElement(By.id("confirmBox")).click();
		System.out.print(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.print("I clicked ok");*/
		
		//Alert dismiss
		driver.findElement(By.id("confirmBox")).click();
		System.out.print(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.print("I clicked cancle");
		
		
		//Prompt box
		//Alert accept
		driver.findElement(By.id("promptBox")).click();
		System.out.print(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Sandhya");
		driver.switchTo().alert().accept();
		System.out.print("I clicked Ok");
		      
		//Alert dismiss
		driver.findElement(By.id("promptBox")).click();
		System.out.print(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Sandhya");
		driver.switchTo().alert().accept();
		System.out.print("I clicked Ok");
		

		
		
	}

}
