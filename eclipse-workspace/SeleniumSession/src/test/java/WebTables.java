import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		String contactname= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[2]//td[2]")).getText();
		System.out.println("Contact Name: "+contactname);
		
//		int rows= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr")).size();
//		System.out.println("Total Rows"+rows);
//		
//		int columns= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr//th")).size();
//		System.out.println("total Cells"+ columns);
//		
//		for(int r=2; r<=rows; r++)
//		{
//			for(int c=1; c<=columns; c++)
//			{
//				String value= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]//td["+c+"]")).getText();
//				System.out.println("Table values: "+value+"\t");
//				
//			}
//			System.out.println();
//		}
		
		

	}

}
