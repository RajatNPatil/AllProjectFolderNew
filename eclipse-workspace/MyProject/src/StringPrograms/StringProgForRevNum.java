package StringPrograms;

public class StringProgForRevNum {
	
		   public static void main(String[] args) {
			   
		       String input = "123, 456, 789";
		       
		       String[] numbers = input.split(",");
		       
		       StringBuilder output = new StringBuilder();
		       
		       for (int i = 0; i < numbers.length; i++) 
		       {
		           String num = numbers[i].trim();
		           String reversed = new StringBuilder(num).reverse().toString();
		           output.append(reversed);
		           
		           // Add comma and space except after the last number
		           if (i < numbers.length - 1)
		           {
		               output.append(", ");
		           }
		       }
		       System.out.println("Output: " + output.toString());
		   
		}

}
