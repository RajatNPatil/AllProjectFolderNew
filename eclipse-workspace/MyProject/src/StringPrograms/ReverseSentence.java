package StringPrograms;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String s= "I Love My India";
		String a[]= s.split(" ");
		String rev="";
		
		for(int i=a.length-1; i>=0; i-- )
		{
			rev= rev+ a[i]+ " ";
		}
		
		System.out.println(rev);

	}

}
