package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class upload {
    public static void main(String[] args) {
        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        String baseUrl = "http://subshifter.bitsnbites.eu/";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
       
        WebElement uploadElement = driver.findElement(By.id("shiftfile"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\New folder\\New Text Document.txt");

        // check the "I accept the terms of service" check box
      //  driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.xpath("//xhtml:div[1]/xhtml:div[2]/xhtml:table/xhtml:tr/xhtml:td[1]/xhtml:form/xhtml:table/xhtml:tr[4]/xhtml:td[2]/xhtml:input")).click();
        }
}