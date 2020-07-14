import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndByLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driverServer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Selenium/links.html");
		driver.findElement(By.linkText("visit google")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("go to")).click();
		driver.close();
	}

}
