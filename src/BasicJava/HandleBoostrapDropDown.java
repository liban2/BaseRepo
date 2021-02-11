package BasicJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBoostrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			//if(list.get(i).getText().equals("Something else here")) {
				list.get(i).click();
				//break;
		//	}
		}
		
		
		
		
		
		
		
		
		
	}

}
