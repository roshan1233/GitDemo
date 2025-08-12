package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		//open the excel file(Workboox)
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book1.xls"));
	
		
		//goto req sheet --> sheet1
		Sheet s = wb.getSheet("sheet1");
		
		//goto req row--> 1st row
		Row r = s.getRow(0);
		
		//goto req cell--> 1s t cell
		Cell c = r.getCell(0);
		
		//get the data & print it
		String v = c.getStringCellValue();
		System.out.println(v);
		
		//close the excel file
		wb.close();

	}

}
