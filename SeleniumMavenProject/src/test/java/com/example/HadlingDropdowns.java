package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HadlingDropdowns extends App {

	public void Dropdowns() throws Exception {
		Setup();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		//Single select dropdown.
		/*
		 * WebElement Dropdown=driver.findElement(By.id("course")); Select select =new
		 * Select(Dropdown); System.out.println("Dropdown before selecting" + "");
		 * List<WebElement>selectOptions=select.getOptions(); for(WebElement
		 * options:selectOptions) { System.out.println(options.getText()); }
		 * select.selectByIndex(1); // Java System.out.println("Dropdown selected");
		 * Thread.sleep(5000); select.selectByValue("net");//Dot net Thread.sleep(5000);
		 * select.selectByVisibleText("Javascript"); Thread.sleep(5000); String
		 * FirstSelect=select.getFirstSelectedOption().getText();
		 * System.out.println("First Selected option- " +FirstSelect);
		 */
		    //Multiple select dropdown
		    WebElement IdeElement=driver.findElement(By.id("ide"));
			Select IdeDropdown =new Select(IdeElement);
			
			System.out.println("Dropdown before selecting"+ "");
			List<WebElement>selectIdeOptions=IdeDropdown.getOptions();
			for(WebElement ideoptions:selectIdeOptions) {
				System.out.println(ideoptions.getText());
			}
			IdeDropdown.selectByIndex(0); // Eclipse
			    System.out.println("Dropdown selected");
			    Thread.sleep(5000);
			    IdeDropdown.selectByValue("ij");//IntelliJ IDEA
			    Thread.sleep(5000);
			    IdeDropdown.selectByVisibleText("NetBeans");
			    Thread.sleep(5000);
			    
			    IdeDropdown.deselectByVisibleText("IntelliJ IDEA");
			    Thread.sleep(5000);
			    
			    List<WebElement>Selectedoptions=IdeDropdown.getAllSelectedOptions();
			    for(WebElement Selectedoption:Selectedoptions) {
			    System.out.println(" Selected option- " +Selectedoption.getText());}
		TearDown();
	
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HadlingDropdowns drop=new HadlingDropdowns();
		drop.Dropdowns();
	}

}
