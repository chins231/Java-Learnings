package strings;

import java.awt.Window.Type;

public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAnagram("word", "wrdo"));
		System.out.println(checkAnagram("bbbb", "bbb"));
	}

	public static boolean checkAnagram(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf(""+ch);
			//String str3=""+ch;
			//System.out.println(ch.getClass().equals(Type.class));
			//System.out.println(str3.getClass().equals(String.class));
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}

}
