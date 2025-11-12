package Prctice001;

public class Test1 {

	public static void main(String[] args) {
		
		String input= "This is a tree";
		
	//	o/p: tree a is This, eert a si sihT, sihT si a eert
		
		String a[]= input.split(" ");
		String rev= "";
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev= rev + a[i] + " ";
		}
		System.out.println(rev);
		
		String input1 = "This is a tree";
		String rev1= "";
		
		for(int i=input1.length()-1; i>=0; i--)
		{
			rev1= rev1+ input1.charAt(i);
		}
		
		System.out.println(rev1);
		
		String b[]= rev1.split(" ");
		
		String rev2= "";
		
		for(int i=b.length-1; i>=0; i--)
		{
			rev2= rev2 + b[i] + " ";
		}
		System.out.println(rev2);
		
		
		
		
		
		
		

	}

}
