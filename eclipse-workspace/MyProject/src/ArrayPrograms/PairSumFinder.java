package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class PairSumFinder {

	public static void main(String[] args) {
		
		int num[]= {4,5,7,11,9,13,8,12};
		int targetSum= 20;
		
		Set<Integer> set= new HashSet<>();
		
		System.out.println("Pairs with sum 20: ");
		
		for(int value: num)
		{
			int complement= targetSum-value;
			if(set.contains(complement))
			{
				System.out.println(complement+", "+value);
			}
			set.add(value);
		}

	}

}
