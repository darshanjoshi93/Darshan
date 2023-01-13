package Stepdefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demomobile {
	
	WebDriver driver = null;
	

@When("brower is open")
public void brower_is_open() throws InterruptedException {
   
	System.setProperty("webdriver.chrome.driver", "C:/Users/Moolya/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
}

@And("user is navigate to flipkart homepage")
public void user_is_navigate_to_flipkart_homepage() throws InterruptedException {
	driver.navigate().to("https://www.flipkart.com");
	driver.getTitle();
	
	Thread.sleep(3000);
   
}

@When("user clicks on mobile category")
public void user_clicks_on_mobile_category() {
	 driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click();  
	//System.out.println(categoryname);
	//driver.findElement("");
	  
   
	
	
	
}

@And("user is navigate to mobile category page")
public void user_is_navigate_to_mobile_category_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user select a mobile")
public void user_select_a_mobile() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@And("Validate whether user is bying a mobile phone")
public void validate_whether_user_is_bying_a_mobile_phone() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
