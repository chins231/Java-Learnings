package nov12.basics;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenandOddDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		int temp=0,even=0,odd=0,zero=0;
		int num=new Scanner(System.in).nextInt();
       while (num>0)
       {
    	   temp=num%10;
    	   num=num/10;
    	   if(temp==0)
    		   zero++;
    		   
    	   if(num%2==0)
    		   even++;
    	   else
    		   odd++;
       }
       System.out.println("Total even: "+even+" Total odd:"+odd+" zeros "+zero);
	}
	 

}
