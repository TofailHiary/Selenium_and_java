package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AcceptuserRequests {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	 //System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        String baseUrl = "https://pre-www.baaz.com";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
      // Thread.sleep(3000);
        WebElement login = driver.findElement(By.xpath("//A[text()='Log in']"));
        
        login.click();
        WebElement Email = driver.findElement(By.xpath("//INPUT[@autofocus='autofocus']"));
        Email.sendKeys("tofail.test@gmail.com");
        WebElement password = driver.findElement(By.xpath("//INPUT[@class='form__control ng-untouched ng-pristine ng-invalid']"));
        password.sendKeys("test123456");
        
        WebElement login2 = driver.findElement(By.xpath("//BUTTON[@class='btn btn--block btn--before-login'][text()='Log in to Baaz']"));

        login2.click();
        Thread.sleep(5000);
        
        
        WebElement friendrequest = driver.findElement(By.id("header_friend_requests"));
        friendrequest.click();
        
        while (1>0){
        	
        Thread.sleep(3000);
        WebElement accept = driver.findElement(By.id("accept"));
        accept.click();
        //driver.navigate().refresh();
        //Thread.sleep(5000);
        //WebElement any = driver.findElement(By.xpath("//DIV[@class='popup__cancel-wrapper']"));
       //any.click();
        //friendrequest.click();
     WebElement no = driver.findElement(By.xpath("//button[@class='btn btn--grey-2'][text()='No']"));
       no.click();
     //   driver.switchTo().alert().dismiss();
   // WebElement close = driver.findElement(By.id("close"));
    // close.click();
        
       }
   
        
       
    }
}