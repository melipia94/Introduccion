import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Driver object
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String a = driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl()); //En qué pagina estoy 
		System.out.println(driver.getPageSource());
	
		driver.navigate().to("http://yahoo.com");
		driver.close(); //it cloase current browser
		driver.quit(); //it closes all the browsers opened by selenium
		
	}

}
