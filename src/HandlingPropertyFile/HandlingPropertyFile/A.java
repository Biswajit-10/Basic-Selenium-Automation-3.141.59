package HandlingPropertyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//		FileReader fr=new FileReader("./data/testscript.xlsx"); not work here
		Workbook wb = WorkbookFactory.create(fis);
//		String data = wb.getSheet("CustomerCare").getRow(1).getCell(1).getStringCellValue();
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.getSheet("CreateCustomer").getRow(1).getCell(1).setCellValue("hello");
		
		wb.write(fos);
		wb.close();

	}
}
