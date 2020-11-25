package strings;

import java.util.Arrays;

public class Anagarm1 {

	public static void main(String[] args) {
		String Str="Atest";
		String str1="testa";
		char [] ch=Str.toLowerCase().toCharArray();
		char [] ch1=str1.toLowerCase().toCharArray();
		System.out.println(ch);
		System.out.println(ch1);
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1))
		{
			System.out.println("2 strings are Anagrams");
		}
		else
			System.out.println("Not Anagrams");
		
		
		
         
	}

}
