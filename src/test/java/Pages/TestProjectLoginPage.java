package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestProjectLoginPage {
	
	protected WebDriver driver;
	
	private By txt_username=By.id("name");
	private By txt_password=By.id("password");
    
	private By btn_login=By.id("login");
    
    
    public TestProjectLoginPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void enter_username(String username)
    {
    	driver.findElement(txt_username).sendKeys(username);
    }
    
    public void enter_password(String password)
    {
    	driver.findElement(txt_password).sendKeys(password);
    }

    public void click_on_login()
    {
    	driver.findElement(btn_login).click();
    }
}
