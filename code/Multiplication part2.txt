package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify {
	WebDriver driver;
	@Test
	public void Multi() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://webmath.com/index3.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[3]")).click();
	Webmath  ab=new Webmath (driver);
	ab.count1();
	ab.count2();
	ab.button();
	ab.back();
	
	}
}
