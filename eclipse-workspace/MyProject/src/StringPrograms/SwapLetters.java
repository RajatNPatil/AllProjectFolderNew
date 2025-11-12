package StringPrograms;
	
	public class SwapLetters {
	    public static void main(String[] args) {
	        String input = "Automation";

	        if (input != null && input.length() > 1) 
	        {
	            char first = input.charAt(0);
	            char last = input.charAt(input.length() - 1);
	            String middle = input.substring(1, input.length() - 1);
	            String result = last + middle + first;

	            System.out.println("Original: " + input);
	            System.out.println("Swapped: " + result);
	        } else {
	            System.out.println("No swap needed: " + input);
	        }
	    }
	}
