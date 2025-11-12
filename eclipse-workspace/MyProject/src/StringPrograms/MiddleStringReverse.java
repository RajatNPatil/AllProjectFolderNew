package StringPrograms;

public class MiddleStringReverse {

	public static void main(String[] args) {
		String sen="I love selenium with Java and python";
		String a[]= sen.split(" ");
		String n= "";
		String m="";
		
		for(int i=0; i<=(a.length/2)-1; i++)
		{
			n= n+a[i]+" ";
		}		
		System.out.print(n);
		
		String str= a[(a.length/2)];
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		
		System.out.print(sb+" ");
		
		for(int i=(a.length/2)+1; i<a.length; i++)
		{
			m= m+a[i]+" ";
		}		
		System.out.print(m);
		

	}

}
