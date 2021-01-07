package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastofeachString {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String str=new Scanner(System.in).nextLine();
		String[] str1 = str.split(" ");
		System.out.println(Arrays.toString(str1));
		for (String str2: str1)
		{
			System.out.println(str2.substring(0,1)+str2.substring(str2.length()-1));
			String str3=str2.substring(1, str2.length()-1);
			System.out.println(str3);
		}

	}

}
