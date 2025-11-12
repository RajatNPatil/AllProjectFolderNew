package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		
		//ArrayList: Resizable array allows duplicates and insertion order is preserved
		
		//LinkedList: List with fast insert and remove operations
		
		ArrayList<Integer> l= new ArrayList<>();
		
//		l.add(1);
//		l.add(2);
		
		l.addAll(Arrays.asList(1,2,3,4,5));
		
		//l.addAll(List.of(1,2,3,4,5));
		
		System.out.println(Collections.min(l));  //1
		System.out.println(Collections.max(l));  //5
		
		//System.out.println(Collections.l);
		
		System.out.println(l);   //[1, 2, 3, 4, 5]
		
		l.remove(1); 
		
		//l.set(0, 2);
		
		System.out.println(l);    //[1, 3, 4, 5]
		
		System.out.println(l.size());  //4
		
		for(int i=0; i<l.size(); i++)
		{
			System.out.print(l.get(i)+" ");    //1 3 4 5 
		}
		
		System.out.println();
		System.out.println(l.getLast());   //5
		System.out.println(l.getFirst());  //1
		
		Iterator<Integer> it= l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");   //1 3 4 5 
		}	

	}

}
