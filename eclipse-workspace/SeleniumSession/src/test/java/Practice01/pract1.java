package Practice01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pract1 {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\Data\\UserData.xlsx");
		XSSFWorkbook wk= new XSSFWorkbook();
		XSSFSheet sheet= wk.createSheet("SheetName");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int totRow= sc.nextInt();
		
		System.out.println("Enter no. of cells");
		int totCells= sc.nextInt();
		
		for(int r=0; r<=totRow; r++)
			{
				XSSFRow currentRow= sheet.createRow(r);
				
				for(int c=0; c<totCells; c++)
				{
					XSSFCell cell= currentRow.createCell(c);
					cell.setCellValue(sc.next());
				}
				
			}
		
		
		
		XSSFRow row1= sheet.createRow(0);
		
		row1.createCell(0).setCellValue("1");
		row1.createCell(1).setCellValue("Java");
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2= sheet.createRow(1);
		
		row2.createCell(0).setCellValue("2");
		row2.createCell(1).setCellValue("Python");
		row2.createCell(2).setCellValue("Automation");
		
		wk.write(file);
		wk.close();
		file.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\Data\\userData.xlsx");
//		XSSFWorkbook wk= new XSSFWorkbook(file);
//		XSSFSheet sheet= wk.getSheet("SheetName");
//		
//		int totalRows= sheet.getLastRowNum();
//		int totalCells= sheet.getRow(1).getLastCellNum();
//		
//		System.out.println(totalRows);
//		System.out.println(totalCells);
//		
//		for(int r=0; r<=totalRows; r++)
//		{
//			XSSFRow currentRow= sheet.getRow(r);
//			
//			for(int c=0; c<totalCells; c++)
//			{
//				XSSFCell cell= currentRow.getCell(c);
//				System.out.println(cell.toString());
//			}
//			System.out.println();
//		}
//		
//		wk.close();
//		file.close();
		

	}

}
