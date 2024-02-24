package webElement.textbox;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import genericUtils.FileUtility;
import pomRepo.RegisterPage;

public class ToRegisterAndLoginUserTest extends BaseClass{

	public WebDriver driver;
	@Test
	public void toRegisterUserTest() {
		 RegisterPage register = new RegisterPage(driver);
		
	}
	@Test
	public void toLoginUserTest() {
		FileUtility fUtils=new FileUtility();
		String email= fUtils.
	}
}
