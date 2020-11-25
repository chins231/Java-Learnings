package JavaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter num >2 for which need to be checked: \n");
		int num=new Scanner(System.in).nextInt();
		boolean isPrime=true;
		for (int i=2;i<num/2;i++)
		{
			if(num%2==0)
			{
				
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Prime Num");
		}
		else
		{
			System.out.println("Not a Prime Num");
		}

	}

}
