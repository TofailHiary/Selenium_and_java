package Selenium ; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MyClass {
	

 

	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.google.jo/";
      //  String expectedTitle = "Facebook - Log In or Sign Up";
        //String actualTitle = "";

        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
       // actualTitle = driver.getTitle();
        //WebElement backGroundColor = driver.findElement(By.tagName("body"));
        WebElement search  = driver.findElement(By.xpath("//INPUT[@id='lst-ib']"));
        WebElement testre = driver.findElement(By.xpath("//INPUT[@value='بحث Google‏']"));
        search.sendKeys("testing");
       // test.click();
        testre.click();
        WebElement testresult1=driver.findElement(By.xpath("//SPAN[@dir='ltr'][text()='Testing Synonyms, Testing Antonyms | Thesaurus.com']"));
        testresult1.click();
        String newsite1 ="http://www.thesaurus.com/browse/testing";
        String title2= "Testing Synonyms, Testing Antonyms | Thesaurus.com";
        String title3=driver.getTitle();
        driver.get(newsite1);
        
       if (title2.contentEquals(title3) ){
    	   
    	   System.out.println("the page opened is correct");
    	   
       }else 
    	   
       {
    	   System.out.println("the page opened isn't correct");  
       }
   
       driver.close();
       
	}
   
       
    }



	

