package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvider3 {
	
	@DataProvider(name="login")
	public String[][] loginData() throws IOException
	{
		String path= System.getProperty("user.dir")+"\\Data\\ExcelData.xlsx";
		ExcelUtility3 xl= new ExcelUtility3(path);
		
		int totalRows= xl.getRowCount("sheet");
		int totalCells= xl.getCellCount("sheet", 1);
		
		String loginData[][]= new String[totalRows][totalCells];
		
		for(int r=1; r<=totalRows; r++)
		{
			for(int c=0; c<totalCells; c++)
			{
				loginData[r-1][c]= xl.getCellData("sheet", r, c);
			}
		}
		
		return loginData;
		
		
		
		
		
	}

}
