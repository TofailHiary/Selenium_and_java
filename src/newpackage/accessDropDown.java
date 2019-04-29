package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class accessDropDown {
 public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    String baseUrl = "https://www.facebook.com";
	    WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		Select drpage = new Select(driver.findElement(By.id("month")));
		
		drpage.selectByVisibleText("Jan");
	drpage.deselectAll();
		//Selecting Items in a Multiple SELECT elements
		//driver.get("http://jsbin.com/osebed/2");
		//Select fruits = new Select(driver.findElement(By.id("fruits")));
		//fruits.selectByVisibleText("Banana");
		//fruits.selectByIndex(1);
		//fruits.selectByIndex(2);
		//fruits.selectByIndex(3);
 }
}