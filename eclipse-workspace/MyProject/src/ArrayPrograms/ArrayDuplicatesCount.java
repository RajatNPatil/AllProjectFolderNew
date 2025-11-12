package ArrayPrograms;

public class ArrayDuplicatesCount {

	public static void main(String[] args) {
		int a[]= {2,1,3,2,4,3,5,6,65};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Number: "+a[i]);
					break;
				}
			}
		}

	}

}
