package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		WebElement b=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	a.contextClick(b).build().perform();
	driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	}

}
