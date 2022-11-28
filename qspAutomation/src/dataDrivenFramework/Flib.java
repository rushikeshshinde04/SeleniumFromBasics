package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//Generic reusable method to read data
public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
{
	//Industry used method
	
	//FileInputStream fis = new FileInputStream(excelPath);
	//return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowCount).getCell(cellCount).getStringCellValue();

	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(rowCount);
	Cell cell = row.getCell(cellCount);
	String data = cell.getStringCellValue();
	return data;
}


//Generic reusable method to write data

public void WriteExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException
{
//Industry used method

//FileInputStream fis = new FileInputStream(excelPath);
//return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowCount).getCell(cellCount).getStringCellValue();

FileInputStream fis = new FileInputStream(excelPath);
Workbook wb=WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(rowCount);
Cell cell = row.createCell(cellCount);
cell.setCellValue(data);

FileOutputStream fos = new FileOutputStream(excelPath);
wb.write(fos);
}

public int getRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	int rc= sh.getLastRowNum();
	return rc;
	
}

}
