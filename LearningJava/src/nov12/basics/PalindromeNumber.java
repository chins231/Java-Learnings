package nov12.basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int newNum=0;
		System.out.println("Enter a number :");
		int num=new Scanner(System.in).nextInt();
		int temp=num;
//		while (num>0)
//		{
//			newNum=newNum*10+num%10;
//			num=num/10;
//		}
//		System.out.println(newNum);
//		if(newNum==temp)
//		{
//			System.out.println("Palindrome Number");
//		}
//		else
//		{
//			System.out.println("Not a Palindrome Number");
//		}
		
		
		if(Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString())==temp)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}

	}

}
