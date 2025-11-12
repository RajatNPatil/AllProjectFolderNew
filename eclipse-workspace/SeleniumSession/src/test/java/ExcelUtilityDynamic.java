import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityDynamic {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\data\\UserData.xlsx");
		XSSFWorkbook wk= new XSSFWorkbook();
		XSSFSheet sheet= wk.createSheet("SheetName");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no of rows: ");
		int rows= sc.nextInt();
		
		System.out.println("Enter no of cells: ");
		int cells= sc.nextInt();
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow currentrow= sheet.createRow(r);
			
			for(int c=0; c<cells; c++)
			{
				XSSFCell currentcell= currentrow.createCell(c);
				currentcell.setCellValue(sc.next());
			}
		}
		
		wk.write(file);
		wk.close();
		file.close();

	}

}
