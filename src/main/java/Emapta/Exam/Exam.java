package Emapta.Exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam {
	public WebDriver driver;
	public WebDriver EmaptaExam() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ryanesc\\eclipse-workspace\\Exam\\src\\main\\java\\Emapta\\Exam\\data.properties");
		prop.load(fis);
		String URL=prop.getProperty("url");
		String browserName=prop.getProperty("browser");
		
		if (browserName=="chrome");
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
