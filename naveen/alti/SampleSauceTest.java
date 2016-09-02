package alti;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
public class SampleSauceTest {
 
  public static final String USERNAME = "anreddy";
  public static final String ACCESS_KEY = "1158b707-7baf-4b61-9628-fef5ebddf12d";
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
 
  @Test(testName = "1315", description = "sauce lab demo test")
  public void demofirst() throws MalformedURLException{

	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    //DesiredCapabilities caps = DesiredCapabilities.firefox();
	    caps.setCapability("platform", "WINDOWS");
	    caps.setCapability("version", "44.0");
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    
	    /**
	     * Goes to Sauce Lab's guinea-pig page and prints title
	     */
	 
	   // driver.get("https://saucelabs.com/test/guinea-pig");
	    driver.get("https://facebook.com/");
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#email")).sendKeys("naveenreddyaleti@gmail.com");
	    driver.findElement(By.cssSelector("#pass")).sendKeys("9908099680");
	    driver.findElement(By.cssSelector("[value='Log In']")).click();
	    System.out.println("title of page is: " + driver.getTitle());
	    driver.quit();
  }
  }


