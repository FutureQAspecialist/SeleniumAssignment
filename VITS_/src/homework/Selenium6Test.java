package homework;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Selenium6Test {
  @Test
  public void f() {
	  
	  
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/maryambaloch/Downloads/chromedriver-mac-arm64-2/chromedriver");
      ChromeOptions co = new ChromeOptions();
      co.setBinary("/Users/maryambaloch/Downloads/chrome-mac-arm64-2/Google Chrome for Testing.app");

      WebDriver driver = new ChromeDriver();
      
      //open the browser and navigate to the link
      
      driver.get("http://jqueryui.com/droppable/");
      driver.manage().window().maximize();
      
      //switch to iframe
      driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
      
      //add try catch to see which element is not being found
      try {
    	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
    	} catch (NoSuchElementException e) {
    	    System.out.println("Error locating iframe: " + e.getMessage());
    	}

      //locate drag/drop element + drag & drop
      WebElement dragElement = driver.findElement(By.id("draggable"));
      
      try {
    	    WebElement dragElement1 = driver.findElement(By.id("draggable"));
    	} catch (NoSuchElementException e) {
    	    System.out.println("Error locating dragElement: " + e.getMessage());
    	}
      
      
      WebElement dropElement = driver.findElement(By.id("droppable"));
      Actions actions = new Actions(driver);
      actions.dragAndDrop(dragElement, dropElement).build().perform();
      
      //switch to main frame
      driver.switchTo().defaultContent();
      
      //verify CSS property
      String color = dropElement.getCssValue("background-color");
      
      
      Assert.assertEquals(color, "rgba(70, 130, 180, 1)");

      
      //verify text change
      String newText = dropElement.getText();
    Assert.assertEquals(newText, "Dropped!");
      
      
      
  }
}
