package com.cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn1 {
	public static void main(String args[]) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).submit();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		String del=driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).getText();
		String pro=driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]")).getText();
		
		if(del.equals("Remove")) {
			
			System.out.println("Product added");	
		}
		else {
			System.out.println("Product not added");	
		}
		
		if(pro.equals("1")) {
			System.out.println("Product Can viewed Successfully");
		}
		else {
			System.out.println("Product Can not be viewed ");
		}
		
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		String ch=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		if(ch.equals("Checkout: Your Information")) {
			System.out.println("Displaying Your Information");
		}
		else {
			System.out.println("Not displaying Your Information");
		}
		//
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("505060");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).submit();
		
		
		String tt=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		
		if(tt.equals("Checkout: Overview")) {
			System.out.println("Displaying Overview");
			System.out.println(driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
		}
		else {
			System.out.println("Not displaying Overview");
		}
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		if(title.equals("Swag Labs")) {
			System.out.println("Title is same");
		}
		else {
			System.out.println("Title is not same");
		}
		
		if(url.equals("https://www.saucedemo.com/checkout-step-two.html")) {
			System.out.println("URL is same");
		}
		else {
			System.out.println("URL is not same");
		}
		
		driver.close();

	}
}
