package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import constants.Constantsdata;



public class FetchDatafromExcel

{
	public static String Testdata(int x, int y) throws IOException
	{
		FileInputStream fs = new FileInputStream(Constantsdata.Test_Data);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFCell value = sheet.getRow(x).getCell(y);
		String URLvalue = value.toString();
		workbook.close();
		return URLvalue;
		
	}
	
	public static String readCustomerID() throws IOException
	{
		FileInputStream fs = new FileInputStream(Constantsdata.Test_Data);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(sheet.getLastRowNum());
		XSSFCell cell = row.getCell(0);
		String CusIDvalue = cell.getStringCellValue();
		workbook.close();
		fs.close();
		return CusIDvalue;
		
	}

}
