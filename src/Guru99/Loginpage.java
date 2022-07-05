
package Guru99;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Loginpage extends  BaseClass {
	login le;
	 New_Account cre;
	@BeforeClass
     public  void open() throws IOException {
		intilizebrowser();
		le=new login(driver);
		 cre=new New_Account(driver);
	}
	@BeforeMethod
	public void openbrowser() throws EncryptedDocumentException, IOException {
		le.enterUN(utilityclass.getTestData(0, 0));
	    le.enterPWD(utilityclass.getTestData(0, 1));
	    le.clickLoginBtn();
	    cre.CreateAc();
		cre.Customeri();
		cre.Acctyp();
		cre.indepo();
		cre.buttons();
	}
	@Test
	public void login() throws IOException
	{
        String acturl = driver.getCurrentUrl();
		String expurl="https://demo.guru99.com/V4/manager/Managerhomepage.php";
		Assert.assertEquals(acturl,expurl,"Pass Both result same");
		Assert.assertNotSame(expurl, acturl);
	}

	

}
