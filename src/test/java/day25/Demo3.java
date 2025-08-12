package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {
//write data into excel file
	public static void main(String[] args) throws Exception {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book1.xls"));
		
		wb.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Akshara");
		
		wb.write(new FileOutputStream("./data/book2.xls"));//dif path or file name-->Save As

		wb.close();

	}

}
