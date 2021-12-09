package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import basicpackage.DriverSetup;

public class TC01_VisitSite extends DriverSetup {
	public static String baseUrl="https://bookshopbd.com/";
	
	@Test (priority=1)
	public static void loadSite() throws InterruptedException 
	{
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String pageTitleActual=driver.getTitle();
		System.out.println("The page title is: "+ pageTitleActual);
		Thread.sleep(3000);
		
		String pageTitleExpected="Buy Books Online at Best Price in Bangladesh - BookShopBD.com - বুকশপবিডি";
		Assert.assertEquals(pageTitleExpected, pageTitleActual);
		
		Thread.sleep(5000);

}
}
