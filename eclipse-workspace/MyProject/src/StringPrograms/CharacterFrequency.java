package StringPrograms;
	
import java.util.HashMap;

	public class CharacterFrequency {
		
	    public static void main(String[] args) {
	    	int counter[]=new int[256];
	        String str = "AUTOMATION";
//	        HashMap<Character, Integer> frequencyMap = new HashMap<>();
//
//	        for (char ch : str.toCharArray()) {
//	            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
//	        }
//
//	        // Print the frequency of each character
//	        for (char ch : frequencyMap.keySet()) {
//	            System.out.println(ch + " : " + frequencyMap.get(ch));
//	        }
	        
	        int len=str.length();
	        
	        for(int i=0; i<len; i++)
	        {
	        	counter[(int) str.charAt(i)]++;
	        }
	        for(int i=0; i<256; i++)
	        {
	        	if(counter[i]!=0)
	        	{
	        		System.out.println((char)i+" = "+counter[i]);
	        	}
	        }
	        
	        
	        
	    }
	}



