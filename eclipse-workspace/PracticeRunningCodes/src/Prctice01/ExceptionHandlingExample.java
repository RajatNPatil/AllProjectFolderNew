package Prctice01;

	public class ExceptionHandlingExample {
	    public static void main(String[] args) {
	        try 
	        {
	            int result = 10 / 0; // This will throw an ArithmeticException
	            System.out.println("Result: " + result); // This line will not be executed
	        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println("Error Arithmetic: Cannot divide by zero. " + e.getMessage());
	        } 
	        catch (Exception a) 
	        {
	            System.out.println("Error: Cannot divide by zero. " + a.getMessage());
	        } 
	        finally 
	        {
	            System.out.println("Finally block executed.");
	        }
	        
	        	        
	   }
}
