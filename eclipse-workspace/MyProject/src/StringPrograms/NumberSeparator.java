package StringPrograms;
	
	import java.util.ArrayList;
	import java.util.Scanner;

	public class NumberSeparator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string of numbers separated by spaces (e.g., \"10 -5 20 -15 30\"):");
	        String inputString = scanner.nextLine();

	        ArrayList<Integer> positiveNumbers = new ArrayList<>();
	        ArrayList<Integer> negativeNumbers = new ArrayList<>();

	        // Split the string and parse numbers
	        String[] numberStrings = inputString.split(" ");
	        for (String s : numberStrings) {
	            try {
	                int number = Integer.parseInt(s);
	                if (number >= 0) {
	                    positiveNumbers.add(number);
	                } else {
	                    negativeNumbers.add(number);
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Warning: '" + s + "' is not a valid number and will be skipped.");
	            }
	        }

	        // Print the results
	        System.out.println("Positive Numbers: " + positiveNumbers);
	        System.out.println("Negative Numbers: " + negativeNumbers);

	        scanner.close();
	    }
	}
