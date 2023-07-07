package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import java.io.*;

public class Sample_Project2 {
	
	Workbook wb;
	Sheet sh;
	int numrow;
	WebDriver driver;
	@BeforeTest
	public void Start() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://webmath.com/index3.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[4]")).click();
	}
	
	@Test(dataProvider ="testdata")
	public void setup(String a, String b) {
		driver.findElement(By.name("dividend")).clear();
		driver.findElement(By.name("dividend")).sendKeys(a);
		driver.findElement(By.name("divisor")).clear();
		driver.findElement(By.name("divisor")).sendKeys(b);
		driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/b/form/center/input")).click();
		driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
		}
		
	
	@DataProvider (name="testdata")
 public Object[][]TestDataFeed(){
	 try {
wb = Workbook.getWorkbook(new File("C:\\Users\\Sanket\\Desktop\\Book2.xls"));	 
 sh= wb.getSheet("Sheet1");
 numrow=sh.getRows();
}
catch( Exception e) {
	e.printStackTrace();
}
	 Object [][] data=new Object[numrow][sh.getColumns()];
	 for (int i=0; i<numrow;i++) {
		 data[i][0]=sh.getCell(0,i).getContents();
		 data [i][1] =sh.getCell(1,i).getContents();
	 }
	 return data;
}
	public void End() {
		driver.close();
	}
 
 }
