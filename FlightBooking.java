import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FlightBooking {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","chromedriver");
WebDriver driver = new ChromeDriver();
driver.get("https://www.realmadrid.com/en");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().window().maximize();

}
}

