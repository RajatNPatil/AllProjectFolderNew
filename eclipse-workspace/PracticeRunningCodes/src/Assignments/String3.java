package Assignments;

import java.util.HashMap;
import java.util.Map;

public class String3 {

	public static void main(String[] args) {
		
		String str1= "My java is my Java";
		
		String str= str1.toLowerCase();
		
		Map<String,Integer> strchars= new HashMap<>();
		
		for(String ch: str.split(" "))
		{
			strchars.put(ch, strchars.getOrDefault(ch, 0)+1);
		}
		
		//System.out.print("Unique Words: ");
		for(Map.Entry<String, Integer> entry: strchars.entrySet())
		{
			if(entry.getValue()>0)
			{
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		}

	}

}
