package arrays;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="Hi hello SriRanganath this will be reversed";
		String StrRev="";
		String [] strArr=str.split(" ");
		System.out.println(str);
		System.out.println(Arrays.toString(strArr));
		//iterator
//		for (int i=0;i<strArr.length;i++)
//		{
//		
//			for (int j=strArr[i].length()-1;j>=0;j--)
//			{
//				StrRev+=""+strArr[i].charAt(j);
//			}
//			System.out.println(StrRev);
//		}
		//using string buffer
		for (int i=0;i<strArr.length;i++)
		{
			StringBuffer sbr=new StringBuffer(strArr[i]);
			StrRev+=sbr.reverse().toString();
		}
		System.out.println(StrRev);

	}

}
