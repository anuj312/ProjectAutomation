package project.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.driverfactory.DriverFactory;
import project.utils.ElementUtil;




public class LoginPage {
	
	WebDriver driver;
	private ElementUtil eleUtil;
	
	
	DriverFactory d = new DriverFactory();
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
		
	}
	
	
	private By MyAccountLink = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	private By LoginLink = By.xpath("//a[text() = 'Login']");
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	public By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	private By registerLink = By.linkText("Register");
	private By accLogoutMessage = By.cssSelector("div#content h1");
	
	
	public static Logger log = Logger.getLogger(LoginPage.class);
	
	
	
	
	public void Dologin()
	{
		// driver.findElement(MyAccountLink).click();
	//	eleUtil.getElement(MyAccountLink).click();
	//	eleUtil.getElement(LoginLink).click();
		eleUtil.getElement(emailId).sendKeys(d.init_prop().getProperty("username"));
		eleUtil.getElement(password).sendKeys(d.init_prop().getProperty("password"));
		eleUtil.getElement(loginBtn).click();
	}
	
	public boolean Forgotpasswordlink() throws InterruptedException 
	{
		Thread.sleep(5);
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	

}
