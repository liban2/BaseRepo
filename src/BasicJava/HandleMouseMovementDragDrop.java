package BasicJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseMovementDragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(4000);
		
		action.moveToElement(driver.findElement(By.linkText("LOGIN / SIGNUP"))).build().perform();
		
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.quit();
		
		
		
		
	}

}



