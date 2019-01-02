package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI2{

    public WebDriver driver = null;
@BeforeMethod

    public void setUp(){

        System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Zack\\Desktop\\SELENIUMMM\\JAR FILES\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bloomingdales.com/");
}

    public void typeOnElementName(String locator, String value){
    driver.findElement(By.name(locator)).sendKeys(value);
}
 public void typeOnElementID(String locator, String value){
    driver.findElement(By.id(locator)).sendKeys(value);
 }

    public void typeOnElementcss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnElement(String locator, String value){
      try{
          driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
      }
      catch(Exception ex1){

    }
       try{
           driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
       }
       catch(Exception ex2){

       }

       try{
           driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
       }
       catch(Exception ex3){

       }
    }
//ty
//  @AfterMethod
//  public void clean(){
//    driver.close();
//
//      }
    public void navigateBack(){
    driver.navigate().back();

    }

  }





