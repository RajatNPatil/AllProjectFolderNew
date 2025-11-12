package Exceptions;

public class NullPointerExceptionn {

	public static void main(String[] args) {
		
		try
		{
			int a=9/0;
			System.out.println(a);
			
			
		String sen= null;
		
		int len= sen.length();
		System.out.println("sen length is: "+len);
		
	
		}
		catch(ArithmeticException s)
		{
			System.out.println("Caught ArithmeticException");
			System.exit(0);
		}
		catch(NullPointerException n)
		{
			System.out.println("Caught NullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception");
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		
		

	}

}
