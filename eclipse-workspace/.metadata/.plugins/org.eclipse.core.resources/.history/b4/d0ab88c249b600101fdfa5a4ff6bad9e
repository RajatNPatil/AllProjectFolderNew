package ArrayPrograms;

import java.util.Set;
import java.util.TreeSet;

public class SortingArrayAndRemovingDuplicates {

	public static void main(String[] args) {
		int a[]= {3,4,2,3,1,5,6,7,7};
		Set<Integer> set= new TreeSet<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			set.add(a[i]);
		}
		//set.remove(set.get());
		for(int num: set)
		{
			
			System.out.print(num+" ");
		}
		

	}

}
