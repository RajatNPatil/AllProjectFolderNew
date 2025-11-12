package Prctice001;
	
	import java.util.HashMap;
	import java.util.Map;

	public class NonRepeatingSubstrings {

	    public static int countNonRepeatingSubstrings(String s) {
	        int count = 0;
	        int left = 0;
	        Map<Character, Integer> charCount = new HashMap<>();

	        for (int right = 0; right < s.length(); right++) {
	            char currentChar = s.charAt(right);
	            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

	            // Shrink the window from the left if a character repeats
	            while (charCount.get(currentChar) > 1) {
	                char leftChar = s.charAt(left);
	                charCount.put(leftChar, charCount.get(leftChar) - 1);
	                left++;
	            }

	            // Add the number of valid substrings ending at 'right'
	            // The number of valid substrings ending at 'right' is (right - left + 1)
	            count += (right - left + 1);
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String str1 = "abc"; // Expected: 6 (a, b, c, ab, bc, abc)
	        String str2 = "aba"; // Expected: 5 (a, b, a, ab, ba)
	        String str3 = "aa";  // Expected: 2 (a, a)

	        System.out.println("Total non-repeating substrings in \"" + str1 + "\": " + countNonRepeatingSubstrings(str1));
	        System.out.println("Total non-repeating substrings in \"" + str2 + "\": " + countNonRepeatingSubstrings(str2));
	        System.out.println("Total non-repeating substrings in \"" + str3 + "\": " + countNonRepeatingSubstrings(str3));
	    }
	}


