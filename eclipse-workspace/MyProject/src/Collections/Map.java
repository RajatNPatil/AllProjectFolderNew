package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		//HashMap: Stores key/value pairs with no specific order, keys are unique and values can be duplicates, Insertion order not preserved
		
		//TreeMap: 	Sorted map based on the natural order of keys
		
		//LinkedHashMap: Maintains the order in which keys were inserted
		
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("Raj", 1);
		map.put("Rajat", 2);
		map.put("Rj", 3);
		
		System.out.println(map.entrySet());  //[Rj=3, Raj=1, Rajat=2]
		
		System.out.println(map.values());   //[3, 1, 2]
		
		System.out.println(map.keySet());   //[Rj, Raj, Rajat]
		
		for(Entry<String, Integer> m: map.entrySet())
		{
			System.out.print(m+" ");   //Rj=3 Raj=1 Rajat=2 
		}
		
	    List<String> s= Arrays.asList("Ro","Vi","Sa");
		List<Integer> q= Arrays.asList(1,2,3);
		
		
		
	
		

	}

}
