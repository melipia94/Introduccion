import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class descarga {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://transaccionesco-uat.tigocloud.net/user/login");
		driver.findElement(By.id("edit-name")).sendKeys("nhmesa");
		driver.findElement(By.id("edit-pass")).sendKeys("cambiame");
		driver.findElement(By.id("edit-submit")).click();
		String actualurl= driver.getCurrentUrl();
		if (actualurl.equals("https://transaccionesco-uat.tigocloud.net/admin")) {
			driver.findElement(By.xpath("//a[contains(@href,'/admin/tigo/vtex/oms')]")).click();

		}
		else {
			System.out.println("No estás en la pagina correcta");
			driver.close();
			System.out.println(actualurl);
		}
		
//		driver.getTitle();
//		
//		System.out.println(driver.getTitle());
//		
//		System.out.println(driver.getCurrentUrl()); //En qué pagina estoy 
//		System.out.println(driver.getPageSource());
//	
//		driver.navigate().to("http://yahoo.com");
//		driver.close(); //it cloase current browser
//		driver.quit(); //it closes all the browsers opened by selenium
		
	}
	
}
