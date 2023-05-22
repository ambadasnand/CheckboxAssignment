package webdrivercheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;

public class TestCheckboxes {
	
	@Test
	public void testRadioBtn() throws InterruptedException {
	
	WebDriver  driver = Helper.startBrowser("GC");
	//driver.get("https://www.easycalculation.com/index.php");
	driver.get("C:\\Users\\Admin\\Desktop\\CheckBox.html");
	
	driver.findElement(By.xpath("//input[@name='option1']")).click();
	
	Thread.sleep(1500);
	WebElement checkbox = driver.findElement(By.xpath("//input[@name='option1']"));
	checkbox.click();
	
	if (checkbox.isSelected()) {
		
		System.out.println("Checkbox is selected");
	} else {
		
		System.out.println("Checkbox is not selected");
	}
	
    checkbox.click();
	
	if (!checkbox.isSelected()) {
		
		System.out.println("Checkbox is Toggle off..!!");
	} 
	}
	

}
