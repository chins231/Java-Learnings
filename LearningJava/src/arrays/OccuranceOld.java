package arrays;

import java.util.Scanner;

public class OccuranceOld {

	public static void main(String[] args) {
		String str="Hi hello SriRanganath this will be used for counting a char occurance";
		System.out.println("Enter a char to find its occurance");
		char c=new Scanner(System.in).next().charAt(0);
		//String c=new Scanner(System.in).nextLine();
		int count=0;
		for (char ch:str.toCharArray())
		{
			if (ch==c)
			{
				count++;
			}
		}
		if(count>0)
		 System.out.println("num of occurances is "+count );
		else
			System.out.println("No occurances");

	}

}
