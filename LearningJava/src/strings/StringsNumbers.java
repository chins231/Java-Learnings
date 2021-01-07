package strings;

import java.util.Arrays;

public class StringsNumbers {

	public static void main(String[] args) {
		String str = "abcd1234ss test 2345e";
		String[] str1 = str.split(" ");
		System.out.println(Arrays.toString(str1));
		String newStr = "";
		for (String str2 : str1) {
			for (int i = 0; i < str2.length(); i++) {

				if (Character.isDigit(str2.charAt(i))) {
					newStr += str2.charAt(i);
				}

			}
			if (newStr.isEmpty()) {
				System.out.print(" ");
			} else {
				System.out.print(newStr);

			}

			newStr = "";

		}
	}
}
