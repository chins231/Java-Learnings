package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseWordsSB {

	public static void main(String[] args) {
		System.out.println("Enter a statement to be reveresed");
	      String sc = new Scanner(System.in).nextLine();
	      
	    	  String [] words=sc.split(" ");
	      String reverse="";
	
	      for (String word : words)
	      {
	    	  StringBuilder sb=new StringBuilder(word);  
	    	  sb.reverse();
	    	  System.out.println(sb);
	    	  reverse+=sb.toString()+" ";
	    	  
	      }
	      System.out.println(reverse);
	      int [] arr1=new int[5];
	      for (int j=0;j<arr1.length;j++)
	      {System.out.println("Enter an element"  );
	      int arrele  = new Scanner(System.in).nextInt();
	      arr1[j]=arrele;
	    	  
	      }
	      List <String> listStr= Arrays.asList("HI","Chins","test"); 
	      List<int[]> sourceList = Arrays.asList(arr1);
	      System.out.println(listStr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	      //System.out.println(Arrays.toString(sourceList.stream().distinct().collect(Collectors.toList())));
	      System.out.println(Arrays.toString(sourceList.toArray()));
	      List <String> list = Arrays.asList("HI","Test","HRU","HI");
	      System.out.println( list.stream().distinct().collect(Collectors.toList()));
	     System.out.println( list.stream().sorted().collect(Collectors.toList()));
	     
	     
	      
   
	}

}
