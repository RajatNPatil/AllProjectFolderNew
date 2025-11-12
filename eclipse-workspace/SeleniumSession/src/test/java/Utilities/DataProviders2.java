package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders2 {
	
	@DataProvider(name="LoginData")
	public String[][] LoginData() throws IOException
	{
		String path= System.getProperty("user.dir")+"\\Data\\UserData.xlsx";
		
		Excelutility2 ex= new Excelutility2(path);
		
		int totalRows= ex.getRowCount("sheet1");
		int totalCells= ex.getCellCount("sheet1",1);
		
		String loginData[][]= new String[totalRows][totalCells];
		
		for(int r=1; r<=totalRows; r++)
		{
			for(int c=0; c<totalCells; c++)
			{
				loginData[r-1][c]= ex.getCellData("sheet1", r, c);
			}
		}
		
		return loginData;
		
	}
	
	
	
	
	

}
