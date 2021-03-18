package Emapta.Exam;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Page extends Exam{

	@Test
	public void PageTest() throws IOException
	{
		driver=EmaptaExam();
		driver.manage().window().maximize();
		driver.get("https://creditorwatch.com.au/");
		driver.findElement(By.xpath("//div[@class='navbar-desktop']/ul/li[4]/a")).click();
		WebElement staticDropdown = driver.findElement(By.id("cat"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(41);
		driver.findElement(By.xpath("//div[@class='row row-padding-bottom']/div/div/article[2]/h2/a")).click();
	
		
	}
	
}
