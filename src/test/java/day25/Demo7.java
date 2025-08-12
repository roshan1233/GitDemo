package day25;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo7 {

	public static void main(String[] args) throws Exception {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book4.xls"));
		int rc= wb.getSheet("sheet1").getLastRowNum();
		for(int i=0;i<=rc;i++)
		{
			try {
					int cc=wb.getSheet("sheet1").getRow(i).getLastCellNum();
					for(int j=0;j<cc;j++)
					{
						try 
						{
							String v = wb.getSheet("sheet1").getRow(i).getCell(j).toString();
							System.out.print(v+" ");
						}
						catch (Exception e) 
						{
							System.out.print("-- ");
						}
					}
			}
			catch (Exception e)
			{
				System.out.print("-- -- -- --");
			}
		
			System.out.println();
		}
		wb.close();

	}

}