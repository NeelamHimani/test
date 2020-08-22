package Pages;

import Test.ConstantVariables;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.KSPH_Login_Page;

public class ActiveUser_Ksph {

	public static void activeUser() throws IOException, InterruptedException {

		// Code for Redirect New Register User

		KSPH_Login_Page.getfile(ConstantVariables.ORFile);

		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheetAt(2);
		System.out.println(ConstantVariables.excelSheet.getSheetName());

		ConstantVariables.test = ConstantVariables.report.startTest("Registration With KSPH");
		String ActiveServer = ConstantVariables.excelSheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(ActiveServer);

		switch (ActiveServer) {
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
			// ConstantVariables.driver.get("https://solutions.kloudscript.net/");
			break;
		case "dev3":
			ConstantVariables.driver.get("https://dev3.kloudscript.net/");
			break;
		default:
			System.out.println("Not able to Find the Server");
			break;
		}

		String currentURL = ConstantVariables.driver.getCurrentUrl();
		System.out.println("currentURL==========" + currentURL);

		String pageTitle = ConstantVariables.driver.getTitle();
		System.out.println("pageTitle===============" + pageTitle);
		WebDriverWait wait = new WebDriverWait(ConstantVariables.driver, 15);
		// Code for to Redirect test2 server and active user

		// Click on KS SSO button
		KSPH_Login_Page.getfile(ConstantVariables.ORFile);

		// get sheet of ActiveuserXpath
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheetAt(3);
		System.out.println(ConstantVariables.excelSheet.getSheetName());

		// Get Value of XPATH
		String KSSSOUserXpath = KSPH_Login_Page.getExcelData(3, 1, 2);
		String KSSSOEmailAddress = KSPH_Login_Page.getExcelData(3, 2, 2);
		String NextButtonXapth = KSPH_Login_Page.getExcelData(3, 3, 2);
		String PasswordXpath = KSPH_Login_Page.getExcelData(3, 4, 2);
		String PasswordNextButtonXpath=KSPH_Login_Page.getExcelData(3, 5, 2);
		String PortalNotificationXpath=KSPH_Login_Page.getExcelData(3, 6, 2);
		String NotificationSymbolXpath=KSPH_Login_Page.getExcelData(3, 7, 2);
		String MenuButtonXpath=KSPH_Login_Page.getExcelData(3, 8, 2);
		String ServiceRequestXpath=KSPH_Login_Page.getExcelData(3, 9, 2);
		String AccountManagementXpath=KSPH_Login_Page.getExcelData(3, 10, 2);
		String SearchWithUsernameXpath=KSPH_Login_Page.getExcelData(3, 11, 2);
		String SearchButtonXpath=KSPH_Login_Page.getExcelData(3, 12, 2);
	//	String ActiveButtonXpath=KSPH_Login_Page.getExcelData(3, 13, 2);
	//	String ClickYesButtonXpath=KSPH_Login_Page.getExcelData(3, 14, 2);
		
		// Variable of WebElement
		WebElement KSSSOLoginButton;
		WebElement EmailAddress;
		WebElement NextButtonelement;
		WebElement PasswordElement;
		WebElement PasswordNextButtonelement;
		WebElement PortalNotificationElement;
		WebElement NotificationSymbolElement;
		WebElement MenuButtonElement;
		WebElement ServiceElement;
		WebElement AccountmanagementElement;
		WebElement SearchWithUsername;
		WebElement SearchButtonElement;
		WebElement ActiveUserElement;
		WebElement ClickYesButtonElement;
		
		// Code For TestData File
		String filePath = ConstantVariables.TestDataFile;
		FileInputStream fis = new FileInputStream(filePath); // Your .xlsx file name along with path
		ConstantVariables.excelWorkbook = new XSSFWorkbook(fis);
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("ActiveUserData");
		System.out.println("Excel sheet name====" + ConstantVariables.excelSheet.getSheetName());

		// Get Value of TestData File
		String EmailAddressValue = KSPH_Login_Page.getExcelData(1, 1, 4);
		String PasswordFieldValue = KSPH_Login_Page.getExcelData(1, 1, 5);

		KSSSOLoginButton = ConstantVariables.driver.findElement(By.xpath(KSSSOUserXpath));
		KSSSOLoginButton.click();

		String winHandleBefore = ConstantVariables.driver.getWindowHandle();
		for (String winHandle : ConstantVariables.driver.getWindowHandles()) {
			ConstantVariables.driver.switchTo().window(winHandle);

		}
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(KSSSOEmailAddress)));
		
		WebElement UserEmail = ConstantVariables.driver.findElement(By.xpath(KSSSOEmailAddress));
		UserEmail.clear();
		UserEmail.sendKeys(EmailAddressValue);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NextButtonXapth)));
		ConstantVariables.driver.findElement(By.xpath(NextButtonXapth)).click();

		Thread.sleep(4000);
	
		ArrayList<String> tabs6 = new ArrayList<String>(ConstantVariables.driver.getWindowHandles());
		ConstantVariables.driver.switchTo().window(tabs6.get(1));
		System.out.println("current URL=====" + ConstantVariables.driver.getCurrentUrl());
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath)));
		WebElement UserPass = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
		Thread.sleep(7000);
	
		
		
		UserPass.sendKeys(Keys.SHIFT);
		UserPass.sendKeys("ccxxc");
		

	//	
	
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PasswordNextButtonXpath)));
		ConstantVariables.driver.findElement(By.xpath(PasswordNextButtonXpath)).click();
		Thread.sleep(4000);
		ConstantVariables.driver.switchTo().window(winHandleBefore);
		
		System.out.println("page title========="+ConstantVariables.driver.getCurrentUrl());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PortalNotificationXpath)));
		ConstantVariables.driver.findElement(By.xpath(PortalNotificationXpath)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NotificationSymbolXpath)));
		ConstantVariables.driver.findElement(By.xpath(NotificationSymbolXpath)).click();
		

		ArrayList<String> tabs2 = new ArrayList<String>(ConstantVariables.driver.getWindowHandles());
		ConstantVariables.driver.switchTo().window(tabs2.get(1));
		System.out.println("current URL=====" + ConstantVariables.driver.getCurrentUrl());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuButtonXpath)));
		ConstantVariables.driver.findElement(By.xpath(MenuButtonXpath)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ServiceRequestXpath)));
		ConstantVariables.driver.findElement(By.xpath(ServiceRequestXpath)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AccountManagementXpath)));
		ConstantVariables.driver.findElement(By.xpath(AccountManagementXpath)).click();
		
		
		ArrayList<String> tabs3 = new ArrayList<String>(ConstantVariables.driver.getWindowHandles());
		ConstantVariables.driver.switchTo().window(tabs3.get(1));
		System.out.println("current URL=====" + ConstantVariables.driver.getCurrentUrl());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SearchWithUsernameXpath)));
		ConstantVariables.driver.findElement(By.xpath(SearchWithUsernameXpath)).sendKeys("krishana");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SearchButtonXpath)));
		ConstantVariables.driver.findElement(By.xpath(SearchButtonXpath)).click();
		
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ActiveButtonXpath
		 * )));
		 * ConstantVariables.driver.findElement(By.xpath(ActiveButtonXpath)).click();
		 * 
		 * ArrayList<String> tabs4 = new
		 * ArrayList<String>(ConstantVariables.driver.getWindowHandles());
		 * ConstantVariables.driver.switchTo().window(tabs4.get(1));
		 * System.out.println("current URL=====" +
		 * ConstantVariables.driver.getCurrentUrl());
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * ClickYesButtonXpath)));
		 * ConstantVariables.driver.findElement(By.xpath(ClickYesButtonXpath)).click();
		 */
		
	}

}
