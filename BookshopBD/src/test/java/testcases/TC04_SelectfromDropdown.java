package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basicpackage.DriverSetup;

public class TC04_SelectfromDropdown extends DriverSetup {
public static String baseUrl = "https://bookshopbd.com/c/authors/humayun-ahmed/";
	
	@Test (priority=4)
	public static void SelectfromDropdown() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement e = driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/div[1]/div[1]/aside[2]/form[1]/select[1]"));
		Select drdWriter = new Select(e);
		Thread.sleep(3000);
		drdWriter.selectByIndex(2);
		Thread.sleep(5000);
		
	}
		

}

