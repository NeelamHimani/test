package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadXpathFromExcel {
	
	public static void main(String args[]) throws IOException {
		
	//	readExcelData("C:\\project\\KSPH_Automation_Script\\src\\test\\java\\ExcelData", "Login_Xpath.xlsx", "Login_Input", 2, 0);
		readExcelData(1, 2);
		readExcelData(2, 2);
		readExcelData(3, 2);
	}
	
	
	public static  String  readExcelData(int row, int col) throws IOException{

		
		String filePath="C:\\\\project\\\\KSPH_Automation_Script\\\\src\\\\test\\\\java\\\\ExcelData";
		String fileName="Login_Xpath.xlsx";
		String sheetName="Login_Input";
		 	ArrayList data = new ArrayList();
		    //Create an object of File class to open xlsx file
		    File file =    new File(filePath+"\\"+fileName);

		    //Create an object of FileInputStream class to read excel file
		    FileInputStream inputStream = new FileInputStream(file);
		    Workbook workbook = null;

		    //Find the file extension by splitting file name in substring  and getting only extension name
		    String fileExtensionName = fileName.substring(fileName.indexOf("."));
		 
		    //Check condition if the file is xlsx file
			if (fileExtensionName.equals(".xlsx")) {
				// If it is xlsx file then create object of XSSFWorkbook class
				workbook = new XSSFWorkbook(inputStream);
			}			
			 //Check condition if the file is xls file
		    else if(fileExtensionName.equals(".xls")){
		        //If it is xls file then create object of HSSFWorkbook class
		        workbook = new HSSFWorkbook(inputStream);
		    }
			
			// Read sheet inside the workbook by its name
			Sheet sheet = workbook.getSheet(sheetName);
			//System.out.println("sheet name===========================================================" + sheet.getSheetName());

			// Find number of rows in excel file
			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		//	System.out.println("rowCount==============================================================" + rowCount);
		
			Cell cell = sheet.getRow(row).getCell(col);
			System.out.println("cell===================="+cell);
			return fileExtensionName;
	
			/*
			 * if (cell == null || type == CellType.BLANK) { return ""; } else if (type ==
			 * CellType.NUMERIC) return String.format("%.0f", cell.getNumericCellValue());
			 * else return cell.getStringCellValue();
			 */
			
	 }
}
		    
	 
	 



