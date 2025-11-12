package StringPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortStringDescending {

    public static void main(String[] args) {
        String originalString = "programming";

        // Convert the string to a Character array (Wrapper class for Collections.reverseOrder())
        
        Character[] charArray = new Character[originalString.length()];
        for (int i = 0; i < originalString.length(); i++) {
            charArray[i] = originalString.charAt(i);
        }

        // Sort the Character array in descending order
        
        Arrays.sort(charArray, Collections.reverseOrder());

        // Convert the sorted Character array back to a String
        
        StringBuilder sortedString = new StringBuilder(charArray.length);
        for (char character : charArray) {
            sortedString.append(character);
        }

        System.out.println("Original String: " + originalString);
        System.out.println("String sorted in descending order: " + sortedString.toString());
    }
    
//    String o= "programming";
//    String a[]= o.split("");
//    
//    Arrays.sort(a, Collections.reverseOrder());
//    for(String sen: a){
//    System.out.print(sen);
//    }
    
}
