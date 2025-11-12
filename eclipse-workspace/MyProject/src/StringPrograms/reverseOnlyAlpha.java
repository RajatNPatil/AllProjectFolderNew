package StringPrograms;

public class reverseOnlyAlpha {

	public static void main(String[] args) {
		String s= "a1b2c3d4e5f6";
		String result= reverseAlpha(s);
		System.out.println("reversed only alphabets: "+result);

	}
	
	public static String reverseAlpha(String s)
	{
		char chars[]= s.toCharArray();
		int left=0;
		int right= chars.length-1;
		
		while(left<right)
		{
			if(!Character.isLetter(chars[left]))
			{
				left++;
			}
			else if(!Character.isLetter(chars[right]))
			{
				right--;
			}
			else
			{
				char temp= chars[left];
				chars[left]= chars[right];
				chars[right]= temp;
				left++;
				right--;
			}
		}
		return new String(chars);
	}

}
