package practiseDataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrgTest {

	public static void main(String[] args) throws IOException {
		FileInputStream  fis = new FileInputStream("C:\\Users\\AMAN RAJ\\Desktop\\commondata.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String browser=pObj.getProperty("browser");
		String url=pObj.getProperty("url");
		String userName=pObj.getProperty("username");
		String passWord=pObj.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(passWord);
		
		//WebDriver driver = new ChromeDriver();
	//	driver.get(url);
		//driver.get("http://localhost:8888");
		//driver.findElement(By.name("user_name")).sendKeys("userName");
		//driver.findElement(By.name("user_password")).sendKeys("passWord");
	//	driver.findElement(By.id("submitButton")).click();
		//driver.findElement(By.linkText("Organisations")).click();
		//driver.quit();

	}

}
