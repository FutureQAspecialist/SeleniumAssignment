package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium2 {
  @Test
  public void f() throws InterruptedException {
	  
	  
	
	  System.setProperty("webdriver.chrome.driver", "/Users/maryambaloch/Downloads/chromedriver-mac-arm64-2/chromedriver");
      ChromeOptions co = new ChromeOptions();
      co.setBinary("/Users/maryambaloch/Downloads/chrome-mac-arm64-2/Google Chrome for Testing.app");

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      
      
      String url = driver.getCurrentUrl();
      String expectedURL= "https://www.facebook.com/";
      
      //verify the URL
      Assert.assertEquals(url, expectedURL); 
      
      //Verify "create an account"
      WebElement create= driver.findElement(By.linkText("Create new account")); //double check the inspection
      create.click();
      
      Thread.sleep(300);
      
      
      //fill in the text boxes
      WebElement firstname= driver.findElement(By.name("firstname"));
      firstname.sendKeys("Maryam");
      
      WebElement surname= driver.findElement(By.name("lastname"));
      surname.sendKeys("Baloch");
      		
     WebElement email= driver.findElement(By.name("reg_email__"));
     email.sendKeys("maryamamanbaloch@gmail.com");
     
     WebElement pswrd= driver.findElement(By.name("reg_passwd__"));
     pswrd.sendKeys("HelloWorld123!");
     
      
      //Update DOB
      
      WebElement dayDOB= driver.findElement(By.id("day"));
      Select daySelect= new Select(dayDOB);
      daySelect.selectByVisibleText("16");
      
      
      WebElement monthDropdown = driver.findElement(By.id("month")); 
      Select monthSelect = new Select(monthDropdown);
      monthSelect.selectByVisibleText("August"); 
      
      WebElement yearDropdown = driver.findElement(By.id("year")); 
      Select yearSelect = new Select(yearDropdown);
      yearSelect.selectByVisibleText("2000");
      
      Thread.sleep(300);
      
      //select gender
      
      WebElement genderbutton= driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
      genderbutton.click();
      
      
      //click on "Create an account"
      
      
      
      //verify account creation
      
      
      
  }
}
