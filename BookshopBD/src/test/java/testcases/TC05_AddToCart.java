package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basicpackage.DriverSetup;

public class TC05_AddToCart extends DriverSetup {
public static String baseUrl ="https://bookshopbd.com/c/authors/humayun-ahmed/?filter_book-author=";

@Test (priority=5)
public static void SelectfromDropdown() throws InterruptedException {
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//add to cart
	
	WebElement bookTocart= driver.findElement(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(bookTocart);
	WebElement addTocart = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[4]/a[1]/div[1]/strong[1]"));
	actions.moveToElement(addTocart);
	Thread.sleep(2000);
	actions.click().build().perform();
	
	Thread.sleep(5000);
	
	//click confirm order
	
	driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[2]/div[2]/div[2]/div[1]/a[1]/span[1]")).click();
	
	//checkout details
	
	driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("Zaved");
	driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("Munna");
	
	WebElement billing_country = driver.findElement(By.name("billing_country"));
	Select select= new Select(billing_country);
	Thread.sleep(3000);
	
	select.selectByIndex(1);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("House #49,Lane-2,Block-A,Mirpur-6");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Dhaka");
	
	WebElement billing_state = driver.findElement(By.xpath("//select[@id='billing_state']"));
	Select select2= new Select(billing_state);
	select2.selectByVisibleText("Dhaka");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("1216");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("01747914247");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("zavedmunna7@gmail.com");
	Thread.sleep(3000);
	
	//place order
	driver.findElement(By.xpath("//button[@id='place_order']")).click();
	
	Thread.sleep(5000);
	
	
}

}

