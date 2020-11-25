package InterviewQuestions;

public class SampleStrings {

	public static void main(String[] args) {
		String s=new String("Sachin123");  
		String s2=new String("Sachin12345");  
		System.out.println(s2);//Sachin  
		 s2=s.intern();  
		System.out.println(s2);//Sachin  
		System.out.println(s2.toUpperCase());
	}

}
