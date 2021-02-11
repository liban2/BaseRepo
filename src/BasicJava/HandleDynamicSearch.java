package BasicJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicSearch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://www.google.com");
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		driver.findElement(By.name("q")).sendKeys("somalia");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println("Total number of suggestions in search box::::--->"+list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Somalia map")) {
				list.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		


	}

}
