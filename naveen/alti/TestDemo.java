package alti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDemo {
	static WebDriver driver;
	public static void main(String[] args){
		driver = new FirefoxDriver();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("my name is naveen");
		driver.close();
		driver.quit();
	}
}
