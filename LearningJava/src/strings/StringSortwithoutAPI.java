package strings;

import java.util.Arrays;

public class StringSortwithoutAPI {

	public static void main(String[] args) {
		String[] str= {"abc","zab","cbd","bca"};
		String temp="";
	
		//int test=0;
		int i=0,j=0;	
		boolean flag;
		for(String str1: str)
		{
			flag=true;
			
			while (j<str[i].length()&&j<str[i+1].length()&& i<str.length)
			
			{
			
			if(str[i].charAt(j)>str[i+1].charAt(j)&&flag)
			{
				flag=false;
				temp=str[i];
				str[i]=str[i+1];
				str[i+1]=str[i];
				break;
			}
			
			j++;
		}
			i++;
		}
		System.out.println(Arrays.toString(str));
		 
}
}