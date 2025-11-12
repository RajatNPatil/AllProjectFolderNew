package Collections;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		
		//Queue: First-In, First-Out
		
		PriorityQueue<String> pq= new PriorityQueue<>();
		
		pq.addAll(Arrays.asList("Rohit","virat","Sachin"));
		
		System.out.println(pq);  //[Rohit, virat, Sachin]
		
		System.out.println(pq.peek());  //Rohit
		
		pq.poll();
		
		System.out.println(pq);    //[Sachin, virat]
		
		
		

	}

}
