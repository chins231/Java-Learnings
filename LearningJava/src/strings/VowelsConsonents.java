package strings;

import java.util.Scanner;

public class VowelsConsonents {

	public static void main(String[] args) {
		System.out.println("Enter a String here : ");
		String str=new Scanner(System.in).nextLine();
		System.out.println("Length of the String is "+str.length());
		int vowels = 0,consonents=0,digits=0;
        for (char ch : str.toCharArray())
        {
        	if (Character.isDigit(ch))
        	{
        		digits++;
        	}
        	else {
        		switch (ch) 
          	  { case 'a': 
          		case 'e': 
          		case 'i': 
          		case 'o': 
          		case 'u': 
          			vowels++; 
          			break; 
          		
          	    default: 
          	    	consonents++;
          	    }
        	}
        	
        	}
        
        System.out.println("Total vowles "+vowels+ " total consonents "+consonents+"+ total digits :"+digits) ;

        		
        }
		
	}


