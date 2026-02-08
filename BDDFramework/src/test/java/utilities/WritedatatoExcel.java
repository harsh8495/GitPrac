package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constantsdata;

public class WritedatatoExcel
{

	public static void WriteCustomerID(String CustomerID) throws IOException
	{
		FileInputStream fs = new FileInputStream(Constantsdata.Test_Data);
		Workbook workbook = new XSSFWorkbook(fs);
		Sheet sheet = workbook.getSheet(Constantsdata.Sheet_Name);
		
		int lastRow = sheet.getLastRowNum();
		
		Row row = sheet.createRow(lastRow+1);
		row.createCell(0).setCellValue(CustomerID);
		fs.close();
		
		FileOutputStream fos = new FileOutputStream(Constantsdata.Test_Data);
		workbook.write(fos);
		
		fos.close();
		workbook.close();
		
		
	}
}
