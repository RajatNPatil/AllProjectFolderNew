package StringPrograms;

public class MultipleReplace {

	    public static void main(String[] args) {
	        String input = "Tomorrow";
	        StringBuilder result = new StringBuilder();
	        int oCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch == 'o' || ch == 'O') {
	                oCount++;
	                if (oCount == 1) {
	                    result.append("#");
	                } else if (oCount == 2) {
	                    result.append("##");
	                } else if (oCount == 3) {
	                    result.append("###");
	                } else {
	                    result.append(ch);
	                }
	            } else {
	                result.append(ch);
	            }
	        }

	        System.out.println("Original: " + input);
	        System.out.println("Modified: " + result.toString());
	    }
	}

