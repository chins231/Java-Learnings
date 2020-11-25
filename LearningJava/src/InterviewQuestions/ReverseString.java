package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a String to reverse  :");
		 String str=new Scanner(System.in).nextLine();
		 char[] ch = new char[str.length()]; 
		 
		for (int i=str.length()-1;i>=0;i--)
		{
			ch[str.length()-i-1]=str.charAt(i);
			
		}
		System.out.println(ch);
		//System.out.println(Arrays.toString(ch));
		System.out.println("===========");
		System.out.println("Enter a String to reverse  :");
		 String str1=new Scanner(System.in).nextLine();
		StringBuilder sbr=new StringBuilder(str1).reverse();
		System.out.println(sbr.toString());
		
	}

}
