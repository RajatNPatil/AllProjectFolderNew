package ArrayPrograms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Merge2Arrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {3,5,6,7,8};
		
		int a1= a.length;
		int b1= b.length;
		
		int c1= a1+b1;
		
		int c[]= new int[c1];
		
		for(int i=0; i<a1; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b1; i++)
		{
			c[i+a1]=b[i];
		}
		
		Set<Integer> set= new TreeSet<Integer>();
		for(int i=0; i<c.length; i++)
		{
			set.add(c[i]);
		}
		System.out.print("Merging of two arrays: ");
		for(int s: set)
		{
			System.out.print(s+" ");
		}
		
		//System.out.println(Arrays.toString(c));

	}

}
