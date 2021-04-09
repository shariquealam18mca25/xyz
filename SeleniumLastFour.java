import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLastFour {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","chromedriver");
    	WebDriver driver = new ChromeDriver();

    	driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.id("email")).sendKeys("alynna.903@believesrq.com");
        driver.findElement(By.id("passwd")).sendKeys("Qwerty@123");
        driver.findElement(By.id("SubmitLogin")).click();
        
        driver.findElement(By.xpath("//div[@id='contact-link']/a")).click();
        Select select=new Select(driver.findElement(By.id("id_contact")));
        select.selectByVisibleText("Customer service");
        
        Select select1=new Select(driver.findElement(By.name("id_order")));
        select1.selectByVisibleText("WGDNHMKHG - 03/22/2021");
        
        Select select2=new Select(driver.findElement(By.name("id_product")));
        select2.selectByVisibleText("Faded Short Sleeve T-shirts - Color : Orange, Size : S");

        driver.findElement(By.id("message")).sendKeys("Product is damaged");
        driver.findElement(By.id("submitMessage")).click();

    }
}