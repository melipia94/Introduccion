import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicityWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Espera implicita, para que no falle inmediatamente cuando no encuentre un elemento
		
		int j=0;
		String[] itemsNeeded= {"Cucumber","Brocolli","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(products.size());
		for(int i=0;i<products.size();i++) {
			String[] name= products.get(i).getText().split("-");
			String formateName= name[0].trim(); //trim elimina los espacios
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formateName)) {
				j++;
				//click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
				}
				
			}
		}
		
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
	}
 
}
