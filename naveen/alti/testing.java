package alti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testing {
static WebDriver driver;
	public static void main(String[] args){
		driver = new FirefoxDriver();
		driver.get("https://github.com/");
		System.out.println("my name is naveen");
	}
}
