package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basicpackage.DriverSetup;

public class TC02_VisitWriter extends DriverSetup {
	public static String baseUrl="https://bookshopbd.com/";
	@Test (priority=2)
	
	public static void ClickMenu() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//header/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(5000);
	}
}
