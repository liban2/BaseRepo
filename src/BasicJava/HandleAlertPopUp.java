package BasicJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		

		System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();//this is to switch to the popup page 
		
		System.out.println(alert.getText());//this is to obtain the text of the popup
		
        alert.accept();//if you wish to accept
		
		//alert.dismiss();//if theres a cancel button
		
		
		String text = alert.getText();
		
		if(text.equals("Please enter valid username")) {
			System.out.println("This is correct message");
		}
		else {
			System.out.println("in-correct message");
		}
		
		
		
		
		
		
		
	}

}
