package InterviewQuestions;

import java.util.Scanner;

public class StringLexicographicalOrder {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String s= sc.nextLine();              //reads string   
		System.out.print("You have entered: "+s);     
		
		 lexo( s);
		

	}
	public static void lexo(String s)
	{
	   int largestI=-1;
	   int largestJ= 0;

	//Finding largest I  
	for(int i=0;i<s.length()-1;i++)
	 {
	  if(s.charAt(i) < s.charAt(i+1))
	    largestI=i;   
//	  if(largestI>=0)
//	  {
//	 System.out.println(s.charAt(i));
//	 System.out.println(s.charAt(largestI));}
//
 }
	 if(largestI==-1)    
	 {
	 System.out.println("no answer");
	 return;
	 }

	// finding  Largest J
	 for(int j=0;j<s.length();j++)
	 {
	  if(s.charAt(j) > s.charAt(largestI))
	   largestJ=j;    
	  System.out.println(s.charAt(j));
	  System.out.println(s.charAt(largestJ));


	 }

	 //Swap the characters at largestI and LargestJ
	 char[] characters=s.toCharArray();
	 characters[largestI]=s.charAt(largestJ);
	 System.out.println(characters[largestI]);
	 characters[largestJ]=s.charAt(largestI);
	 System.out.println(characters[largestJ]);
	 s=String.valueOf(characters);
System.out.println(s);
	 //reverse the string from largestI+1 to end
	 String s1=s.substring(largestI+1);
	 System.out.println(s1);
	 s=s.substring(0,largestI+1); 
	 System.out.println(s);
	 StringBuilder sb= new StringBuilder(s1);
	 sb=sb.reverse(); 
	 System.out.println(sb.toString());
	 System.out.println(s.concat(sb.toString()));    

	}

}
