import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driverServer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Selenium/dropDown.html");
		
		WebElement playerdropdown= driver.findElement(By.xpath("/html/body/select[1]"));
		WebElement skillsdropdown= driver.findElement(By.xpath("/html/body/select[2]"));
		
		
		Select selectPlayer= new Select(playerdropdown);
		Select selectSkill= new Select(skillsdropdown);
		
		selectPlayer.selectByIndex(7);
		selectPlayer.selectByIndex(8);
		Thread.sleep(2000);
		selectPlayer.selectByValue("Ravi Bopara");
		
		driver.close();
	}

}
