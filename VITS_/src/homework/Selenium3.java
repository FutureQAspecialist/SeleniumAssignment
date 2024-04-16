package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/maryambaloch/Downloads/chromedriver-mac-arm64-2/chromedriver");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("/Users/maryambaloch/Downloads/chrome-mac-arm64-2/Google Chrome for Testing.app");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        
        System.out.println("Total links on Flipkart homepage: " + links.size());
        
        for (WebElement link : links) {
            System.out.println("Link Text: " + link.getText() + ", URL: " + link.getAttribute("href"));
        }

        // Close the browser
        driver.quit();
        
        
	}

}
