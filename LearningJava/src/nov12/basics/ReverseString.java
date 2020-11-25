package nov12.basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		String strrev="";
		String str=new Scanner(System.in).nextLine();
		for (int i=str.length()-1;i>=0;i--)
		{
			strrev+=""+str.charAt(i);
		}
      System.out.println(strrev);
      System.out.println("Enter a String:");
		String strrevq="";
		String str1=new Scanner(System.in).nextLine();
		StringBuilder sbr=new StringBuilder(str1);
		System.out.println(sbr.reverse());
		System.out.println("Enter a String:");
		String strrev1="";
		String str2=new Scanner(System.in).nextLine();
		StringBuffer sbr1=new StringBuffer(str2);
		System.out.println(sbr1.reverse());
		
	}

}
