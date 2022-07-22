package project.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project.base.BaseTest;
import project.pages.LoginPage;
import project.pages.MyAccount;

public class AccountsPage extends BaseTest {
	
	Test1 log;
	
	@BeforeClass
	public void setup()
	{
		myacc = new MyAccount(driver);
		log = new Test1();
		loginpage = new LoginPage(driver);
		
	}
	
	@Test
	public void VerifyMyAccModule() throws InterruptedException
	{
	 //   el.waitForElementsVisible(loginpage.loginBtn,  7);
		
		loginpage.Dologin();
		
		myacc.EditMyAILink();
		
		myacc.EditMyAI_FirstName("Rahul");
		
		myacc.EditMyAI_LastName("Kumar");
		
		myacc.EditMyAI_Email("email2rakeshsingh@gmail.com");
		
		myacc.EditMyAI_Submitbtn();
		
		//System.out.println(myacc.EditMyAI_VerifySuccessMsg());
		Assert.assertEquals(myacc.EditMyAI_VerifySuccessMsg(), "Success: Your account has been successfully updated.");
		
	}
	
	

}
