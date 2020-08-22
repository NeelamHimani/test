package Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Test.ConstantVariables;

public class LoginWithValidUser {
	static String UsernaemXpath;
	static String PasswordXpath;
	static String loginButtonXpath;
	static String SignatureXpath;
	static String ClearbuttonXpath;
	static String SignaturebuttonXpath1;
	static String AcceptButtonXpath;
	static String PharmacyNameXpath;	
	
	
	static WebElement UsernameElement;
	static WebElement PasswordElement;
	static WebElement loginButtonElement;
	static WebElement Signatureelement;
	static WebElement clearButtonElement;
	static WebElement signatureButtonElement1;
	static WebElement acceptButtonElement;
	static WebElement pharmacyNameElement;
	
	
	
	
	public static void loginWithValidUser() throws IOException, InterruptedException {

	
		ConstantVariables.driver.get("https://dev3.kloudscript.net/");

		System.out.println("Login Page");
		String currentURL = ConstantVariables.driver.getCurrentUrl();
		System.out.println("currentURL==========" + currentURL);
		

		String pageTitle = ConstantVariables.driver.getTitle();
		System.out.println("pageTitle===============" + pageTitle);
		WebDriverWait wait = new WebDriverWait(ConstantVariables.driver, 15);
		// Code for to Redirect test2 server and active user

		// Click on KS SSO button
		KSPH_Login_Page.getfile(ConstantVariables.ORFile);

		// get sheet of ActiveuserXpath
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheetAt(4);
		System.out.println(ConstantVariables.excelSheet.getSheetName());

		UsernaemXpath = KSPH_Login_Page.getExcelData(4, 1, 2);
		PasswordXpath= KSPH_Login_Page.getExcelData(4, 2, 2);
		loginButtonXpath=KSPH_Login_Page.getExcelData(4, 3, 2);
		SignatureXpath=KSPH_Login_Page.getExcelData(4, 4, 2);
		ClearbuttonXpath=KSPH_Login_Page.getExcelData(4, 5, 2);
		SignaturebuttonXpath1=KSPH_Login_Page.getExcelData(4, 6, 2);
		AcceptButtonXpath=KSPH_Login_Page.getExcelData(4, 7, 2);
		PharmacyNameXpath=KSPH_Login_Page.getExcelData(4, 8, 2);

		// Code For TestData File
		String filePath = ConstantVariables.TestDataFile;
		FileInputStream fis = new FileInputStream(filePath); // Your .xlsx file name along with path
		ConstantVariables.excelWorkbook = new XSSFWorkbook(fis);
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("LoginData");
		System.out.println("Excel sheet name====" + ConstantVariables.excelSheet.getSheetName());
		// Find number of rows in excel file
		int rowCount = ConstantVariables.excelSheet.getLastRowNum() - ConstantVariables.excelSheet.getFirstRowNum();
		// Create a loop over all the rows of excel file to read it
		int count = ConstantVariables.excelSheet.getPhysicalNumberOfRows();
		for (int i = 1; i < count; i++) {

			Row row1 = ConstantVariables.excelSheet.getRow(i);

			// ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed:
			// " + SelectOrganizationXpath);
			if (row1 != null) {
				boolean cell;
				if (cell = row1.getCell(4) != null) {
					String ExcelValue = row1.getCell(4).getStringCellValue();
					System.out.println(ExcelValue);
					// ConstantVariables.test.log(LogStatus.INFO, "pharmay selection" + ExcelValue);
					UsernameElement = ConstantVariables.driver.findElement(By.xpath(UsernaemXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(UsernaemXpath)));
					actions.click().build().perform();
					// Thread.sleep(2000);
					UsernameElement.sendKeys(ExcelValue);
				}
				if (cell = row1.getCell(5) != null) {
					String PasswordValue = row1.getCell(5).getStringCellValue();
					System.out.println(PasswordValue);
					// ConstantVariables.test.log(LogStatus.INFO, "pharmay selection" + ExcelValue);
					PasswordElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
					
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PasswordXpath)));
					// Thread.sleep(2000);
					PasswordElement.sendKeys(PasswordValue);				
				}				
		}
	}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginButtonXpath)));
		loginButtonElement=ConstantVariables.driver.findElement(By.xpath(loginButtonXpath));
		loginButtonElement.click();
		
		/*
		 * //Code for new user signature JavascriptExecutor js =
		 * (JavascriptExecutor)ConstantVariables.driver;
		 * js.executeScript("window.scrollBy(0,850)", "");
		 * 
		 * // JavascriptExecutor js = (JavascriptExecutor) ConstantVariables.driver; //
		 * This will scroll down the page by 1000 pixel vertical //
		 * js.executeScript("window.scrollBy(0,2000)");
		 * 
		 * //Code for FIle Upload
		 * Signatureelement=ConstantVariables.driver.findElement(By.xpath(SignatureXpath
		 * ));
		 * 
		 * 
		 * // enter the file path onto the file-selection input field
		 * Signatureelement.sendKeys(
		 * "D:\\Neelam_Automation_Work\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\signature-sebastien-loeb.jpg"
		 * );
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ClearbuttonXpath)
		 * )); clearButtonElement =
		 * ConstantVariables.driver.findElement(By.xpath(ClearbuttonXpath));
		 * clearButtonElement.click();
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * SignaturebuttonXpath1))); signatureButtonElement1 =
		 * ConstantVariables.driver.findElement(By.xpath(SignaturebuttonXpath1));
		 * 
		 * //signatureButtonElement1.click();
		 * 
		 * Thread.sleep(7000);
		 * 
		 * acceptButtonElement=ConstantVariables.driver.findElement(By.xpath(
		 * AcceptButtonXpath)); acceptButtonElement.click();
		 */
		
		
		//Validation for pharmacy name
		int count1 = ConstantVariables.excelSheet.getPhysicalNumberOfRows();
		for (int j = 1; j < count1; j++) {
			
			
			Row row11 = ConstantVariables.excelSheet.getRow(j);
		
			//ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + SelectOrganizationXpath);
			if (row11 != null) {
				boolean cell;
				if (cell = row11.getCell(6) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row11.getCell(6));
					System.out.println("value============" + value);

					if (row11.getCell(2).getStringCellValue().equals("Pharmacy_Name_Tooltip")) {
						pharmacyNameElement = ConstantVariables.driver.findElement(By.xpath(PharmacyNameXpath));
						pharmacyNameElement.sendKeys(value);
						Thread.sleep(2000);
					}
				/*	if (row11.getCell(2).getStringCellValue().equals("Pharmacy_Name_Single_Char")) {

						FirstNameWebElement.clear();
						FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
						FirstNameWebElement.sendKeys(value);
						Thread.sleep(2000);
					}*/
			}
		}
	}
	}
}
	

