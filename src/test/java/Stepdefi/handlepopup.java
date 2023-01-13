package Stepdefi;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class handlepopup {
	
	WebDriver driver = null;

@When("browser is open")
public void browser_is_open() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Moolya/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
}

@And("user navigate to the homepage")
public void user_navigate_to_the_homepage() {
 if (driver.getPageSource().contains("Home"))  
	 System.out.println("Home");


}

@When("user click on the login button")
public void user_click_on_the_login_button() {
   Alert alert1 = driver.switchTo().alert();
}

@And("user naviagte to the popup")
public void user_naviagte_to_the_popup() {
	if (driver.getPageSource().contains("Login"))  
		 System.out.println("Login");
}

@Then("User is able to close the popup")
public void user_is_able_to_close_the_popup() throws InterruptedException {
   
	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	Thread.sleep(3000);
	
	if (driver.getPageSource().contains("Flipkart"))  
		 System.out.println("Flipkart");
	driver.close();
	
}
}
