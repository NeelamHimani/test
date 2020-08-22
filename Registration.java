package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Test.ConstantVariables;
import Test.ModulePermission;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class Registration {

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

	public static void registerPage() throws Exception {

		System.out.println("Registration Page");

		KSPH_Login_Page.getfile(
				"D:\\Neelam_Automation_Work\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx");

		// Code For OR File
		SignUpButtonXpath = KSPH_Login_Page.getExcelData(1, 1, 2);
		SignUpButtonElement = ConstantVariables.driver.findElement(By.xpath(SignUpButtonXpath));
		Thread.sleep(1000);
		SignUpButtonElement.click();
	//	ConstantVariables.test.log(LogStatus.INFO, "SignUpButton: " + SignUpButtonXpath);

		SelectOrganizationXpath = KSPH_Login_Page.getExcelData(1, 2, 2);
		SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectOrganizationXpath));
		SelectOrganizationElement.click();
	//	ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + SelectOrganizationXpath);

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
		SecurityQuestion1ValueXpath=KSPH_Login_Page.getExcelData(1, 18, 2);
		SecurityAnswer1Xpath=KSPH_Login_Page.getExcelData(1, 19, 2);
		SecurityQuestion2Xpath=KSPH_Login_Page.getExcelData(1, 20, 2);
		SecurityQuestion2ValueXpath=KSPH_Login_Page.getExcelData(1, 21, 2);
		SecurityAnswer2Xpath=KSPH_Login_Page.getExcelData(1, 22, 2);
		SecurityQuestion3Xpath=KSPH_Login_Page.getExcelData(1, 23, 2);
		SecurityQuestion3ValueXpath=KSPH_Login_Page.getExcelData(1, 24, 2);
		SecurityAnswer3Xpath=KSPH_Login_Page.getExcelData(1, 25, 2);

		SubmitButtonXpath = KSPH_Login_Page.getExcelData(1, 8, 2);

		// Code For TestData File
		String filePath = ConstantVariables.TestDataFile;
		FileInputStream fis = new FileInputStream(filePath); // Your .xlsx file name along with path
		ConstantVariables.excelWorkbook = new XSSFWorkbook(fis);
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("Register_Test_Data");
		System.out.println("Excel sheet name====" + ConstantVariables.excelSheet.getSheetName());
		// Find number of rows in excel file
		int rowCount = ConstantVariables.excelSheet.getLastRowNum() - ConstantVariables.excelSheet.getFirstRowNum();
		// Create a loop over all the rows of excel file to read it
		int count = ConstantVariables.excelSheet.getPhysicalNumberOfRows();
		for (int i = 1; i < count; i++) {
			
			
			Row row1 = ConstantVariables.excelSheet.getRow(i);
		
			//ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + SelectOrganizationXpath);
			if (row1 != null) {
				boolean cell;
				if (cell = row1.getCell(4) != null) {
					String ExcelValue = row1.getCell(4).getStringCellValue();
					System.out.println(ExcelValue);
					//ConstantVariables.test.log(LogStatus.INFO, "pharmay selection" + ExcelValue);

					if (ExcelValue.equals("Pharmacy")) {
						SelectOrganizationElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacyXpath)));
						actions.click().build().perform();
						//Thread.sleep(2000);

						ConstantVariables.test.log(LogStatus.INFO, "Organization selection completed: " + ExcelValue);
						
					} else if (ExcelValue.equals("NA")) {

						Thread.sleep(2000);

					} else {

					}
				}
				if (cell = row1.getCell(5) != null) {

					String SelectTitleTestData = row1.getCell(5).getStringCellValue();
					System.out.println(SelectTitleTestData);
					System.out.println(
							"===================================#########################################========================");
					SelectTitleElement = ConstantVariables.driver.findElement(By.xpath(SelectTitleXpath));
					SelectTitleElement.click();
					SelectPharmacistElement = ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath));
					Actions actions = new Actions(ConstantVariables.driver);
					actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SelectPharmacistXpath)));
					actions.click().build().perform();
					ConstantVariables.test.log(LogStatus.INFO, "SelectTitleTestData completed: " + SelectTitleTestData);
					Thread.sleep(2000);

				}
				if (cell = row1.getCell(6) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String value = dataFormatter.formatCellValue(row1.getCell(6));
					System.out.println("value============" + value);

					if (row1.getCell(2).getStringCellValue().equals("FN_Numeric")) {
						FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
						FirstNameWebElement.sendKeys(value);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("FN_Character")) {

						FirstNameWebElement.clear();
						FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
						FirstNameWebElement.sendKeys(value);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("FN_RandomData")) {

						FirstNameWebElement.clear();
						FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
						FirstNameWebElement.sendKeys(value);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("FN_Blank_Space")) {

						FirstNameWebElement.clear();
						FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
						FirstNameWebElement.sendKeys(value);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("FN_Correct_Value")) {
						FirstNameWebElement.clear();
						FirstNameWebElement = ConstantVariables.driver.findElement(By.xpath(FirstNameXpath));
						FirstNameWebElement.sendKeys(value);
						Thread.sleep(2000);
						ConstantVariables.test.log(LogStatus.INFO, "Firstname value completed: " + value);

					}
				}
				if (cell = row1.getCell(7) != null) {

					DataFormatter dataFormatter = new DataFormatter();
					String lastnameValue = dataFormatter.formatCellValue(row1.getCell(7));
					System.out.println("value============" + lastnameValue);

					if (row1.getCell(2).getStringCellValue().equals("LN_Numeric")) {
						LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
						LastNameWebElement.sendKeys(lastnameValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("LN_Character")) {

						LastNameWebElement.clear();
						LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
						LastNameWebElement.sendKeys(lastnameValue);
						Thread.sleep(2000);

					}
					if (row1.getCell(2).getStringCellValue().equals("LN_Random_Data")) {

						LastNameWebElement.clear();
						LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
						LastNameWebElement.sendKeys(lastnameValue);
						Thread.sleep(2000);

					}
					if (row1.getCell(2).getStringCellValue().equals("LN_Blank_Space")) {

						LastNameWebElement.clear();
						LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
						LastNameWebElement.sendKeys(lastnameValue);
						Thread.sleep(2000);

					}
					if (row1.getCell(2).getStringCellValue().equals("LN_Correct_Value")) {

						LastNameWebElement.clear();
						LastNameWebElement = ConstantVariables.driver.findElement(By.xpath(LastNameXpath));
						LastNameWebElement.sendKeys(lastnameValue);
						Thread.sleep(2000);

					}
					ConstantVariables.test.log(LogStatus.INFO, "Lastname value completed: " + lastnameValue);
				}
				if (cell = row1.getCell(8) != null) {

					Thread.sleep(2000);
					DataFormatter dataFormatter = new DataFormatter();
					String EmailAddressValue = dataFormatter.formatCellValue(row1.getCell(8));
					System.out.println("EmailAddressValue============" + EmailAddressValue);

					if (row1.getCell(2).getStringCellValue().equals("Email_Incorrect")) {
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Email_Numeric")) {
						EmailAddressWebElement.clear();
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Email_Invalid")) {
						EmailAddressWebElement.clear();
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}

					if (row1.getCell(2).getStringCellValue().equals("Email_Already_Exist")) {
						EmailAddressWebElement.clear();
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Email_Random_Data")) {
						EmailAddressWebElement.clear();
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Email_String_Value")) {
						EmailAddressWebElement.clear();
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Email_Special_Character")) {
						EmailAddressWebElement.clear();
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Email_Correct")) {
						EmailAddressWebElement.clear();
						EmailAddressWebElement = ConstantVariables.driver.findElement(By.xpath(EmailAddressXpath));
						EmailAddressWebElement.sendKeys(EmailAddressValue);
						Thread.sleep(2000);
					}
					
					ConstantVariables.test.log(LogStatus.INFO, "Email Address value completed: " + EmailAddressValue);
				}
				if (cell = row1.getCell(9) != null) {

					DataFormatter dataFormatter = new DataFormatter();

					String ConfirmEmailAddressValue = dataFormatter.formatCellValue(row1.getCell(9));
					System.out.println(ConfirmEmailAddressValue);

					if (row1.getCell(2).getStringCellValue().equals("Confirm_Email_Incorrect")) {

						ConfirmEmailAddrssWebElement = ConstantVariables.driver
								.findElement(By.xpath(ConfirmEmailAddrssXpath));
						ConfirmEmailAddrssWebElement.sendKeys(ConfirmEmailAddressValue);
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Confirm_Email_correct")) {
						ConfirmEmailAddrssWebElement.clear();
						ConfirmEmailAddrssWebElement = ConstantVariables.driver
								.findElement(By.xpath(ConfirmEmailAddrssXpath));
						ConfirmEmailAddrssWebElement.sendKeys(ConfirmEmailAddressValue);
						Thread.sleep(2000);
					}
					
					ConstantVariables.test.log(LogStatus.INFO, "Confirm Email Address Value completed: " + ConfirmEmailAddressValue);

				}
				if (cell = row1.getCell(10) != null) {
					
					DataFormatter dataFormatter1 = new DataFormatter();
					String PhoneNumberValue = dataFormatter1.formatCellValue(row1.getCell(10));
					System.out.println(PhoneNumberValue);

					if (row1.getCell(2).getStringCellValue().equals("Select_PhoneType")) {
						PhoneTypeWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(PhoneTypeXpath)));
						actions.click().build().perform();
						Thread.sleep(2000);
					}
					if (row1.getCell(2).getStringCellValue().equals("Phone_No_Incorrect")) {

					

						PhoneNumberWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneNumberXpath));
						PhoneNumberWebElement.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
								Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
								Keys.BACK_SPACE, Keys.BACK_SPACE);
						Thread.sleep(2000);
						PhoneNumberWebElement.sendKeys(PhoneNumberValue);
						
					}
					ConstantVariables.test.log(LogStatus.INFO, "PhoneNumberValues Value completed: " +PhoneNumberValue);

				}
				if (cell = row1.getCell(11) != null) {

					DataFormatter dataFormatter1 = new DataFormatter();
					String PhoneNumberValue = dataFormatter1.formatCellValue(row1.getCell(11));
					System.out.println(PhoneNumberValue);
					
					if (row1.getCell(2).getStringCellValue().equals("Phone_No_correct")) {

						

						PhoneNumberWebElement = ConstantVariables.driver.findElement(By.xpath(PhoneNumberXpath));
						PhoneNumberWebElement.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
								Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
								Keys.BACK_SPACE, Keys.BACK_SPACE);
						Thread.sleep(2000);
						PhoneNumberWebElement.sendKeys(PhoneNumberValue);
						
					}
					ConstantVariables.test.log(LogStatus.INFO, "PhoneNumberValues Value completed: " +PhoneNumberValue);
				}
				if (row1.getCell(12) != null) {
					DataFormatter dataFormatter1 = new DataFormatter();
					String UsernameValue = dataFormatter1.formatCellValue(row1.getCell(12));
					System.out.println(UsernameValue);

					if (row1.getCell(2).getStringCellValue().equals("Username")) {

						if (UsernameValue.length() >= 6) {
							UsernameWebElement = ConstantVariables.driver.findElement(By.xpath(UsernameXpath));
							Thread.sleep(2000);
							UsernameWebElement.sendKeys(UsernameValue);
						}

					}
					if (row1.getCell(2).getStringCellValue().equals("Username_Already_Exist")) {

						if (UsernameValue.length() >= 6) {
							UsernameWebElement.clear();
							UsernameWebElement = ConstantVariables.driver.findElement(By.xpath(UsernameXpath));
							Thread.sleep(2000);
							UsernameWebElement.sendKeys(UsernameValue);
						}
					}
					if (row1.getCell(2).getStringCellValue().equals("Username_Correct_Value")) {

						if (UsernameValue.length() >= 6) {
							UsernameWebElement.clear();
							UsernameWebElement = ConstantVariables.driver.findElement(By.xpath(UsernameXpath));
							Thread.sleep(2000);
							UsernameWebElement.sendKeys(UsernameValue);

						}

					}
					ConstantVariables.test.log(LogStatus.INFO, "UsernameValue Value completed: " +UsernameValue);
				}
				if (row1.getCell(13) != null) {

					DataFormatter dataFormatter1 = new DataFormatter();
					String PasswordValue = dataFormatter1.formatCellValue(row1.getCell(13));
					System.out.println(PasswordValue);

					if (row1.getCell(2).getStringCellValue().equals("Password_Value")) {
						if (PasswordValue.length() >= 9 && PasswordValue.length() <= 16) {
							passwordWebElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
							passwordWebElement.sendKeys(PasswordValue);
						}
					}
					if (row1.getCell(2).getStringCellValue().equals("Password_Limitation")) {
						if (PasswordValue.length() >= 9 && PasswordValue.length() <= 16) {
							passwordWebElement.clear();
							passwordWebElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
							passwordWebElement.sendKeys(PasswordValue);
						}
					}
					if (row1.getCell(2).getStringCellValue().equals("Password_Valid_Value")) {
						if (PasswordValue.length() >= 9 && PasswordValue.length() <= 16) {
							passwordWebElement.clear();
							passwordWebElement = ConstantVariables.driver.findElement(By.xpath(PasswordXpath));
							passwordWebElement.sendKeys(PasswordValue);
						}
					}
					ConstantVariables.test.log(LogStatus.INFO, "PasswordValue Value completed: " +PasswordValue);
				}
				if (row1.getCell(14) != null) {

					DataFormatter dataFormatter1 = new DataFormatter();
					String ConfirmPasswordValue = dataFormatter1.formatCellValue(row1.getCell(14));
					System.out.println(ConfirmPasswordValue);

					if (row1.getCell(2).getStringCellValue().equals("Confirm_Pwd_Incorrect")) {

						ConfirmpasswordWebElement = ConstantVariables.driver
								.findElement(By.xpath(ConfirmPasswordXpath));
						ConfirmpasswordWebElement.sendKeys(ConfirmPasswordValue);

					}
					if (row1.getCell(2).getStringCellValue().equals("Confirm_Pwd_Correct")) {
						ConfirmpasswordWebElement.clear();
						ConfirmpasswordWebElement = ConstantVariables.driver
								.findElement(By.xpath(ConfirmPasswordXpath));
						ConfirmpasswordWebElement.sendKeys(ConfirmPasswordValue);
					}
					ConstantVariables.test.log(LogStatus.INFO, "ConfirmPasswordValue Value completed: " +ConfirmPasswordValue);
				}
				if (row1.getCell(15) != null) {

					DataFormatter dataFormatter1 = new DataFormatter();
					String securityQuestion1 = dataFormatter1.formatCellValue(row1.getCell(15));
					System.out.println(securityQuestion1);
					if (row1.getCell(2).getStringCellValue().equals("Select_Security_Ques")) {


						SecurityQuestion1WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1Xpath));
						SecurityQuestion1WebElement.click();
						Thread.sleep(2000);
						
						
						/*
						 * SecurityQuestion1ValueWebElement=ConstantVariables.driver.findElement(By.
						 * xpath(SecurityQuestion1ValueXpath));
						 * SecurityQuestion1ValueWebElement.click(); Thread.sleep(3000);
						 */
						
						SecurityQuestion1ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion1ValueXpath)));
						actions.click().build().perform();
					//	Thread.sleep(2000);

					}
					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion1 Value completed: " +securityQuestion1);
				}
				if(row1.getCell(16)!=null)
				{
					DataFormatter dataFormatter1 = new DataFormatter();
					String securityAnswer1 = dataFormatter1.formatCellValue(row1.getCell(16));
					System.out.println(securityAnswer1);
					
					if(row1.getCell(2).getStringCellValue().equals("Select_Answer_1_Invalid")) {
						SecurityAnswer1WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer1Xpath));
						SecurityAnswer1WebElement.sendKeys(securityAnswer1);
					}
					if(row1.getCell(2).getStringCellValue().equals("Select_Answer_1_Valid")) {
						SecurityAnswer1WebElement.clear();
						SecurityAnswer1WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer1Xpath));
						SecurityAnswer1WebElement.sendKeys(securityAnswer1);
						
					}
					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer1 Value completed: " +securityAnswer1);
				}
				if(row1.getCell(17)!=null) {
					DataFormatter dataFormatter1 = new DataFormatter();
					String securityQuestion2 = dataFormatter1.formatCellValue(row1.getCell(17));
					System.out.println(securityQuestion2);
					if (row1.getCell(2).getStringCellValue().equals("Select_Security_Ques2")) {


						SecurityQuestion2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2Xpath));
						SecurityQuestion2WebElement.click();
						Thread.sleep(2000);
						SecurityQuestion2ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion2ValueXpath)));
						actions.click().build().perform();
						//Thread.sleep(2000);

					}
					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion2 Value completed: " +securityQuestion2);
				}
				if(row1.getCell(18)!=null)
				{
					DataFormatter dataFormatter1 = new DataFormatter();
					String securityAnswer2 = dataFormatter1.formatCellValue(row1.getCell(18));
					System.out.println(securityAnswer2);
					
					if(row1.getCell(2).getStringCellValue().equals("Select_Answer_2_Invalid")) {
						SecurityAnswer2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer2Xpath));
						SecurityAnswer2WebElement.sendKeys(securityAnswer2);
					}
					if(row1.getCell(2).getStringCellValue().equals("Select_Answer_2_Valid")) {
						SecurityAnswer2WebElement.clear();
						SecurityAnswer2WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer2Xpath));
						SecurityAnswer2WebElement.sendKeys(securityAnswer2);
						
					}
					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer2 Value completed: " +securityAnswer2);
				}
				if(row1.getCell(19)!=null) {
					DataFormatter dataFormatter1 = new DataFormatter();
					String securityQuestion3 = dataFormatter1.formatCellValue(row1.getCell(19));
					System.out.println(securityQuestion3);
					if (row1.getCell(2).getStringCellValue().equals("Select_Security_Ques3")) {


						SecurityQuestion3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3Xpath));
						SecurityQuestion3WebElement.click();
						Thread.sleep(2000);
						SecurityQuestion3ValueWebElement = ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath));
						Actions actions = new Actions(ConstantVariables.driver);
						actions.moveToElement(ConstantVariables.driver.findElement(By.xpath(SecurityQuestion3ValueXpath)));
						actions.click().build().perform();
					//	Thread.sleep(2000);

					}
					ConstantVariables.test.log(LogStatus.INFO, "securityQuestion3 Value completed: " +securityQuestion3);
				}
				if(row1.getCell(20)!=null)
				{
					DataFormatter dataFormatter1 = new DataFormatter();
					String securityAnswer3 = dataFormatter1.formatCellValue(row1.getCell(20));
					System.out.println(securityAnswer3);
					
					if(row1.getCell(2).getStringCellValue().equals("Select_Answer_3_Invalid")) {
						SecurityAnswer3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer3Xpath));
						SecurityAnswer3WebElement.sendKeys(securityAnswer3);
					}
					if(row1.getCell(2).getStringCellValue().equals("Select_Answer_3_Valid")) {
						SecurityAnswer3WebElement.clear();
						SecurityAnswer3WebElement=ConstantVariables.driver.findElement(By.xpath(SecurityAnswer3Xpath));
						SecurityAnswer3WebElement.sendKeys(securityAnswer3);
						
					}
					ConstantVariables.test.log(LogStatus.INFO, "securityAnswer3 Value completed: " +securityAnswer3);
				}
				
			}

			SubmitButtonElement = ConstantVariables.driver.findElement(By.xpath(SubmitButtonXpath));
			((JavascriptExecutor) ConstantVariables.driver)
					.executeScript("window.scrollTo(0," + SubmitButtonElement.getLocation().x + ")");
			SubmitButtonElement.click();
			
			

			boolean isFound = existsElement(By.xpath(ErrorMessage));

			if (isFound) {
				System.out.println(" displayed as fail it as fail");

				String ActualMessage = ConstantVariables.driver.findElement(By.xpath(ErrorMessage)).getText();
				System.out
						.println("===================================================================" + ActualMessage);
				try {
					if (ActualMessage != null) {
						// String expectedMessage = "Please enter valid username.";
						// Assert.assertTrue("Please enter valid username.",
						// expectedMessage.equals(ActualMessage));
						// System.out.println("Test Pass");
						ExcelUtil.setCellData("PASS", i, 21);

					} else {
						String expectedMessageValidation = "Invalid username an";
						Assert.assertFalse("Invalid username an", expectedMessageValidation.equals(ActualMessage));
						System.out.println("Test Fail");
						ExcelUtil.setCellData("Fail", i, 21);
					}
				} catch (NullPointerException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}

			} else {
				System.out.println("tag it as passed in excel.");
				ExcelUtil.setCellData("PASS", i, 21);

			}
			
		}
		// for loop ends
	ConstantVariables.driver.quit();
	}

	private static boolean existsElement(By id) {
		try {
			ConstantVariables.driver.findElement(id);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}

}
