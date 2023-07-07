package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a =new Actions(driver);
		WebElement b= driver.findElement(By.id("nav-link-accountList"));
		WebElement c= driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span"));
		a.moveToElement(b).moveToElement(c).click().build().perform();

	}

}
