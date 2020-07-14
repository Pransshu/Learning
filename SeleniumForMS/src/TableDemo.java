import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driverServer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Selenium/Table.html");
		
		WebElement table= driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td[1]"));
		String value=table.getText();
		System.out.println(value);
		for (int i=2;i<=4;i++){
			 
			 // If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
			 for (int j=1;j<4;j++){
			 String sColumnValue= driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + i + "]/td["+ j +"]")).getText();
			 System.out.println("The value of "+i+" row and "+j+" column is: " +sColumnValue);
			 }

		}
		
		
		driver.close();
	}

}
