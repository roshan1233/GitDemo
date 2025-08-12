package day25;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo5 {

	public static void main(String[] args) throws Exception {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book4.xls"));
		
		int rc = wb.getSheet("sheet1").getLastRowNum();
		System.out.println(rc);
		
		int cc = wb.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(cc);
		
		
		cc = wb.getSheet("sheet1").getRow(1).getLastCellNum();
		System.out.println(cc);
		
		cc = wb.getSheet("sheet1").getRow(2).getLastCellNum();
		System.out.println(cc);
		
//		cc = wb.getSheet("sheet1").getRow(3).getLastCellNum();
//		System.out.println(cc);
		
		cc = wb.getSheet("sheet1").getRow(4).getLastCellNum();
		System.out.println(cc);
		
		cc = wb.getSheet("sheet1").getRow(5).getLastCellNum();
		System.out.println(cc);
		
		wb.close();

	}

}
