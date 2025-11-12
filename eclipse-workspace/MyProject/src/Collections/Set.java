package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		
		//HashSet: Unordered collection of unique elements which don't allow duplicates, insertion order is not preserved
		
		//TreeSet: Sorted set of unique elements (natural order)
		
		//LinkedHashSet: Maintains the order in which elements were inserted
		
		
				HashSet<Integer> s= new HashSet<>();
				
//				s.add(1);
//				s.add(2);
				
				s.addAll(Arrays.asList(1,2,3,4,5,3,5));
				
				//s.addAll(List.of(1,2,3,4,5));
				
				System.out.println(s);   //[1, 2, 3, 4, 5]
				
				s.remove(1);              
				
				System.out.println(s);    //[2, 3, 4, 5]
				
				System.out.println(s.size());  //4
				
				for(int i=0; i<s.size(); i++)
				{
					//System.out.print(s.get(i)+" ");    //1 3 4 5 
				}
				
				System.out.println();
				//System.out.println(s.getLast());   //5
				//System.out.println(s.getFirst());  //1
				
				Iterator<Integer> it= s.iterator();
				while(it.hasNext())
				{
					System.out.print(it.next()+" ");   //2 3 4 5
				}

	}

}
