package BasicJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefresherHandles {

	public static void main(String[] args) throws InterruptedException {
		
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		
//		driver.findElement(By.name("proceed")).click();//ive clicked the sigin button and it has a popup-alert
//		
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();//this is how i switch to the popup to gain control
//		
//		System.out.println(alert.getText());// this is how i get what is written on the popup frame
//		
//		Thread.sleep(3000);
//		
//		String text = alert.getText();//this how i store alert.gettext to my variable
//		
//		if(text.equals("Please enter a valid user name")) {//this how i verify if the pop is actually showing proper message
//			System.out.println("This is correct message");
//		}
//		else {
//			System.out.println("this is showing incorrect message");
//		}
//		
//		alert.accept();//and this is if i accept the terms 
//		
//		alert.dismiss();//or if i wish to decline 
//		
		
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		Thread.sleep(2000);
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("message is correct");
		}
		else {
			System.out.println("message is in-correct");
		}
		
		driver.quit();
		
	}

}
