package BasicJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.uk/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("this is the title");
		}
		else {
			System.out.println("this is incorrect title");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
