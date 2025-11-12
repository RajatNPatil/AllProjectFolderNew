package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccOfCountry {

	public static void main(String[] args) {
		
		String input = "I my name is Pradhya from India and I love travelling and I have visited Thailand, France, Indonesia, America, Canada. But I loved France the most for it's food";
		
		String inp1= input.replaceAll("[,.]", " ");
		
		String a[]= {"India","Thailand","France","Indonesia","America","Canada"};
		
		Map<String,Integer> strwords= new HashMap<>();
		
		for(String word: inp1.split(" "))
		{
			if(strwords.containsKey(word))
			{
				strwords.put(word, strwords.get(word)+1);
			}
			else
			{
				strwords.put(word, 1);
			}
		}
		
//		for(String sen: a)
//		{
//			if(strwords.equals(a))
//			{
//				System.out.println(strwords);
//			}
//		}
		
		for(Map.Entry<String, Integer> entry: strwords.entrySet())
		{		
//			for(int i=0; i<a.length;i++)
//			{
//			if(entry.getKey().equals(a[i]))
//			{			
//				System.out.println(entry.getKey()+" = "+entry.getValue());
//			}
//			}
			
			for(String countryy: a)
			{
				if(entry.getKey().equals(countryy))
				{
					System.out.println(entry.getKey()+" = "+entry.getValue());
				}
			}
			
		}

	}

}
