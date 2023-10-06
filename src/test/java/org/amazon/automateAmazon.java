package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateAmazon {

	
	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.co.in/");
		
		d.findElement(By.id("APjFqb")).sendKeys("amazon");
		
		
	}
}
