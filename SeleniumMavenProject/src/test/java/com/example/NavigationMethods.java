package com.example;

public class NavigationMethods extends App {
	
	public void Navigates() throws Exception {
		Setup();
		
		driver.get("https://github.com");
		
		Thread.sleep(3000);
		//driver.navigate().to("HYR Tutorial");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		TearDown();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		NavigationMethods Nv=new NavigationMethods();
		Nv.Navigates();
		
	}

}
