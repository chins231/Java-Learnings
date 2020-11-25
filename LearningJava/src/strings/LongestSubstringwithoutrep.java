package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringwithoutrep {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		 String str=new Scanner(System.in).nextLine();
		 longestSubString(str);
			
	}
	
	static void longestSubString(String str)
	{
		ArrayList<String> str1 = new ArrayList<String>();
		
		for (int i=0;i<str.length();i++)
		{   int j;
			for ( j=i+1;j<str.length();j++)
			{
				
				System.out.println("Checking for "+str.charAt(i));
				if (str.charAt(i)!=str.charAt(j))
			{
				System.out.println("unique so far");
				System.out.println(str.charAt(j));
			}
				else {
					System.out.println("Found "+str.charAt(j));
					break;
				}
			}
			System.out.println(str.substring(i,j));
			str1.add(str.substring(i,j-1));
			
		}
		System.out.println("Final unique subsets:"+str1);
		int largestString=0;
		int index=0;
		for(int i = 0; i < str1.size(); i++)
	      {  // Test which String is the largest
	         if(str1.get(i).length() > largestString)
	         {
	            largestString = str1.get(i).length();
	            index = i;
	         }

	      } 
		System.out.println("Largest substring would be "+str1.get(index)+" and its index is :"+index);
		
	}
}
