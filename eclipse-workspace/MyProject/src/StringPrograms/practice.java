package StringPrograms;

import java.util.Arrays;
import java.util.Collections;

public class practice {

	public static void main(String[] args) {
		
	String s= "programming";
	
	Character[] chars= new Character[s.length()];
	
	for(int i=0; i<s.length(); i++)
	{
		chars[i]= s.charAt(i);
	}
	
	Arrays.sort(chars, Collections.reverseOrder());
	
	StringBuilder str= new StringBuilder(chars.length);
	
	for(Character charr: chars)
	{
		str.append(charr);
	}
	
	System.out.println(str.toString());
		
		
		
	}

}
