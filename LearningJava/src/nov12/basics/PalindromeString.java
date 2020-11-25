package nov12.basics;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		
		String str= new Scanner(System.in).nextLine();
		char [] ch=str.toCharArray();
		char temp;
		for (int i=0;i<=ch.length/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(ch).toString());

	}

}
