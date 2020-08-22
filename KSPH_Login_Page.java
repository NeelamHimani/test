package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import Test.ConstantVariables;


public class KSPH_Login_Page  {
	
	

    //Using FindBy for locating elements
 
    
 
	public static void main(String args[]) throws IOException {
		getfile("D:\\Neelam_Automation_Work\\project\\15-07-2020\\KSPH_Automation_Script\\src\\test\\java\\ExcelData\\Login_Xpath.xlsx");
		getExcelData(1, 1, 1);
		
		
	}

	//Method To getFile using with file path and used variables from constantvariables.
	public static String getfile(String filePath) throws IOException {

		FileInputStream fis = new FileInputStream(filePath); // Your .xlsx file name along with path
		ConstantVariables.excelWorkbook = new XSSFWorkbook(fis);
		return filePath;
	}

	//Method to get data from Excel for particular row and column
	public static String getExcelData(int index, int row, int col) throws IOException {
		ConstantVariables.excelSheet = ConstantVariables.excelWorkbook.getSheetAt(index);
		System.out.println(ConstantVariables.excelSheet.getSheetName());
		// Read sheet inside the workbook by its name
		// excelSheet = excelWorkbook.getSheet("Validation"); //Your sheet name
		Cell data = ConstantVariables.excelSheet.getRow(row).getCell(col);
		System.out.println("data===" + data.getStringCellValue());
		return data.getStringCellValue();

	}
}
