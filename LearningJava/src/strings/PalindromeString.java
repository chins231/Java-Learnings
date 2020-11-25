package strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str =new String("RANGANATH");
		System.out.println("Enter a char to check for occurance  :");
		String Str =new Scanner(System.in).nextLine();
		//StringBuffer sbr=new StringBuffer(Str).reverse();
		StringBuilder sbr1=new StringBuilder(Str).reverse();
		System.out.println(sbr1);
		System.out.println(sbr1.toString());
		if(Str.equals(sbr1.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
