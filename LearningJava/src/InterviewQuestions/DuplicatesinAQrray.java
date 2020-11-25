package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesinAQrray {

	public static void main(String[] args) {
		int [] arr1={1,2,3,6,5,1,2,3};
		
		Set<Integer>set =new HashSet<Integer>();

		for (int i=0;i<arr1.length;i++)
		{
			if(!set.add(arr1[i]))
				System.out.println(arr1[i]);
		}
		List<String> list=Arrays.asList("1","2","3","6","5","1","2","3");
		list.stream().distinct().forEach(System.out::println);
		String str="This word wog thas word duplicate elements duplicate elements thiw";
//		char[] ch=str.toCharArray();
////		Set<char[]> chSet=new HashSet<char[]>();
//		Set<Character> chSet=new HashSet<>();
//		List<Character> listChars = new ArrayList<>();
//		for (char ch1:ch)
//		{
//			chSet.add(ch1);
//		}
//		System.out.println(chSet);
		String [] words=str.split(" ");
		Set<String> strSet=new HashSet<>();
		String nonDup="";
		
		for (String word:words)
		{
			if(strSet.add(word))
			{
//				new StringBuffer(word).reverse().toString();
				nonDup+=(new StringBuffer(word).reverse().toString()) +" ";
			}
				
		}
		System.out.println(nonDup);
		Stream<String> s=Stream.of("ABC","SRT","DEF","XYZ","RAMZ","HIFIZ");
		s.filter(st->st.contains("Z")).forEach(System.out::println);
		
		List<String> list11 =Arrays.asList("srt","test","queue");
		
		System.out.println(list11.stream().map(String::toUpperCase).collect(Collectors.toList()));
//		
	}
	

}
