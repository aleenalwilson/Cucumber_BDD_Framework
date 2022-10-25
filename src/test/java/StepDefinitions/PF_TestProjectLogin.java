package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Factory.TestProjectLoginPage_PF;
import Pages.TestProjectLoginPage;
import io.cucumber.java.en.*;

public class PF_TestProjectLogin {

	WebDriver driver=null;
	
	TestProjectLoginPage_PF loginPagePF;
	
	
	
	@Given("chrome browser is open")
	public void browser_is_open() {
		
		System.out.println("TestProjectPF Demo");
		System.out.println("Inside step - chrome browser is open");
	    driver=new ChromeDriver();
	    
	}
	
	@And("user is on TestProject login page")
	public void user_is_on_test_project_login_page() {
	    
		System.out.println("Inside step - user is on TestProject login page");
		driver.navigate().to("https://example.testproject.io/web/");
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		System.out.println("Inside step - user enters username and password");
	    loginPagePF=new TestProjectLoginPage_PF(driver);
	    
	    loginPagePF.enter_username(username);
	    loginPagePF.enter_password(password);
	}

	@And("clicks on login")
	public void clicks_on_login() {
		
		System.out.println("Inside step - clicks on login");
		loginPagePF.click_on_login();
	}

	@Then("user is navigated to complete the test form page")
	public void user_is_navigated_to_complete_the_test_form_page() {
	    
		System.out.println("Inside step - user is navigated to complete the test form page");
		if(driver.getPageSource().contains("let's complete the test form"))
			System.out.println("In Complete Test Form Page ");
		
		driver.close();
	}

	

}
