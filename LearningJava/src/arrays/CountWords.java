package arrays;

import java.util.Arrays;

public class CountWords {

	public static void main(String[] args) {
		String str="Hi hello SriRanganath this will be used for counting a char occurance";
		//int count=1;
//		for (int i=0;i<str.length()-1;i++)
//		{
//			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
//			{
//				count++;
//			}
//		}
	//	System.out.println("Total words are: "+count);

		String[] newStr=str.split(" ");
		System.out.println(Arrays.toString(newStr));
		System.out.println("Total words are:"+newStr.length);
		
	}

}
