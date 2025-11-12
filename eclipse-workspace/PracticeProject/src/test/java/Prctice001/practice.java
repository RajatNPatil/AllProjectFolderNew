package Prctice001;

import java.util.LinkedHashSet;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
		int a[]= {4,4,3,3,8,9,7,7,9,8};
		
		Set<Integer> set= new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++)
			{
			set.add(a[i]);
			}
		
		System.out.println(set);

	}

}
