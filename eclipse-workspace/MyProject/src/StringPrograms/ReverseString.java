package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s= "n@i%k#a*m";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev= rev+ s.charAt(i);
		}
		
		rev= rev.replaceAll("[@%%#*]", "");
		
		System.out.println("Reverse string without special chars: "+rev);

	}

}
