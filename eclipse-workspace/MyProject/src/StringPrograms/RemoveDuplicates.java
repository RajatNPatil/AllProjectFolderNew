package StringPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s= "IIII LLLLOOOOVVVVEEEE IIIINNNNDDDDIIIIIAAAA";
		String a[]= s.split("");
		
		Set<String> set= new LinkedHashSet<String>();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		//System.out.println(set);
		
		List<String> l= new ArrayList<String>(set);
		
		l.add(6," ");
		l.add(7,"I");
		l.add(10,"I");
		
		for(String sen: l)
		{
			System.out.print(sen);
		}
		

	}

}
