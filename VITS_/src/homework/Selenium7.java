package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/maryambaloch/Downloads/chromedriver-mac-arm64-2/chromedriver");
	      ChromeOptions co = new ChromeOptions();
	      co.setBinary("/Users/maryambaloch/Downloads/chrome-mac-arm64-2/Google Chrome for Testing.app");

	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();

	      
	        driver.get("https://www.gmail.com");
	        
	        WebElement emailInput = driver.findElement(By.id("identifierId")); //inspect
	        emailInput.sendKeys("maryamamanbaloch"); //send
	        driver.findElement(By.name("V67aGc")).click(); //inspect
	        
	        WebElement passwordInput = driver.findElement(By.name("password")); //inspect
	        passwordInput.sendKeys("your_password"); //send
	        driver.findElement(By.id("passwordNext")).click(); //inspect
	        
	        //verify login in
	        String expectedTitle = "Gmail";
	        String actualTitle = driver.getTitle();
	        if (actualTitle.contains(expectedTitle)) {
	            System.out.println("Gmail logged in successfully.");
	        } else {
	            System.out.println("Failed to login to Gmail.");
	        }
	        
	        
	        // Click compose button
	        WebElement composeButton = driver.findElement(By.xpath("//div[text()='Compose']")); //inspect
	        composeButton.click();
	        
	        
	     // Verify that a new mail window is opened
	        WebElement newMailWindow = driver.findElement(By.xpath("//div[contains(@aria-label, 'New Message')]"));
	        if (newMailWindow.isDisplayed()) {
	            System.out.println("New mail window opened.");
	        } else {
	            System.out.println("Failed to open new mail window.");
	        }
	        
	        
	        // Enter email ID, subject, and body text
	        WebElement toInput = driver.findElement(By.name("to"));
	        toInput.sendKeys("qatesting@vitsconsulting.com");

	        WebElement subjectInput = driver.findElement(By.name("subjectbox"));
	        subjectInput.sendKeys("QA Automation Test Mail");

	        WebElement bodyInput = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
	        bodyInput.sendKeys("This is a test email sent using Selenium automation.");

	        // Click send button
	        WebElement sendButton = driver.findElement(By.xpath("//div[contains(@aria-label, 'Send') and @role='button']"));
	        sendButton.click();

	        // Close the browser
	        driver.quit();



	}

}
