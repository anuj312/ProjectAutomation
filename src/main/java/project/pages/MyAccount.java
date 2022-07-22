package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import project.driverfactory.DriverFactory;
import project.utils.ElementUtil;

public class MyAccount {
	
WebDriver driver;
private ElementUtil eleUtil;
DriverFactory d = new DriverFactory();
	
public MyAccount(WebDriver driver)
{
	this.driver=driver;
}

//MASTER
//Edit_my_account_info_locators

By EditMyAI =  By.xpath("//*[text() = 'Edit your account information']");
By FirstName = By.xpath("//input[@id='input-firstname']");
By LastName = By.xpath("//input[@id='input-lastname']");
By Email = By.xpath("//input[@id='input-email']");
By Telephone = By.xpath("//input[@id='input-telephone']");
By Submitbtn = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input ");
By VerifySuccessMsg = By.xpath("//*[@id='account-account']/div[1]");


public void EditMyAILink()
{
driver.findElement(EditMyAI).click();
}

public void EditMyAI_FirstName(String str)
{
	clear(FirstName);
driver.findElement(FirstName).sendKeys(str);
}

public void EditMyAI_LastName(String str)
{
	clear(LastName);
driver.findElement(LastName).sendKeys(str);
}

public void EditMyAI_Email(String str)
{
	clear(Email);
driver.findElement(Email).sendKeys(str);
}

public void EditMyAI_Telephone(String str)
{
	clear(Telephone);
driver.findElement(Telephone).sendKeys(str);
}

public void EditMyAI_Submitbtn()
{
driver.findElement(Submitbtn).click();

}

public String EditMyAI_VerifySuccessMsg()
{
	String str = driver.findElement(VerifySuccessMsg).getText();
	return str;
}

public void clear(By locator)
{
	driver.findElement(locator).clear();
}
}
