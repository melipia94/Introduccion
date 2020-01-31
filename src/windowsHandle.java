import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowsHandle {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tigo.com.co/");
		Thread.sleep(2000L);
		Actions a = new Actions(driver);
		WebElement elemento= driver.findElement(By.xpath("//a[contains(.,'Politica de seguridad y protección de datos personales')]"));
		a.moveToElement(elemento).build().perform();
		driver.findElement(By.xpath("//a[contains(.,'Politica de seguridad y protección de datos personales')]")).click();
		Thread.sleep(3000L);
		System.out.println("este es el primero");
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String parentid= it.next();
		driver.switchTo().window(parentid);
		System.out.println("este es el primero");
		System.out.println(driver.getTitle());
		Thread.sleep(3000L);
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("este es el segundo");
		System.out.println(driver.getTitle());
		WebElement elemento2 = driver.findElement(By.xpath("//div[@class='btn']/a[contains(@target,'_blank')]"));
		a.moveToElement(elemento2).build().perform();
		elemento2.click();
		Thread.sleep(3000L);
		
		ids=driver.getWindowHandles();
		it= ids.iterator();
		parentid= it.next();
		driver.switchTo().window(parentid);
		System.out.println("este es el primero");
		System.out.println(driver.getTitle());
		Thread.sleep(3000L);
		 childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("este es el segundo");
		System.out.println(driver.getTitle());
		Thread.sleep(2000L);
		String childid2=it.next();
		
		driver.switchTo().window(childid2);
		System.out.println("este es el tercero");
		System.out.println(driver.getTitle());
	}
}
