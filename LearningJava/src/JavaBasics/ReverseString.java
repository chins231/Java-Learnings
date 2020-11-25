package JavaBasics;

public class ReverseString {
 
	public static void main(String[] args) {
		
//		//1.
        String str ="Selenium";
		String strrev="";
		System.out.println(str.length());
		for (int i=str.length()-1;i>=0;i--) 
		{
			strrev+=str.charAt(i);
			
		
		}
		//System.out.println("String reverse :"+ strrev);
		StringBuffer sbf= new StringBuffer(str);
		//System.out.println(sbf.reverse().toString());
		System.out.println(sbf.reverse());

	}
//		//2. string buffer class 
 	
		

}
