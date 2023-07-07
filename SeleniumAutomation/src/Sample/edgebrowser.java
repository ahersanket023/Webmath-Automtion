package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgebrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sanket\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.booking.com/");

	}

}
