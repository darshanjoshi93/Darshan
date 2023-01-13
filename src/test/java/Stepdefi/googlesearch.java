//package Stepdefi;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

//public class googlesearch {

//	WebDriver driver = null;




//	@Given("browser is open")
//
	//public void browser_is_open() throws InterruptedException {
	//	System.out.println("Inside step- Browser is open");

		//String projectPath = System.getProperty("user dir");
		//System.out.println("ProjectPath is :"+ProjectPath);


	//	System.setProperty("webdriver.chrome.driver", "C:/Users/Moolya/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");

		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
	//	Thread.sleep(4000);

		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//}



	//@And("user is on google search page")
	//public void user_is_on_google_search_page() throws InterruptedException {
		//System.out.println("Inside step-User is on google search page");

	//	driver.navigate().to("https://google.com");
	//	Thread.sleep(4000);
	//}

	//@When("user is enterd a text in search box")
	//public void user_is_enterd_a_text_in_search_box() throws InterruptedException {
	//	System.out.println("Inside step-user is entered a text in search box");

	//	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//Thread.sleep(4000);
	//}

	//@And("hits enter button")
	//public void hits_Senter_button() throws InterruptedException {
		//System.out.println("Inside step- Hits enter button");

		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Thread.sleep(4000);

	//}

	//@Then("user is navigated to search result page")
	//public void user_is_navigated_to_search_result_page() throws InterruptedException {
		//System.out.println("Inside step-user is navigated to search result page");

		//driver.getPageSource().contains("Online Cources");
		//Thread.sleep(4000);
		//driver.close();
		//driver.quit();
//	}


//}
