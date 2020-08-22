package Pages;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import Test.ConstantVariables;

public class RegisterWith100Users {

	static String Result;
	static String ErrorMessage;
	static String SignUpButtonXpath;
	static String SelectOrganizationXpath;
	static String SelectPharmacyXpath;
	static String SubmitButtonXpath;
	static String SelectTitleXpath;
	static String SelectPharmacistXpath;
	static String FirstNameXpath;
	static String LastNameXpath;
	static String EmailAddressXpath;
	static String ConfirmEmailAddrssXpath;
	static String PhoneTypeXpath;
	static String PhoneNumberXpath;
	static String UsernameXpath;
	static String PasswordXpath;
	static String ConfirmPasswordXpath;
	static String SecurityQuestion1Xpath;
	static String SecurityQuestion1ValueXpath;
	static String SecurityAnswer1Xpath;
	static String SecurityQuestion2Xpath;
	static String SecurityQuestion2ValueXpath;
	static String SecurityAnswer2Xpath;
	static String SecurityQuestion3Xpath;
	static String SecurityQuestion3ValueXpath;
	static String SecurityAnswer3Xpath;

	static WebElement SignUpButtonElement;
	static WebElement SelectOrganizationElement;
	static WebElement SelectPharmacyElement;
	static WebElement SubmitButtonElement;
	static WebElement SelectTitleElement;
	static WebElement SelectPharmacistElement;
	static WebElement FirstNameWebElement;
	static WebElement LastNameWebElement;
	static WebElement EmailAddressWebElement;
	static WebElement ConfirmEmailAddrssWebElement;
	static WebElement PhoneTypeWebElement;
	static WebElement PhoneNumberWebElement;
	static WebElement UsernameWebElement;
	static WebElement passwordWebElement;
	static WebElement ConfirmpasswordWebElement;
	static WebElement SecurityQuestion1WebElement;
	static WebElement SecurityQuestion1ValueWebElement;
	static WebElement SecurityAnswer1WebElement;
	static WebElement SecurityQuestion2WebElement;
	static WebElement SecurityQuestion2ValueWebElement;
	static WebElement SecurityAnswer2WebElement;
	static WebElement SecurityQuestion3WebElement;
	static WebElement SecurityQuestion3ValueWebElement;
	static WebElement SecurityAnswer3WebElement;

	public static void register100Users() throws Exception {

		System.out.println("Registration Page");

		KSPH_Login_Page.getfile(
				"C:\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx");

		// Code For OR File
		SignUpButtonXpath = KSPH_Login_Page.getExcelData(1, 1, 2);
		SignUpButtonElement = ConstantVariables.driver.findElement(By.xpath(SignUpButtonXpath));
		Thread.sleep(1000);
		SignUpButtonElement.click();
		// ConstantVariables.test.log(LogStatus.INFO, "SignUpButton: " +
		// SignUpButtonXpath);

		SelectOrganizationXpath = KSPH_Login_Page.getExcelData(1, 2, 2);
		SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectOrganizationXpath));
		SelectOrganizationElement.click();
		// ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed:
		// " + SelectOrganizationXpath);

		SelectPharmacyXpath = KSPH_Login_Page.getExcelData(1, 3, 2);
		ErrorMessage = KSPH_Login_Page.getExcelData(1, 4, 2);
		SelectTitleXpath = KSPH_Login_Page.getExcelData(1, 5, 2);
		SelectPharmacistXpath = KSPH_Login_Page.getExcelData(1, 6, 2);
		FirstNameXpath = KSPH_Login_Page.getExcelData(1, 7, 2);
		LastNameXpath = KSPH_Login_Page.getExcelData(1, 9, 2);
		EmailAddressXpath = KSPH_Login_Page.getExcelData(1, 10, 2);
		ConfirmEmailAddrssXpath = KSPH_Login_Page.getExcelData(1, 11, 2);
		PhoneTypeXpath = KSPH_Login_Page.getExcelData(1, 12, 2);
		PhoneNumberXpath = KSPH_Login_Page.getExcelData(1, 13, 2);
		UsernameXpath = KSPH_Login_Page.getExcelData(1, 14, 2);
		PasswordXpath = KSPH_Login_Page.getExcelData(1, 15, 2);
		ConfirmPasswordXpath = KSPH_Login_Page.getExcelData(1, 16, 2);
		SecurityQuestion1Xpath = KSPH_Login_Page.getExcelData(1, 17, 2);
		SecurityQuestion1ValueXpath = KSPH_Login_Page.getExcelData(1, 18, 2);
		SecurityAnswer1Xpath = KSPH_Login_Page.getExcelData(1, 19, 2);
		SecurityQuestion2Xpath = KSPH_Login_Page.getExcelData(1, 20, 2);
		SecurityQuestion2ValueXpath = KSPH_Login_Page.getExcelData(1, 21, 2);
		SecurityAnswer2Xpath = KSPH_Login_Page.getExcelData(1, 22, 2);
		SecurityQuestion3Xpath = KSPH_Login_Page.getExcelData(1, 23, 2);
		SecurityQuestion3ValueXpath = KSPH_Login_Page.getExcelData(1, 24, 2);
		SecurityAnswer3Xpath = KSPH_Login_Page.getExcelData(1, 25, 2);

		SubmitButtonXpath = KSPH_Login_Page.getExcelData(1, 8, 2);

		// Code For TestData File
		String filePath = ConstantVariables.Register100User;
		FileInputStream fis = new FileInputStream(filePath); // Your .xlsx file name along with path
		ConstantVariables.excelWorkbook = new XSSFWorkbook(fis);
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("Register100User_Test_Data");
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
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(4) != null) {
					String ExcelValue = row1.getCell(4).getStringCellValue();
					System.out.println(ExcelValue);
					// ConstantVariables.test.log(LogStatus.INFO, "pharmay selection" + ExcelValue);

					if (ExcelValue.equals("Pharmacy")) {
						SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath)));
						actions.click().build().perform();
						// Thread.sleep(2000);

						ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + ExcelValue);

					} else if (ExcelValue.equals("NA")) {

						Thread.sleep(2000);

					} else {

					}
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(5)!= null) {

					String SelectTitleTestData = row1.getCell(5).getStringCellValue();
					System.out.println(SelectTitleTestData);
					
					SelectTitleElement = ConstantVariables.driver.findElement(By.xpath(SelectTitleXpath));
					SelectTitleElement.click();
					SelectPharmacistElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath)));
					actions.click().build().perform();
					ConstantVariables.test.log(LogStatus.INFO, "SelectTitleTestData completed: " + SelectTitleTestData);
					Thread.sleep(2000);

				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(6) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(6));
					System.out.println("First name value============" + value);
					
					FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
					FirstNameWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Firstname value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(7) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(7));
					System.out.println("Last name value============" + value);
					
					LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
					LastNameWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "LastName value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(8) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(8));
					System.out.println("Email value============" + value);
					
					EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
					EmailAddressWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Email value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(9) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(9));
					System.out.println("Confirm Email value============" + value);
					
					ConfirmEmailAddrssWebElement = ConstantVariables.driver.findElement(By.xpath(ConfirmEmailAddrssXpath));
					ConfirmEmailAddrssWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Confirma Email value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(10) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(10));
					System.out.println("Confirm Email value============" + value);
					
					PhoneTypeWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath)));
					actions.click().build().perform();
					Thread.sleep(2000);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(11) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String PhoneNumberValue = dataFormatter.formatCellValue(row1.getCell(11));
					System.out.println("Confirm Email value============" + PhoneNumberValue);
					
					PhoneNumberWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneNumberXpath));
					PhoneNumberWebElement.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
							Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
							Keys.BACK_SPACE, Keys.BACK_SPACE);
					Thread.sleep(2000);
					PhoneNumberWebElement.sendKeys(PhoneNumberValue);
					
					ConstantVariables.test.log(LogStatus.INFO, "PhoneNumberValues Value completed: " +PhoneNumberValue);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(12) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String Value = dataFormatter.formatCellValue(row1.getCell(12));
					System.out.println("Confirm Email value============" +Value);
					
					if (Value.length() >= 6) {
				
						UsernameWebElement = ConstantVariables.driver.findElement(By.xpath(UsernameXpath));
						Thread.sleep(2000);
						UsernameWebElement.sendKeys(Value);

					}
					ConstantVariables.test.log(LogStatus.INFO, "UsernameValue Value completed: " +Value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(13) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String PasswordValue = dataFormatter.formatCellValue(row1.getCell(13));
					System.out.println("PasswordValue value============" + PasswordValue);

					if (PasswordValue.length() >= 9 && PasswordValue.length() <= 16) {
				
						passwordWebElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
						passwordWebElement.sendKeys(PasswordValue);
					}

					ConstantVariables.test.log(LogStatus.INFO, "PasswordValue Value completed: " + PasswordValue);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(14) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String ConfirmPasswordValue = dataFormatter.formatCellValue(row1.getCell(14));
					System.out.println("ConfirmPasswordValue value============" + ConfirmPasswordValue);

					ConfirmpasswordWebElement = ConstantVariables.driver
							.findElement(By.xpath(ConfirmPasswordXpath));
					ConfirmpasswordWebElement.sendKeys(ConfirmPasswordValue);
				
					ConstantVariables.test.log(LogStatus.INFO, "ConfirmPasswordValue Value completed: " +ConfirmPasswordValue);
				}
				
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(15) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(15));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
					
					SecurityQuestion1WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1Xpath));
					SecurityQuestion1WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion1ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath)));
					actions.click().build().perform();

					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(16) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer1 = dataFormatter.formatCellValue(row1.getCell(16));
					System.out.println("ConfirmPasswordValue value============" + securityAnswer1);

				
					SecurityAnswer1WebElement = ConstantVariables.driver.findElement(By.xpath(SecurityAnswer1Xpath));
					SecurityAnswer1WebElement.sendKeys(securityAnswer1);

					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer1 Value completed: " + securityAnswer1);
				}
			
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(17) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(17));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
					

					SecurityQuestion2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2Xpath));
					SecurityQuestion2WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion2ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath)));
					actions.click().build().perform();
					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
				}	
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(18) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer2 = dataFormatter.formatCellValue(row1.getCell(18));
					System.out.println("securityAnswer2 value============" + securityAnswer2);

				
					
					SecurityAnswer2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer2Xpath));
					SecurityAnswer2WebElement.sendKeys(securityAnswer2);
		
				ConstantVariables.test.log(LogStatus.INFO, "securityAnswer2 Value completed: " +securityAnswer2);
				}
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(19) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion3 = dataFormatter.formatCellValue(row1.getCell(19));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion3);
					
					SecurityQuestion3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3Xpath));
					SecurityQuestion3WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion3ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath)));
					actions.click().build().perform();
				
				}	
				if (cell = ConstantVariables.excelSheet.getRow(1).getCell(20) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer3 = dataFormatter.formatCellValue(row1.getCell(20));
					System.out.println("securityAnswer3 value============" + securityAnswer3);

			
					SecurityAnswer3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer3Xpath));
					SecurityAnswer3WebElement.sendKeys(securityAnswer3);
	
					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer3 Value completed: " +securityAnswer3);
			
			}

		}
			break;
		}
		SubmitButtonElement = ConstantVariables.driver.findElement(By.xpath(SubmitButtonXpath));
		((JavascriptExecutor) ConstantVariables.driver)
				.executeScript("window.scrollTo(0," + SubmitButtonElement.getLocation().x + ")");
		SubmitButtonElement.click();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Code for 2nd User
		// Code For OR File
		KSPH_Login_Page.getfile(
				"C:\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx");
		SignUpButtonXpath = KSPH_Login_Page.getExcelData(1, 1, 2);
		SignUpButtonElement = ConstantVariables.driver.findElement(By.xpath(SignUpButtonXpath));
		Thread.sleep(1000);
		SignUpButtonElement.click();
		// ConstantVariables.test.log(LogStatus.INFO, "SignUpButton: " +
		// SignUpButtonXpath);

		SelectOrganizationXpath = KSPH_Login_Page.getExcelData(1, 2, 2);
		SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectOrganizationXpath));
		SelectOrganizationElement.click();
		
		// Code For TestData File
		String filePath1 = ConstantVariables.Register100User;
		FileInputStream fis1 = new FileInputStream(filePath1); // Your .xlsx file name along with path
		ConstantVariables.excelWorkbook = new XSSFWorkbook(fis1);
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("Register100User_Test_Data");
		System.out.println("Excel sheet name====" + ConstantVariables.excelSheet.getSheetName());
		// Find number of rows in excel file
		int rowCount1 = ConstantVariables.excelSheet.getLastRowNum() - ConstantVariables.excelSheet.getFirstRowNum();
		// Create a loop over all the rows of excel file to read it
		int count2 = ConstantVariables.excelSheet.getPhysicalNumberOfRows();
		for (int i = 2; i < count2; i++) {

			Row row1 = ConstantVariables.excelSheet.getRow(i);

			// ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed:
			// " + SelectOrganizationXpath);
			if (row1 != null) {
				boolean cell;
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(4) != null) {
					String ExcelValue = row1.getCell(4).getStringCellValue();
					System.out.println(ExcelValue);
					// ConstantVariables.test.log(LogStatus.INFO, "pharmay selection" + ExcelValue);

					if (ExcelValue.equals("Pharmacy")) {
						SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath)));
						actions.click().build().perform();
						// Thread.sleep(2000);

						ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + ExcelValue);

					} else if (ExcelValue.equals("NA")) {

						Thread.sleep(2000);

					} else {

					}
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(5)!= null) {

					String SelectTitleTestData = row1.getCell(5).getStringCellValue();
					System.out.println(SelectTitleTestData);
					
					SelectTitleElement = ConstantVariables.driver.findElement(By.xpath(SelectTitleXpath));
					SelectTitleElement.click();
					SelectPharmacistElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath)));
					actions.click().build().perform();
					ConstantVariables.test.log(LogStatus.INFO, "SelectTitleTestData completed: " + SelectTitleTestData);
					Thread.sleep(2000);

				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(6) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(6));
					System.out.println("First name value============" + value);
					
					FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
					FirstNameWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Firstname value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(7) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(7));
					System.out.println("Last name value============" + value);
					
					LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
					LastNameWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "LastName value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(8) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(8));
					System.out.println("Email value============" + value);
					
					EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
					EmailAddressWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Email value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(9) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(9));
					System.out.println("Confirm Email value============" + value);
					
					ConfirmEmailAddrssWebElement = ConstantVariables.driver.findElement(By.xpath(ConfirmEmailAddrssXpath));
					ConfirmEmailAddrssWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Confirma Email value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(10) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(10));
					System.out.println("Confirm Email value============" + value);
					
					PhoneTypeWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath)));
					actions.click().build().perform();
					Thread.sleep(2000);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(11) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String PhoneNumberValue = dataFormatter.formatCellValue(row1.getCell(11));
					System.out.println("Confirm Email value============" + PhoneNumberValue);
					
					PhoneNumberWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneNumberXpath));
					PhoneNumberWebElement.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
							Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
							Keys.BACK_SPACE, Keys.BACK_SPACE);
					Thread.sleep(2000);
					PhoneNumberWebElement.sendKeys(PhoneNumberValue);
					
					ConstantVariables.test.log(LogStatus.INFO, "PhoneNumberValues Value completed: " +PhoneNumberValue);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(12) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String Value = dataFormatter.formatCellValue(row1.getCell(12));
					System.out.println("Confirm Email value============" +Value);
					
					if (Value.length() >= 6) {
				
						UsernameWebElement = ConstantVariables.driver.findElement(By.xpath(UsernameXpath));
						Thread.sleep(2000);
						UsernameWebElement.sendKeys(Value);

					}
					ConstantVariables.test.log(LogStatus.INFO, "UsernameValue Value completed: " +Value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(13) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String PasswordValue = dataFormatter.formatCellValue(row1.getCell(13));
					System.out.println("PasswordValue value============" + PasswordValue);

					if (PasswordValue.length() >= 9 && PasswordValue.length() <= 16) {
				
						passwordWebElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
						passwordWebElement.sendKeys(PasswordValue);
					}

					ConstantVariables.test.log(LogStatus.INFO, "PasswordValue Value completed: " + PasswordValue);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(14) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String ConfirmPasswordValue = dataFormatter.formatCellValue(row1.getCell(14));
					System.out.println("ConfirmPasswordValue value============" + ConfirmPasswordValue);

					ConfirmpasswordWebElement = ConstantVariables.driver
							.findElement(By.xpath(ConfirmPasswordXpath));
					ConfirmpasswordWebElement.sendKeys(ConfirmPasswordValue);
				
					ConstantVariables.test.log(LogStatus.INFO, "ConfirmPasswordValue Value completed: " +ConfirmPasswordValue);
				}
				
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(15) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(15));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
					
					SecurityQuestion1WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1Xpath));
					SecurityQuestion1WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion1ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath)));
					actions.click().build().perform();

					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(16) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer1 = dataFormatter.formatCellValue(row1.getCell(16));
					System.out.println("ConfirmPasswordValue value============" + securityAnswer1);

				
					SecurityAnswer1WebElement = ConstantVariables.driver.findElement(By.xpath(SecurityAnswer1Xpath));
					SecurityAnswer1WebElement.sendKeys(securityAnswer1);

					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer1 Value completed: " + securityAnswer1);
				}
			
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(17) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(17));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
					

					SecurityQuestion2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2Xpath));
					SecurityQuestion2WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion2ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath)));
					actions.click().build().perform();
					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
				}	
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(18) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer2 = dataFormatter.formatCellValue(row1.getCell(18));
					System.out.println("securityAnswer2 value============" + securityAnswer2);

				
					
					SecurityAnswer2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer2Xpath));
					SecurityAnswer2WebElement.sendKeys(securityAnswer2);
		
				ConstantVariables.test.log(LogStatus.INFO, "securityAnswer2 Value completed: " +securityAnswer2);
				}
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(19) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion3 = dataFormatter.formatCellValue(row1.getCell(19));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion3);
					
					SecurityQuestion3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3Xpath));
					SecurityQuestion3WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion3ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath)));
					actions.click().build().perform();
				
				}	
				if (cell = ConstantVariables.excelSheet.getRow(2).getCell(20) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer3 = dataFormatter.formatCellValue(row1.getCell(20));
					System.out.println("securityAnswer3 value============" + securityAnswer3);

			
					SecurityAnswer3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer3Xpath));
					SecurityAnswer3WebElement.sendKeys(securityAnswer3);
	
					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer3 Value completed: " +securityAnswer3);
			
			}

		}
			break;
		}
		SubmitButtonElement = ConstantVariables.driver.findElement(By.xpath(SubmitButtonXpath));
		((JavascriptExecutor) ConstantVariables.driver)
				.executeScript("window.scrollTo(0," + SubmitButtonElement.getLocation().x + ")");
		SubmitButtonElement.click();
		
		
		//////////////////////////////////////////////////////////////////////Starting Code For 3rd User//////////////////////////////////////////////////////////////////////
		//Code for 2nd User
		// Code For OR File
		KSPH_Login_Page.getfile(
				"C:\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx");
		SignUpButtonXpath = KSPH_Login_Page.getExcelData(1, 1, 2);
		SignUpButtonElement = ConstantVariables.driver.findElement(By.xpath(SignUpButtonXpath));
		Thread.sleep(1000);
		SignUpButtonElement.click();
		// ConstantVariables.test.log(LogStatus.INFO, "SignUpButton: " +
		// SignUpButtonXpath);

		SelectOrganizationXpath = KSPH_Login_Page.getExcelData(1, 2, 2);
		SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectOrganizationXpath));
		SelectOrganizationElement.click();
		
		// Code For TestData File
		String filePath3 = ConstantVariables.Register100User;
		FileInputStream fis3 = new FileInputStream(filePath1); // Your .xlsx file name along with path
		ConstantVariables.excelWorkbook = new XSSFWorkbook(fis3);
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("Register100User_Test_Data");
		System.out.println("Excel sheet name====" + ConstantVariables.excelSheet.getSheetName());
		// Find number of rows in excel file
		int rowCount3 = ConstantVariables.excelSheet.getLastRowNum() - ConstantVariables.excelSheet.getFirstRowNum();
		// Create a loop over all the rows of excel file to read it
		int count3 = ConstantVariables.excelSheet.getPhysicalNumberOfRows();
		for (int i = 3; i < count3; i++) {

			Row row1 = ConstantVariables.excelSheet.getRow(i);

			// ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed:
			// " + SelectOrganizationXpath);
			if (row1 != null) {
				boolean cell;
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(4) != null) {
					String ExcelValue = row1.getCell(4).getStringCellValue();
					System.out.println(ExcelValue);
					// ConstantVariables.test.log(LogStatus.INFO, "pharmay selection" + ExcelValue);

					if (ExcelValue.equals("Pharmacy")) {
						SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath)));
						actions.click().build().perform();
						// Thread.sleep(2000);

						ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + ExcelValue);

					} else if (ExcelValue.equals("NA")) {

						Thread.sleep(2000);

					} else {

					}
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(5)!= null) {

					String SelectTitleTestData = row1.getCell(5).getStringCellValue();
					System.out.println(SelectTitleTestData);
					
					SelectTitleElement = ConstantVariables.driver.findElement(By.xpath(SelectTitleXpath));
					SelectTitleElement.click();
					SelectPharmacistElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath)));
					actions.click().build().perform();
					ConstantVariables.test.log(LogStatus.INFO, "SelectTitleTestData completed: " + SelectTitleTestData);
					Thread.sleep(2000);

				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(6) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(6));
					System.out.println("First name value============" + value);
					
					FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
					FirstNameWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Firstname value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(7) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(7));
					System.out.println("Last name value============" + value);
					
					LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
					LastNameWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "LastName value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(8) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(8));
					System.out.println("Email value============" + value);
					
					EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
					EmailAddressWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Email value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(9) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(9));
					System.out.println("Confirm Email value============" + value);
					
					ConfirmEmailAddrssWebElement = ConstantVariables.driver.findElement(By.xpath(ConfirmEmailAddrssXpath));
					ConfirmEmailAddrssWebElement.sendKeys(value);
					Thread.sleep(2000);
					ConstantVariables.test.log(LogStatus.INFO, "Confirma Email value completed: " + value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(10) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(10));
					System.out.println("Confirm Email value============" + value);
					
					PhoneTypeWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath)));
					actions.click().build().perform();
					Thread.sleep(2000);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(11) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String PhoneNumberValue = dataFormatter.formatCellValue(row1.getCell(11));
					System.out.println("Confirm Email value============" + PhoneNumberValue);
					
					PhoneNumberWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneNumberXpath));
					PhoneNumberWebElement.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
							Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
							Keys.BACK_SPACE, Keys.BACK_SPACE);
					Thread.sleep(2000);
					PhoneNumberWebElement.sendKeys(PhoneNumberValue);
					
					ConstantVariables.test.log(LogStatus.INFO, "PhoneNumberValues Value completed: " +PhoneNumberValue);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(12) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String Value = dataFormatter.formatCellValue(row1.getCell(12));
					System.out.println("Confirm Email value============" +Value);
					
					if (Value.length() >= 6) {
				
						UsernameWebElement = ConstantVariables.driver.findElement(By.xpath(UsernameXpath));
						Thread.sleep(2000);
						UsernameWebElement.sendKeys(Value);

					}
					ConstantVariables.test.log(LogStatus.INFO, "UsernameValue Value completed: " +Value);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(13) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String PasswordValue = dataFormatter.formatCellValue(row1.getCell(13));
					System.out.println("PasswordValue value============" + PasswordValue);

					if (PasswordValue.length() >= 9 && PasswordValue.length() <= 16) {
				
						passwordWebElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
						passwordWebElement.sendKeys(PasswordValue);
					}

					ConstantVariables.test.log(LogStatus.INFO, "PasswordValue Value completed: " + PasswordValue);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(14) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String ConfirmPasswordValue = dataFormatter.formatCellValue(row1.getCell(14));
					System.out.println("ConfirmPasswordValue value============" + ConfirmPasswordValue);

					ConfirmpasswordWebElement = ConstantVariables.driver
							.findElement(By.xpath(ConfirmPasswordXpath));
					ConfirmpasswordWebElement.sendKeys(ConfirmPasswordValue);
				
					ConstantVariables.test.log(LogStatus.INFO, "ConfirmPasswordValue Value completed: " +ConfirmPasswordValue);
				}
				
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(15) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(15));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
					
					SecurityQuestion1WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1Xpath));
					SecurityQuestion1WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion1ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath)));
					actions.click().build().perform();

					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(16) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer1 = dataFormatter.formatCellValue(row1.getCell(16));
					System.out.println("ConfirmPasswordValue value============" + securityAnswer1);

				
					SecurityAnswer1WebElement = ConstantVariables.driver.findElement(By.xpath(SecurityAnswer1Xpath));
					SecurityAnswer1WebElement.sendKeys(securityAnswer1);

					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer1 Value completed: " + securityAnswer1);
				}
			
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(17) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(17));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
					

					SecurityQuestion2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2Xpath));
					SecurityQuestion2WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion2ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath)));
					actions.click().build().perform();
					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
				}	
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(18) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer2 = dataFormatter.formatCellValue(row1.getCell(18));
					System.out.println("securityAnswer2 value============" + securityAnswer2);

				
					
					SecurityAnswer2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer2Xpath));
					SecurityAnswer2WebElement.sendKeys(securityAnswer2);
		
				ConstantVariables.test.log(LogStatus.INFO, "securityAnswer2 Value completed: " +securityAnswer2);
				}
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(19) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityQuestion3 = dataFormatter.formatCellValue(row1.getCell(19));
					System.out.println("ConfirmPasswordValue value============" + securityQuestion3);
					
					SecurityQuestion3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3Xpath));
					SecurityQuestion3WebElement.click();
					Thread.sleep(2000);
					SecurityQuestion3ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath)));
					actions.click().build().perform();
				
				}	
				if (cell = ConstantVariables.excelSheet.getRow(3).getCell(20) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String securityAnswer3 = dataFormatter.formatCellValue(row1.getCell(20));
					System.out.println("securityAnswer3 value============" + securityAnswer3);

			
					SecurityAnswer3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer3Xpath));
					SecurityAnswer3WebElement.sendKeys(securityAnswer3);
	
					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer3 Value completed: " +securityAnswer3);
			
			}

		}
			break;
		}
		SubmitButtonElement = ConstantVariables.driver.findElement(By.xpath(SubmitButtonXpath));
		((JavascriptExecutor) ConstantVariables.driver)
				.executeScript("window.scrollTo(0," + SubmitButtonElement.getLocation().x + ")");
		SubmitButtonElement.click();

		////////////////////////////////////////////////////////////Completed 3rd User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		////////////////////////////////////////////////////////////Starting 4th User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		//Code for 2nd User
				// Code For OR File
				KSPH_Login_Page.getfile(
						"C:\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx");
				SignUpButtonXpath = KSPH_Login_Page.getExcelData(1, 1, 2);
				SignUpButtonElement = ConstantVariables.driver.findElement(By.xpath(SignUpButtonXpath));
				Thread.sleep(1000);
				SignUpButtonElement.click();
				// ConstantVariables.test.log(LogStatus.INFO, "SignUpButton: " +
				// SignUpButtonXpath);

				SelectOrganizationXpath = KSPH_Login_Page.getExcelData(1, 2, 2);
				SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectOrganizationXpath));
				SelectOrganizationElement.click();
				
				// Code For TestData File
				String filePath4 = ConstantVariables.Register100User;
				FileInputStream fis4 = new FileInputStream(filePath1); // Your .xlsx file name along with path
				ConstantVariables.excelWorkbook = new XSSFWorkbook(fis4);
				ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("Register100User_Test_Data");
				System.out.println("Excel sheet name====" + ConstantVariables.excelSheet.getSheetName());
				// Find number of rows in excel file
				int rowCount4 = ConstantVariables.excelSheet.getLastRowNum() - ConstantVariables.excelSheet.getFirstRowNum();
				// Create a loop over all the rows of excel file to read it
				int count4 = ConstantVariables.excelSheet.getPhysicalNumberOfRows();
				for (int i = 3; i < count4; i++) {

					Row row1 = ConstantVariables.excelSheet.getRow(i);

					// ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed:
					// " + SelectOrganizationXpath);
					if (row1 != null) {
						boolean cell;
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(4) != null) {
							String ExcelValue = row1.getCell(4).getStringCellValue();
							System.out.println(ExcelValue);
							// ConstantVariables.test.log(LogStatus.INFO, "pharmay selection" + ExcelValue);

							if (ExcelValue.equals("Pharmacy")) {
								SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath));
								Actions actions = new Actions(ConstantVariables.driver);
								actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath)));
								actions.click().build().perform();
								// Thread.sleep(2000);

								ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + ExcelValue);

							} else if (ExcelValue.equals("NA")) {

								Thread.sleep(2000);

							} else {

							}
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(5)!= null) {

							String SelectTitleTestData = row1.getCell(5).getStringCellValue();
							System.out.println(SelectTitleTestData);
							
							SelectTitleElement = ConstantVariables.driver.findElement(By.xpath(SelectTitleXpath));
							SelectTitleElement.click();
							SelectPharmacistElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath));
							Actions actions = new Actions(ConstantVariables.driver);
							actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath)));
							actions.click().build().perform();
							ConstantVariables.test.log(LogStatus.INFO, "SelectTitleTestData completed: " + SelectTitleTestData);
							Thread.sleep(2000);

						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(6) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String value = dataFormatter.formatCellValue(row1.getCell(6));
							System.out.println("First name value============" + value);
							
							FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
							FirstNameWebElement.sendKeys(value);
							Thread.sleep(2000);
							ConstantVariables.test.log(LogStatus.INFO, "Firstname value completed: " + value);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(7) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String value = dataFormatter.formatCellValue(row1.getCell(7));
							System.out.println("Last name value============" + value);
							
							LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
							LastNameWebElement.sendKeys(value);
							Thread.sleep(2000);
							ConstantVariables.test.log(LogStatus.INFO, "LastName value completed: " + value);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(8) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String value = dataFormatter.formatCellValue(row1.getCell(8));
							System.out.println("Email value============" + value);
							
							EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
							EmailAddressWebElement.sendKeys(value);
							Thread.sleep(2000);
							ConstantVariables.test.log(LogStatus.INFO, "Email value completed: " + value);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(9) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String value = dataFormatter.formatCellValue(row1.getCell(9));
							System.out.println("Confirm Email value============" + value);
							
							ConfirmEmailAddrssWebElement = ConstantVariables.driver.findElement(By.xpath(ConfirmEmailAddrssXpath));
							ConfirmEmailAddrssWebElement.sendKeys(value);
							Thread.sleep(2000);
							ConstantVariables.test.log(LogStatus.INFO, "Confirma Email value completed: " + value);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(10) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String value = dataFormatter.formatCellValue(row1.getCell(10));
							System.out.println("Confirm Email value============" + value);
							
							PhoneTypeWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath));
							Actions actions = new Actions(ConstantVariables.driver);
							actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath)));
							actions.click().build().perform();
							Thread.sleep(2000);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(11) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String PhoneNumberValue = dataFormatter.formatCellValue(row1.getCell(11));
							System.out.println("Confirm Email value============" + PhoneNumberValue);
							
							PhoneNumberWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneNumberXpath));
							PhoneNumberWebElement.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
									Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
									Keys.BACK_SPACE, Keys.BACK_SPACE);
							Thread.sleep(2000);
							PhoneNumberWebElement.sendKeys(PhoneNumberValue);
							
							ConstantVariables.test.log(LogStatus.INFO, "PhoneNumberValues Value completed: " +PhoneNumberValue);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(12) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String Value = dataFormatter.formatCellValue(row1.getCell(12));
							System.out.println("Confirm Email value============" +Value);
							
							if (Value.length() >= 6) {
						
								UsernameWebElement = ConstantVariables.driver.findElement(By.xpath(UsernameXpath));
								Thread.sleep(2000);
								UsernameWebElement.sendKeys(Value);

							}
							ConstantVariables.test.log(LogStatus.INFO, "UsernameValue Value completed: " +Value);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(13) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String PasswordValue = dataFormatter.formatCellValue(row1.getCell(13));
							System.out.println("PasswordValue value============" + PasswordValue);

							if (PasswordValue.length() >= 9 && PasswordValue.length() <= 16) {
						
								passwordWebElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
								passwordWebElement.sendKeys(PasswordValue);
							}

							ConstantVariables.test.log(LogStatus.INFO, "PasswordValue Value completed: " + PasswordValue);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(14) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String ConfirmPasswordValue = dataFormatter.formatCellValue(row1.getCell(14));
							System.out.println("ConfirmPasswordValue value============" + ConfirmPasswordValue);

							ConfirmpasswordWebElement = ConstantVariables.driver
									.findElement(By.xpath(ConfirmPasswordXpath));
							ConfirmpasswordWebElement.sendKeys(ConfirmPasswordValue);
						
							ConstantVariables.test.log(LogStatus.INFO, "ConfirmPasswordValue Value completed: " +ConfirmPasswordValue);
						}
						
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(15) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(15));
							System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
							
							SecurityQuestion1WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1Xpath));
							SecurityQuestion1WebElement.click();
							Thread.sleep(2000);
							SecurityQuestion1ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath));
							Actions actions = new Actions(ConstantVariables.driver);
							actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath)));
							actions.click().build().perform();

							ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(16) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String securityAnswer1 = dataFormatter.formatCellValue(row1.getCell(16));
							System.out.println("ConfirmPasswordValue value============" + securityAnswer1);

						
							SecurityAnswer1WebElement = ConstantVariables.driver.findElement(By.xpath(SecurityAnswer1Xpath));
							SecurityAnswer1WebElement.sendKeys(securityAnswer1);

							ConstantVariables.test.log(LogStatus.INFO, "securityAnswer1 Value completed: " + securityAnswer1);
						}
					
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(17) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String securityQuestion1 = dataFormatter.formatCellValue(row1.getCell(17));
							System.out.println("ConfirmPasswordValue value============" + securityQuestion1);
							

							SecurityQuestion2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2Xpath));
							SecurityQuestion2WebElement.click();
							Thread.sleep(2000);
							SecurityQuestion2ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath));
							Actions actions = new Actions(ConstantVariables.driver);
							actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath)));
							actions.click().build().perform();
							ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
						}	
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(18) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String securityAnswer2 = dataFormatter.formatCellValue(row1.getCell(18));
							System.out.println("securityAnswer2 value============" + securityAnswer2);

						
							
							SecurityAnswer2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer2Xpath));
							SecurityAnswer2WebElement.sendKeys(securityAnswer2);
				
						ConstantVariables.test.log(LogStatus.INFO, "securityAnswer2 Value completed: " +securityAnswer2);
						}
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(19) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String securityQuestion3 = dataFormatter.formatCellValue(row1.getCell(19));
							System.out.println("ConfirmPasswordValue value============" + securityQuestion3);
							
							SecurityQuestion3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3Xpath));
							SecurityQuestion3WebElement.click();
							Thread.sleep(2000);
							SecurityQuestion3ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath));
							Actions actions = new Actions(ConstantVariables.driver);
							actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath)));
							actions.click().build().perform();
						
						}	
						if (cell = ConstantVariables.excelSheet.getRow(4).getCell(20) != null) {

							DataFormatter dataFormatter = new DataFormatter();
							String securityAnswer3 = dataFormatter.formatCellValue(row1.getCell(20));
							System.out.println("securityAnswer3 value============" + securityAnswer3);

					
							SecurityAnswer3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer3Xpath));
							SecurityAnswer3WebElement.sendKeys(securityAnswer3);
			
							ConstantVariables.test.log(LogStatus.INFO, "securityAnswer3 Value completed: " +securityAnswer3);
					
					}

				}
					break;
				}
				SubmitButtonElement = ConstantVariables.driver.findElement(By.xpath(SubmitButtonXpath));
				((JavascriptExecutor) ConstantVariables.driver)
						.executeScript("window.scrollTo(0," + SubmitButtonElement.getLocation().x + ")");
				SubmitButtonElement.click();


	}
}

