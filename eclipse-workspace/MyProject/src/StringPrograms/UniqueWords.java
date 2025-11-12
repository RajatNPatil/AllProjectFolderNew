package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
	
    public static void main(String[] args) {
        String sen="my name is my Rajat Nikam and all and all name is";
        
   Map<String,Integer> strwords= new HashMap<String,Integer>();
        
        for(String word: sen.split(" "))
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
        System.out.print("Unique Words from given string is: ");
        for(Map.Entry<String,Integer> entry: strwords.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.print(entry.getKey()+" ");
            }
        }
        
//        String a[]= sen.split(" ");
//        
//        Set<String> unique= new LinkedHashSet<>();
//        
//        for(String word: a)
//        {
//        	unique.add(word);
//        }
//        
//        for(String word: unique)
//        {
//        	System.out.print(word+" ");
//        }
        
    }

}
