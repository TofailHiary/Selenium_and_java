package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RemoveNotification {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	 //System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        String baseUrl = "https://pre-www.baaz.com";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
      
      // Thread.sleep(3000);
        int coun=615;
        	while (coun<=1000){
        WebElement login = driver.findElement(By.xpath("//A[text()='Log in']"));
        login.click();
        WebElement Email = driver.findElement(By.xpath("//INPUT[@autofocus='autofocus']"));
        Email.sendKeys("qa"+coun+"@baaz.com");
        WebElement password = driver.findElement(By.xpath("//INPUT[@class='form__control ng-untouched ng-pristine ng-invalid']"));
        password.sendKeys("test1234");
        WebElement login2 = driver.findElement(By.xpath("//BUTTON[@class='btn btn--block btn--before-login'][text()='Log in to Baaz']"));
        login2.click();
        Thread.sleep(5000);
        
        WebElement close1 = driver.findElement(By.xpath("//icon[@class='popover__close-icon']"));
        close1.click();
        Thread.sleep(1000);
        WebElement avatar = driver.findElement(By.xpath("//div[@class='avatar avatar--38']"));
        avatar.click();
       

        
        WebElement setting = driver.findElement(By.xpath("//DIV[@bztranslate='MENU_ITEM_SETTINGS'][text()='Settings']"));

        setting.click();
        Thread.sleep(5000);
        
       if (coun==615){
    	   WebElement close = driver.findElement(By.id("close"));
        	close.click();
       }
        
        
        
        WebElement Notifications = driver.findElement(By.xpath("//SPAN[text()='Notifications']"));
        Notifications.click();
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        jse.executeScript("window.scrollBy(0,250)", "");
        jse.executeScript("window.scrollBy(0,250)", "");
        WebElement renoti = driver.findElement(By.xpath("//LABEL[@for='posts_from_selected_friends']"));
        renoti.click();
        Thread.sleep(3000);
     WebElement save = driver.findElement(By.xpath("//BUTTON[@class='btn btn--green-2'][text()='Save']"));
     save.click();
     Thread.sleep(3000);
     
     avatar.click();
     
     WebElement logout = driver.findElement(By.xpath("//DIV[@bztranslate='MENU_ITEM_LOG_OUT'][text()='Log out']"));
     logout.click();
     Thread.sleep(5000);
     
     //   driver.switchTo().alert().dismiss();
   // WebElement close = driver.findElement(By.id("close"));
    // close.click();
     coun++;
        	}
        	
        
        }   
    }
