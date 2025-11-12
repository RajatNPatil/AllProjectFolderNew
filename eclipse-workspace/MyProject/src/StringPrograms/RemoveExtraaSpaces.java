package StringPrograms;

public class RemoveExtraaSpaces {

	public static void main(String[] args) {
		
		String str= "    Raj    Aryan          Malhotra     ";
		
		//Output: Raj Aryan Malhotra
		
		String cleanName= str.trim().replaceAll("\\s+", " ");
		
		System.out.println("Clean name with proper spacing: "+cleanName);
		

	}

}
