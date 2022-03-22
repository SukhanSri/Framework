package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	static String projectpath;
	static XSSFWorkbook	workbook1;
	static 	XSSFSheet sheet;
	public static void main(String[] args) throws IOException {
	//	getRowCount();
	//	getCellData();
	}
//	public static void getRowCount() throws IOException  {
//
//		projectpath = System.getProperty("user.dir");
//		workbook1 = new XSSFWorkbook(projectpath+ "/ExcelFiles/Data.xlsx");
//		sheet = workbook1.getSheet("Sheet1");
//		int rowcount = sheet.getPhysicalNumberOfRows();
//		System.out.println(rowcount);
//		}
	
	public excelutils(String excelpath, String sheetname) throws IOException {
		projectpath = System.getProperty("user.dir");
		workbook1 = new XSSFWorkbook(excelpath);
		sheet = workbook1.getSheet(sheetname);
	}
	
	public static void getCellData(int rowNum, int colNum) throws IOException {
		
		String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(celldata);
		int celldata2 = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(celldata2);
	}
}
