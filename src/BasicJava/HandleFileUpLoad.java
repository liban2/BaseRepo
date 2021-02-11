package BasicJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpLoad {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("/Users/admin/Dropbox/My Mac (admins MacBook Pro)/Desktop/download.jpg");
		// never enter .click always enter file path into sendkeys().
		
		
		
		
		
	}

}
