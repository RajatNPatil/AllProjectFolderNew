package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccOfWords {
	
	public static void occOfWords(String sen)
	{
		Map<String,Integer> strwords= new HashMap<String,Integer>();
		for(String word: sen.split(" "))
		{
			String word1= word.toLowerCase();
			if(strwords.containsKey(word1))
			{
				strwords.put(word1, strwords.get(word1)+1);
			}
			else
			{
				strwords.put(word1, 1);
			}
			
		}
		//System.out.println(strwords);
		
		for(String st: strwords.keySet())
		{
			System.out.println(st+" = "+strwords.get(st));
		}
	}

	public static void main(String[] args) {
		occOfWords("My Java is my java");

	}

}
