import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=es");
		driver.findElement(By.id("username")).sendKeys("hola");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("error")).getText();
		driver.close();
		
		
	}

}
