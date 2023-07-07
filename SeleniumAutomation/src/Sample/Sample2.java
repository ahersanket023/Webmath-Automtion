package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sanket\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_0_v8")).click();
	}

}
