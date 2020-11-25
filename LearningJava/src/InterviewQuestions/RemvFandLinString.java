package InterviewQuestions;

import java.util.Scanner;

public class RemvFandLinString {

	public static void main(String[] args) {
		System.out.println("Enter a String :");
		 String str=new Scanner(System.in).nextLine();
		 System.out.println(str.substring(1, str.length()-1));

	}

}
