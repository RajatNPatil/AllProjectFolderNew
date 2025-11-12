package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility2 {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook wk;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	String path;
	
	public Excelutility2(String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		fi= new FileInputStream(path);
		wk= new XSSFWorkbook(fi);
		sheet= wk.getSheet(sheetName);
		
		int rowCount= sheet.getLastRowNum();
		
		wk.close();
		fi.close();
		
		return rowCount;	
	}
	
	public int getCellCount(String sheetName, int rowNum) throws IOException
	{
		fi= new FileInputStream(path);
		wk= new XSSFWorkbook(fi);
		sheet= wk.getSheet(sheetName);
		row= sheet.getRow(rowNum);
		
		int cellCount= row.getLastCellNum();
		
		wk.close();
		fi.close();
		
		return cellCount;	
	}
	
	public String getCellData(String sheetName, int rowNum, int cellNum) throws IOException
	{
		fi= new FileInputStream(path);
		wk= new XSSFWorkbook(fi);
		sheet= wk.getSheet(sheetName);
		row= sheet.getRow(rowNum);
		cell= row.getCell(cellNum);
		
		DataFormatter formatter= new DataFormatter();
		String data;
		
		try {
		data= formatter.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data="";
		}
		
		wk.close();
		fi.close();
		
		return data;
	}
	
	
	
}
