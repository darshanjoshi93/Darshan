//package Stepdefi;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class loginflipkart {
//
//	
//	WebDriver driver = null;
//	
//@Given("browser is open")
//	public void browser_is_open1() throws InterruptedException {
//		System.out.println("Inside step- Browser is open");
//
//		//String projectPath = System.getProperty("user dir");
//		//System.out.println("ProjectPath is :"+ProjectPath);
//
//
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Moolya/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(4000);
//	   
//	}
//
////
////@And("User is in login page")
////public void user_is_in_login_page() throws InterruptedException {
////	  driver.navigate().to("https://www.flipkart.com");
////	    String title = driver.getTitle();
////	    System.out.println("Welcome to " + title);
//
//}
//
//@And("user enters valid email and password")
//public void user_enters_valid_email_and_password() throws InterruptedException {
////	
////	driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
////	Thread.sleep(3000);
////	String pagename = driver.getTitle();
////	System.out.println(pagename);
////  
//    
//    // driver.findElement(By.linkText("https://www.flipkart.com/account/login?ret=/")).click();
//	//driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
//	//driver.findElement(By.xpath(""))
//    // Alert popup = driver.switchTo().alert();
//    //driver.close();
//    // driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("jdarshan007@gmail.com");
//    //driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("9738471440");
//    //driver.findElement(By.xpath("//a[text()='Login']")).sendKeys("9738471440");
//    //driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
//    //Thread.sleep(5000);
//	//driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
//	
//} 
//@And ("user clicks on login button")
//public void user_clicks_on_login_button() {
//	driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();	
//   
//}
//
//@And("user is able to view the flipkart homepage")
//public void user_is_able_to_view_the_flipkart_homepage() throws InterruptedException {
//   driver.findElement(By.className("exehdJ")).getText();
//   Thread.sleep(3000);
//   
//}
//
//@Then("user is able to see the title on consle")
//public void user_is_able_to_see_the_title_on_consle() throws InterruptedException {
//	WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Darshan')]"));
//	Actions act = new Actions(driver);
//	act.moveToElement(ele).perform();
//	Thread.sleep(2000);
//	driver.close();
//    
//}	
//	
//}
