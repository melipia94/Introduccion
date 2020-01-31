import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//XPATH
		// //TagName[@atributo='value']
//		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Hola");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass");
//		driver.findElement(By.xpath("//input[@value='Entrar']")).click();
		
		//CSS SELECTORT
		//TagName[atributo='valor'] ->más exacto
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hola");
		driver.findElement(By.cssSelector("[value='Entrar']")).click();
		//OTTRA MANERA DE CSS SELECTOR
		//tagName#id
		//tagName.className
		//#email
	
		//Para buscar un css selector sólo es necesario poner el $ sin la x
		
		
		//Regular expresión
		// //tagName[@contains(@atributo, valor)]-> No es exacto, lo contiene
		// Para CSS
		//  tagName[atributo*='value'] -> para css sleector basta con poner el * abtes del igua
		
		
	 //Plugin: Chropath- chrome, Firepath-Firefox
		//Relativos-no dependen de los padres
		//No relativos padre/hijos
		
		
		
		//contiene testo
		// //*[text()='Selenium' ]
		//css es más rapido que xpath
		
		
		//CSS
		//con css no es necesario que tenga el tagname
		
	}
}
