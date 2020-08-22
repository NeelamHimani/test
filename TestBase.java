package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {
	

	 public static final String testDataExcelFileName = "Login_Xpath.xlsx";
  @BeforeSuite
	public static void initialize() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\chromedriver.exe");
		ConstantVariables.driver = new ChromeDriver();
		// To maximize browser
		ConstantVariables.driver.manage().window().maximize();
		// Implicit wait
		ConstantVariables.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

	}
	  
}

