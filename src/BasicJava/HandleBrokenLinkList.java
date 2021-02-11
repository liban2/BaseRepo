package BasicJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinkList {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver88");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.spicejet.com/");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(linklist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0; i<linklist.size(); i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href") != null && (!linklist.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linklist.get(i));
			}
		}
		
		System.out.println("size of active links and images::-->"+ activelinks.size());
		System.out.println("number of none active links and images::-->"+(linklist.size() - activelinks.size()));
		
		
		for(int j=0; j<activelinks.size(); j++) {
			
			
			HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
