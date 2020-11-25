package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromearraysstrings {

	public static void main(String[] args) {
		System.out.println("Enter a string ");
	      Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();
	      char[] myArray = s.toCharArray();
	      int size = myArray.length;
	      char [] test =Arrays.copyOf(myArray, 10);
	      System.out.println(test);
	      char [] original = Arrays.copyOf(myArray,myArray.length);

	      for (int i = 0; i < size / 2; i++) {
	         char temp = myArray[i];
	         myArray[i] = myArray[size-i-1];
	         myArray[size-i-1] = temp;
	      }
	      System.out.println("Original Array"+Arrays.toString(original));
	      System.out.println("Reverse Array"+Arrays.toString(myArray));

	      if(Arrays.equals(myArray, original)) {
	         System.out.println("Entered string is a palindrome");
	      } else {
	         System.out.println("Entered string is not a palindrome");
	      }

	}

}
