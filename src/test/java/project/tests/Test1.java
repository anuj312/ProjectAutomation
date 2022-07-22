package project.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import project.base.BaseTest;
import project.pages.LoginPage;



public class Test1 extends BaseTest {
	
	
	@BeforeClass
	public void set()
	{
		loginpage = new LoginPage(driver);
	}
	
	
	@Description("Login page tests")
	@Test(priority=1)
	public void Login()
	{
		
		loginpage.Dologin();
		
	}
	
	@Test(priority=0)
	public void VerifyForgotPasswordLink() throws InterruptedException {
	  Assert.assertEquals(loginpage.Forgotpasswordlink(), true);
	}
	
	

}
