package com.cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		String n;
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();
		String s=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).getText();
		n=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		
		
		if(s.equals("Name (A to Z)")) {
			System.out.println("Able to Arrange in A to Z");
			System.out.println("Name in A to Z- "+n);
		}
		else {
			System.out.println(" Not Able to Arrange in A to Z");
		}
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		Thread.sleep(2000);

		String p=driver.findElement(By.xpath("//*[@id=\\\"header_container\\\"]/div[2]/div/span/select")).getText();
		n=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		
		if(p.equals("Name (Z to A)")) {
			System.out.println("Able to Arrange in Z to A");
			System.out.println("Name (Z to A)- "+n);
		}
		else {
			System.out.println(" Not Able to Arrange in Z to A");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		s=driver.findElement(By.xpath("//*[@id=\\\"header_container\\\"]/div[2]/div/span/select")).getText();
		n=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		
		if(s.equals("Price (low to high)")) {
			System.out.println("Able to Arrange in Price (low to high)");
			System.out.println("Name in Price (low to high)- "+n);
		}
		else {
			System.out.println(" Not Able to Arrange in Price (low to high)");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		s=driver.findElement(By.xpath("//*[@id=\\\"header_container\\\"]/div[2]/div/span/select")).getText();
		n=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		
		if(s.equals("Price (high to low)")) {
			System.out.println("Able to Arrange in Price (high to low)");
			System.out.println("Name in Price (high to low)- "+n);
		}
		else {
			System.out.println(" Not Able to Arrange in Price (high to low)");
		}
		
		Thread.sleep(2000);

	}

}
