package webdrivercheckboxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class Assignment2 {
	
	@Test
	public void testWaitAlert() throws InterruptedException {
		
		WebDriver  driver = Helper.startBrowser("GC");
		
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"post-body-9011060868494634961\"]/button")).click();
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.close();
	}

}
