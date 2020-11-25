package InterviewQuestions;

import java.util.Scanner;

public class Reveserinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int rev=0;
		System.out.println(Integer.MAX_VALUE );
		System.out.println(Integer.MIN_VALUE);
		System.out.println("Enter number to reverse");
		int num=new Scanner(System.in).nextInt();
       while (num>0)
       {
		rev=rev*10 + num%10;
		num=num/10;
		if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
		{
			System.out.println(0);
		    break;}
       }
       System.out.println(rev);
		

	}

}
