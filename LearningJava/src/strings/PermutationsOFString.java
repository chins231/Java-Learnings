package strings;

public class PermutationsOFString {

	public static void main(String[] args) {
String str="abcd";
//		for (int i=0;i<str.length();i++)
//		{
//			
//			System.out.println(str.charAt(i)+str.substring(0,i)+str.substring(i+1,str.length()));
//		}
//		
		permutation("", str); 
	}

	
	private static void permutation(String perm, String word) 
	{ 
		if (word.isEmpty()) 
		{ System.out.println(perm + word); } 
		else 
		{ 
			for (int i = 0; i < word.length(); i++) 
		{ 
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
				} } }
}

	

