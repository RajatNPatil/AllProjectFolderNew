import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static void main(String[] args) throws IOException
	{
	
	FileInputStream file=  new FileInputStream(System.getProperty("user.dir")+"\\Data\\UserData.xlsx");
	XSSFWorkbook wk= new XSSFWorkbook(file);
	
	XSSFSheet sheet= wk.getSheet("Sheet1");
	
	int totalRows= sheet.getLastRowNum();
	int totalCells= sheet.getRow(1).getLastCellNum();
	
	System.out.println("total rows: "+totalRows);
	System.out.println("total cells: "+totalCells);
	
	for(int r=0; r<=totalRows; r++)
	{
		XSSFRow currentRow= sheet.getRow(r);
		
		for(int c=0; c<totalCells; c++)
		{
			XSSFCell currentCell= currentRow.getCell(c);
			System.out.println(currentCell.toString());
		}
		System.out.println();
	}
	
	wk.close();
	file.close();
	
	
	
			
	}
}
