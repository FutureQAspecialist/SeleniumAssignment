package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/maryambaloch/Downloads/chromedriver-mac-arm64-2/chromedriver");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("/Users/maryambaloch/Downloads/chrome-mac-arm64-2/Google Chrome for Testing.app");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        
        // Enter a product in the search box
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("Apple Watches");

     

        // Select category from categories dropdown (Electronics)
        WebElement categoriesDropdown = driver.findElement(By.className("gh-sb"));
        categoriesDropdown.click();
        
      // WebElement Category = driver.findElement(By.xpath("//a[text()='Electronics']"));
       // Category.click();

        // Click the search button
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
       
       
    }


	}


