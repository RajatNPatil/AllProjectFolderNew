package Prctice01;

import java.util.HashMap;

public class frequencyOfChars {

	public static void main(String[] args) {
		
		      String s ="cg@1234";
		      HashMap<Character, Integer> map = new HashMap<>();
		       for(int i=0;i<s.length();i++)
		       {
		           if(map.containsKey(s.charAt(i)))
		           {
		               map.put(s.charAt(i),map.get(s.charAt(i))+1);
		           }
		           else
		           {
		               map.put(s.charAt(i),1);
		           }
		       }
		       map.forEach((K,V)-> System.out.println( "Character  " +K + " Frequency" +V  ));
		       

	}

}
