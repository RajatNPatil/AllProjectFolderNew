package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility3 {
	
public FileInputStream fi;
public FileOutputStream fo;
public XSSFWorkbook wk;
public XSSFSheet sheet;
public XSSFRow row;
public XSSFCell cell;
String path;

public ExcelUtility3(String path)
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

public int getCellCount(String sheetName, int rownum) throws IOException
{
	fi= new FileInputStream(path);
	wk= new XSSFWorkbook(fi);
	sheet= wk.getSheet(sheetName);
	row= sheet.getRow(rownum);
	
	int cellCount= row.getLastCellNum();
	
	
	wk.close();
	fi.close();
	
	return cellCount;
}

public String getCellData(String sheetName, int rownum, int cellnum) throws IOException
{
	fi= new FileInputStream(path);
	wk= new XSSFWorkbook(fi);
	sheet= wk.getSheet(sheetName);
	row= sheet.getRow(rownum);
	cell= row.getCell(cellnum);
	
	DataFormatter formatter= new DataFormatter();
	String data;
	
	try 
	{
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
