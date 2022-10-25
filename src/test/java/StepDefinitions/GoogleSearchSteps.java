package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
	    driver=new ChromeDriver();
	    
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step - user is on google search page");
		driver.get("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside step - user enters a text in search box");
	   driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
	   
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("Inside step - hits enter");
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step - user is navigated to search results");
		if(driver.getPageSource().contains("results"))
			System.out.println("Showing search results");
		driver.close();
	}

}
