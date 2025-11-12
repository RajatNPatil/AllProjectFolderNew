package ArrayPrograms;
import java.util.HashSet;
import java.util.Set;

public class DuplicateDigits {

	    public static boolean hasDuplicateDigits(int num) {
	        String numStr = String.valueOf(num);
	        Set<Character> digits = new HashSet<>();

	        for (char c : numStr.toCharArray()) {
	            if (!digits.add(c)) { // If add returns false, it means the element already exists
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int num = 12314567;
	        if (hasDuplicateDigits(num)) {
	            System.out.println("The number " + num + " has duplicate digits.");
	        } else {
	            System.out.println("The number " + num + " does not have duplicate digits.");
	        }
	    }
	}


