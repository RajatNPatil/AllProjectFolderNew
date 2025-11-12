package StringPrograms;

import java.util.Scanner;

public class occOfCharacters {

	public static void main(String[] args) {
		int counter[]= new int[256];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str= sc.nextLine();
		String s= str.replace(String.valueOf(" "),"").toLowerCase();
		int len= s.length();
		
		for(int i=0; i<len; i++)
		{
			counter[(int) s.charAt(i)]++;
		}
		for(int i=0; i<256; i++)
		{
			if(counter[i]!=0)
			{
				System.out.println((char)i+" = "+counter[i]);
			}
		}

	}

}
