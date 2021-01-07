package arrays;

import java.util.Scanner;

public class OccuranceofAChar {

	public static void main(String[] args) {
		String str="Hi hello SriRanganath this will be used for counting a char occurance";
		System.out.println("Enter a char to find its occurance");
		String c=new Scanner(System.in).nextLine();
		//char ch=new Scanner(System.in).next().charAt(0);
		int num=occuranceOfChar(c,str);
		if(num>0)
		{
			System.out.println("Occurance of "+c+" in "+str+ " is"+ num);
		}
		else
		{
			System.out.println("No occurance");
		}

	}
	
	static int occuranceOfChar(String c,String str)
	{
		
		int count=str.length()-str.replaceAll(c, "").length();
		return count;
	}
}
