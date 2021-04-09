import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    WebElement p=driver.findElement(By.name("q"));
    p.sendKeys("Today's news");
    
    Thread.sleep(1500);
    p.submit();
    
    Thread.sleep(1500);
    driver.navigate().back();

    

 
}
}
