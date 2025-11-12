package Assignments;

public class StringProg1 {
	
	public static void main(String[] args)
	{
		String str="JAVA123PROGRAM45";      //output JAVAPROGRAM  12345
		
		StringBuilder letters= new StringBuilder();
		StringBuilder digits= new StringBuilder();
		
		for(char ch: str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				letters.append(ch);
			}
			else if(Character.isDigit(ch))
			{
				digits.append(ch);
			}
		}
		
		System.out.println(letters+" "+digits);
		
		
	}

}
