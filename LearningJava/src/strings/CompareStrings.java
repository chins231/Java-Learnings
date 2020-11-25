package strings;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String  :");
		 String stra=new Scanner(System.in).nextLine();
		 System.out.println("Enter a String  :");
		 String strb=new Scanner(System.in).nextLine();
		
       String str="ranganath";
       String str1="chinnu";
       for (int i=0 ;i<stra.length();i++)
       {
    	   System.out.println(str.charAt(i));
    	   int count=0;
    	   for (int j=0;j<strb.length();j++)
    	   {
    		   
    		   if (stra.charAt(i)==strb.charAt(j))
    		   {
    			   System.out.println("Common Character found:"+str.charAt(i));
    			   count++;
    		   }
    		   
    		       
    	   }
    	   System.out.println("Occurance of "+str.charAt(i) +" in "+strb+ " is "+count);
       }
	}

}
