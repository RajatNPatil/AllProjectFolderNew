package StringPrograms;

public class LetterAndDigitSeprates {

	public static void main(String[] args) {
		
			String str="JAVA123PROGR@#AM45%&";      //output JAVAPROGRAM  12345  @#%&
			
			StringBuilder letters= new StringBuilder();
			StringBuilder digits= new StringBuilder();
			StringBuilder SpecialChars= new StringBuilder();
			
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
				else
				{
					SpecialChars.append(ch);
				}
			}
			
			System.out.println(letters+" "+digits+" "+SpecialChars);
			
			
		

	}

}
