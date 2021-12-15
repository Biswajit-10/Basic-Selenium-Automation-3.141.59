package com.actitime.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is generic class for data driven testing
 * @author Biswajit
 *
 */
public class FileLib {
	/**
	 *  This is generic mehod to write the data in property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;		
	}
	/**
	 * This is generic mehod to read the data in excel sheet
	 * <ol>
	 *<li> @param sheetname
	 *<li> @param row
	 *<li>@param cell
	 * <ol>
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	/**
	 * This is generic mehod to write the data in excel sheet
	 * <ul>
	 * <li>@param sheetname
	 * <li>@param row
	 * <li>@param cell
	 * <li>@param value
	 * <ul>
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	//	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		File f=new File("./data/testscript.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
		Workbook wb = WorkbookFactory.create(f);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
//		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		FileOutputStream fos=new FileOutputStream(f,true);
		wb.write(fos);
		wb.close();
	}
}


















