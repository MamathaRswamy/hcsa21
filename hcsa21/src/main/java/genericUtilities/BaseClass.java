package genericUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;

public class BaseClass {
	public static WebDriver driver;
	public static  LoginPage loginpage;
	public  static RegisterPage registerpage;
	PropertyUtility utility=new PropertyUtility();
	public static JavascriptUtility jsutility=new JavascriptUtility();
	@BeforeClass
	public void launchingBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void NavigatingToApplication() throws IOException {
		driver.get(utility.readingDataFromPropertyFile("url"));
		loginpage=new LoginPage(driver);
		registerpage=new RegisterPage(driver);
	}

	@AfterClass
	public void teardonwTheBrowser() {
		driver.quit();
	}
}
