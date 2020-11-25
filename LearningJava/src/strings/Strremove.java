package strings;

public class Strremove {

	public static void main(String[] args) {
		String str="adafdfdfdf";
		char ch='a';
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)==ch))
			   sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());

	}

}
