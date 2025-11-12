package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class CommonValuesInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {3,5,6,7};
		int sum=0;
		
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j] && !list.contains(a[i]))
				{
					list.add(a[i]);
					sum= sum+a[i];
				}
			}
		}
		
		System.out.print("Common values: ");
		
		for(int l: list)
		{
			System.out.print(l+" ");
		}
		
		System.out.println();
		System.out.println("Sum of common values is: "+sum);

	}

}
