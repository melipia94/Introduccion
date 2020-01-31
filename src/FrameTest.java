import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://tigoselfcareregional-uat-co.tigocloud.net/");
		driver.findElement(By.xpath("//*[@class='button-material is-primary waves-effect waves-light']")).click();
		driver.findElement(By.id("idEmail")).sendKeys("automatizacionmicuenta@gmail.com");
		driver.findElement(By.id("continueBtn")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[@class='btn waves-effect waves-light light-blue white-text']")).click();
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tigo2019");
		Thread.sleep(3000L);
	
	
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		Thread.sleep(3000L);
		//Para cambiar de inframe
		Thread.sleep(5000L);
		WebElement element = driver.findElement(By.id("action_Pagar"));
		String atributo = element.getAttribute("style");
		;
		Thread.sleep(3000L);
		System.out.println("esto"+ atributo.substring(1));
//		driver.switchTo().frame("webWidget");
//		driver.switchTo().defaultContent(); // vuelve al contenedor orginal
//		// dRAG AND DROP
//		Actions a = new Actions(driver);
//		WebElement source= driver.findElement(By.id("draggable"));
//		WebElement target= driver.findElement(By.id("droppable"));
//		a.dragAndDrop(source, target).build().perform();
		
	}

}
