import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("email")).sendKeys("Etipioa");
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.linkText("¿Olvidaste tu cuenta?")).click();
		
		
	}

}
