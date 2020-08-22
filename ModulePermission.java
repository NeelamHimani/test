package Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import Pages.ActiveUser_Ksph;
import Pages.EmailVerification;
import Pages.KSPH_Login_Page;
import Pages.LoginPage;
import Pages.LoginWithValidUser;
import Pages.RegisterWith100Users;
import Pages.Registration;

public class ModulePermission extends TestBase {
	@Test
	public void modulePermission() throws Exception {


		KSPH_Login_Page.getfile(ConstantVariables.ORFile);

		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheetAt(0);
		System.out.println(ConstantVariables.excelSheet.getSheetName());
		
		String path = System.getProperty("user.dir") + "//Reports//KSPH_Automation_Script.html";
		System.out.println("path value====="+path);
		ConstantVariables.report = new ExtentReports(path);

		ConstantVariables.test = ConstantVariables.report.startTest("Registration With KSPH");
		String server = ConstantVariables.excelSheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(server);

		switch (server) {
		case "Test1":
			ConstantVariables.driver.get("https://test1.kloudscript.net/kloudscript/auth/login");
			break;
		case "Test2":
			ConstantVariables.driver.get("https://test2.kloudscript.net/kloudscript/auth/login");
			break;
		case "Test3":
			ConstantVariables.driver.get("https://test3.kloudscript.net/kloudscript/auth/login");
			break;
		case "UAT100":
			ConstantVariables.driver.get("https://uat100.kloudscript.net:100/kloudscript/auth/login");
			break;
		case "UAT251":
			ConstantVariables.driver.get("https://uat251.kloudscript.net:251/kloudscript/auth/login");
			break;
		case "Ketu":
			ConstantVariables.driver.get("https://ketu.kloudscript.net/kloudscript/auth/login");
			break;
		case "KsKetu":
			System.out.println("KsKetu");
			break;
		case "KSPH":
			ConstantVariables.driver.get("https://solutions.kloudscript.net/");
			break;
		case "dev3":
			ConstantVariables.driver.get("https://dev3.kloudscript.net/");
			break;
		default:
			System.out.println("Not able to Find the Server");
			break;
		}

		String currentURL=ConstantVariables.driver.getCurrentUrl();
		System.out.println("currentURL=========="+currentURL);
		
		String pageTitle=ConstantVariables.driver.getTitle();
		System.out.println("pageTitle==============="+pageTitle);
		
		String RegisterPermission=ConstantVariables.excelSheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println("RegisterPermission======"+RegisterPermission);
		ConstantVariables.test.log(LogStatus.INFO, "Server: " + server);
		
		if(RegisterPermission.equals("YES")) {
			
			ConstantVariables.test.log(LogStatus.INFO, "Registration: " + RegisterPermission);
		//	Registration.registerPage();
			LoginWithValidUser.loginWithValidUser();
		//	ActiveUser_Ksph.activeUser();  //This class is for manual verification for register Username email
		//	EmailVerification.VerifyRegistrationEmail();
			//RegisterWith100Users.register100Users();
		}
	
		/*
		 * String LoginPermission =
		 * ConstantVariables.excelSheet.getRow(3).getCell(1).getStringCellValue();
		 * System.out.println(LoginPermission); if (LoginPermission.equals("YES")) {
		 * //LoginPage.loginPage(); } else {
		 * System.out.println("No Any permission server available"); }
		 */

	
	}

	public static void ReadModulePermission() throws IOException {}
	
	@AfterTest
	public void afterTest() {
	//	 ConstantVariables.driver.quit();
		/*
		 * reporter.endTest(test); reporter.flush();
		 */
		ConstantVariables.report.endTest(ConstantVariables.test);
		ConstantVariables.report.flush();
	}
}
