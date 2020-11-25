package JavaBasics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		 int num;
		 
         System.out.println("Enter a number for which you need multiplication :");
       
         num=new Scanner(System.in).nextInt();
         for (int i=1;i<=10;i++)
         {
        	 System.out.println(num+"*"+i+":"+num*i);
         }
         

	}

}
