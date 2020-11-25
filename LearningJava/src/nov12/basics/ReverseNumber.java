package nov12.basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse=0;
		System.out.println("Enter a numer to reverse: ");
		int num =new Scanner(System.in).nextInt();
		while (num>0)
		{
			reverse =reverse*10+num%10;
			num=num/10;
		}
		System.out.println(reverse);
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println(Integer.valueOf(sb.reverse().toString()));

	}

}
