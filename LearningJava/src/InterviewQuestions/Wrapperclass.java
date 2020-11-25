package InterviewQuestions;

import java.util.Arrays;

public class Wrapperclass {

	public static void main(String[] args) {
		String x="100";
		System.out.println(Integer.parseInt(x)+20);
		
		System.out.println(Boolean.parseBoolean("FAlse"));
		System.out.println();
		
		String j = "Ant";
		  char c = j.charAt(0); //charAt() method will convert first index of string to char
		  System.out.println(c); // will print A
		  char[] c_Array = j.toCharArray(); // returns a length 3 char array ['A','n','t']
		  System.out.println(Arrays.toString(c_Array));

	}

}
