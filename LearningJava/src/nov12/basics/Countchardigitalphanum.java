package nov12.basics;

import java.util.Scanner;

public class Countchardigitalphanum {

	public static void main(String[] args) {
		System.out.println("Enter a string with combination");
		int digit=0,alphabets=0,alphanumeric=0;
		String str=new Scanner(System.in).nextLine();
		for (char ch: str.toCharArray())
		{
			if(Character.isDigit(ch))
				digit++;
			else if(Character.isAlphabetic(ch))
				alphabets++;
			else
				alphanumeric++;
				
		}
		System.out.println("Alphabets: "+alphabets +" Alphanumeric: "+alphanumeric+" digits:  "+digit);
		

	}

}
