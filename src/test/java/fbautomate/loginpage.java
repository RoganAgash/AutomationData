package fbautomate;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	
	
	public static void main(String[] args) {
		
		
		int r=3;
		
		
		for (int i = 0; i <=r; i++) {
			
		
		
	WebDriver d=new ChromeDriver();
		
		
		d.get("https://www.facebook.com/");
		
		
		
		d.findElement(By.id("email")).sendKeys("rogan");
		
		d.findElement(By.id("pass")).sendKeys("11111222");
		
		System.out.println(d.getCurrentUrl());	
		
		
		d.close();
		
		}
	}

}
