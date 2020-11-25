package strings;

import java.util.Scanner;

public class OccuranceofChars {

	public static void main(String[] args) {
		String str =new String("RANGANATH");
		System.out.println("Enter a char to check for occurance  :");
		 char checkchar=new Scanner(System.in).next().charAt(0);
		int occurance= occuranceOfChar(str,checkchar);
       System.out.println("Occurance of b in "+checkchar+" is : "+occurance);
	}
	
	
	static int occuranceOfChar(String str,char c)
	{
		int count=0;
		for ( char c1 :  str.toCharArray())
		{
			if(c1==c)
				count++;
		}
		return count;
	}
}
