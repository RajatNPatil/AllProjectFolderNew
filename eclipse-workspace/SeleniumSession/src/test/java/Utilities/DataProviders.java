package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="UserData")
	public String[][] getData() throws IOException
	{
		
		String path= System.getProperty("user.dir")+"\\Data\\UserData.xlsx";
		
		Excelutility ex= new Excelutility(path);
		
		int totalRows= ex.getRowCount("Sheet1");
		int totalCells= ex.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String[totalRows][totalCells];
		
		for(int r=1; r<=totalRows; r++)
		{
			for(int c=0; c<totalCells; c++)
			{
				loginData[r-1][c]= ex.getCellData("Sheet1", r, c); 
			}
		}
		
		return loginData;
	}

}
