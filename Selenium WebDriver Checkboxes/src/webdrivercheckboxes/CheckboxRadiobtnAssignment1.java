package webdrivercheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;

public class CheckboxRadiobtnAssignment1 {
	
	@Test
	public void testChkboxRadioBtn() throws InterruptedException {
	
	WebDriver  driver = Helper.startBrowser("GC");
	//driver.get("https://www.easycalculation.com/index.php");
	driver.get("C:\\Users\\Admin\\Desktop\\assignment.html");
	
	List<WebElement> list = driver.findElements(By.cssSelector("input[type='checkbox']"));
	System.out.println("Number of Checkboxes are: " + list.size());
	
	for (int i = 0; i < list.size(); i++) {
		
		if(list.get(i).isDisplayed() && list.get(i).isEnabled())
		{
			Thread.sleep(1000);
			list.get(i).click();
		}
	}
	
	List<WebElement> list2 = driver.findElements(By.xpath("//input [@name='group-1']"));
	System.out.println("Number of Radio Buttons are: " + list2.size());
	
	for (int i = 0; i < list2.size(); i++) {
	 if (!(list2.get(i).isSelected())) {
		 
		 Thread.sleep(1000);
         list2.get(i).click();
      }
	}
	
	
	}

}
