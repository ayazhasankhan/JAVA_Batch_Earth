package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteXls {

	public static void main(String[] args) throws Exception {
		
		String fs = "/Users/mr.a2z/Ayazworkspace/PageObjectModel/DemoFile.xlsx";
		
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		
	       Sheet sheet =workbook.createSheet("Test");
	       Row row = sheet.createRow(5);
	       Cell cell =row.createCell(6);
	       cell.setCellValue("Hello");
		

	      //Create file system using specific name
	      FileOutputStream out = new FileOutputStream(fs);

	      //write operation workbook using file out object 
	      workbook.write(out);
	      out.close();
	      System.out.println("createworkbook.xlsx written successfully");
		

	}
}
