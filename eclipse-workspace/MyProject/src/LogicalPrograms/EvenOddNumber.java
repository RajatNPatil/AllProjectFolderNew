package LogicalPrograms;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		int num[]= {1,1,2,3,5,7,8,11};
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]+" is even number");
			}
			else
			{
				System.out.println(num[i]+" is odd number");
			}
		}

	}

}
			