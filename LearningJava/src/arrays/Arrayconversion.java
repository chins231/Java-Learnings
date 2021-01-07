package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayconversion {

	public static void main(String[] args) {
		String  [] colors= {"red","blue","black"};
		List <String> listStrings= new ArrayList<String>(Arrays.asList(colors));
		System.out.println(Arrays.asList(colors));
		String [] test= {"dfd","dfdf","adfdfdf","dfdfder"};
       List<String> list=new ArrayList<>();
       Collections.addAll(list, colors);
      // \u000d System.out.println(list);
      // System.out.println("One"+1+2+"Two"+"Three"+3+4+"Four"+"Five"+5);
       int i=10+ +11- -12;
       System.out.println(i);
       List<String> list1=Arrays.asList(test);
       System.out.println("**************************");
       System.out.println(listStrings);
	}

}
