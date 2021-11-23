package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
	public static void main(String[] args) throws IOException{
		File f=new File("./data/excel.xlsx");
		FileInputStream fis=new FileInputStream(f);
//		String data = WorkbookFactory.create(fis).getSheet("MarkSheet").getRow(2).getCell(2).getStringCellValue();
//		System.out.println(data);
		FileOutputStream fos=new FileOutputStream(f,true);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("MarkSheet").getRow(3).getCell(2).setCellValue("fail");
		wb.write(fos);
		wb.close();
	}
}
