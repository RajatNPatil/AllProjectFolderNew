package LogicalPrograms;

public class SwappingTwoVariables {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int c;

		System.out.println("Before swapping: a = " + a + ", b = " + b);

//		a = a + b; // a now holds the sum of original a and b
//		b = a - b; // b now holds the original value of a (sum - original b)
//		a = a - b; // a now holds the original value of b (new a - new b, which is original b)

		System.out.println("After swapping: a = " + a + ", b = " + b);

	}

}
