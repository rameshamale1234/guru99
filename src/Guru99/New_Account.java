package Guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Account {
	@FindBy(xpath="//a[text()='New Account']")WebElement CreateAcc;
	@FindBy(xpath="//input[@name='cusid']")WebElement Customerid;	
	@FindBy(xpath="//select[@name='selaccount']")WebElement Acctype;
	@FindBy(xpath="//input[@name='inideposit']")WebElement deposit;
	@FindBy(xpath="//input[@name='button2']")WebElement button;
	New_Account (WebDriver driver){
			PageFactory.initElements(driver, this);
		}
	public void CreateAc() {
		CreateAcc.click();
	}
	public void Customeri() {
		Customerid.sendKeys("123456");
	}
	public void Acctyp() {
		Select sel=new Select(Acctype);
		sel.selectByValue("Current");
	}
	public void indepo() {
		deposit.sendKeys("123456");
	}
	public void buttons() {
		 button.click();
	}
}
