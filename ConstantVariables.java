package Test;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus; 

public class ConstantVariables {
	
	public static WebDriver driver=null;
	public static XSSFWorkbook excelWorkbook = null;
	public static XSSFSheet excelSheet = null;
	public static XSSFRow row = null;
	public static XSSFCell cell = null;
	
	public static String ORFile="D:\\Neelam_Automation_Work\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx";
	public static String TestDataFile="D:\\Neelam_Automation_Work\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Test_Data.xlsx";
	public static String Register100User="D:\\Neelam_Automation_Work\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Register_With_100Users.xlsx";
	
	//FilePath variable of setCellData for ExcelUtil Class
	public static String filePath="D:\\Neelam_Automation_Work\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Test_Data.xlsx";
	
	public static ExtentTest test;
	public static ExtentReports report;
	
	

}
