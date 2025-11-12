import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\data\\UserData.xlsx");
		XSSFWorkbook wk= new XSSFWorkbook();
		XSSFSheet sheet= wk.createSheet("SheetName");
		
		XSSFRow row1= sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue("Selenium");
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2= sheet.createRow(1);
		
		row2.createCell(0).setCellValue("JavaScript");
		row2.createCell(1).setCellValue("Cypress");
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3= sheet.createRow(2);
		
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue("Playwright");
		row3.createCell(2).setCellValue("Automation");
		
		wk.write(file);
		wk.close();
		file.close();
		
		
		
		

	}

}
