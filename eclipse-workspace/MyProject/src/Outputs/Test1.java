package Outputs;

public class Test1 {
	
	public void print(Integer i)
	{
		System.out.println(i);
	}
	
	public void print(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Test1 ts= new Test1();
		
		ts.print(2);
		ts.print("abc");
		ts.print(null);
		
		

	}

}
