package StringsDEMO;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		String name="Selenium WebDriver";
		
		char[] chars1 = new char[7];
		name.getChars(0, 7, chars1, 0);
		char c = name.charAt(2);
		System.out.println(c);
		
		System.out.println(chars1);
		
		System.out.println( name.startsWith("Selenium"));
		System.out.println(Arrays.toString((name.split(" "))));
       for (int i=0;i<name.length();i++)
       { System.out.println(name.charAt(i));
    	   
       }
	}

}
