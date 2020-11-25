package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		System.out.println("Enter a String :");
		 String str=new Scanner(System.in).nextLine();
			
				
				
				String str11= removeDuplicates(str);
		       System.out.println("After removing duplicates :"+str11);
		       
			}
			
			
			static String removeDuplicates(String str)
			{
				for (int i=0;i<str.length();i++)
				{
					
				}
				StringBuffer sv=new StringBuffer(str);
				
				LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
				for (int i=0;i<str.length();i++)
				 lhs.add(str.charAt(i));
				return lhs.toString();
			}
		


	

}
