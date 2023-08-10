package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	
	
	public static void main(String[] args) throws Exception {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe "  );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]']")).click();
	 
	}
}
