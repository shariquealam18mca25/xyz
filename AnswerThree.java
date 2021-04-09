import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class AnswerThree {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(new By.ById("autosuggest")).sendKeys("india",Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement india = driver.findElement(new By.ByXPath("//a[@class='ui-corner-all'][text()='India']"));
		india.click();
		
		driver.findElement(new By.ById("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Goa",Keys.ENTER);
		
		driver.findElement(new By.ById("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		List<WebElement> cities= driver.findElements(new By.ByXPath("//div[@class='dropdownDiv']//a[@class='']"));
		for(WebElement city : cities) {
			if(city.getText().equals("Goa (GOI)")) {
				System.out.println("Booking Flight with same departure and arrival city Funcionality Failed");
				break;
			}
	}
	

}
}