package strings;

public class NonRepeatedFirstChar {

	public static void main(String[] args) {
		String str= "This is repetead word this is non repeated word chinnu , hTope your, ? are doing good ?chinnu welcome to new company welcome welcomez";
		for (char ch: str.toCharArray())
		{
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("First non repeating character is :"+ch);
				break;
			}
		}

	}

}
