package Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import Test.ConstantVariables;

public class LoginPage {

	
	static String username;
	static String Password;
	static String loginbutton;
	static String InvalidLogin;
	
	static WebElement username1;
	static WebElement password;
	
	public static void loginPage() throws Exception {

		KSPH_Login_Page.getfile(
				"C:\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx");

		if (KSPH_Login_Page.getExcelData(1, 1, 1) == null || KSPH_Login_Page.getExcelData(1, 2, 1) == null) {

			System.out.println("data is not available");

		} else {

			username = KSPH_Login_Page.getExcelData(1, 1, 2);
			if (username != null) {
				System.out.println(username);
				username1 = ConstantVariables.driver.findElement(By.xpath(username));
			}

			Password = KSPH_Login_Page.getExcelData(1, 2, 2);
			if (Password != null) {
				password = ConstantVariables.driver.findElement(By.xpath(Password));
			}

			InvalidLogin = KSPH_Login_Page.getExcelData(1, 4, 2);
			if (InvalidLogin != null) {
				System.out.println(InvalidLogin);
			}

			loginbutton = KSPH_Login_Page.getExcelData(1, 3, 2);
			WebElement login = ConstantVariables.driver.findElement(By.xpath(loginbutton));

			String filePath = ConstantVariables.TestDataFile;
			FileInputStream fis = new FileInputStream(filePath); // Your .xlsx file name along with path
			ConstantVariables.excelWorkbook = new XSSFWorkbook(fis);
			ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheet("TestData");
			System.out.println("Excel sheet name====" + ConstantVariables.excelSheet.getSheetName());
			// Find number of rows in excel file
			int rowCount = ConstantVariables.excelSheet.getLastRowNum() - ConstantVariables.excelSheet.getFirstRowNum();
			// Create a loop over all the rows of excel file to read it
			int count = ConstantVariables.excelSheet.getPhysicalNumberOfRows();
			for (int i = 1; i < count; i++) {

				Row row1 = ConstantVariables.excelSheet.getRow(i);
				username1.clear();
				password.clear();
				String username = row1.getCell(4).getStringCellValue();
				username1.sendKeys(username);
				String password1 = row1.getCell(5).getStringCellValue();
				password.sendKeys(password1);

				login.click();

				Thread.sleep(1500L);

				/*
				 * Code for display the result value in TestData File. Use the assert true and
				 * assert false value and change the value as per the validation message
				 */
				 
				boolean isFound = existsElement(By.xpath(InvalidLogin));
				System.out.println(username);
				System.out.println(password1);
				if (isFound) {
					System.out.println(" displayed as fail it as fail");
					
					String ActualMessage = ConstantVariables.driver.findElement(By.xpath(InvalidLogin)).getText();
					System.out.println(
							"===================================================================" + ActualMessage);
					try {
						if (ActualMessage != null) {
						//	String expectedMessage = "Please enter valid username.";
						//	Assert.assertTrue("Please enter valid username.", expectedMessage.equals(ActualMessage));
						//	System.out.println("Test Pass");
							ExcelUtil.setCellData("PASS", i, 6);	
							
						}else {
							String expectedMessageValidation = "Invalid username an";
							Assert.assertFalse("Invalid username an", expectedMessageValidation.equals(ActualMessage));
							System.out.println("Test Fail");
							ExcelUtil.setCellData("Fail", i, 6);
						}
					}catch (NullPointerException e) {
						e.printStackTrace();
						System.out.println(e.getMessage());
					}
					
				} else {
					System.out.println("tag it as passed in excel.");
					ExcelUtil.setCellData("PASS", i, 6);
				}
			}
		}
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
