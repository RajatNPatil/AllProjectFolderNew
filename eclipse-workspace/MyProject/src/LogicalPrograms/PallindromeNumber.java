package LogicalPrograms;

public class PallindromeNumber {
	
	public static void main(String[] args)
	{
		String o= "madam";
		String rev="";
		
		for(int i=o.length()-1; i>=0; i--)
		{
			rev= rev+ o.charAt(i);
		}
		
		if(rev.equals(o))
		{
			System.out.println("Given string "+o+" is pallindrome");
		}
		else
		{
			System.out.println("Given string "+o+" is not pallindrome");
		}
	}

}
