package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProjectLoginPage_PF {
	
	protected WebDriver driver;
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
    
    
    public TestProjectLoginPage_PF(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void enter_username(String username)
    {
    	txt_username.sendKeys(username);
    }
    
    public void enter_password(String password)
    {
    	txt_password.sendKeys(password);
    }

    public void click_on_login()
    {
    btn_login.click();
    }
}
