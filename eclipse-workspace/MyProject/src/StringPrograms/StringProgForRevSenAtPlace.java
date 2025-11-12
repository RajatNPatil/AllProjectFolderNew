package StringPrograms;

public class StringProgForRevSenAtPlace {
	
		   public static void main(String[] args) {
			   
		       String input = "my java is my java";
		       
		       String[] numbers = input.split(" ");
		       
		       StringBuilder output = new StringBuilder();
		       
		       for (int i = 0; i < numbers.length; i++) 
		       {
		           String num = numbers[i];
		           String reversed = new StringBuilder(num).reverse().toString();
		           output.append(reversed+" ");
		       }
		       
		       System.out.println("Output: " + output.toString());
		   
		}

}
