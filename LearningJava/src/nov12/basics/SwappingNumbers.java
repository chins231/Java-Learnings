package nov12.basics;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		System.out.println("Enter number 1:");
		int num1= new Scanner (System.in).nextInt();

		System.out.println("Enter number 2:");
		int num2= new Scanner (System.in).nextInt();
		
		System.out.println("Before Swapping "+num1+" "+num2);
		//swapping(num1,num2);
		//swapping1(num1,num2);
		//swapping2(num1,num2);
		num2=num1+num2-(num1=num2);
		System.out.println("After Swapping "+num1+" "+num2);
		
	}
   static void swapping(int num1, int num2)
   {
	   int temp=0;
	   temp=num1;
	   num1=num2;
	   num2=temp;
	   System.out.println("After Swapping "+num1+" "+num2);
   }
   static void swapping1(int num1, int num2)
   {
	   
	   num1=num1+num2;
	   num2=num1-num2;
	   num1=num1-num2;
	   System.out.println("After Swapping "+num1+" "+num2);
   }
   static void swapping2(int num1, int num2)
   {
	   
	   num1=num1^num2;
	   num2=num1^num2;
	   num1=num1^num2;
	   System.out.println("After Swapping "+num1+" "+num2);
   }
   
   
}
