package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayconversion {

	public static void main(String[] args) {
		String  [] colors= {"red","blue","black"};
		System.out.println(Arrays.asList(colors));
		
       List<String> list=new ArrayList<>();
       Collections.addAll(list, colors);
      // \u000d System.out.println(list);
      // System.out.println("One"+1+2+"Two"+"Three"+3+4+"Four"+"Five"+5);
       int i=10+ +11- -12;
       System.out.println(i);
       
	}

}
