package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webmath {
	WebDriver driver;
	By count1= By.name("n1");
	By count2= By.name("n2");
	By button= By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/input[3]");
	By back =By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img");
	
	public Webmath(WebDriver driver) {
		this.driver=driver;
	}
	public void count1() {
		driver.findElement(count1).sendKeys("5");
	}
	public void count2() {
		driver.findElement(count2).sendKeys("5");
	}
	public void button() {
		driver.findElement(button).click();
			}
	public void back() {
		driver.findElement(back).click();
	}
	

}
