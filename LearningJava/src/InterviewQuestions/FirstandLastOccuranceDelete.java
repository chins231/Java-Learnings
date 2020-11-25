package InterviewQuestions;

import java.util.Scanner;

public class FirstandLastOccuranceDelete {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter a String :");
		String str=new Scanner(System.in).nextLine();
		System.out.println("Enter a char to search :");
		//String str1=new Scanner(System.in).nextLine();
		char c=new Scanner(System.in).next().charAt(0);
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				count++;
		}
		System.out.println(count);
		int first=str.indexOf(c);
		System.out.println(str.lastIndexOf(c,2));
		int last=str.lastIndexOf(c,first+1);
		System.out.println(" "+first+" "+last);
		String str2 = str.substring(0, first) +  
                str.substring(first + 1,last)+
                str.substring(last+1); 
		System.out.println(str2);
		

	}

}
