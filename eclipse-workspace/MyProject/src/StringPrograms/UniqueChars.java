package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars {

	public static void main(String[] args) {
		
		String str = "5ddddpljhtt9648555pf";
		
		Map<Character,Integer> unique= new HashMap<>();
		
		for(char ch: str.toCharArray())
		{
			unique.put(ch, unique.getOrDefault(ch, 0)+1);
		}
		
		System.out.print("Unique Characters: ");
		
		for(Map.Entry<Character, Integer> entry: unique.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey()+ " ");
			}
		}
 
}
}