package StringPrograms;

public class RepeatPairPrinter {

	public static void main(String[] args) {
		String str= "aabbccddefg";
		
		for(int i=0; i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				System.out.println(""+str.charAt(i)+str.charAt(i+1));
				i++;
			}
		}		

	}

}
