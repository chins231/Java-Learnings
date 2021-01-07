package strings;

import java.util.Arrays;

public class Stringrepeat {

	public static void main(String[] args) {
		String str="Chinnu";
		String newStr= repeat(str,5);
		System.out.println(newStr);

	}
	public static String repeat(String str, int times) {
		
		 char [] ch=new char[times];
		 String str1=new String(ch);
		 
		 System.out.println(str1);
		// String newstr = new String(charArray);
		return str1.replace("\0", str);
		 
     // return new String(new char[times]).replace("\0", str);
    }

}
