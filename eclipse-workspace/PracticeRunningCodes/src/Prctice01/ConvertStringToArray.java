package Prctice01;

public class ConvertStringToArray {
	
	    public static void main(String[] args) {
	        String myString = "Hello Java";
	        char[] charArray = myString.toCharArray();
	        
	        for(int i=charArray.length-6; i>=0; i--)
	        {
	        	 System.out.print(charArray[i]);
	        }

	        // Print the character array
//	        for (char c : charArray) {
//	            System.out.print(c + " ");
//	        }
	        
	
	    }
	}


