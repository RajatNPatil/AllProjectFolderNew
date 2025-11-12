package Prctice01;

public class ConvertAndReverseArrayString {
	
	 public static void main(String[] args) {
		 
	        String myString = "Hello Java";
	        
	        String s[]= myString.split(" ");
	                
	        
	        for(int i=s.length-1; i>=0; i--)
	        {
	        	 System.out.print(s[i]+" ");
	        }
	        
	        
	        
	 }
}
