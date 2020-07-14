import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreesnShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyReader property= new PropertyReader();
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", property.getDriverPath());
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(property.getURL());
		
		TakesScreenshot scrShot= ((TakesScreenshot)driver);
		
		File sourceFile= scrShot.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("D:\\Selenium\\Screenshots\\scr3.jpeg");
		
		Files.copy(sourceFile, destFile);
		
		driver.close();
		
		
		
	}

}
