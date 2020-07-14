import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
PropertyReader property= new PropertyReader();
WebDriver driver;
System.setProperty("webdriver.chrome.driver", property.getDriverPath());
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get(property.getURL());

driver.close();
	}

}
