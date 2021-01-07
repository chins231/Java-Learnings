package strings;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String str1="zzzzz";
		String str2="zzzzzz";
		Boolean flag=false;
		
		
		for (int i=0;i<str1.length();)
		{
			
				
			if(i<str2.length())
			{
				System.out.println(str1.charAt(i));
				System.out.println(str2.charAt(i));
				
			if(str1.charAt(i)>str2.charAt(i))
			{
				//flag=true;
				System.out.println("str1 is largest lexographucally");
				break;
			}
			else if(str1.charAt(i)<str2.charAt(i))
			{
				//flag=false;
				System.out.println("str2 is largest lexographucally");
				break;
			}
			else
			{
				flag=true;
			}
			
		}
			i++;
		}
		if(flag && str1.length()==str2.length())
		{
			System.out.println("both are equal");
		}

	}

}
