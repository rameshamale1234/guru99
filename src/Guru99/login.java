package Guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login{ 
WebDriver driver;
	@FindBy(xpath="//input[@name='uid']")private WebElement  username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//input[@name='btnLogin']")private WebElement clickbtn;
	public login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPWD(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickLoginBtn()
	{
		clickbtn.click();
	}
}
