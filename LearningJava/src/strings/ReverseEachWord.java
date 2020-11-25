package strings;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str= "This is repetead word this is non repeated word chinnu , hTope your, ? are doing good ?chinnu welcome to new company welcome welcomez";
		System.out.println(str);
		String[] spliStr=str.split(" ");
		System.out.println(Arrays.toString(spliStr));
		String strrev = "";
		for (String s:spliStr )
		{
			//reverese each word
//			for (int i=0;i<s.length();i++)
//			{
//				strrev+=s.charAt((s.length()-1)-i);
//			}
//			strrev+=" ";
			
			//reveres sentence
			for (int i=spliStr.length-1;i>=0;i--)
			{
				strrev+=spliStr[i]+" ";
			}
			
		}
		System.out.println(strrev);

	}

}
